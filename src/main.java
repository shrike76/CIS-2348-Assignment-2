import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of students' data you with to enter:");
        int n=input.nextInt();
        Student[] s=new Student[n];

        for (int i=0;i<n;i++){
            Student s1=new Student();
            System.out.println("Enter the first name:");
            String a=input.next();
            s1.firstname_(a);
            System.out.println("Enter the last name:");
            String b=input.next();
            s1.lastname_(b);
            System.out.println("Enter the ID:");
            int c=input.nextInt();
            s1.ID_(c);


            }



        }


    }

