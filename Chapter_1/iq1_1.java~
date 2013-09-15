import java.lang.String;
import java.util.*;

public class iq1_1{

    public static Boolean isUnique(String s){

	//ArrayList<Character> c = new ArrayList<Character>();
	
	int x = s.length();

	char[] c = new char[x];

	c = s.toCharArray();

	for(int i=0;i<x;i++){
	    for(int j=i+1;j<x;j++){
		System.out.println("c[i]=" + c[i] + ", c[j] = " + c[j]); 
		if(c[i]==c[j]){
		    return false;
		}
	    }
	}
	/*
	for(int i=0;i<x;i++){
	    for(int j=i+1;j<x;i++){
		System.out.println("c[i]=" + c[i] + ", c[j] = " + c[j]);
		if(c[i]==c[j]){
		    return false;
		}
	    }
	}
	*/
	return true;
    }

    public static void main(String[] args){
	
	// Test 1
	String s = "World";
	Boolean x = isUnique(s);
	System.out.println(x);

	// Test 2
	String t = "Hello";
	Boolean y = isUnique(t);
	System.out.println(y);
    }

}