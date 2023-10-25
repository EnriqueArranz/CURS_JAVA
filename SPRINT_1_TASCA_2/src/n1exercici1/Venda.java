package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Producte> productes;
	private double preuTotal;

	public Venda() {
		this.productes = new ArrayList<>();
		this.preuTotal = 0;
	}

	// Método para añadir productos a la venta

	public void afegirProducte(Producte producte) {
		this.productes.add(producte);
	}

	// Método para calcular el precio total de la venta

	public double calcularTotal() throws VendaBuidaException {
		if (productes.isEmpty()) {
			// Lanzar la excepción si la lista de productos está vacía
			throw new VendaBuidaException();
		} else {
			// Calcular el precio total sumando los precios de los productos
			for (Producte producte : productes) {
				this.preuTotal += producte.getPreu();
			}
		}
		return this.preuTotal;
	}
}