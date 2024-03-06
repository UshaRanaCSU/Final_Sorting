import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.print("The numbers of students you want to enter :");
        count = sc.nextInt();

        List<Student> link = new LinkedList<Student>();

        for (int i = 0; i < count; i++) {
            sc.nextLine();
            System.out.print("Enter Student's Name :");
            String name = sc.nextLine();
            System.out.print("Enter Student's Address :");
            String address = sc.nextLine();
            System.out.print("Enter Student's GPA :");
            double gpa = sc.nextDouble();
            Student s = new Student(name, address, gpa);
            link.add(s);
        }

        Collections.sort(link);
        Iterator<Student> link1 = link.iterator();
        try {
            FileWriter fw = new FileWriter("Student_sorted_data.txt");
            while (link1.hasNext()) {
                fw.write(link1.next().toString() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}