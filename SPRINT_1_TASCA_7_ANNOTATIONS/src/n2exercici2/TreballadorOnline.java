package n2exercici2;

public class TreballadorOnline extends Treballador {

	
    
     
	private final int plusTelework= 35;
     
	@Override 
	public void calcularSou(int hores) {
		
		int sou = hores * preuHora;
		sou += plusTelework;
		System.out.println("El cost del traballador es de "+ sou +" €.");
	}

}
