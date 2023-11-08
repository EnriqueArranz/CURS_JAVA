package n1exercici1;

public class NoGenericMethods<T> {

	private T nombre;
	private T apellido;
	private T segundoApellido;
	public NoGenericMethods(T nombre, T apellido, T segundoApellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.segundoApellido = segundoApellido;
	}
	public T getNombre() {
		return nombre;
	}
	public void setNombre(T nombre) {
		this.nombre = nombre;
	}
	public T getApellido() {
		return apellido;
	}
	public void setApellido(T apellido) {
		this.apellido = apellido;
	}
	public T getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(T segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	
	
	

}
