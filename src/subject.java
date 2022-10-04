import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class subject {
    // attributes of subject
    static String Name;
    static String classRoom;
    // creating arraylist to store subjects
    public static ArrayList<String> subjects = new ArrayList<String>();
    // method to add a subject
    public static void addSubject() {
        System.out.println("Enter the name of the subject: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the class room of the subject: ");
        classRoom = myObj.nextLine();
        HashMap<String, String> subject = new HashMap<String, String>();
        subject.put("Name", Name);
        subject.put("classRoom", classRoom);
        subjects.add(String.valueOf(subject));
        System.out.println("The subject has been added successfully");
    }
    // method to display all subjects
    public static void displaySubjects() {
        System.out.println("The subjects are: ");
        for (int i = 0; i < subjects.size(); i++) {
            String subject = subjects.get(i);
            System.out.println(subject);
        }
    }
    // updating a subject
    public static void updateSubject() {
        System.out.println("Enter the name of the subject: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the class room of the subject: ");
        classRoom = myObj.nextLine();
        HashMap<String, String> subject = new HashMap<String, String>();
        subject.put("Name", Name);
        subject.put("classRoom", classRoom);
        subjects.add(String.valueOf(subject));
        System.out.println("The subject has been updated successfully");
        System.out.println(subjects.get(0));
    }
    // deleting a subject from arraylist
    public static void deleteSubject() {
        // Printing all subjects with id to choose from
        System.out.println("The subjects are: ");
        for (int i = 0; i < subjects.size(); i++) {
            String subject = subjects.get(i);
            System.out.println(i + " " + subject);
        }
        System.out.println("Enter the id of the subject: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        // deleting the subject from arraylist with the id
        subjects.remove(Integer.parseInt(Name));
        System.out.println("The subject has been deleted successfully");
    }
    // searching for a subject
    public static void searchSubject() {
        System.out.println("Enter the name of the subject: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        for (int i = 0; i < subjects.size(); i++) {
            String subject = subjects.get(i);
            if (subject.contains(Name)) {
                System.out.println(subject);
            }
        }
    }
    // menu for subject
    public static void subjectMenu() {
        System.out.println("1. Add a subject");
        System.out.println("2. Display all subjects");
        System.out.println("3. Update a subject");
        System.out.println("4. Delete a subject");
        System.out.println("5. Search for a subject");
        System.out.println("6. Back to main menu");
        System.out.println("Enter your choice: ");
        Scanner myObj = new Scanner(System.in);
        String choice = myObj.nextLine();
        switch (choice) {
            case "1":
                addSubject();

                break;
            case "2":
                displaySubjects();

                break;
            case "3":
                updateSubject();

                break;
            case "4":
                deleteSubject();

                break;
            case "5":
                searchSubject();
                break;
            default:
                System.out.println("Invalid choice");
                subjectMenu();
                break;
        }
    }

}
