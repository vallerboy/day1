import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for(int i = 0; i <= 500000; i++){
            arrayList.add(0, "hejo"+i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Array: " + (stopTime-startTime));

        List<String> linkedList = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i <= 500000; i++){
            linkedList.add(0, "hejo"+i);
        }
        long stopTime1 = System.currentTimeMillis();

        System.out.println("Linked: " + (stopTime1-startTime1));
    }
}
