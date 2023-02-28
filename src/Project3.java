import java.util.Scanner;

public class Project3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers to be swapped");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("the numbers before the swapping :-"+"\nx:"+x+"\ny:"+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("the numbers After swapping :- "+"\nx:"+x+"\ny:"+y);
	
}
}
