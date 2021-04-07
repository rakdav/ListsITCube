import java.util.LinkedList;
import java.util.Queue;

public class MainQueue
{
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(5);
        queue.add(9);
        queue.add(3);
        queue.add(6);
        queue.offer(7);
        while (queue.size()!=0)
            System.out.println(queue.remove());
        System.out.println(queue.size());
    }
}
