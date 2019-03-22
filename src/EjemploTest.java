import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjemploTest {

	@Test
	void CalcularPositivos() {
		System.out.println("Calcularndo dos números Positivos");
		Calcular s = new Calcular("2", "3");
		assertTrue(s.sumar() == 5);
	}

	@Test
	public void CalcularNegativos() {
		System.out.println("Calcularndo dos números negativos ...");
		Calcular S = new Calcular("-2", "-3");
		assertTrue(S.sumar() == -5);
	}

	@Test
	public void CalcularPositivoNegativo() {
		System.out.println("Calcularndo un número positivo y un número negativo ...");
		Calcular S = new Calcular("2", "-3");
		assertTrue(S.sumar() == -1);
	}
	@Test
	void restaPositivos() {
		System.out.println("Restando dos números Positivos");
		Calcular s = new Calcular("2", "3");
		assertTrue(s.restar() == -1);
	}

	@Test
	public void restaNegativos() {
		System.out.println("Restando dos números negativos ...");
		Calcular S = new Calcular("-2", "-3");
		assertTrue(S.restar() == 1);
	}

	@Test
	public void restaPositivoNegativo() {
		System.out.println("Restando un número positivo y un número negativo ...");
		Calcular S = new Calcular("2", "-3");
		assertTrue(S.restar() == 5);
	}
	@Test
	void multPositivos() {
		System.out.println("Multiplicando dos números Positivos");
		Calcular s = new Calcular("2", "3");
		assertTrue(s.multiplicar() == 6);
	}

	@Test
	public void multNegativos() {
		System.out.println("Multiplicando dos números negativos ...");
		Calcular S = new Calcular("-2", "-3");
		assertTrue(S.multiplicar() == 6);
	}

	@Test
	public void multPositivoNegativo() {
		System.out.println("Multiplicando un número positivo y un número negativo ...");
		Calcular S = new Calcular("2", "-3");
		assertTrue(S.multiplicar() == -6);
	}
	@Test
	void divPositivos() {
		System.out.println("Dividiendo dos números Positivos");
		Calcular s = new Calcular("6", "3");
		assertTrue(s.dividir() == 2);
	}

	@Test
	public void divNegativos() {
		System.out.println("Dividiendo dos números negativos ...");
		Calcular S = new Calcular("-6", "-3");
		assertTrue(S.dividir() == 2);
	}

	@Test
	public void divPositivoNegativo() {
		System.out.println("Dividiendo un número positivo y un número negativo ...");
		Calcular S = new Calcular("6", "-3");
		assertTrue(S.dividir() == -2);
	}

}
