public class BankAccountTest {
    public static void main(String[] args) {

		System.out.println("------------ Bank Account -------------\n");

		BankAccount ba = new BankAccount();
		ba.deposito(5000, "corriente");
		ba.deposito(4000, "ahorro");
		ba.retirar(500, "ahorro");
		ba.retirar(10000, "corriente");

		System.out.println("fondos totales: $" + ba.totalFondos());
		System.out.println(ba.toString());

		ba.cantidadCtas();
	}
}
