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
    // method to add a teacher
    public static void addTeacher() {
        System.out.println("Enter the name of the teacher: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the email of the teacher: ");
        Email = myObj.nextLine();
        System.out.println("Enter the phone of the teacher: ");
        Phone = myObj.nextLine();
        System.out.println("Enter the date of the teacher: ");
        date = myObj.nextLine();
        HashMap<String, String> teacher = new HashMap<String, String>();
        teacher.put("Name", Name);
        teacher.put("Email", Email);
        teacher.put("Phone", Phone);
        teacher.put("date", date);
        teachers.add(String.valueOf(teacher));
        System.out.println("The teacher has been added successfully");
    }
    // method to display all teachers
    public static void displayTeachers() {
        System.out.println("The teachers are: ");
        for (int i = 0; i < teachers.size(); i++) {
            String teacher = teachers.get(i);
            System.out.println(teacher);
        }
    }
    // updating a teacher
    public static void updateTeacher() {
        System.out.println("Enter the name of the teacher: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        System.out.println("Enter the email of the teacher: ");
        Email = myObj.nextLine();
        System.out.println("Enter the phone of the teacher: ");
        Phone = myObj.nextLine();
        System.out.println("Enter the date of the teacher: ");
        date = myObj.nextLine();
        HashMap<String, String> teacher = new HashMap<String, String>();
        teacher.put("Name", Name);
        teacher.put("Email", Email);
        teacher.put("Phone", Phone);
        teacher.put("date", date);
        teachers.add(String.valueOf(teacher));
        System.out.println("The teacher has been updated successfully");
        System.out.println(teachers.get(0));
    }
    // deleting a teacher from arraylist
    public static void deleteTeacher() {
        // displaying all teachers with id
        System.out.println("The teachers are: ");
        for (int i = 0; i < teachers.size(); i++) {
            String teacher = teachers.get(i);
            System.out.println("id= "+ i + " " + teacher);
        }
        System.out.println("Enter the id of the teacher you want to delete: ");
        Scanner myObj = new Scanner(System.in);
        int id = myObj.nextInt();
        teachers.remove(id);
        System.out.println("The teacher has been deleted successfully");
    }
    // method to search for a teacher
    public static void searchTeacher() {
        System.out.println("Enter the name of the teacher: ");
        Scanner myObj = new Scanner(System.in);
        Name = myObj.nextLine();
        // searching for the teacher
        for (int i = 0; i < teachers.size(); i++) {
            String teacher = teachers.get(i);
            if (teacher.contains(Name)) {
                System.out.println("The teacher is: " + teacher);
            }
        }
    }
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
