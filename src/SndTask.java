import java.util.ArrayList;
import java.util.Scanner;

public class SndTask {
//    4. Write a program that creates an array of 10 elements size.
//    Your program should prompt the user to input numbers in array and then display the sum of all array elements.
    public static void main(String[] args) {
        ArrayList<Integer> num_arr = new ArrayList<>(10);
        int result = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Put your "+ i+1 +" number: ");
            int user_input = input.nextInt();
            num_arr.add(user_input);
        }
        System.out.println(num_arr);
        for (Integer integer : num_arr) {
            result = result + integer;
        }
        System.out.println(result);
        System.out.println(1/(2*3.14*1550*2.2*0.000001));

//        int[][] my = {};
    }
}
