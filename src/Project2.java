import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the two numbers to be swapped");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int temp;
		System.out.println("the numbers before swapping:-"+"\nx:"+x+"\ny:"+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("the numbers after swapping :-"+"\nx:"+x+"\ny:"+y);
		
	}

}
