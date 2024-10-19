package Actividad2;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameCardLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCardLayout frame = new FrameCardLayout();
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
	public FrameCardLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		CardLayout cardlayout = new CardLayout();

		contentPane.setLayout(cardlayout);

		ClassLoader classloader = getClass().getClassLoader();

		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel();
		ImageIcon imagenIcon = new ImageIcon(classloader.getResource("hamburguesa.png"));
		imagenIcon.setImage(imagenIcon.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));

		label1.setIcon(imagenIcon);
		panel1.add(label1);

		JButton button1 = new JButton("Siguiente");
		button1.setIcon(imagenIcon);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "panel2");

			}
		});
		panel1.add(button1);

		JPanel panel2 = new JPanel();
		JButton button2 = new JButton("Atrás");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardlayout.show(contentPane, "panel1");

			}
		});
		panel2.add(button2);

		contentPane.add(panel1, "panel1");
		contentPane.add(panel2, "panel2");
	}

}
