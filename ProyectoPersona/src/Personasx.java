
import java.util.Scanner;

public class Personasx {

	Scanner teclado;
	String nombre;
	int edad;
	
	public void cargarDatos()
	{
		teclado=new Scanner (System.in);
		
		System.out.print("Ingrese Nombre de la Persona: ");
		nombre=teclado.next();
		
		System.out.print("Ingrese la Edad de la Persona: ");
		edad=teclado.nextInt();
		
		System.out.println();
		
	}
	
	
	public void imprimirDatos()
	{
		System.out.println("---------------------");
		System.out.println();
		System.out.print("Nombre de la Persona: "+ nombre);
		System.out.println();
		System.out.print("Edad de la Persona: "+ edad);
		System.out.println();
		System.out.println("----------------------");
		
	}
	
	
	
	public static void main(String[] args) {


	}

}
