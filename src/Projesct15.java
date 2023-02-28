import java.util.Scanner;

//Reverse of String
public class Projesct15 {
	public static void main(String[] args) {
		String temp="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String to be reversed");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			temp=ch+temp;
		}
		System.out.println(temp);
		
	}

}
