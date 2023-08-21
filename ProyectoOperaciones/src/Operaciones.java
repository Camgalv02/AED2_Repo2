import java.util.Scanner;

public class Operaciones {

	Scanner teclado;
	int val1;
	int val2;
	
	
	public Operaciones() // constructor // no puede llevar void o tipo
	{
		teclado= new Scanner(System.in);
		
		System.out.print("Ingrese el Primer valor: ");
		val1= teclado.nextInt();
		
		System.out.print("Ingrese el Segundo valor: ");
		val2= teclado.nextInt();
		System.out.println();
		System.out.println();
	}
	
	public void sumar()
	{
		int suma = val1 + val2;
		System.out.println("El resultado de la suma de los dos valores es: " + suma );
		System.out.println("----------------------------------------------");
	}
	
	public void restar()
	{
		int resta = val1 - val2;
		System.out.println("El resultado de la resta de los dos valores es: " + resta );
		System.out.println("-----------------------------------------------");
	}
	
	public void multiplicar()
	{
		int multiplicacion = val1 * val2;
		System.out.println("El resultado del producto de los dos valores es: " + multiplicacion );
		System.out.println("------------------------------------------------");
	}
		
	public void dividir()
	{
		float division = val1 / val2;
		System.out.println("El resultado de la division de los dos valores es: " + division );
		System.out.println("--------------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		Operaciones op= new Operaciones();
		
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();

	}

}
