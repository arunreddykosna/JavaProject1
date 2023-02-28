import java.util.Scanner;

//SubString
public class Project14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String for subStrins");
		String s=sc.nextLine();
		for(int i=0;i<=s.length();i++) {
			for(int j=1;j<=s.length()-i;j++) {
				System.out.println(s.substring(i,i+j));
			}
		}
	}

}
