package Actividad3;

import java.util.ArrayList;

public class ControlProductos {
	public static void main(String[] args) {
		ArrayList<Productos> listaProductos = new ArrayList<Productos>();

		String bebida = "Bebida", postre = "Postre", comida = "Comida";

		Productos p1 = new Productos("Agua", bebida, 3.0);
		Productos p2 = new Productos("Refresco", bebida, 2.0);
		Productos p3 = new Productos("Cerveza", bebida, 3.0);
		Productos p4 = new Productos("Jugo", bebida, 3.2);
		Productos p5 = new Productos("Torta", postre, 2.8);
		Productos p6 = new Productos("Helado", postre, 3.0);
		Productos p7 = new Productos("Flan", postre, 3.0);
		Productos p8 = new Productos("Racion De Alitas", comida, 9.0);
		Productos p9 = new Productos("Bocadillo De Pollo", comida, 5.0);
		Productos p10 = new Productos("Bocadillo de Lomo", comida, 4.5);

		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		listaProductos.add(p5);
		listaProductos.add(p6);
		listaProductos.add(p7);
		listaProductos.add(p8);
		listaProductos.add(p9);
		listaProductos.add(p10);

	}

}
