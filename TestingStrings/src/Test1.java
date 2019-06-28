
public class Test1{
	public static void main(String args []) {
		
		
		String s1 = "I Love";
		s1 += " Java";
		String s2 = "I";
		s2 += " Love Java";
		
		//instancias diferentes
		if(s1.equals(s2)) {
			System.out.println("yes");
		}
	}
}