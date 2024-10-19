package Actividad3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Comandas extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Comandas dialog = new Comandas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace(); //tpvView, solo va las cosas graficas, contolProductos controlador, y productos modelo
			//no entiendo pero luego lo vemos :) x2 :) 
		}
	}

	/**
	 * Create the dialog.
	 */
	public Comandas() {
		setBounds(100, 100, 650, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		CardLayout cardlayout = new CardLayout();
		contentPanel.setLayout(cardlayout);
		
		setResizable(true);
		setLocationRelativeTo(null);
		
		String botonesComanda [] = {"ENTRANTES","PRIMEROS","SEGUNDOS","POSTRES","BEBIDAS"};
		JButton[] botonesPlatos = new JButton[botonesComanda.length];
		
		for (int i = 0; i < botonesComanda.length; i++) {
			botonesPlatos[i] = new JButton(botonesComanda[i]);
			
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
