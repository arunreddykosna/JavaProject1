import java.util.Scanner;

public class Project24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n!=0) {
			System.out.println("your entered number is:"+n);
			System.out.println("enter a number");
		}
	}

}
