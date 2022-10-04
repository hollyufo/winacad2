import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

public class college {
    public static ArrayList<String> collages = new ArrayList<String>();
    String Name;
    String Website;
    public void addCollage() {
        System.out.println("Enter the name of the collage: ");
        // using scanner to get input
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the Web site of the collage: ");
        Website = myObj.nextLine();
        // creating a hashmap to store the data
        HashMap<String, String> college = new HashMap<String, String>();
        college.put("Name", Name);
        college.put("Website", Website);
        // adding arraylist to linkedlist
        collages.add(String.valueOf(college));
        System.out.println("The collage has been added successfully");
    }
    // method to display all collages
    public void displayCollages() {
        System.out.println("The collages are: ");
        for (int i = 0; i < collages.size(); i++) {
            String collage = collages.get(i);
            System.out.println(collage);
        }
    }
    // updating a collage
    public void updateCollage() {
        System.out.println("Enter the name of the collage: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the Web site of the collage: ");
        Website = myObj.nextLine();
        HashMap<String, String> college = new HashMap<String, String>();
        college.put("Name", Name);
        college.put("Website", Website);
        collages.add(String.valueOf(college));
        System.out.println("The collage has been updated successfully");
        System.out.println(collages.get(0));
    }
    // deleting a collage from arraylist
    public void deleteCollage() {
    // displaying all colleges with id
        System.out.println("The collages are: ");
        for (int i = 0; i < collages.size(); i++) {
            String collage = collages.get(i);
            System.out.println("id= "+ i + " " + collage);
        }
        System.out.println("Enter the id of the collage you want to delete: ");
        Scanner myObj = new Scanner(System.in);
        int id = myObj.nextInt();
        collages.remove(id);
        System.out.println("The collage has been deleted successfully");
    }
    // searching for a collage
    public void searchCollage() {
        System.out.println("Enter the name of the collage: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        // searching the list and displaying the result
        for (int i = 0; i < collages.size(); i++) {
            // searching for a match in the string
            if (collages.get(i).contains(Name)) {
                System.out.println("The collage is found");
                System.out.println(collages.get(i));
            }
        }
    }
    // displaying a menu to manage collages
    public void collegem() {
        System.out.println("Welcome to admin");
        System.out.println("----------------------------------------");
        System.out.println("1.Display collages");
        System.out.println("2.Add collage");
        System.out.println("3.Update");
        System.out.println(("4.Delete collage"));
        System.out.println("5.Search collage");
        System.out.println("5.Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
        Scanner myObj = new Scanner(System.in);
        int s = myObj.nextInt();
        // switch statement to check choice
        switch (s) {
            case 1:
                displayCollages();
                break;
            case 2:
                addCollage();
                break;
            case 3:
                updateCollage();
                break;
            case 4:
                deleteCollage();
                break;
            case 5:
                searchCollage();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
