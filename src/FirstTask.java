import java.util.ArrayList;
import java.util.Collections;

public class FirstTask {
    public static void main(String[] args) {

//        1. Write a program to implement your own Array List in Java.
//
//        2. Write Java statements that do the following:
//        a) Declare an array numArray of 15 elements of type int.
//                b) Output the value of the tenth element of the array alpha.
//                c) Set the value of the fifth element of the array alpha to 35.
//        d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.

        ArrayList<Integer> num_array = new ArrayList<>();
        Collections.addAll(num_array,1,2,34,423,231,2,124,432,324,3452,5352,3234,32,323,33);

        System.out.println(num_array.get(9));
        num_array.set(4,35);

        int sum = num_array.get(5) + num_array.get(12);
        num_array.set(8,sum);
        System.out.println(num_array.get(8));
        System.out.print("\n_________________________________________\nThis is with for loop\n");

        for (int i = 0; i < num_array.size(); i++) {
            System.out.println(num_array.get(i));
        }

        System.out.print("\n_________________________________________\nThis is with foreach(for advanced) loop\n");

        for (Integer integer : num_array) {
            System.out.println(integer);
        }

        System.out.print("\n_________________________________________\nThis is with while\n");

        int count = 0;
        while (num_array.size()>count){
            System.out.println(num_array.get(count));
            count++;
        }

        System.out.print("\n_________________________________________\nThis is with dowhile\n");

        count = 0;
        do{
            System.out.println(num_array.get(count));
            count++;
        }while (num_array.size()>count);




    }
}
