import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test my_test = new Test();
        boolean decision = true;
        Scanner input = new Scanner(System.in);
        Scanner decider = new Scanner(System.in);

        double random = Math.random();


        while (decision){
            System.out.print("What do you want to perform\n(+1 for addition)\n(+2 for multiplication)\n(+3 for subtraction)\n(+4 for division)");
            String user_input = input.nextLine();

            System.out.println("Put first number: ");
            int first_num = input.nextInt();

            System.out.println("Put second number: ");
            int second_num = input.nextInt();

            if (user_input.equalsIgnoreCase("+1")){
                System.out.println("The sum of the two num is"+my_test.add(first_num, second_num));
            } else if (user_input.equalsIgnoreCase("+2")) {
                System.out.println("The multiplication of the two num is "+my_test.multiplication(first_num, second_num));
            }else if(user_input.equalsIgnoreCase("+3")){
                System.out.println("The subtraction of the two num is " + my_test.subtract(first_num, second_num));
            } else if (user_input.equalsIgnoreCase("+4")) {
                System.out.println("The division of the two num is " + my_test.division(first_num, second_num));
            }

            System.out.println("Do you want to continue the program? Y or N");
            String user_decision = decider.nextLine();
            decision = user_decision.equalsIgnoreCase("Y");

        }



    }

    public int add(int a, int b){
        return a+b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int division(int a, int b){
        return a/b;
    }
}
