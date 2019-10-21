import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students' data you with to enter:");
        int n=input.nextInt();

        for (int i=0;i<n;i++){
            List<Student> studentarray = new ArrayList<Student>();
            studentarray.add(new Student());
            System.out.println("Enter the first name:");
            String a=input.next();
            studentarray.get(i).firstname_(a);
            System.out.println("Enter the last name:");
            String b=input.next();
            studentarray.get(i).lastname_(b);
            System.out.println("Enter the ID:");
            int c=input.nextInt();
            studentarray.get(i).ID_(c);
            System.out.println("Enter the class standing:");
            String d=input.next();
            studentarray.get(i).classstanding_(d);
            System.out.println("Enter the email:");
            String f=input.next();
            studentarray.get(i).email_(f);
            System.out.println("Enter the address line:");
            String e=input.next();
            studentarray.get(i).addressLine_(e);
            System.out.println("Enter the City:");
            String g=input.next();
            studentarray.get(i).city_(g);
            System.out.println("Enter the State:");
            String h=input.next();
            studentarray.get(i).state_(h);
            System.out.println("Enter the Zip code:");
            int j=input.nextInt();
            studentarray.get(i).zipcode_(j);
            i++;
        }



    }


}

