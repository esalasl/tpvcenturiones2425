package Actividad2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class CristianEsCazador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CristianEsCazador frame = new CristianEsCazador();
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
	public CristianEsCazador() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		
		CardLayout cardlayout = new CardLayout();
		setContentPane(contentPane);
		contentPane.setLayout(cardlayout);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "pregunta1");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "pregunta1");
			}
		});
		btnNewButton.setBounds(313, 150, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "pregunta1");
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "pregunta2");
				
			}
		});
		rdbtnNewRadioButton.setBounds(319, 152, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "pregunta1");
			}
		});
		btnNewButton_1.setBounds(169, 152, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "pregunta2");
	}
}
