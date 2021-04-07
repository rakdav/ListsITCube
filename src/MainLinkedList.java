import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class MainLinkedList
{
    public static void main(String[] args) {
        LinkedList<String> states=new LinkedList<>();
        states.add("Germany");
        states.add("France");
        states.add("Britain");
        states.add("Italy");
        states.add("Spain");
        System.out.println(states.size());
        System.out.println(states.get(2));
        states.set(3,"Russia");
        for (int i=0;i<states.size();i++)
            System.out.print(states.get(i)+" ");
        System.out.println();
        for (String st:states) System.out.print(st+" ");
        System.out.println();
        Iterator<String> iterator=states.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();
        if(states.contains("Spain")) System.out.println("Yes");
        else System.out.println("No");
        states.remove("France");
        states.removeFirst();
        states.removeLast();
        Iterator<String> iterator1=states.iterator();
        while (iterator1.hasNext())
            System.out.print(iterator1.next()+" ");
        System.out.println();
        states.addFirst("Brazil");
        states.addLast("Sweden");
        for (String st:states) System.out.print(st+" ");
        System.out.println();
    }
}
