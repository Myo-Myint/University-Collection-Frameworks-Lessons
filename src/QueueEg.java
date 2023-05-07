import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEg {
    public static void main(String[] args) {
//        Queue<String> myQueue = new LinkedList<>();
//        myQueue.add("Myo");
//        myQueue.add("Thu");
//        myQueue.add("Mint");
////        System.out.println(myQueue);
//
//        myQueue.remove();
//        System.out.println(myQueue);

//        System.out.println(myQueue.getClass(0));;

        Queue<Integer> my_snd_queue = new PriorityQueue<>();
        my_snd_queue.add(9);
        my_snd_queue.add(3);
        my_snd_queue.add(213);

        System.out.println(my_snd_queue);
        System.out.println(my_snd_queue.peek());

        my_snd_queue.remove();
        System.out.println(my_snd_queue);
        System.out.println(my_snd_queue.peek());

        Queue<String> my_third_queue = new PriorityQueue<>();
        my_third_queue.add("Mint");
        my_third_queue.add("Apple");
        my_third_queue.add("223");
        my_third_queue.add("ada");
        my_third_queue.add("Zebra");



        System.out.println(my_third_queue);
        System.out.println(my_third_queue.peek());


        my_third_queue.remove();
        System.out.println(my_third_queue);

        System.out.println(my_third_queue.peek());

        my_third_queue.poll();
        System.out.println(my_third_queue.peek());



    }
}
