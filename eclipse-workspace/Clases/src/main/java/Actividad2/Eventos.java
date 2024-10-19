
package Actividad2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;

public class Eventos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaEventos;
	private DefaultTableModel model;
	private int mesActual;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Eventos frame = new Eventos();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Eventos() {

		Calendar calendar = Calendar.getInstance();

		mesActual = calendar.get(Calendar.MONTH) + 1;
		ClassLoader classloader = getClass().getClassLoader();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("EVENTOS");
		setSize(590, 390);

		ImageIcon iconAnimado = new ImageIcon(classloader.getResource("animacion.gif"));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		model = new DefaultTableModel(new Object[][] {}, new String[] { "NOMBRE", "TIPO", "FECHA" });
		tablaEventos = new JTable(model);
		tablaEventos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaEventos.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		tablaEventos.setBorder(new LineBorder(new Color(0, 0, 0)));
		tablaEventos.setBounds(54, 55, 437, 145);
		contentPane.add(tablaEventos);

		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblNombre.setBounds(87, 30, 63, 14);
		contentPane.add(lblNombre);

		JLabel lblTipo = new JLabel("TIPO");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblTipo.setBounds(249, 28, 46, 16);
		contentPane.add(lblTipo);

		JLabel lblFecha = new JLabel("FECHA");
		lblFecha.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setBounds(396, 30, 55, 14);
		contentPane.add(lblFecha);

		JButton btnIncluir = new JButton("INCLUIR EVENTO");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorEventos dialog = new ControladorEventos(Eventos.this);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		btnIncluir.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		btnIncluir.setBounds(29, 300, 155, 23);
		contentPane.add(btnIncluir);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Linux Libertine G", Font.BOLD, 13));
		btnSalir.setBounds(428, 300, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(0, 0, 574, 351);
		lblFondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFondo.setIcon(iconAnimado);
		contentPane.add(lblFondo);
	}

//			METODO PARA RECOGER DATOS DE CALENDARIO
	public void agregarEvento(String nombre, String tipo, int dia) {
		// Obtener el año y el mes actual
		Calendar calendar = Calendar.getInstance();
		int año = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH) + 1; // +1 porque los meses empiezan en 0

		// FORMATEO DE FECHAS YYYY-MM-DD
		String fecha = String.format("%04d-%02d-%02d", año, mes, dia);

		// AGREGAR FILAS A LA TABLA
		DefaultTableModel model = (DefaultTableModel) tablaEventos.getModel();
		model.addRow(new Object[] { nombre, tipo, fecha });
	}
}