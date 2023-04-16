import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> nameList = new ArrayList<> ();

        nameList.add(0, "Shi");
        System.out.println(nameList);
        nameList.add("Bo");
        System.out.println(nameList);
        nameList.add("Kim");
        System.out.println(nameList);

        System.out.println(nameList.get(1));

        nameList.set(1,"Bim");
        System.out.println(nameList);

        String removed = nameList.remove(1);
        System.out.println(nameList);
        System.out.println(removed);

        System.out.println(nameList.size());

        System.out.println(nameList.contains("Bo"));

        for (String value : nameList) {
            System.out.println(value);
        }
    }
}
