
public class Ejercicios
{	
	//devuelve true si numero es multiplo de 3, de lo contrario devuelve false
	//2 puntos
	static boolean esMultiploDeTres(int num)
	{
		if ( (num % 3)== 0) 
		{
			return true; 
       
		}
		return false;
	}
		//devuelve el numero menor entre a, b o c
	//Primero creamos la variable resultado para almacenar el resultado

	
	
	//devuelve el numero menor entre a, b o c
	//3 puntos
	static int getMenor(int a, int b, int c)
	{
			int resultado=0;
	//veremos si las condiciones de la variables e menor
		//comparando el valor entre ellas.

		int resultado = 0;
		{
			if ( a<b && a<c)
			{
				return a;
			}
			if (b<c && b<a)
			{
				return b;
			}
			if (c < a && c < b)
			{
				return c;
			}
		}
		//Para cada evaluacion activamos la funcion y la almacenamos en nuestra variable
	//resultado listo para mostrar en pantalla
		return resultado;
		
			}
	
	//devolvera los elementos del arreglo

	
	
	//devuelve el promedio los elementos de un arreglo
	//5 puntos
	static int getPromedio(int arreglo[])
	{
		//Primero creamos una variable llamada resultado para almacenar los calculos
		//crearemos una variable llamada resultado para guardar calculos//
		int resultado = 0;
		int cantidad_numeros = 0;
		//Usamos FOR para que recorra el arreglo y acumula dentro de la variable(cantidad_numeros) el 

		for(int i = 0; i< arreglo.length; i++)
		{
			resultado += arreglo [i];
			cantidad_numeros ++;
		}
		// al terminar todo el arreglo... 
	//dividira la suma de todos 
	//elementos que tiene el arreglo. 
		resultado = (resultado/cantidad_numeros);
		return resultado ;
		}
	
	//Realizar una funcion con las siguientes indicaciones:
	//Si el parametro recibido es "Honduras" devolvera "Tegucigalpa"
	//Si el parametro recibido es "Francia" devolvera "Paris"
	//Si el parametro recibido es "Inglaterra" devolvera "Londres"
	static String getCapital(String pais)
	{
		return "";
	}
	
	//realizarla siguiente funcion recurisva:
	
	/* Pseudocodigo*/
	//funcionRecursiva(num)
	//  si num == 0
	//    devolver 0
	//  fin si
	//  devolver num + funcionRecursiva(num-1)
	
	/*Notacion matematica*/
	//funcionRecusriva(num) = num + funcionRecursiva(num-1)
	//Donde funcionRecursiva(0) = 0
	
	//1 punto oro extra
	static int funcionRecursiva(int num)
	{
		int resultado;//se hace una variable
		if (num == 0)//se evalua la condicion
		{
			resultado = 0;
		}else //se establece el else del if para terminar de evaluar
		{
			resultado = num + funcionRecursiva(num-1);
	}
	return resultado; //devuelve el resultado
}

		
	
	public static void main(String args[])
	{
	}
}
