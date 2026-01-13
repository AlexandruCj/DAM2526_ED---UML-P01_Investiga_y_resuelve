package investigaYresuelve;

public class Main {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(1);

		Producto teclado = new Producto("Teclado", 25.50);
		Producto raton = new Producto("Ratón", 15.00);

		pedido1.agregarProducto(teclado);
		pedido1.agregarProducto(raton);

		pedido1.setEstado(EstadoPedido.ENVIADO);

		System.out.println("Número del pedido: " + pedido1.getNumero());
		System.out.println("Estado del pedido: " + pedido1.getEstado());
		System.out.println("Total del pedido: " + pedido1.calcularTotal());
	}
}
