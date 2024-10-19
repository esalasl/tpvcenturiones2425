package ActividadesYEjemplos;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	JLabel lblSuma,lblResta,lblMultiplicacion,lblDivision;
	int num1,num2;
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frmCalculadora = new Calculadora();
					frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setBackground(new Color(154, 186, 218));
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 384);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//CREACIÓN BOTON SUMA CON SU LISTENES Y JOPTIONPANE PARA SUS NUMEROS
		JButton btnSuma = new JButton("SUMA");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para sumar"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));

				lblSuma.setText("La suma es: " + (num1 + num2));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,"ERROR");
					
				}
				
				
			}
		});
		btnSuma.setBounds(178, 20, 89, 23);
		contentPane.add(btnSuma);
		
		lblSuma = new JLabel("");
		lblSuma.setFont(new Font("Rubik", Font.PLAIN, 16));
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSuma.setBounds(118, 54, 216, 23);
		contentPane.add(lblSuma);
		
		JButton btnResta = new JButton("RESTA");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para restar"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));
				
				lblResta.setText("La resta es: " + (num1-num2));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,"ERROR");
				}
				
				
			}
		});
		btnResta.setBounds(178, 88, 89, 23);
		contentPane.add(btnResta);
		
		lblResta = new JLabel("");
		lblResta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResta.setFont(new Font("Rubik", Font.PLAIN, 16));
		lblResta.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResta.setBounds(118, 122, 216, 23);
		contentPane.add(lblResta);
		
		JButton btnMultiplicacion = new JButton("MULTIPLICACIÓN");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número para multiplicar"));
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));
					
					lblMultiplicacion.setText("La multiplicación: " + (num1*num2));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,"ERROR");
				}
				
			}
		});
		btnMultiplicacion.setBounds(159, 156, 135, 21);
		contentPane.add(btnMultiplicacion);
		
		lblMultiplicacion = new JLabel("");
		lblMultiplicacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultiplicacion.setFont(new Font("Rubik", Font.PLAIN, 16));
		lblMultiplicacion.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMultiplicacion.setBounds(118, 188, 216, 23);
		contentPane.add(lblMultiplicacion);
		
		JButton btnDivision = new JButton("DIVISIÓN");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
					num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número"));

					lblDivision.setText("La división es: " + (num1 / num2));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					
				}

			}
		});
		btnDivision.setBounds(178, 232, 89, 23);
		contentPane.add(btnDivision);
		
		lblDivision = new JLabel("");
		lblDivision.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivision.setFont(new Font("Rubik", Font.PLAIN, 16));
		lblDivision.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDivision.setBounds(118, 277, 216, 23);
		contentPane.add(lblDivision);
		
		JButton btnRESET = new JButton("RESET");
		btnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSuma.setText("");
				lblResta.setText("");
				lblMultiplicacion.setText("");
				lblDivision.setText("");
			}
		});
		btnRESET.setBounds(178, 311, 89, 23);
		contentPane.add(btnRESET);
		
		
		
	}
}