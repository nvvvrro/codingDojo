package cl.dojo;

import cl.dojo.libraries.FizzBuzz;

public class FizzBuzzTest {

	public static void main(String[] args) {

		FizzBuzz fizzBuzz = new FizzBuzz();

		String result = fizzBuzz.fizzBuzz(15);
		System.out.println(result);
	}

}
