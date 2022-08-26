import java.util.ArrayList;

public class MyClass {

    public static ArrayList<String> CombinedNames() {
        ArrayList<String> nameList1 = new ArrayList<String>();
        ArrayList<String> nameList2 = new ArrayList<String>();
        nameList1.add("Kasper");
        nameList1.add("Denis");
        nameList2.add("Oliver");
        nameList1.add(nameList2.get(0));
        return nameList1;
    }
}
