package Actividad2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Tarea extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textTarea;
	private String tarea;

	public Tarea(JFrame padre) {
		super(padre, "Tareas", true);
		setForeground(new Color(255, 0, 0));
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		textTarea = new JTextField();
		textTarea.setBackground(new Color(255, 235, 205));
		textTarea.setBounds(35, 72, 375, 76);
		contentPanel.add(textTarea);
		textTarea.setColumns(10);

		JLabel lblNewLabel = new JLabel("INGRESA LA TAREA");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel.setFont(new Font("Microsoft YaHei Light", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(113, 29, 206, 32);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tarea.class.getResource("/img/FONDOTAREAS.png")));
		lblNewLabel_1.setBounds(-80, 0, 514, 272);
		contentPanel.add(lblNewLabel_1);
		setLocationRelativeTo(null);

		JPanel buttonPane = new JPanel();
		buttonPane.setBackground(SystemColor.activeCaption);
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("AGREGAR");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tarea = textTarea.getText(); // RECUPERAMOS EL LA TAREA INGRESADA
				dispose();
			}
		});
		FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.CENTER, 5, 5);
		buttonPane.setLayout(fl_buttonPane);
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("SALIR");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonPane.add(cancelButton);
	}

	// METODO PARA OBTENER LA TAREA INGRESADA POR EL USUARIO
	public String getTarea() {
		return tarea;
	}
}