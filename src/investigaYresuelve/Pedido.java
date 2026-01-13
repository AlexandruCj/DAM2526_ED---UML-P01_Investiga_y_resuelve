package investigaYresuelve;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numero;
	private EstadoPedido estado;
	private List<Producto> productos;

	public Pedido(int numero) {
		this.numero = numero;
		this.estado = EstadoPedido.PENDIENTE;
		this.productos = new ArrayList<>();
	}

	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}

	public double calcularTotal() {
		double total = 0.0;
		for (Producto p : this.productos) {
			total += p.getPrecio();
		}
		return total;
	}

	public int getNumero() {
		return this.numero;
	}

	public EstadoPedido getEstado() {
		return this.estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}
}