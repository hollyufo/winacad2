import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class marks {
    // testing
    // attributes of marks
    static String Name;
    static String mark;
    static String date;
    static String subject;
    // arraylist to store marks
    public static ArrayList<String> marks = new ArrayList<String>();
    // method to add a mark
    public static void addMark() {
        System.out.println("Enter the name of the student: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the mark of the student: ");
        mark = myObj.nextLine();
        System.out.println("Enter the date of the student: ");
        date = myObj.nextLine();
        System.out.println("Enter the subject of the student: ");
        subject = myObj.nextLine();
        HashMap<String, String> mark = new HashMap<String, String>();
        mark.put("Name", Name);
        mark.put("mark", String.valueOf(mark));
        mark.put("date", date);
        mark.put("subject", subject);
        marks.add(String.valueOf(mark));
        System.out.println("The mark has been added successfully");
    }
    // method to display all marks
    public static void displayMarks() {
        System.out.println("The marks are: ");
        for (int i = 0; i < marks.size(); i++) {
            String mark = marks.get(i);
            System.out.println(mark);
        }
    }
    // updating a mark
    public static void updateMark() {
        System.out.println("Enter the name of the student: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the mark of the student: ");
        mark = myObj.nextLine();
        System.out.println("Enter the date of the student: ");
        date = myObj.nextLine();
        System.out.println("Enter the subject of the student: ");
        subject = myObj.nextLine();
        HashMap<String, String> mark = new HashMap<String, String>();
        mark.put("Name", Name);
        mark.put("mark", String.valueOf(mark));
        mark.put("date", date);
        mark.put("subject", subject);
        marks.add(String.valueOf(mark));
        System.out.println("The mark has been updated successfully");
        System.out.println(marks.get(0));
    }
    // deleting a mark from arraylist
    // printing all subjects with id to choose from
    public static void deleteMark() {
        System.out.println("The marks are: ");
        for (int i = 0; i < marks.size(); i++) {
            String mark = marks.get(i);
            System.out.println(i + " " + mark);
        }
        System.out.println("Enter the id of the mark: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        // deleting the mark from arraylist with the id
        marks.remove(Integer.parseInt(Name));
        System.out.println("The mark has been deleted successfully");
    }
    // method to search for a mark
    public static void searchMark() {
        System.out.println("Enter the name of the student: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        // searching for a matching string in arraylist
        for (int i = 0; i < marks.size(); i++) {
            String mark = marks.get(i);
            if (mark.contains(Name)) {
                System.out.println(mark);
            }
        }
    }
    // method to display the menu
    public static void mmenu() {
        System.out.println("Welcome to marks");
        System.out.println("----------------------------------------");
        System.out.println("1. Add a mark");
        System.out.println("2. Display all marks");
        System.out.println("3. Update a mark");
        System.out.println("4. Delete a mark");
        System.out.println("5. Search for a mark");
        System.out.println("6. Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
        // geting the choice from the user
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();
        // switch case to choose the method
        switch (choice) {
            case "1":
                addMark();
                break;
            case "2":
                displayMarks();
                break;
            case "3":
                updateMark();
                break;
            case "4":
                deleteMark();
                break;
            case "5":
                searchMark();
                break;
            case "6":
                System.out.println("Thank you for using marks");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
