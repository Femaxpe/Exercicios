public class typeConv{
	public static void main(String args []) {
		
		int iVal = 25;
		
		switch(iVal % 2) {
			case 0:
				System.out.print(iVal);
				System.out.println(" is even");
				break;
			case 1:
				System.out.print(iVal);
				System.out.println(" is odd");
				break;
			default:
				System.out.println("broke");
				break;
		
		}
	}
}