import java.util.Scanner;

//Sum of natural number
public class Project27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till the sum should be calculated");
		int n=sc.nextInt();
		int sum=((n+1)*n)/2;
		System.out.println(sum);
	}

}
