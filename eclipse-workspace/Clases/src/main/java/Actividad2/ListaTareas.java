package Actividad2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class ListaTareas extends JFrame {

	private JPanel contentPane;
	private static int seleccionado;
	JList<String> lista = new JList();
	String nuevaTarea;

	DefaultListModel<String> listModel = new DefaultListModel<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaTareas frame = new ListaTareas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListaTareas() {
		setResizable(false);
		setTitle("LISTA DE TAREAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("GESTOR DE TAREAS");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 17));
		lblNewLabel_1.setBounds(197, 36, 197, 23);
		contentPane.add(lblNewLabel_1);

		lista = new JList<String>();
		lista.setBounds(129, 108, 333, 145);
		lista.setBackground(new Color(255, 235, 205));
		lista.setModel(listModel);
		contentPane.add(lista);

		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.setBounds(25, 322, 116, 23);
		btnAgregar.setBackground(new Color(255, 255, 255));
		// JFrame dialog = this;
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// EVENTO DONDE SE HACE UN LLAMADO A LA CLASE TAREA Y SE GENERA LA NUEVA VENTANA
				// PARA EL INGRESO DE LAS NUEVAS TAREAS
				Tarea tareaAgregar = new Tarea(ListaTareas.this);
				tareaAgregar.setVisible(true);

				nuevaTarea = tareaAgregar.getTarea();
				// SE VERIFICA QUE ESTE VACIA LA TAREA Y SE RELLENA CON EL TEXTO OBTENIDO
				if (nuevaTarea != null && !nuevaTarea.isEmpty()) {
					listModel.addElement(nuevaTarea);

				} else
					// MENSAJE DE ERROR EN CASO DE QUO HAYA NADA EN LA TABLA O NO SE HAYA
					// SELECCIONADO NADA
					JOptionPane.showMessageDialog(btnAgregar, "ERROR");

			}

		});
		contentPane.add(btnAgregar);

		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(290, 322, 122, 23);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PRIMERO SE RECUPERA EL ELEMENTO SELECCIONADO, SE CONFIRMA SI ES DISTINTO
				// IGUAL -1 Y DE SER ASI SE ELIMINA DE LA LISTA
				int selecionado = lista.getSelectedIndex();

				if (selecionado != -1) {
					listModel.remove(selecionado);
				} else
					// MENSAJE DE ERROR EN CASO DE QUO HAYA NADA EN LA TABLA O NO SE HAYA
					// SELECCIONADO NADA
					JOptionPane.showMessageDialog(btnEliminar, "ERROR");

			}
		});
		contentPane.add(btnEliminar);

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(151, 322, 129, 23);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SE RECUPERA EL ELEMENTO SELECCIONADO
				seleccionado = lista.getSelectedIndex();

				lista.getSelectedIndex();
				// SE COMPRUEBA QUE EXISTE O QUE SE SELECCIONO, Y SE PROCEDE A LLAMAR A LA NUEVA
				// VENTANA DE LA CLASE TAREA PARA HACER LA MODIFICACION,Y SEGUIDO INSERTAR EN LA
				// TABLA
				if (seleccionado != -1) {

					Tarea tareaModificar = new Tarea(ListaTareas.this);
					tareaModificar.setVisible(true);

					String tareaModificada = tareaModificar.getTarea();
					if (tareaModificada != null && !tareaModificada.isEmpty()) {
						// SE RECOGE LA TAREA SELECCIONADA Y SE CAMBIA A LA NUEVA
						listModel.setElementAt(tareaModificada, seleccionado);
					}
				} else {
					// MENSAJE DE ERROR EN CASO DE QUO HAYA NADA EN LA TABLA O NO SE HAYA
					// SELECCIONADO NADA
					JOptionPane.showMessageDialog(ListaTareas.this, "ERROR");
				}
			}
		});
		contentPane.add(btnModificar);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(422, 322, 122, 23);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnSalir);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 554, 371);
		lblNewLabel.setIcon(new ImageIcon(ListaTareas.class.getResource("/img/FONDOTAREAS.png")));
		contentPane.add(lblNewLabel);
	}
}
