import java.util.Scanner;

//Armstrong number
public class Project26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check an Armstrong number");
		int n=sc.nextInt();
		int r,sum=0,digits=0;
		int temp=n;
		while(temp!=0) {
			digits++;
			temp=temp/10;
		}
		temp=n;
		while(temp!=0) {
			r= temp%10;
			sum=sum+power(r,digits);
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println(n+" is an Armstrong number");	
		}
		else {
			System.out.println(n+" is not Armstrong number");
		}
	}
	static int power(int n,int r) {
		int p=1;
		for(int i=1;i<=r;i++) {
			p=p*n;
		}
		return p;
		}
	}


