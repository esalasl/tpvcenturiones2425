package ActividadesYEjemplos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Event;

import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class MedidasPanel extends JFrame {

	protected static final JLabel textField = null;
	private JPanel contentPane;

	JTextField textDatoIngresado = new JTextField();
	JLabel lblFondo, lblResultado;

	public MedidasPanel() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Conversor de Medidas");
		setBounds(100, 100, 590, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				double dato1, resultado;
				dato1 = Double.parseDouble(textDatoIngresado.getText());
				String option = (String) comboBox.getSelectedItem();

				if (option.equals("Centimetros")) {
					resultado = dato1 * 100;
					lblResultado.setText("" + resultado + " cm");
				}
				if (option.equals("Metros")) {
					resultado = dato1;
					lblResultado.setText("" + resultado + " m");
				}
				if (option.equals("Kilometros")) {
					resultado = dato1 / 1000;
					lblResultado.setText("" + resultado + " km");
				}

			}
		});

		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		lblResultado.setBounds(419, 189, 105, 38);
		contentPane.add(lblResultado);

		btnSalir.setBackground(Color.WHITE);
		btnSalir.setFont(new Font("Mongolian Baiti", Font.BOLD, 16));
		btnSalir.setBounds(250, 263, 89, 23);
		contentPane.add(btnSalir);

		JButton btnConvetir = new JButton("CONVERTIR");
		btnConvetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dato1, resultado;
				dato1 = Double.parseDouble(textDatoIngresado.getText());
				String option = (String) comboBox.getSelectedItem();

				if (option.equals("Centimetros")) {
					resultado = dato1 * 100;
					lblResultado.setText("" + resultado + " cm");
				}
				if (option.equals("Metros")) {
					resultado = dato1;
					lblResultado.setText("" + resultado + " m");
				}
				if (option.equals("Kilometros")) {
					resultado = dato1 / 1000;
					lblResultado.setText("" + resultado + " km");
				}

			}
		});

		btnConvetir.setFont(new Font("Mongolian Baiti", Font.PLAIN, 11));
		btnConvetir.setBounds(419, 138, 103, 40);
		contentPane.add(btnConvetir);

		JLabel lblTexto = new JLabel("ELIGE A QUIERES CONVERTIR");
		lblTexto.setForeground(Color.RED);
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 18));
		lblTexto.setBounds(120, 37, 320, 68);
		contentPane.add(lblTexto);
		comboBox.setBounds(36, 137, 134, 40);

		comboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "ESCOGE UNO", "CENTIMETROS", "METROS", "KILOMETROS" }));
		comboBox.setMaximumRowCount(4);
		contentPane.add(comboBox);

		textDatoIngresado = new JTextField();
		textDatoIngresado.setHorizontalAlignment(SwingConstants.CENTER);
		textDatoIngresado.setBackground(Color.LIGHT_GRAY);
		textDatoIngresado.setBounds(236, 137, 103, 40);
		contentPane.add(textDatoIngresado);
		textDatoIngresado.setColumns(10);

		lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 574, 321);
		lblFondo.setIcon(new ImageIcon(MedidasPanel.class.getResource("/img/fondo.png")));
		contentPane.add(lblFondo);
	}
}
