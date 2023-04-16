import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    public static void main(String[] args) {
        HashMap <String, String> student1 = new HashMap<>();
        student1.put("name", "Blue");
        student1.put("language", "Java");
        student1.put("grade", "A");

        HashMap <String, String> student2 = new HashMap<>();
        student2.put("grade", "B");
        student2.put("name", "Black");
        student2.put("language", "Javascript");

        HashMap <String, String> student3 = new HashMap<>();
        student3.put("grade", "A");
        student3.put("name", "Brown");
        student3.put("language", "Python");


        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-----------------------------------");

        ArrayList< HashMap <String, String>> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println(studentList);

        for (HashMap <String, String> student : studentList){
            String grade = student.get("grade");
            if (grade == "A") {
                String first = student.get("name");
                System.out.println(first + " got grade A");
            }
        }


    }
}
