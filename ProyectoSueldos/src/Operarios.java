import java.util.Scanner;

public class Operarios 
{
	Scanner teclado;
	int [] sueldos;
	
	public Operarios() //constructor
	{
		teclado=new Scanner(System.in);
		
		sueldos = new int [5]; // vector?
		
		for(int s=0;s<5;s++)
		{
			System.out.print("Ingrese valor del sueldo: ");
			sueldos [s]=teclado.nextInt();
		}
	}
	
	
	public void imprimir()
	{
		for(int s=0;s<5;s++)
		{
			System.out.println("-----------------------------");
			System.out.println();
			System.out.println("Los sueldos ingresados son: " + sueldos [s]);
			
			
		}	
	}
		
	
	public static void main(String[] args) {
	
		Operarios op = new Operarios();
		
		op.imprimir();
		
		
		
		
		
	}

}
