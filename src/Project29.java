import java.util.Scanner;

//LCM
public class Project29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to calculate LCM");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int lcm=(n1>n2)?n1:n2;
		
		while((n1!=0)&&(n2!=0)) {
			if((lcm%n1==0)&&(lcm%n2==0)) {
				System.out.println("the LCM of "+n1+" and "+n2+" is "+lcm);
				break;
				}
			lcm++;
			
		}
	}

}
