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
    private static int count=0;

    public Student() { }

    public void firstname_(String a) {
        char[] b = a.toCharArray();
        for (char c : b) {
            if (!Character.isLetter(c)) {
                System.out.println("Error");
                System.exit(0);
            }
        }
        firstname = a;
        count++;
    }

    public void lastname_(String a) {
        char[] b = a.toCharArray();
        for (char c : b) {
            if (!Character.isLetter(c)) {
                System.out.println("Error");
                System.exit(0);
            }
        }
        lastname = a;
    }

    public void ID_(int a) {
        if (a > 9999999) {
            System.out.println("Error, greater than 7");
            System.exit(0);
        } else if (!(a == (int) a)) {
            System.out.println("Error, not an integer");
            System.exit(0);
        }
        ID = a;
    }

    public void classstanding_(String a) {
        if (a.equals("freshman") || (a.equals("sophomore")) || (a.equals("junior")) || (a.equals("senior"))) {
            classStanding = a;
        } else {
            System.out.println("Error");
            System.exit(0);
        }
    }

    public void email_(String a) { //I don't know how to do this without regex.
        email=a;
    }

    public void addressLine_(String a) { //I also don't know how to do this one.
        addressLine = a;
    }

    public void city_(String a) {
        char[] b = a.toCharArray();
        for (char c : b) {
            if (!Character.isLetter(c)) {
                System.out.println("Error");
                System.exit(0);
            }
        }
        city = a;
    }

    public void state_(String a) {
        if (a.equals("AK")||(a.equals("AL"))||(a.equals("AR"))||(a.equals("AZ"))||(a.equals("CA"))||(a.equals("CO"))||(a.equals("CT"))||(a.equals("DC"))||(a.equals("DE"))||(a.equals("FL"))||(a.equals("GA"))||(a.equals("HI"))||(a.equals("IA"))||(a.equals("ID"))||(a.equals("IL"))||(a.equals("IN"))||(a.equals("KS"))||(a.equals("KY"))||(a.equals("LA"))||(a.equals("MA"))||(a.equals("MD"))||(a.equals("ME"))||(a.equals("MI"))||(a.equals("MN"))||(a.equals("MO"))||(a.equals("MS"))||(a.equals("MT"))||(a.equals("NC"))||(a.equals("ND"))||(a.equals("NE"))||(a.equals("NH"))||(a.equals("NJ"))||(a.equals("NM"))||(a.equals("NV"))||(a.equals("OH"))||(a.equals("OK"))||(a.equals("OR"))||(a.equals("PA"))||(a.equals("RI"))||(a.equals("SC"))||(a.equals("SD"))||(a.equals("TN"))||(a.equals("TX"))||(a.equals("UT"))||(a.equals("VA"))||(a.equals("VT"))||(a.equals("WA"))||(a.equals("WI"))||(a.equals("WV"))||(a.equals("WY"))){
            state = a;
        }
        else {
            System.out.println("Error");
            System.exit(0);
        }
    }

    public void zipcode_(int a) {
        if (a > 999999999) {
            System.out.println("Error");
            System.exit(0);
        } else if (!(a == (int) a)) {
            System.out.println("Error, not an integer");
            System.exit(0);
        }
        zipcode = a;
    }

    public void getInfo(){
        System.out.println("First name: "+firstname);
        System.out.println("Last name: "+lastname);
        System.out.println("ID: "+ID);
        System.out.println("Class Standing: "+classStanding);
        System.out.println("Email: "+email);
        System.out.println("Address: "+addressLine);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zipcode);
    }

    public static int getCount(){
        return count;
    }
}
