package n1exercici1;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoGenericMethods<String> empleado1 = new NoGenericMethods<>("juan","arranz","puig");
		NoGenericMethods<String> empleado2 = new NoGenericMethods<>("arranz","puig","juan");
		NoGenericMethods<String> empleado3 = new NoGenericMethods<>("puig","juan","arranz");
		
		
		System.out.println(empleado1.getNombre());
		System.out.println(empleado1.getApellido());
		System.out.println(empleado1.getSegundoApellido());
		
		System.out.println(empleado2.getNombre());
		System.out.println(empleado2.getApellido());
		System.out.println(empleado2.getSegundoApellido());
		
		System.out.println(empleado3.getNombre());
		System.out.println(empleado3.getApellido());
		System.out.println(empleado3.getSegundoApellido());
		
	}

}
