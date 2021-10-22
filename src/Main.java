import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public class Operaciones {
		public static boolean esPrimo(int numero)  {
			int contador = 2;
			boolean primo=true;

			while (primo && contador != numero) {
			  if (numero % contador == 0)
			    primo = false;
			  contador++;
			}
			
			return primo;
		}
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList());
		List<String> nombres = new ArrayList<>(Arrays.asList("juan", "pepe", "juanma", "alex"));
		
		long t_ini = System.currentTimeMillis();
		List<Integer> primos = numeros.stream().filter(x -> Operaciones.esPrimo(x)).collect(Collectors.toList());
		long t_fin = System.currentTimeMillis();
		System.out.println("Tiempo: " + ((t_fin - t_ini)/1000));
		System.out.println(primos);
		
	}
}
