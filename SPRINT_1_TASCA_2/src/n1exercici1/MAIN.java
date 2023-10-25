package n1exercici1;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
            // Crear productos
            Producte producte1 = new Producte("Producte 1", 50);
            Producte producte2 = new Producte("Producte 2", 30);
            
            // Crear venta
            Venda venda = new Venda();
            
            // Añadir productos a la venta
            venda.afegirProducte(producte1);
            venda.afegirProducte(producte2);
            
            // Calcular total de la venta
            double total = venda.calcularTotal();
            System.out.println("Preu total de la venda: " + total);

        } catch (VendaBuidaException e) {
            // Capturar y mostrar el mensaje de la excepción personalizada
            System.out.println(((Throwable) e).getMessage());
        }
    }
}




