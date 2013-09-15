import java.lang.String;

public class StringBufferTest{

    public static String joinWords(String[] words){

	String sentence = "";
	for(String w: words){
	    sentence = sentence + w;
	}
	return sentence;
    }

    public static String joinWords2(String[] words){

	StringBuffer sentence = new StringBuffer();
	for(String w: words){
	    sentence.append(w);
	}
	return sentence.toString();
    }

    public static void main(String[] args){

	// One
	String[] s = new String[3];
	s[0] = "Hello";
	s[1] = " ";
	s[2] = "World";
	String x = joinWords(s);
	System.out.println(x);
	
	// Two
	String[] t = new String[3];
	t[0] = "Helloz";
	t[1] = " to ";
	t[2] = "Worldz";
	String y = joinWords2(t);
	System.out.println(y);
    }

}