import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class DescuentoPorcentualTest {
	
	DescuentoPorcentual dpo;
	@Before
	public void inicializar() {
		DescuentoPorcentual dpo = new DescuentoPorcentual();
		//dpo.calcularDescuento(100);
		dpo.setPorcentajeDescuento(10);
	}
	


	
	
	@Test
	void testCalcularDescuento() {
		
		
		assertEquals(90, dpo.calcularDescuento(100), 0);
		//System.out.println(dpo.aplicarDescuento(10000));
	}
	
	
	
	//DescuentoPorcentualTest o = new testCalcularDescuento();
	
	
	/*
	@Test
	void testAplicarDescuento() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPorcentajeDescuento() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPorcentajeDescuento() {
		DescuentoPorcentual dpo = new DescuentoPorcentual();
		dpo.setPorcentajeDescuento(10);
		System.out.println(dpo);
	}
*/
}
