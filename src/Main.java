import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
	
	public class Operaciones {
		/**
		 * Para todo el rango 2 -> numero, aplica un filtro calculando si el resto de la division del numero
		 * y los valores menores mayores que 1 es igual a 0, solo pasaran el filtro los que sean numeros primos, 
		 *  por lo que, de ser primo, el valor de res, debe ser igual o menos al numero pasado por parametro	
		 * @param numero
		 * @return
		 */
		public static boolean esPrimo(int numero)  {
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
