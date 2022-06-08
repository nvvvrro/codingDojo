import java.util.Random;

public class BankAccount {
	private String numCuenta;
	private double saldoCtaCorriente = 0;
	private double saldoCtaAhorro = 0;
	private static int ctasCreadas = 0;
	private static double totalSaldo = 0.0;

	public BankAccount() {
		super();
		this.numCuenta = generarCuenta();
		ctasCreadas++;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldoCtaCorriente() {
		return saldoCtaCorriente;
	}

	public void setSaldoCtaCorriente(double saldoCtaCorriente) {
		this.saldoCtaCorriente = saldoCtaCorriente;
	}

	public double getSaldoCtaAhorro() {
		return saldoCtaAhorro;
	}

	public void setSaldoCtaAhorro(double saldoCtaAhorro) {
		this.saldoCtaAhorro = saldoCtaAhorro;
	}

	@Override
	public String toString() {
		return "BankAccount [getNumCuenta()=" + getNumCuenta() + ", getSaldoCtaCorriente()=" + getSaldoCtaCorriente()
				+ ", getSaldoCtaAhorro()=" + getSaldoCtaAhorro() + ", totalFondos()=" + totalFondos() + "]";
	}

	private String generarCuenta() {
		String numCta = "";

		Random rdm = new Random();
		for (int i = 0; i < 10; i++) {
			numCta += String.valueOf(rdm.nextInt(9));
		}

		return numCta;
	}

	public void deposito(double monto, String cuenta) {

		if (cuenta.equals("ahorro")) {
			this.saldoCtaAhorro += monto;
			System.out.println("cuenta ahorro(DEPOSITO) + $" + monto);

		} else if (cuenta.equals("corriente")) {
			this.saldoCtaCorriente += monto;
			System.out.println("cuenta corriene(DEPOSITO) + $" + monto);

		} else {
			System.out.println("debe depositar a cuenta <ahorro> o <corriente>");
		}

		totalSaldo += monto;
	}

	public void retirar(double monto, String cuenta) {

		if (cuenta.equals("ahorro")) {
			if (monto <= this.saldoCtaAhorro) {
				this.saldoCtaAhorro -= monto;
				totalSaldo -= monto;
				System.out.println("cuenta ahorro(RETIRO) - $" + monto);
			} else {
				System.out.println("fondos insuficiente en cuenta ahorro!");
			}
		} else if (cuenta.equals("corriente")) {
			if (monto <= this.saldoCtaCorriente) {
				this.saldoCtaCorriente -= monto;
				totalSaldo -= monto;
				System.out.println("cuenta corriente(RETIRO) - $" + monto);
			} else {
				System.out.println("fondos insuficiente en cuenta corriente");
			}
		} else {
			System.out.println("debe retirar de cuenta <ahorro> o <corriente>");
		}
	}

	public double totalFondos() {
		return totalSaldo;
	}

	public void cantidadCtas() {
		System.out.println(ctasCreadas);
	}
}
