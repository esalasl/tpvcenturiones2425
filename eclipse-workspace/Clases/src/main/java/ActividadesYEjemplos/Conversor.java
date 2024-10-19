package ActividadesYEjemplos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel cPConversor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("CONVERSOR");
		setBounds(100, 100, 600, 400);
		cPConversor = new JPanel();
		cPConversor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(cPConversor);

		JButton btnMedidas = new JButton("MEDIDAS");
		btnMedidas.setBounds(165, 145, 115, 55);
		btnMedidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Abre la nueva ventana MedidasPanel
				MedidasPanel medidasFrame = new MedidasPanel();
				medidasFrame.setVisible(true);
				dispose();
			}
		});
		cPConversor.setLayout(null);

		btnMedidas.setBorder(new LineBorder(null, 3, true));
		btnMedidas.setBackground(Color.WHITE);
		btnMedidas.setForeground(new Color(0, 0, 0));
		btnMedidas.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		cPConversor.add(btnMedidas);

		JButton btnTemperaturas = new JButton("TEMPERATURAS");
		btnTemperaturas.setBounds(305, 145, 132, 55);
		btnTemperaturas.setForeground(Color.BLACK);
		btnTemperaturas.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		btnTemperaturas.setBorder(new LineBorder(null, 3, true));
		btnTemperaturas.setBackground(Color.WHITE);
		cPConversor.add(btnTemperaturas);

		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 590, 371);
		fondo.setIcon(new ImageIcon(Conversor.class.getResource("/img/img.png")));
		cPConversor.add(fondo);
	}

}
