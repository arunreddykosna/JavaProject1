import java.util.Scanner;

public class Project5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to be compaired");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b&&a>c) {
			System.out.println(a+" is the largest number");
		}
		else if(b>a&&b>c) {
			System.out.println(b+" is the largest number");
		}
		else if(c>a&&c>b) {
			System.out.println(c+" is the largest number");
		}
		else {
			System.out.println("the values entered are not distinct");
		}
	}

}
