import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class DescuentoPorcentualConTopeTest {
	
	 private DescuentoPorcentualConTope descuento;
	 
	 
	 @Before
	    public void setup() {
	        descuento = new DescuentoPorcentualConTope();
	    }
	 

	@Test
	void testCalcularDescuento() {
        descuento.setPorcentajeDescuento(10);
        double descuentoCalculado = descuento.calcularDescuento(100);
        assertEquals(10, descuentoCalculado, 0);
	}

	@Test
	void testAplicarDescuento() {
        double descuentoEsperado = 10;
        descuento.setPorcentajeDescuento(10);
        descuento.setTope(50);
        double totalConDescuento = descuento.aplicarDescuento(100);
        assertEquals(100 - descuentoEsperado, totalConDescuento, 0);
        
        descuento.setPorcentajeDescuento(50);
        totalConDescuento = descuento.aplicarDescuento(100);
        assertEquals(50, totalConDescuento, 0);
	}

	
	
/*
	
	@Test
	void testGetTope() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTope() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPorcentajeDescuento() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPorcentajeDescuento() {
		fail("Not yet implemented");
	}


*/

}
