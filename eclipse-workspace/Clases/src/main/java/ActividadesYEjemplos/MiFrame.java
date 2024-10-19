package ActividadesYEjemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class MiFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiFrame frame = new MiFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JCheckBox chckbxNewCheckBox;
	JRadioButton rdbtnNewRadioButton;
	private JLabel lblNewLabel;
	/**
	 * Create the frame.
	 */
	public MiFrame() {
		this.setTitle("Mi primer Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		JLabel jLabel = new JLabel("Botón para abrir dialog");
		jLabel.setText("Seleccioname");
		contentPane.add(jLabel);
		
		JButton okButton = new JButton("MOSTRAR JDIALOG");
		okButton.setActionCommand("MOSTRAR JDIALOG");
		contentPane.add(okButton);
		JFrame frame = this;
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MiDialogo miDialogo = new MiDialogo(frame, false);
				miDialogo.setVisible(true);
			}
		});
		
		setContentPane(contentPane);
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel);
		chckbxNewCheckBox = new JCheckBox("New check box");
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(lblNewLabel.getText() + (chckbxNewCheckBox.isSelected() ? "TRUE" : "FALSE"));
			}
		});
		
	    rdbtnNewRadioButton = new JRadioButton("New radio button");
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText(lblNewLabel.getText() + (rdbtnNewRadioButton.isSelected() ? "TRUE" : "FALSE"));
			}
		});
		
		
		
	}

}
