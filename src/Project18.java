import java.util.Scanner;

//Leapyear
public class Project18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check the leap year");
		int n=sc.nextInt();
		if((n%4==0)&&(n%100!=0)||(n%400==0)) {
			System.out.println(n+" is a leap year");
		}else {
			System.out.println(n+" not a leap year");
			
		}
	}

}
