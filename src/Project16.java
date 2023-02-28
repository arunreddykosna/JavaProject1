import java.util.Scanner;

//Palindrome
public class Project16{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String temp="";
		System.out.println("enter a num to check its palindrome or not");
		String n=sc.nextLine();
		for(int i=0;i<n.length();i++) {
			char ch=n.charAt(i);
			temp=ch+temp;
			
		}
		if(temp.equals(n)) {
			System.out.println("its a palindrome number");
		}
		else {
			System.out.println("its not palindrome number");
		}
		
	}

}
