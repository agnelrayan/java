/**
 * Created by agnel on 5/31/18.
 */
class Student {
    int id;
    String name;
    static String collegeName="MACE";

    public Student(){
        this(30,"XY");
        System.out.println("In Default Constructor..");
    }
    public Student(int i,String n){
       // this();
        id=i;
        name=n;
    }
     void display(){
         System.out.println("Id : "+id+" Name : "+name+" College Name: "+collegeName);
     }

    public static void main(String[] args) {
         Student st3 = new Student();
     //   Student st = new Student(10,"AG");
       // Student st2 = new Student(20,"AB");
        //st.display();
        //st2.display();
        st3.display();
        //System.out.println(Student.collegeName);



    }
}
