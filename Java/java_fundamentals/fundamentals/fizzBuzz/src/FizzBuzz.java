public class FizzBuzz {
	public String fizzBuzz(int number) {

		System.out.println("------- FizzBuzz ------\n");

		String result = "";

		if (number % 3 == 0 && number % 5 == 0) {
			result = "FizzBuzz";
		} else if (number % 3 == 0) {
			result = "Fizz";
		} else if (number % 5 == 0) {
			result = "Buzz";
		} else {
			System.out.println(number);
		}

		String fizzBuzz = String.format("%d: %s", number, result);

		return fizzBuzz;

	}
}
