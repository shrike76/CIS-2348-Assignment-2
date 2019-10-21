import java.util.*;
import java.util.regex.*;
public class Student {
    private String firstname;
    private String lastname;
    private int ID;
    private String classStanding;
    private String email;
    private String addressLine;
    private String city;
    private String state;
    private int zipcode;
    private ArrayList<Student> studentarray;
    /*public Student(String a, String b, int c, String d, String e, String f, String g, char h, int i){
        firstname=a;
        lastname=b;
        ID=c;
        classStanding=d;
        email=e;
        addressLine=f;
        city=g;
        state=h;
        zipcode=i;
    }*/

    public Student(){}

    public ArrayList getArray() {
        return studentarray;
    }

    public void firstname_(String a){
        char[] b = a.toCharArray();
        for (char c : b) {
            if(!Character.isLetter(c)) {
                System.out.println("Error");
                System.exit(0);
            }
        }
        firstname=a;
    }
    public void lastname_(String a){
        char[] b = a.toCharArray();
        for (char c : b) {
            if(!Character.isLetter(c)) {
                System.out.println("Error");
                System.exit(0);
            }
        }
        lastname=a;
    }
    public void ID_(int a){
        if (a>9999999){
            System.out.println("Error, greater than 7");
            System.exit(0);
        }
        else if (!(a==(int)a)){
            System.out.println("Error, not an integer");
            System.exit(0);
        }
        ID=a;

    }
    public void classstanding_(String a){ //fix this
        if(a=="freshman"||a=="sophomore"||a=="junior"||a=="senior"){
            classStanding=a;
        }
        else {
            System.out.println("Error");
            System.exit(0);
        }
    }
    public static boolean email_(String email) //fix this
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public void addressLine_(String a){
        addressLine=a;
    }
    public void city_(String a){
        char[] b = a.toCharArray();
        for (char c : b) {
            if(!Character.isLetter(c)) {
                System.out.println("Error");
                System.exit(0);
            }
        }
        city=a;
    }
    public void state_(String a){
        state=a;
    }
    public void zipcode_(int a){
        zipcode=a;
    }
}
