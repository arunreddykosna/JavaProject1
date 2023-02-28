import java.util.Scanner;

//Vowel or Consonent
public class Project20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char to check it is Vowel or Consonent");
		char ch=sc.next().toLowerCase().charAt(0);
		if (ch=='a'||ch =='e'||ch=='i'||ch =='o'|| ch=='u') {
			System.out.println(ch+" is a Vowel");
			
		}else {
			System.out.println(ch+"  is a consonent");
		}
	}

}
