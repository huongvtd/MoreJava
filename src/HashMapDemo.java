import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("Bong", 5);
        students.put("Bo", 6);
        students.put("Bi", 5);
        System.out.println(students);

        students.clone();
        System.out.println(students);

        System.out.println("Bong is "+ students.get("Bong") + " years old.");

        System.out.println("All keys are " + students.keySet());
        System.out.println("All values are " + students.values());
        System.out.println("All pairs are " + students.entrySet());

        students.replace("Bi",8 );
        System.out.println(students);

        System.out.println("--------------------------------");

        Iterator<String> iterator = students.keySet().iterator();
        String student = iterator.next();
        System.out.println("1st student is "+ student);

        Iterator iterator1 = students.keySet().iterator();
        while (iterator1.hasNext()) {
            System.out.println("Key set: " + iterator1.next());
        }
    }
}
