import java.util.Scanner;

//Compare Strings
public class Project8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Strins to be Compaired");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.compareTo(s2)>0) {
			System.out.println("the String"+s1 + "is greater than"+s2);
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("the String"+s1+"is less than"+s2);
		}
		else {
			System.out.println("the both Strings are same");
		}
	}

}
