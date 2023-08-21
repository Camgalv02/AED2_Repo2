//SUPERCLASE o Clase Padre

import java.util.Scanner;

public class Operacion 
{

	protected Scanner teclado; //para pedir datos por teclado
	protected int valor1; // se pueden usar en una subclase que herede de la clase operacion
	protected int valor2;
	
	protected int resultado;
	
	public Operacion() // constructor // no puede llevar void o tipo
	{
		teclado= new Scanner(System.in);
	}
	
	public void cargarValor1()
	{
		System.out.print("Ingrese el Primer valor: ");
		valor1= teclado.nextInt();
	}
	
	public void cargarValor2()
	{
		System.out.print("Ingrese el Segundo valor: ");
		valor2= teclado.nextInt();
	}
	
	public void mostrarResultado()
	{
		System.out.println(resultado);
	}
}
