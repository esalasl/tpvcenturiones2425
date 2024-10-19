package ActividadesYEjemplos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FrameLayouts extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLayouts frame = new FrameLayouts();
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
	public FrameLayouts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		/* ABSOLUTE LAYOUT
		contentPane.setLayout(null);
		JButton buttonOK = new JButton("OK");
		JButton buttonCancel = new JButton("Cancel");
		contentPane.add(buttonOK);
		buttonOK.setBounds(10, 10, 70, 70);
		buttonCancel.setBounds(100, 100, 100, 100);
		*/
		/* BORDER LAYOUT 
		contentPane.setLayout(new BorderLayout());
		JPanel panelCentral = new JPanel();
		JButton buttonOK = new JButton("OK");
		JButton buttonCancel = new JButton("Cancel");
		panelCentral.add(buttonOK);

		panelCentral.add(buttonCancel);
		contentPane.add(panelCentral,BorderLayout.CENTER);
		
		JButton buttonNORTE = new JButton("NORTE");
		contentPane.add(buttonNORTE,BorderLayout.NORTH);
		JButton buttonSUR = new JButton("SUR");
		contentPane.add(buttonSUR,BorderLayout.SOUTH);
		JButton buttonESTE = new JButton("ESTE");
		contentPane.add(buttonESTE,BorderLayout.EAST);
		JButton buttonOESTE = new JButton("OESTE");
		contentPane.add(buttonOESTE,BorderLayout.WEST);
		setContentPane(contentPane);*/
		/* FLOW LAYOUT
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 40,10));
		JButton buttonOK = new JButton("OK");
		JButton buttonCancel = new JButton("Cancel");
		contentPane.add(buttonOK);
		contentPane.add(buttonCancel);
		setContentPane(contentPane); */
		
		/* GRID LAYOUT new GridLayout(ROWS/filas, COLUMNS, HORIZONTAL GAP, VERTICAL GAP)
		contentPane.setLayout(new GridLayout(5,5,2,3));
		for (int i=0; i<25;i++) {
			JButton button = new JButton(Integer.toString(i));
			contentPane.add(button);
		}
		setContentPane(contentPane);*/
		
		/* GRID BAG LAYOUT new GridLayout(ROWS/filas, COLUMNS, HORIZONTAL GAP, VERTICAL GAP)
		contentPane.setLayout(new GridBagLayout());
		for (int i=0; i<25;i++) {
			JButton button = new JButton(Integer.toString(i));
			contentPane.add(button);
		}
		setContentPane(contentPane);
		
		*
		GirdBadContraints caracteristicas
		gridx gridy -> colocacion en el grid (columna y fila)
		gridheight -> gridweight dimensiones de filas y columnas
		Fill -> expansión para rellenar o no por completo la celda
		upadx ipady paddings internos de celda
		*
		*/
		
		
		
	
		
		
		/* Box LAYOUT */
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		JButton buttonOK = new JButton("OK");
		JButton buttonCancel = new JButton("Cancel");
		contentPane.add(buttonOK);
		contentPane.add(buttonCancel);
		setContentPane(contentPane);
	}

}
