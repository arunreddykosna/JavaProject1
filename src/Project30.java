import java.util.Scanner;

//Transpose of Matrix
public class Project30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and columns of the matrix");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int matrix[][]=new int[x][y];
		System.out.println("enter the elements of matrix");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++){
				matrix [i][j]=sc.nextInt();
				}
		}
		int transpose [][]=new int[y][x];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				transpose[j][i]= matrix[i][j];
			}
		}
		System.out.println("the transpose matrix is:-");
		
		for(int i=0;i<y;i++) {
			for(int j=0;j<x;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}

}
