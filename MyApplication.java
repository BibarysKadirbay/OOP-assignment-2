import java.io.*;
import java.util.*;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person>persons=new ArrayList<>();
        File fileStudents = new File("src/student.txt");
        Scanner scanner = new Scanner(fileStudents);
        while(scanner.hasNextLine()) {
            String[] info = scanner.nextLine().split(" ");
            Student student = new Student();
        }
        scanner.close();
        File fileTeachers = new File("src/employee.txt");
        Scanner scan = new Scanner(fileTeachers);
        while(scan.hasNextLine()) {
            String[] info = scan.nextLine().split(" ");
        }
        scan.close();

    }
}
