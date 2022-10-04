import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class users {
    // creating arraylist to store users
    public static ArrayList<String> users = new ArrayList<String>();
    static String Name;
    static String Email;
    static String Phone;
    static String date;
    // methode to add student to arraylist
    public static void addStudent() {
        System.out.println("Enter the name of the student: ");
        // using scanner to get input
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the Email of the student: ");
        Email = myObj.nextLine();
        System.out.println("Enter the Phone of the student: ");
        Phone = myObj.nextLine();
        System.out.println("Enter the date of the student: ");
        date = myObj.nextLine();
        // creating a hashmap to store the data
        HashMap<String, String> student = new HashMap<String, String>();
        student.put("Name", Name);
        student.put("Email", Email);
        student.put("Phone", Phone);
        student.put("date", date);
        // adding arraylist to linkedlist
        users.add(String.valueOf(student));
        System.out.println("The student has been added successfully");
    }
    // displaying all students
    public static void displayStudents() {
        System.out.println("The students are: ");
        for (int i = 0; i < users.size(); i++) {
            String student = users.get(i);
            System.out.println(student);
        }
    }
    // method to delete student
    public static void deleteStudent() {
        // displaying all students with id
        System.out.println("The students are: ");
        for (int i = 0; i < users.size(); i++) {
            String student = users.get(i);
            System.out.println("id= "+ i + " " + student);
        }
        System.out.println("Enter the id of the student you want to delete: ");
        Scanner myObj = new Scanner(System.in);
        int id = myObj.nextInt();
        users.remove(id);
        System.out.println("The student has been deleted successfully");
    }
    // menu to display options
    public static void Smenu() {
        System.out.println("Welcome to students");
        System.out.println("----------------------------------------");
        System.out.println("1. Add student");
        System.out.println("2. Display student");
        System.out.println("3. Update student");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
        // using scanner to get input
        Scanner myObj = new Scanner(System.in);
        int choice = myObj.nextInt();
        // switch case to choose the option
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                displayStudents();
                break;
            case 3:
                deleteStudent();
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}

