package mx.com.miproyecto.dao.beans;

public class Animal {
	private long idanimal;
	private String nombre;
	private int edad;

	public long getIdanimal() {
		return idanimal;
	}

	public void setIdanimal(long idanimal) {
		this.idanimal = idanimal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Animal(long idanimal, String nombre, int edad) {
		this.idanimal = idanimal;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Animal() {
	}

	public Animal(long idanimal) {
		this.idanimal = idanimal;
	}

	@Override
	public String toString() {
		return "animal [idanimal=" + idanimal + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

}
