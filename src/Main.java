import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public class Operaciones {
		public static boolean esPrimo(int numero)  {
			for (int i = 2; i < numero; i++)
	            if (numero % i == 0)
	                return false;
			
			return true;
		}
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
		List<String> nombres = new ArrayList<>(Arrays.asList("juan", "pepe", "juanma", "alex"));
		
		numerosPrimosFuncional(numeros);
		
		System.out.println(numeros.stream().filter(x -> x%2==0).mapToInt(x -> x).sum());
	}

	/**
	 * Recorre la lista "numero" mediante el .stream(), aplica el filtro llamando a una funcion
	 * para comprobar si es numero primo, y almacena los elementos del stream que superen el filtro en una lista.
	 * 
	 * @param numeros
	 */
	public static void numerosPrimosFuncional(List<Integer> numeros) {
		List<Integer> primos = numeros.stream().filter(x -> Operaciones.esPrimo(x)).collect(Collectors.toList());

		System.out.println(primos);		
	}
}
