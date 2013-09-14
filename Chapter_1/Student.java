// a new class student
public class Student{
    
    String fname;
    String lname;
    Integer id;
    
    // constuctor
    public Student(String a, String b){
	fname =a;
	lname =b;
    }

    // overload constuctor
    public Student(String a, String b, Integer num){
	fname =a;
	lname =b;
	id = num;
    }

    public static Integer getID(Student s){
	return s.id;
    }

    public static void main(String [] args)
    {

	System.out.println("Hi");
	Student scott = new Student("Scott", "Krieder");
	System.out.println(scott.fname + " " + scott.lname);
	System.out.println("");
	System.out.println("Hi");
	Student rach = new Student("Rachel", "Napier", 1);
	System.out.println(rach.fname +  " " + rach.lname + " " + rach.id);
	System.out.println(getID(rach));
    }
    

}