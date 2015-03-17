import java.util.ArrayList;



class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
}
public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		try
		{
			return a/b;
		}catch(ArithmeticException e) 
		//Se establece el error correspondiente.
		{
			System.out.println("No puede dividir entre cero");
			
		}
		return a/b; 
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{	
		try
		{
			return arreglo[pos];
		
		}catch(Exception e)
		//Se establece el error: La posicion no debe salirse de los limites.
		{

				System.out.println("La posicion no debe salirse de los limites.");
		}
		return 0;
	}

	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		try
		{
			return mi_clase.x;
		
		}catch (Exception e)
		{
			System.out.println("Error Null");
		}
		return 0;
	}
	
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		int promedio = 0;
		int cantidad = 0;
		
		//Se inicializa las variables en cero para el ciclo.
		
		for(Integer numero : mi_lista)
		{
			cantidad = numero + cantidad;
		}
		
		promedio = cantidad / mi_lista.size();
		return promedio;
		
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		int menor = Integer.MAX_VALUE;
		
		//Min_Value y Max_Value Todos los tipos numéricos tienen un valor máximo y mínimo que pueden representar. Sólo tantos bytes están disponibles-esto limita números.
		//http://www.dotnetperls.com/integer-max-value
		
		for(int b = 0; b < mi_lista.size(); b++)	
			
			//b es menor que el tamaño d ela lista, se inicializa en cero.
			
		{
			if(menor > mi_lista.get(b)) menor=mi_lista.get(b); 
		}
		
		return menor;
	}
		
	
	
	//Devuelve la cantidad de veces que existe 'str' (dado) en mi_lista (dado)
	static int contar(ArrayList<String> mi_lista, String str)
	{
		int contador =0;	
		//Contador inicializado en cero.
	
		int largo = mi_lista.size();
		
		//Se comienza el ciclo donde el tamaño de la lista sea menor que b
		
		for(int b = 0; b < largo; b++)
		{
		
			if(str==mi_lista.get(b)) contador = contador + 1;
		}
		
		return contador;
	}
	
	public static void main(String[] args)
	{ 
	}

}
