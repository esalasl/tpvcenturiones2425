package Actividad2;

import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
public class Cuestionario extends JFrame {

	// SE DECLARAN VARIABLES STATIC PARA USAR EN TODA LA CLASE

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup grupoClimas = new ButtonGroup();
	private final ButtonGroup grupoAnimales = new ButtonGroup();
	JProgressBar barraP1 = new JProgressBar(1, 3);
	JProgressBar barraP2 = new JProgressBar(1, 3);
	JProgressBar barraP3 = new JProgressBar(1, 3);
	public String respuestaComida;
	public String respuestaClima;
	public String respuestaAnimales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuestionario frame = new Cuestionario();
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
	public Cuestionario() {

		setTitle("CUESTIONARIO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		ClassLoader classloader = getClass().getClassLoader();
		setLocationRelativeTo(null);

//		SE CREA EL CARDLAYOUT
		CardLayout cardlayout = new CardLayout();

		setContentPane(contentPane);
		contentPane.setLayout(cardlayout);

		JPanel pregunta1 = new JPanel();
		contentPane.add(pregunta1, "panelPregunta1");
		pregunta1.setLayout(null);
		setLocationRelativeTo(null);
		barraP1.setStringPainted(true);

		barraP1.setBounds(10, 268, 489, 14);
		pregunta1.add(barraP1);
		JToggleButton btnHamburguesa = new JToggleButton("");
		btnHamburguesa.setBounds(50, 92, 135, 148);
		pregunta1.add(btnHamburguesa);

		JToggleButton btnPasta = new JToggleButton("");
		btnPasta.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPasta.setBounds(340, 92, 135, 148);
		pregunta1.add(btnPasta);
		// ASIGNACION DE IMAGEN AL BTNHAMBURGUESA
		ImageIcon imagenIconHamburguesa = new ImageIcon(classloader.getResource("hamburguesa.png"));
		imagenIconHamburguesa
				.setImage(imagenIconHamburguesa.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnHamburguesa.setIcon(imagenIconHamburguesa);
		// ASIGNACION DE IMAGEN AL BTNPASTA
		ImageIcon imagenIconPasta = new ImageIcon(classloader.getResource("pasta.png"));
		imagenIconPasta.setImage(imagenIconPasta.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnPasta.setIcon(imagenIconPasta);

		// SE HACE UN GRUPO DE BOTONES PARA QUE SOLO SE PUEDA SELECCIONAR UNO A LA VEZ
		ButtonGroup grupoComida = new ButtonGroup();
		grupoComida.add(btnHamburguesa);
		grupoComida.add(btnPasta);

		JLabel lblPregunta1 = new JLabel("¿Cuál es tu comida favorita?");
		lblPregunta1.setBounds(1105, 258, 135, 14);
		lblPregunta1.setHorizontalAlignment(SwingConstants.CENTER);
		pregunta1.add(lblPregunta1);

		JButton btnAtras = new JButton("ATRÁS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnAtras, "ERROR,SELECCIONA UNA OPCIÓN"); // OPCION DE ERROR AL SER LA
																						// PRIMERA PREGUNTA
			}
		});
		btnAtras.setBounds(26, 287, 89, 23);
		pregunta1.add(btnAtras);

		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SE PREGUNTA SI ESTA SELECCIONADA ALGUNO DE LOS DOS BOTONES PARA HACER PASO AL SIGUIENTE CARDLAYOUT
				if (btnHamburguesa.isSelected() || btnPasta.isSelected()) {
					cardlayout.show(contentPane, "panelPregunta2");
				} else {
					JOptionPane.showMessageDialog(null, "ERROR, SELECCIONA UNO"); // ERROR SI NO SELECCIONA NADA Y DA SIGUIENTE
				}

				if (btnHamburguesa.isSelected()) {
					respuestaComida = "HAMBURGUESITAAAAAAA"; //ERCUPERACION Y ASIGNACION DE PREGUNTA

				} else if (btnPasta.isSelected()) {
					respuestaComida = "PASTICAAAAA"; //ERCUPERACION Y ASIGNACION DE PREGUNTA
				}
//				SE LE DA INCREMENTO DE 2 A LA BARRA DE PROGRESO
				barraP2.setValue(2);
			}
		});
		btnSiguiente.setBounds(385, 287, 100, 23);
		pregunta1.add(btnSiguiente);

		JLabel lblComida = new JLabel("¿CUÁL ES TU COMIDA FAVORITA?");
		lblComida.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblComida.setFont(new Font("Linux Libertine Display G", Font.BOLD, 18));
		lblComida.setBounds(97, 26, 315, 54);
		pregunta1.add(lblComida);

		JLabel lblFondoPanels = new JLabel("");
		lblFondoPanels.setIcon(new ImageIcon(Cuestionario.class.getResource("/resources/fondoPaneles.png")));
		lblFondoPanels.setBounds(0, 0, 509, 321);
		pregunta1.add(lblFondoPanels);

		JPanel pregunta2 = new JPanel();
		contentPane.add(pregunta2, "panelPregunta2");
		pregunta2.setLayout(null);

		JButton btnAtras_1 = new JButton("ATRÁS");
		btnAtras_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
