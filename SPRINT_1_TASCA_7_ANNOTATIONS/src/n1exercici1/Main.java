package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Treballador treballador = new Treballador();
		treballador.calcularSou(80);
		TreballadorOnline treballadoronline = new TreballadorOnline();
		treballadoronline.calcularSou(80);
		TreballadorPresencial treballadorpresencial = new TreballadorPresencial();
		treballadorpresencial.calcularSou(80);
	}

}
