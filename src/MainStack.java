import java.util.LinkedList;
import java.util.Stack;

public class MainStack
{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(6);
        stack.push(3);
        stack.push(9);
        stack.push(1);
        stack.push(12);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
