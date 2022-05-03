import java.util.ArrayList;

public class BasicJava {

	public void numbers() {
		System.out.println("1.----- Todos los n�mero del 1 al 255 ------");

		int i = 1;
		while (i <= 255) {
			System.out.print(i + ", ");
			i++;
		}

	}

	public void imparNumbers() {
		System.out.println("\n\n2.----- N�meros impares del 1 al 255 ------");

		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}

	public void suma() {
		System.out.println("\n\n3.----- Suma 1 al 255 ------");

		int total = 0;
		for (int i = 0; i <= 255; i++) {
			total += i;
			System.out.printf("Numero nuevo: %d Suma: %d \n", i, total);
		}
	}

	public void array() {
		System.out.println("\n\n4.----- Recorrer un arreglo ------");

		int[] arr = { 1, 3, 5, 7, 9, 13 };
		for (int i : arr) {
			System.out.println(i);
		}

	}

	public void maxNum() {
		System.out.println("\n\n5.----- Encontrar el maximo numero ------");

		int[] arr = { 1, 3, 42, 9, 48, 2, -4, -99 };

		int maxNum = arr[0];
		for (int i : arr) {
			System.out.print(i + ", ");
			if (maxNum < i) {
				maxNum = i;
			}
		}

		System.out.println("\nNumero Maximo: " + maxNum);

	}

	public void promedio() {
		System.out.println("\n\n6.----- Obtener el promedio ------");

		int[] arr = { 10, 10, 4 };

		double total = 0;
		double promedio = 0;

		for (int i : arr) {
			total += i;
		}

		promedio = Math.floor(total / arr.length * 100) / 100;

		System.out.println("Promedio: " + promedio);

	}

	public void imparArray() {
		System.out.println("\n\n7.----- Arreglo de numeros impares ------");

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				arr.add(i);
			}
		}

		System.out.println(arr);
	}

	public void maxY() {
		System.out.println("\n\n8.----- Mayor que Y ------");

		int[] arr = { 1, 3, 5, 7 };
		int y = 3;
		int count = 0;

		for (int i : arr) {
			if (i >= y) {
				count++;
			}
		}

		System.out.println("Cantidad de numeros > 3(y): " + count);
	}

	public void numCuadrado() {
		System.out.println("\n\n9.----- Valores al cuadrado ------");

		ArrayList<Integer> arrPow = new ArrayList<Integer>();
		int[] arr = { 1, 5, 10, -2 };

		for (int i : arr) {
			arrPow.add((int) Math.pow(i, 2));
		}

		System.out.println(arrPow);
	}

	public void eliminarNumNegativo() {
		System.out.println("\n\n10.----- Eliminar numeros negativos ------");

		int[] arr = { 1, 5, 10, -2 };
		ArrayList<Integer> arrPositivo = new ArrayList<Integer>();

		for (int i : arr) {
			if (i > 0) {
				arrPositivo.add(i);
			} else if (i < 0) {
				arrPositivo.add(0);
			}
		}
		System.out.println(arrPositivo);
	}

	public void minMaxPromedio() {
		System.out.println("\n\n11.----- Minimo, maximo y promedio ------");

		int[] arr = { 1, 5, 10, -2 };
		ArrayList<Object> arrResult = new ArrayList<Object>();

		int max = 0;
		int min = 0;
		double suma = 0;
		double promedio = 0;

		for (int i : arr) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
			suma += i;
		}

		promedio = Math.floor(suma / arr.length * 100) / 100;

		arrResult.add(max);
		arrResult.add(min);
		arrResult.add(promedio);

		System.out.println(arrResult);
	}

	public void combinarArray() {
		System.out.println("\n\n12.----- Combinando los valores del Arreglo ------");

		int[] arr = { 1, 5, 10, 7, -2 };
		ArrayList<Object> arrResult = new ArrayList<Object>();

		for (int i = 1; i < arr.length; i++) {
			arrResult.add(arr[i]);
		}
		arrResult.add(0);

		System.out.println(arrResult);

	}

}
