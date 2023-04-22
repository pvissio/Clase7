import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DescuentoFijoTest {

	@Test
	void testCalcularDescuento() {
		DescuentoFijo dfo = new DescuentoFijo();
		double df = dfo.calcularDescuento(10000);
		System.out.println(df);
	}

	@Test
	void testAplicarDescuento() {
		DescuentoFijo dfo = new DescuentoFijo();
		double df = dfo.aplicarDescuento(10000);
		System.out.println(df);
	}

}
