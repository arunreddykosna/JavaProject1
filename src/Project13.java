import java.util.Scanner;

//Floyd's Triangle
public class Project13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbet till the trianle should be");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		}
	}


