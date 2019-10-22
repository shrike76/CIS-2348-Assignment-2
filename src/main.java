import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students' data you with to enter:");
        int n = input.nextInt();
        List<Student> studentarray = new ArrayList<Student>();
        int i = 0;
        for (; i < n; i++) {
            Student newStudent = new Student();
            System.out.println("New Student");
            System.out.println("Enter the first name:");
            String a = input.next();
            newStudent.firstname_(a);

            System.out.println("Enter the last name:");
            String b = input.next();
            newStudent.lastname_(b);

            System.out.println("Enter the ID:");
            int c = input.nextInt();
            newStudent.ID_(c);

            System.out.println("Enter the class standing:");
            String d = input.next();
            newStudent.classstanding_(d);

            System.out.println("Enter the email:");
            String f = input.next();
            newStudent.email_(f);

            System.out.println("Enter the address line:");
            String e = input.next();
            newStudent.addressLine_(e);

            System.out.println("Enter the City:");
            String g = input.next();
            newStudent.city_(g);

            System.out.println("Enter the State:");
            String h = input.next();
            newStudent.state_(h);

            System.out.println("Enter the Zip code:");
            int j = input.nextInt();
            newStudent.zipcode_(j);

            studentarray.add(newStudent);
        }
        System.out.println("Students Details, Department of ITL");
        for (i=0; i < n; i++) {
            studentarray.get(i).getInfo();
        }
        System.out.println("Number of Students: "+Student.getCount());
    }
}