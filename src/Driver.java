import java.util.ArrayList;
import static java.lang.System.out;
public class Driver {
    public static void main(String[] args) {
        Node a=new Node("Hi", new ArrayList<>());

        Node b=new Node("Hello", new ArrayList<>());
        Node c=new Node("Test", new ArrayList<>());

        System.out.println(a);

        a.addConnection(b);
        a.addConnection(c);
        System.out.println(a);

        b.addConnection(c);
        System.out.println(b);
    }

}
