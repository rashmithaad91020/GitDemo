import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String str;
		String strrev ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		str = sc.next();
		
		int i=str.length()-1;
		do{			
			strrev= strrev + str.charAt(i);
			i--;
		}
		while(i>=0);
		
		if(strrev.equalsIgnoreCase(str)) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
