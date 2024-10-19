package Actividad3;

public class Productos {

	String nombre;
	String tipo;
	double precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Productos(String nombre, String tipo, double precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos: Nombre: " + getNombre() + ", Tipo: " + getTipo() + ", Precio: " + getPrecio();
	}

}
