package Java_Act3;

import java.util.LinkedList;
import java.util.Queue;

public class Act3_3 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<5;i++) {
            q.add(i);
        }
        System.out.println("Elements in queue: " + q);
        int removeEle = q.remove();
        System.out.println("removed element: " + removeEle);
        int headEle = q.peek();
        System.out.println("head of queue: " + headEle);

        int size = q.size();
        System.out.println("Size of queue: " + size);
    }
}

