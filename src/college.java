import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class college {
    public static LinkedList collages = new LinkedList();
    String Name;
    String Website;
    public void addCollage() {
        System.out.println("Enter the name of the collage: ");
        // using scaner to get input
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the Web site of the collage: ");
        Website = myObj.nextLine();
        // creating a hashmap to store the data
        HashMap<String, String> college = new HashMap<String, String>();
        college.put("Name", Name);
        college.put("Website", Website);
        // adding arraylist to linkedlist
        collages.add(college);
        System.out.println("The collage has been added successfully");
        String test = String.valueOf(collages.getFirst());
        System.out.println();
    }
}
