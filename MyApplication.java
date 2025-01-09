import java.io.*;
import java.util.*;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Person>persons=new ArrayList<>();
        persons.add(new Employee("John", "Lennon", "Fullstack developer", 27045.78));
        persons.add(new Employee("George", "Harrison", "Boxer", 50000.00));
        persons.add(new Student("Ringo", "Starr", 2));
        persons.add(new Student("Paul", "McCartney", 2.68));
        Collections.sort(persons);
        printData(persons);
    }
    public static void printData(ArrayList<Person> persons) {
        for(Payable person:persons) {
            System.out.print(person.toString() + " earns " + person.getPaymentAmount() + " tenge\n");
        }
    }
}
