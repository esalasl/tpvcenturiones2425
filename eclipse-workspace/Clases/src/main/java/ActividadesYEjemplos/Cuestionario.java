package ActividadesYEjemplos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Cuestionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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

	JCheckBox chckbxNewCheckBox_1, chckbxNewCheckBox;
	JRadioButton rdbtnNewRadioButton, rdbtnNewRadioButton_1;
	JLabel lblNewLabel_2;
	
	public void setMessage() {
		String message = "";

		if (chckbxNewCheckBox_1.isSelected() == true) {
			message += chckbxNewCheckBox_1.getText();
			System.out.println(message);

		}
		if (chckbxNewCheckBox.isSelected()) {
			message += chckbxNewCheckBox.getText();
		}
		if (rdbtnNewRadioButton.isSelected()) {
			message += rdbtnNewRadioButton.getText();
		}
		if (rdbtnNewRadioButton_1.isSelected()) {
			message += rdbtnNewRadioButton_1.getText();
		}
		lblNewLabel_2.setText("RESPUESTA:"+ message);
	}
	/**
	 * Create the frame.
	 */
	public Cuestionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("PREGUNTA 1");
		contentPane.add(lblNewLabel);
		
		 chckbxNewCheckBox_1 = new JCheckBox("CHECK 1");
		contentPane.add(chckbxNewCheckBox_1);
		
		 chckbxNewCheckBox = new JCheckBox("CHECK 2");
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("PREGUTNA 2");
		contentPane.add(lblNewLabel_1);
		
		 rdbtnNewRadioButton = new JRadioButton("CIRCLE 1");
		buttonGroup.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton);
		
		 rdbtnNewRadioButton_1 = new JRadioButton("CIRCLE 2");
		buttonGroup.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_2 = new JLabel("RESPUESTA:");
		contentPane.add(lblNewLabel_2);
		Cuestionario c = this;
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.setMessage();
			}
		};
		chckbxNewCheckBox_1.addActionListener(actionListener);
		chckbxNewCheckBox.addActionListener(actionListener);
		rdbtnNewRadioButton_1.addActionListener(actionListener);
		rdbtnNewRadioButton.addActionListener(actionListener);
	}

}
