import java.util.Scanner;

//Number of Days into moths and Days
public class Project19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to convert into days and months");
		int n=sc.nextInt();
		int months=n/30;
		int days =n%30;
		System.out.println(months +" months "+days+" days");
		
	}

}
