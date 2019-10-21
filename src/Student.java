public class Student {
    private String firstname;
    private String lastname;
    private int ID;
    private String classStanding;
    private String email;
    private String addressLine;
    private String city;
    private char state;
    private int zipcode;
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
    public void firstname_(String a){
        char[] b = a.toCharArray();
        for (char c : b) {
            if(!Character.isLetter(c)) {
                System.out.println("Error");
                System.exit(0);
            }
        }
        firstname=a;
        System.out.println(firstname);
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
        System.out.println(lastname);
    }
    public void ID_(int a){
        if (a>7){
            System.out.println("Error");
            System.exit(0);
        }
        else if (!(a==(int)a)){
            System.out.println("Error");
            System.exit(0);
        }
        ID=a;
    }
    }
