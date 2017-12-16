import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private int age;

    public static void main(String[] args) {
        ArrayList<String> cos = new ArrayList<>();
        List<String> cos1 = new LinkedList<>();

        printList(cos);
    }

    public static void printList(List<String> cos){
        for (String co : cos) {
            System.out.println(co);
        }
    }

}
