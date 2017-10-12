import java.util.Scanner;
public class sentecia_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int ola=0;
		
		
		
		System.out.print("ingresame un numero wacho");
		ola=sc.nextInt();
		
		if (ola>0&&ola%2==0) {
			System.out.println("es positivo mono");
			System.out.println("es par");
		}
		
		
		
		else {
			System.out.println("ni sirve mini");
		}
	}

}
