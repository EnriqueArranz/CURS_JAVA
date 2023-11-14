package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> monthsList = new ArrayList();

		monthsList.add("enero");
		monthsList.add("febrero");
		monthsList.add("marzo");
		monthsList.add("abril");
		monthsList.add("mayo");
		monthsList.add("junio");
		monthsList.add("julio");
		monthsList.add("agosto");
		monthsList.add("septiembre");
		monthsList.add("octubre");
		monthsList.add("noviembre");
		monthsList.add("diciembre");

		monthsList.forEach(s -> System.out.println(s));//IMPRIMIR CON EXPRESION LAMBDA

	}

}