//				SE PERMITE DAR PASO ATRAS AL CARD DE LA PREGUNTA 0
				cardlayout.show(contentPane, "panelPregunta1");
			}
		});

		barraP2 = new JProgressBar(1, 3);
		barraP2.setStringPainted(true);
		barraP2.setBounds(20, 262, 489, 14);
		pregunta2.add(barraP2);
		btnAtras_1.setBounds(26, 287, 89, 23);
		pregunta2.add(btnAtras_1);

		JLabel lblPregunta2 = new JLabel("¿QUÉ PREFIERES?");
		lblPregunta2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPregunta2.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		lblPregunta2.setBounds(160, 25, 180, 64);
		pregunta2.add(lblPregunta2);

		JToggleButton btnInvierno = new JToggleButton("");
		grupoClimas.add(btnInvierno);
		btnInvierno.setBounds(45, 88, 129, 150);
		pregunta2.add(btnInvierno);

		JToggleButton btnVerano = new JToggleButton("");
		grupoClimas.add(btnVerano);
		btnVerano.setBounds(342, 88, 129, 150);
		pregunta2.add(btnVerano);

		JButton btnSiguiente_1 = new JButton("SIGUIENTE");
		btnSiguiente_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SE PREGUNTA SI ESTA SELECCIONADA ALGUNO DE LOS DOS BOTONES PARA HACER PASO AL SIGUIENTE CARDLAYOUT
				if (btnInvierno.isSelected() || btnVerano.isSelected()) {
					cardlayout.show(contentPane, "panelPregunta3");
				} else {
					JOptionPane.showMessageDialog(null, "ERROR, ELIGE UNA OPCIÓN");
				}

				if (btnVerano.isSelected()) {
					respuestaClima = "VERANITOOO";
				} else if (btnInvierno.isSelected()) {
					respuestaClima = "FRIOOOOO";
				}

				barraP3.setValue(3);

			}
		});
		btnSiguiente_1.setBounds(385, 287, 100, 23);
		pregunta2.add(btnSiguiente_1);

		JLabel fondoP2 = new JLabel("");
		fondoP2.setIcon(new ImageIcon(Cuestionario.class.getResource("/resources/fondoPaneles.png")));
		fondoP2.setBounds(0, 0, 509, 321);
		pregunta2.add(fondoP2);

		ImageIcon imagenIconInverno = new ImageIcon(classloader.getResource("invierno.png"));
		imagenIconInverno
				.setImage(imagenIconInverno.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnInvierno.setIcon(imagenIconInverno);

		ImageIcon imagenIconVernao = new ImageIcon(classloader.getResource("verano.png"));
		imagenIconVernao.setImage(imagenIconVernao.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnVerano.setIcon(imagenIconVernao);

		JPanel pregunta3 = new JPanel();
		contentPane.add(pregunta3, "panelPregunta3");
		pregunta3.setLayout(null);

		JButton btnAtras_2 = new JButton("ATRÁS");
		btnAtras_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "panelPregunta2");
			}
		});

		barraP3 = new JProgressBar(1, 3);
		barraP3.setStringPainted(true);
		barraP3.setBounds(20, 267, 479, 14);
		pregunta3.add(barraP3);

//		SE USA RADIOBUTTON PARA LA ULTIMA PREGUNTA, DONDE TENEMOS DOS RDBUTTON
		
		JRadioButton rdbtnPerro = new JRadioButton("");
		grupoAnimales.add(rdbtnPerro);
		rdbtnPerro.setBounds(386, 219, 21, 23);
		pregunta3.add(rdbtnPerro);

		JRadioButton rdbtnGato = new JRadioButton("");
		grupoAnimales.add(rdbtnGato);
		rdbtnGato.setBounds(112, 219, 21, 23);
		pregunta3.add(rdbtnGato);
		btnAtras_2.setBounds(25, 287, 89, 23);
		pregunta3.add(btnAtras_2);

		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// SE PREGUNTA SI ESTA SELECCIONADA ALGUNO DE LOS DOS RDBUTTON PARA HACER PASO AL FINALIZAR Y SACAR RESPUESTAS
				if (rdbtnGato.isSelected()) {
					respuestaAnimales = "MICHISSS";
				} else if (rdbtnPerro.isSelected()) {
					respuestaAnimales = "PERRITOOOSSS";
				}
				JOptionPane.showMessageDialog(null, "LAS RESPUESTAS FUERON: " + "\n" + respuestaComida + "\n"
						+ respuestaClima + "\n" + respuestaAnimales);
				dispose();
//				SE HACE UN JOPTION PARA DAR INFORMACION DE LAS RESPUESTAS SELECCIONADAS 
			}

		});
		btnFinalizar.setBounds(384, 287, 100, 23);
		pregunta3.add(btnFinalizar);
		JLabel lblPregunta3 = new JLabel("¿CUÁL TE GUSTA MÁS?");
		lblPregunta3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPregunta3.setFont(new Font("Linux Libertine G", Font.BOLD, 18));
		lblPregunta3.setBounds(140, 37, 217, 28);
		pregunta3.add(lblPregunta3);

		JButton btnPerro = new JButton("");
		btnPerro.setBounds(327, 98, 125, 114);
		pregunta3.add(btnPerro);

		ImageIcon imagenIconPerro = new ImageIcon(classloader.getResource("perro.png"));
		imagenIconPerro.setImage(imagenIconPerro.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnPerro.setIcon(imagenIconPerro);

		JButton btnGato = new JButton("New button");
		btnGato.setBounds(62, 98, 125, 114);
		pregunta3.add(btnGato);

		ImageIcon imagenIconGato = new ImageIcon(classloader.getResource("gato.png"));
		imagenIconGato.setImage(imagenIconGato.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		btnGato.setIcon(imagenIconGato);

		JLabel fondoP3 = new JLabel("");
		fondoP3.setIcon(new ImageIcon(Cuestionario.class.getResource("/resources/fondoPaneles.png")));
		fondoP3.setBounds(0, 0, 509, 321);
		pregunta3.add(fondoP3);

	}
}
