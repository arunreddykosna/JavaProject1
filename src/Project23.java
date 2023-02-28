import java.util.Scanner;

//Reverse of number
public class Project23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		int reverese=0;
		int n=sc.nextInt();
		while(n!=0) {
			reverese=reverese*10;
			reverese=reverese+(n%10);
			n=n/10;
		}
		System.out.println(reverese );
			
	}
	}