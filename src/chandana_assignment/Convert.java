package chandana_assignment;

public class Convert {
public static void main (String args[])

{	
	String testString = "TESTSTRING";
    String output = "";
    for (int i = 0; i < testString.length(); i++) {
        if(i%2 == 0)
        {
            output += Character.toUpperCase(testString.toCharArray()[i]);
        }else
        {
            output += Character.toLowerCase(testString.toCharArray()[i]);
        }
    }

    System.out.println("Newly generated string is as follow: "+ output);
}
	
	

}
