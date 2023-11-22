package kata;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaOriginal = new ArrayList<>();

		listaOriginal.add(4);
		listaOriginal.add(0);
		listaOriginal.add(7);
		listaOriginal.add(0);
		listaOriginal.add(3);
		listaOriginal.add(2);
		listaOriginal.add(0);

		for (int i = 0; i < listaOriginal.size(); i++) {
			if (listaOriginal.get(i) == 0) {
				listaOriginal.remove(i);
				listaOriginal.add(0);
			} else {

			}

		}
		System.out.println(listaOriginal);
	}
}
