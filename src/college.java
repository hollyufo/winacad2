import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

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
        // creating an arraylist
        ArrayList<String> college = new ArrayList<String>();
        college.add(Name);
        college.add(Website);
        // adding arraylist to linkedlist
        collages.add(college);
        System.out.println("The collage has been added successfully");
        System.out.println(collages.getFirst());
    }
}
