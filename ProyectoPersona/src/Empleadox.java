import java.util.Scanner;

public class Empleadox extends Personasx {

	
	Float sueldo;
	Scanner teclado;
	
	
	public void cargarDatos()
	{
		teclado=new Scanner (System.in);
		
		System.out.println();
		System.out.print("Ingrese Sueldo de la Persona: ");
		sueldo=teclado.nextFloat();
		
		
	}
	
	
	public void imprimirDatos()
	{
		System.out.println("---------------------");
		System.out.println();
		System.out.print("Sueldo de la Persona: "+ sueldo);
		System.out.println();
		System.out.println("---------------------");
	}
	




	public static void main(String[] args) {
		
		Personasx p = new Personasx();
		
		p.cargarDatos();
		p.imprimirDatos();
		
		Empleadox e = new Empleadox();
		
		e.cargarDatos();
		e.imprimirDatos();
		
	}

}
