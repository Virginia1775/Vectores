import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author David
 *
 */
public class Vectores {
	
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	public static void  mostrar_mayores_n(int v[], int n) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] > n) {
				System.out.printf("%3d ", v[i]);
			}	
		}
	}

	public static void  pedir_vector(float v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextFloat();
		}
	}
	
	public static void  mostrar_vector(float v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%.2f ", v[i]);
		}
		System.out.println();
	}
	public static void  mostrar_vector(double v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%.2f ", v[i]);
		}
		System.out.println();
	}
	/**
	 * Función que muestra los elementos del vector v, que se encuentrarn en el
	 * intervalo [a,b)
	 * @param v vector de enteros con los valores
	 * @param a extremo izquierdo del intervalo
	 * @param b extremo derech del intervalo
	 */
	public static void mostrar_valores_a_b(int v [], int a, int b) {
		for (int i = 0; i < v.length; i++) {
			if (v[i]>=a && v[i]<b)
				System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	/**
	 * Método que rota los elementos del vector una posición a la izquierda
	 * @param v el vector a rotar
	 */
	public static void rotarIzq(int v[]) {
		int aux = v[0];
		for (int i = 0; i < v.length-1; i++) {
			v[i]=v[i+1];
		}
		v[v.length-1]=aux;
	}
	
	/**
	 * Método que rota los elementos del vector una posición a la derecha
	 * @param v el vector a rotar
	 */
	public static void rotarDerecha(int v[]) {
		int aux = v[v.length-1];
		for (int i = v.length-1; i >=1; i--) {
			v[i]=v[i-1];
		}
		v[0]=aux;
	}
	
	/**
	 * Método que busca el primer elemento del vector mayor que el numero a pasado
	 * y a partir de él muestra el resto de elemetnos del vector
	 * @param v el vector de números
	 * @param el número a buscar
	 */
	public static void  mostrar_vector_a_partir_a(int v[],int a) {
		
		int i=0;
		for (i=0; i<v.length && v[i]<=a ; i++);
		
		for (int j = i; j < v.length; j++) {
			System.out.printf("%3d ", v[j]);
		}
		System.out.println();
	}
	
	/**
	 * Método que indica si los dos vectores pasados por parámetro son paralelos o no.
	 * Los dos vectores deben tener el mismo tamaño
	 * @param v1 El primer vector
	 * @param v2 El segundo vector
	 * @return true si son paralelos o false en caso contrario
	 */
	public static boolean sonParalelos(float v1[], float v2[]) {
		boolean paralelos = true;
		
		float factor = v1[0]/v2[0];
		for (int i=1; i<v1.length; i++) {
			if (v1[i]/v2[i] != factor) {
				paralelos=false;
			}
		}
		return paralelos;
	}
	
	/**
	 * Método de la clase que determina si un vector es capicúa. Es decir, se lee igual de 
	 * izquierda a derecha de derecha a izquierda.
	 * Por ejemplo el array es: 5 2 1 2 5, el resultado debe ser true
	 * @param v el array de números a comprobar
	 * @return valor boolean, true si es capicúa o false en contrario.
	 */
	public static boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
	
	/**
	 * Método que copua el vector v invertido en el vector inverso, para que funcuones correctaemte
	 * el vector inverso debe tener el mistmo tamaño que el vector v.
	 * @param v vector que queremos invertir
	 * @param inverso vector con la solución, debe crearse antes de llamar la función
	 */
	public static void invertir_vector(int v[], int inverso[]) {
		for (int i=0, j=v.length-1; i<v.length;i++,j--) {
			inverso[i]=v[j];
		}
	}
	
	/**
	 * Método que devulve el vector v invertido.
	 * @param v el vector a invertir 
	 * @return int [] vector con la solucion
	 */
	public static int [] invertir_vector(int v[]) {
		int inverso [] = new int[v.length];
		
		for (int i=0, j=v.length-1; i<v.length;i++,j--) {
			inverso[i]=v[j];
		} 
		return inverso;
	}
	
	/**
	 * Método que devuelve la concatenación de los vectores pasados como parámetros
	 * 
	 * @param v el primer vector de enteros
	 * @param v2 el segundo vector de enteros
	 * @return int [] un vector con la concatenacion de los dos vectores
	 */
	public static int [] concatenar (int v[], int v2[]) {
		int v3 [] = new int[v.length+v2.length];
		
		for (int i = 0; i < v.length; i++) {
			v3[i]=v[i];
		}
		for (int i = 0, j=v.length; i < v2.length; i++, j++) {
			v3[j] = v2[i];
		}
		return v3;
	}
	
	/**
	 * Función que devuelve el vector suma de los dos vectores pasados como parámetros
	 * Atención!, los dos vecotres pasados deben tener el mismo tamaño
	 * @param v el primer vector a sumar
	 * @param v2 el segundo vector
	 * @return int [] el vector suma
	 */
	public static int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	/**
	 * Método qie calcula el producto escalar de dos vectores pasados como parámetro. Los 
	 * dos vectores deben tener el mismo tamaño
	 * @param v el primer vector
	 * @param v2 el segundo vector
	 * @return int con el valor del producto escalas.
	 */
	public static int producto_escalar(int v[], int v2[]) {
		int suma=0;
		
		for (int i = 0; i < v.length; i++) {
			suma = suma + v[i]*v2[i];
		}
		return suma;
	}
	
	public static int num_aciertos(int ganadora[], int apuesta[]) {
		int aciertos = 0;
		for (int i = 0; i < apuesta.length; i++) {
			for (int j = 0; j < ganadora.length; j++) {
				if (apuesta[i]==ganadora[j]) {
					aciertos++;
				}
			}
		}
		return aciertos;
	}
	
	public static int [] sortea() {
		int combinacion[] = new int[6];
		
		for (int i = 0; i < combinacion.length; i++) {
			combinacion[i] = (int) (Math.round(Math.random()*48)+1);
		}
		return combinacion;
	}
	
	
	
}
