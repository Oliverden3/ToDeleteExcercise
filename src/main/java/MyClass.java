import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
    public static String CombinedNames(Object index) {

        ArrayList<String> nameList1 = new ArrayList<>();


        String message = "";
        nameList1.add("Kasper");
        nameList1.add("Denis");
        nameList1.add("Oliver");

        if (index instanceof Integer ||index == null) {
            if (index == null) {
                for (int i = 0; i < nameList1.size(); i++) {
                    message += nameList1.get(i);
                    if (i == nameList1.size() - 1) {
                        break;
                    }
                    message += ", ";
                }
            }
            if (index != null) {
                message = nameList1.get((int) index);
            }
        }
        if( index instanceof int[]){
        int[] tal = (int[]) index;
        String nyMessage = nameList1.get(tal[0]) +", "+ nameList1.get(tal[1]);
        message = nyMessage;
        }



        return message;
    }
}