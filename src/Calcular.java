
public class Calcular {
	private String num1;

	private String num2;

	public Calcular(String n1, String n2) {
		num1 = n1;
		num2 = n2;
	}

	public int sumar() {
		int resultado = Integer.parseInt(num1) + Integer.parseInt(num2);
		return resultado;
	}
	public int multiplicar() {
		int resultado = Integer.parseInt(num1) * Integer.parseInt(num2);
		return resultado;
	}
	public float dividir() {
		float resultado = Integer.parseInt(num1) / Integer.parseInt(num2);
		return resultado;
	}
	public int restar() {
		int resultado = Integer.parseInt(num1) - Integer.parseInt(num2);
		return resultado;
	}
	
}
