import java.util.Scanner;

//Prime number
public class Project25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check a prime number or not");
		int n=sc.nextInt();
		 for(int i=2;i<=n/2;i++){
			 if(n%i==0){
				 System.out.println(n+" is not prime number");
				 break;
				 }  
			 else {
				 System.out.println(n+" is a prime number");
			 }
			   }      
	}

}
