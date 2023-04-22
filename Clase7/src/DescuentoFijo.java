
public class DescuentoFijo extends Descuento {
	
	
	public double calcularDescuento(double totalCompra) {
		double montoFijoDescuento = totalCompra - (totalCompra*0.8);
		return montoFijoDescuento;
	}
	
	
	public double aplicarDescuento(double totalCompra) {
		double montoFijoDescuento = calcularDescuento(totalCompra);
		double totalConDescuentoFijo = totalCompra - montoFijoDescuento;
		return totalConDescuentoFijo;
	}
	
	
}
