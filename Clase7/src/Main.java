

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		String ruta = "C:\\Users\\Patricio\\Desktop\\Argentina Programa 4.0\\Desarrollador Java Inicial\\Clase 5\\Actividades\\cat.txt";
		System.out.println("....... Leyendo archivo y creando objetos ......\n" + "\n ......");
		ScannerClass(ruta);
		
	}
		
		public static void ScannerClass(String ruta) { 
			
		int Id = 1;
		String DescProducto;
		Double Cantidad;
		Double Precio;
		File file = new File(ruta);
		Carrito Carrito= new Carrito();
		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
			while (sc.hasNextLine()) {
				String[] VectorString= (sc.nextLine()).split(";");
				DescProducto=VectorString[2];
				Cantidad=Double.parseDouble(VectorString[0]);
				Precio=Double.parseDouble(VectorString[1]);
				Producto obj= new Producto();
				obj.nombreProducto=DescProducto;
				obj.codigo=Id;
				obj.precio=Precio;
				Id+=1;
				ItemCarrito obj2 = new ItemCarrito();
				obj2.Mostrar(obj, Cantidad);
				Carrito.precio(obj2);
				System.out.println(".... Leo objeto: Producto que se carga con una linea del Archivo ....");
				System.out.println(" Producto: "+ obj.nombreProducto +"\n Precio: "+ obj.precio + "\n Id: " + obj.codigo+ "\n ......");
				System.out.println("\n.... Leo primer objeto: Items que guarda los datos del objeto, cantidad y subtotal ....\n");
				System.out.println(" Items: "+ obj2.codigoItemCarrito + "\n Cant : " + obj2.cantidad + "\n Desc.: " + obj.nombreProducto +"\n SubTotal: "+ obj2.totalItem + "\n ......");
		
			}
			
			Scanner lectura = new Scanner (System.in);
			System.out.println("Ingrese 1 para descuento fijo, 2 para descuento porcentual ó 3 para descuento poprcentual con tope");
			int tipoDescuento = lectura.nextInt();
			
			if(tipoDescuento == 1) {
				DescuentoFijo descuentoFijo = new DescuentoFijo();
				double totalConDescuento = descuentoFijo.aplicarDescuento(Carrito.getTotal());
				System.out.println("Total con descuento aplicado: " + totalConDescuento);
			} else if (tipoDescuento == 2) {
				DescuentoPorcentual descuentoPorcentual = new DescuentoPorcentual();
				System.out.println("Ingrese el porcentaje de descuento de esta semana");
				descuentoPorcentual.setPorcentajeDescuento(lectura.nextInt());
				double totalConDescuento = descuentoPorcentual.aplicarDescuento(Carrito.getTotal());
				System.out.println("Total con descuento aplicado: " + totalConDescuento);
			} else if (tipoDescuento == 3) {
				DescuentoPorcentualConTope descuentoPorcentualCT = new DescuentoPorcentualConTope();
				System.out.println("Ingrese el porcentaje de descuento de esta semana");
				descuentoPorcentualCT.setPorcentajeDescuento(lectura.nextInt());
				descuentoPorcentualCT.setTope(1500);
				double totalConDescuento = descuentoPorcentualCT.aplicarDescuento(Carrito.getTotal());
				System.out.println("Total con descuento ó tope: " + totalConDescuento);
			} else {
				System.out.println("Error, ingrese 1 ó 2");
			}
			
			System.out.println("Total sin descuento: "+ Carrito.total);
			
			
		}
		catch (IOException e) {
		e.printStackTrace();

		
		}
      
	}
}