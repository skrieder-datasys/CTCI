import java.util.*;
public class StackTest{


    public static void main(String[] args){
	Stack s = new Stack();
	s.push("World");
	s.push("Hello");
	System.out.println(s.pop());
	System.out.println(s.pop());
    }

}