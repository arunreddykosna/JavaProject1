import java.util.Random;

//Random number
public class Project21 {
	public static void main(String[] args) {
		Random t=new Random();
		for(int i=1;i<=10;i++) {
			System.out.println(t.nextInt(900));
		}
	}

}
