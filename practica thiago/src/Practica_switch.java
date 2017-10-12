import java.util.Scanner;
public class Practica_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int contraseña=0, valor1=0, valor2=0, resultado=0, opcion=0;
		String nombre;
		boolean salir=false;
		System.out.println("ingrese el usuario");
		nombre=sc.nextLine();
		System.out.println("ingrese la contraseña");
		contraseña=sc.nextInt();
		
		if(nombre.equals("gero")&&contraseña==123) {
			System.out.println("bienvenido a la calculadora");
		}
		do {
			System.out.println("1-suma");
			System.out.println("2-resta");
			System.out.println("3-Salimo mono");
			switch(opcion) {
			case 1:
				System.out.println("ingresame numero");
				valor1=sc.nextInt();
				System.out.println("ingresame numero");
				valor2=sc.nextInt();
				resultado=valor1 + valor2;
				System.out.println("el resultado es: "+resultado);
			case 2:
				System.out.println("ingresame numero");
				valor1=sc.nextInt();
				System.out.println("ingresame numero");
				valor2=sc.nextInt();
				resultado=valor1 - valor2;
				System.out.println("el resultado es: "+resultado);
				
			}
			
			
			
		}while(salir=false);	
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}


