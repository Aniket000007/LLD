package LRUCache;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    static Node head = new Node(0,0);
    static Node tail = new Node(0,0);
    static Map<Integer,Node> check = new HashMap<>();
    static int capacity;

    public Cache(int capacity){
        this.capacity=capacity;
    }

    public static void put(int key,int value){

        if (check.containsKey(key)) {
            remove(check.get(key));
        }
        if(check.size()==capacity){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }

    public static int get(int key){
        if(check.containsKey(key)){
            Node node  = check.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }
    }

    public static void remove(Node node){
        check.remove(node.key);
        node.prev.next = node.next;
        node.next.prev=node.prev;
    }

    public static void insert(Node node){
        check.put(node.key,node);
        node.next=head.next;
        node.next.prev = node;
        head.next=node;
        node.prev=head;
    }


}

class Node{
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    Node next;
    Node prev;
}
