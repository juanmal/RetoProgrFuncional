import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
	
	public class Operaciones {
		public static boolean esPrimo(int numero)  {
			// Genera una lista desde 2 a numero		
			
			// Para todo el rango 2 -> numero, aplica un filtro calculando el resto de la division del numero y todos los valores menores mayores que 1,
			// pasando el filtro unicamente los que sean numeros primos, si el resultado obtenido es igual al numero recibido por parametro, es primo
			
			int res = IntStream.rangeClosed(2, numero).filter(x -> numero % x == 0).sum();

			if (res > numero)
				return false;

			return true;
		}
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
		List<String> nombres = new ArrayList<>(Arrays.asList("juan antonio", "pepe andres", "juan manuel", "alex perez"));
		
		numerosPrimosFuncional(numeros);
		
//		System.out.println(numeros.stream().filter(x -> x%2==0).mapToInt(x -> x).sum());
		convierteNombresCamelCase(nombres);
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
	
	public static void convierteNombresCamelCase(List<String> nombres) {
//		List<String> nombresCamelCase = nombres.stream().map(x -> x.split(" ")).collect(Collectors.groupingBy(x -> x[1], ));
//		
//		System.out.println(nombresCamelCase);
	}
}
