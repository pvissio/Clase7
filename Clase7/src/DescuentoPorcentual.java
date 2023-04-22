
public class DescuentoPorcentual extends Descuento {

	private double porcentajeDescuento;

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	public double calcularDescuento(double totalCompra) {
		double descuento = (porcentajeDescuento / 100) * totalCompra;
		return descuento;
	}
	
	public double aplicarDescuento(double totalCompra) {
		double descuento = calcularDescuento(totalCompra);
		double totalConDescuentoPorcentual = totalCompra - descuento;
		return totalConDescuentoPorcentual;
	}
}
