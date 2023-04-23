import java.util.Stack;

public class StackEg {
    public static void main(String[] args) {
        Stack<String> my_stack = new Stack<>();
        my_stack.push("myoe");
        my_stack.push("Mint");
        my_stack.push("Thu");
        my_stack.pop();
        System.out.println(my_stack);
    }
}
