import java.util.Scanner;

public class Project1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println ("Enter the temp to convert from farehnhit to celsius");
	float temp=sc.nextInt();
	float conversion=((temp-32)*5)/9;
	System.out.println("the temp converted is :" + conversion);
	
}
}