public class DescuentoPorcentualConTope extends Descuento {

	private double tope;
	private double porcentajeDescuento;
	
	
	
	public double getTope() {
		return tope;
	}
	public void setTope(double tope) {
		this.tope = tope;
	}
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
		double totalConDescuentoPorcentualConTope = totalCompra - descuento;
		return Math.max(totalConDescuentoPorcentualConTope, tope);
	}
	
}
