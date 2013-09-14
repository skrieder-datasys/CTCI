import java.util.*;
// a new class student
public class Student{
    
    String fname;
    String lname;
    Integer id;
    
    // overload constuctor
    public Student(String a, String b, Integer num){
	fname =a;
	lname =b;
	id = num;
    }

    public static HashMap<Integer, Student> buildMap(ArrayList<Student> students){
        HashMap<Integer, Student> x = new HashMap<Integer, Student>();
        for(Student s : students){
	    x.put(s.id, s);
        }
	return x;
    }

    public static void main(String [] args)
    {

        HashMap hm = new HashMap();
        // Put elements to the map                                                                       
        hm.put("John Doe", new Double(3434.34));
        double d = (Double)hm.get("John Doe");
        System.out.println(d);

        //HashMap y = buildMap(1);
        //int i = (Integer)y.get(1);
        //System.out.println(i);
	
	//
	System.out.println("Hi");
	Student scott = new Student("Scott", "Krieder", 2);
	System.out.println(scott.fname + " " + scott.lname);
	System.out.println("");
	System.out.println("Hi");
	Student rach = new Student("Rachel", "Napier", 1);
	System.out.println(rach.fname +  " " + rach.lname + " " + rach.id);

	//	Student[] students = new Student[2];
	ArrayList<Student> students = new ArrayList<Student>();

	students.add(scott);
	students.add(rach);
	//students[0] = scott;
	//students[1] = rach;

	HashMap y;
	y = buildMap(students);

	Student james = (Student)y.get(2);
	String s = (String)james.fname;
	Student ann = (Student)y.get(1);
	String r = (String)ann.fname;

	System.out.println("woot");
	System.out.println("woot");
	System.out.println(s);
	System.out.println(r);
    }
}