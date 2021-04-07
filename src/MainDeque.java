import java.util.Deque;
import java.util.LinkedList;

public class MainDeque
{
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.add(5);//добавляет в начало
        deque.addFirst(7);//добавляет в начало
        deque.addLast(8);//добавляет в конец
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        deque.offer(12);//добавляет в начало
        deque.offerFirst(13);//добавляет в начало
        deque.offerLast(67);//добавляет в конец
        System.out.println(deque.peek());//возврат без удаления
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.poll());//возврат с удалением первого
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.size());
    }
}
