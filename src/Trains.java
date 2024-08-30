import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Train {
    private int id;

    public String getName() {
        return name;
    }

    private String name;
    private LocalTime arrivalTime;
    private LocalTime departureTime;

    public Train(int id, String name, LocalTime arrivalTime, LocalTime departureTime) {
        this.id = id;
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
}

class TrainSchedule {
    private List<Train> trains;

    public TrainSchedule() {
        trains = new ArrayList<>();
    }

    public void injestData(int id, String name, String arrival, String departure) {
        LocalTime arrivalTime = LocalTime.parse(arrival);
        LocalTime departureTime = LocalTime.parse(departure);
        trains.add(new Train(id, name, arrivalTime, departureTime));
    }

    private void sortTrainsByArrivalTime() {
        Collections.sort(trains, Comparator.comparing(Train::getArrivalTime));
    }

    private int findLastTrain(LocalTime endTime) {
        int low = 0;
        int high = trains.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (trains.get(mid).getArrivalTime().isBefore(endTime) || trains.get(mid).getArrivalTime().equals(endTime)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public void showTrains(String startTime, String endTime) {
        LocalTime start = LocalTime.parse(startTime);
        LocalTime end = LocalTime.parse(endTime);

        sortTrainsByArrivalTime();

        int endIndex = findLastTrain(end);

        for (int i = 0; i <=endIndex; i++) {
            Train train = trains.get(i);

            if (train.getArrivalTime().isAfter(end)) {
                break;
            }

//            if ((train.getArrivalTime().isBefore(end) || train.getArrivalTime().equals(end)) &&
//                    (train.getDepartureTime().isAfter(start) || train.getDepartureTime().equals(start) || train.getDepartureTime().isBefore(end))) {
//                System.out.println(train.getName());
//            }
            if((train.getDepartureTime().isBefore(end) || train.getDepartureTime().equals(end) )&&(train.getArrivalTime().isAfter(start) || train.getArrivalTime().equals(start))){
                System.out.println(train.getName());
                continue;
            }
            if((train.getDepartureTime().isAfter(end) || train.getDepartureTime().equals(end)) && (train.getArrivalTime().isBefore(end) || train.getArrivalTime().equals(end))&& (train.getArrivalTime().isAfter(start)|| train.getArrivalTime().equals(start))){
                System.out.println(train.getName());
                continue;
            }
            if(train.getDepartureTime().isBefore(end)&&train.getArrivalTime().isBefore(start) ){
                System.out.println(train.getName());
                continue;
            }
        }
    }


    public static void main(String[] args) {
        TrainSchedule schedule = new TrainSchedule();
        schedule.injestData(3,"Rajdhani3","07:50","08:10");
        schedule.injestData(1,"Rajdhani1","08:00","08:15");
        schedule.injestData(2,"Rajdhani2","08:10","08:30");
        schedule.injestData(4,"Rajdhani4","08:55","09:10");
        schedule.injestData(4,"Rajdhani5","08:05","08:10");

        schedule.showTrains("08:00","08:30");
    }
}