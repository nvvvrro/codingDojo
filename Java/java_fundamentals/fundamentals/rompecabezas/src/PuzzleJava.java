import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {

	public void arrNum() {
		System.out.println("1.------- Arreglo de numeros ---------");

		ArrayList<Integer> arrMax = new ArrayList<>();
		int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };

		int suma = 0;
		for (int i : arr) {
			if (i >= 10) {
				arrMax.add(i);
			}
			suma += i;
		}

		System.out.println("suma : " + suma + "\nNumeros mayores a 10: " + arrMax);
	}

	public void arrNombres() {
		System.out.println("\n2.------- Arreglo de Nombres ---------");

		ArrayList<String> arrMax = new ArrayList<>();
		ArrayList<String> arr = new ArrayList<>();

		arr.add("Nancy");
		arr.add("Jinichi");
		arr.add("Fujibayashi");
		arr.add("Momochi");
		arr.add("Ishikawa");

		for (String nombre : arr) {
			if (nombre.length() > 5) {
				arrMax.add(nombre);
			}
		}

		System.out.println(arr + "\n Nombre mayor a 5 caracteres: \n" + arrMax);

	}

	public void alfabeto() {
		System.out.println("\n3.------- Alfabeto combinado ---------");

		List<Character> alf = new ArrayList<>();

		for (int i = 0; i < 26; i++) {
			alf.add((char) ('a' + i));
		}

		Collections.shuffle(alf);
		char firstLetter = alf.get(0);
		char endLetter = alf.get(alf.size() - 1);

		String mensaje = "";
		if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
				|| firstLetter == 'u') {
			mensaje = " -> esto es una vocal! ";
		}

		System.out.println(alf + "\nPrimera letra: " + firstLetter + mensaje + "\nUltima letra: " + endLetter);

	}

	public void randomNum() {
		System.out.println("\n4.------- Arreglo aleatorio 55 - 100 ---------");
		ArrayList<Integer> arrNum = new ArrayList<>();

		Random rdm = new Random();

		for (int i = 0; i < 10; i++) {
			arrNum.add(rdm.nextInt(100 - 55 + 1) + 55);
		}

		System.out.println(arrNum);
	}

	public void randomSort() {
		System.out.println("\n5.------- Arreglo aleatorio ordenado 55 - 100 ---------");

		List<Integer> arrNum = new ArrayList<Integer>(10);
		Random rdm = new Random();

		for (int i = 0; i < 10; i++) {
			arrNum.add(rdm.nextInt(100 - 55 + 1) + 55);
		}
		Collections.sort(arrNum);

		int min = Collections.min(arrNum);
		int max = Collections.max(arrNum);

		System.out.println(arrNum + "\nMinimo: " + min + "\nMaximo: " + max);
	}

	public void randomString() {
		System.out.println("\n6.------- Cadena aleatoria de 5 caracteres ---------");
		List<Character> alf = new ArrayList<>();

		String random = "";
		Random rdm = new Random();

		for (int i = 0; i < 5; i++) {
			alf.add((char) ('a' + rdm.nextInt(26)));
		}

		for (Character i : alf) {
			random += i;
		}

		System.out.println("String random: " + random);
	}

	public void arrRandomString() {
		System.out.println("\n7.------- Arreglo con 10 cadenas aleatorias  ---------");

		ArrayList<Character> alf = new ArrayList<>();
		ArrayList<String> arr = new ArrayList<>();

		String alfabeto = "";
		Random rdm = new Random();

		for (int i = 0; i < 26; i++) {
			alf.add((char) ('a' + i));
		}

		for (Character i : alf) {
			alfabeto += i;
		}

		for (int i = 0; i < 10; i++) {
			String random = "";
			for (int j = 0; j < 10; j++) {
				random += alfabeto.charAt(rdm.nextInt(alfabeto.length()));
			}
			arr.add(random);
		}

		System.out.println("String random: " + arr);

	}

}
