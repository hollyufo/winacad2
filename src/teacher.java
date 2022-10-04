import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class teacher {
    static String Name;
    static String Email;
    static String Phone;
    static String date;
    // creating arraylist to store teachers
    public static ArrayList<String> teachers = new ArrayList<String>();
    // menu to manage teachers
    public static void Tmenu() {
        System.out.println("Welcome to teachers");
        System.out.println("----------------------------------------");
        System.out.println("1. Add teacher");
        System.out.println("2. Display teachers");
        System.out.println("3. Delete teacher");
        System.out.println("4. Search teacher");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
        Scanner myObj = new Scanner(System.in);
        int s = myObj.nextInt();
        // switch statement to check choice
        switch (s) {
            case 1:
                addTeacher();
                break;
            case 2:
                displayTeachers();
                break;
            case 3:
                deleteTeacher();
                break;
            case 4:
                searchTeacher();
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
