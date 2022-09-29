import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static int s;
    public static void menu() {
        System.out.println("Welcome to admin");
        System.out.println("----------------------------------------");
        System.out.println("1. Manage students");
        System.out.println("2. Manage teachers");
        System.out.println("3. Manage subjects");
        System.out.println("4. Manage classes");
        System.out.println("5. Manage collages");
        System.out.println("6. Exit");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice: ");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            s = Integer.parseInt(bufferRead.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        do {
            menu();
            System.out.println(s);
        }
        while (s != 6);
    }
}