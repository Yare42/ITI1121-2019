import java.util.Queue;
import java.util.LinkedList;

public class GenerateWords {

    public static void main( String[] args ) {

        String[] series = new String[]{"0","1"};
//        String[] series = new String[]{"U","D","L","R"};
        
        /* NOTE: we do not have our own implementation
         * of a Queue yet. Instead, I use here one
         * provided by Java: java.util.Queue. That interface
         * defines the method "add" for what we
         * have called "enqueue" and the method "remove"
         * for what we have called "dequeue".
         *
         * We need a concrete implementation for that
         * interface, and we will use java.util.LinkedList
         * which implements java.util.Queue
         */


        Queue<String> queue;
        queue = new LinkedList<String>();

        queue.add(""); // was queue.enqueue(""); with our definition
        int j =0;
        while(j++ < 255) {
//        while(true) {
            String s = queue.remove();// was queue.dequeue(); with our defintiion
            System.out.println(s);
            for(int i =0; i< series.length; i++){
                //queue.enqueue(s+series[i]);
                queue.add(s+series[i]);
            }
        }
    }
}
