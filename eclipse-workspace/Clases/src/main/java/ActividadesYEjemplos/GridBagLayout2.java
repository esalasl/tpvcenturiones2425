package ActividadesYEjemplos;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

public class GridBagLayout2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridBagLayout2 frame = new GridBagLayout2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void initGridBagLayout(GridBagConstraints gblc, int x, int y, int w, int h, double wx, double wh) {

		gblc.gridx = x;
		gblc.gridy = y;
		gblc.gridwidth = w;
		gblc.gridheight = h;
		gblc.weightx = wx;
		gblc.weighty = wh;
		gblc.fill = GridBagConstraints.BOTH;// rellenar
	}

	/**
	 * Create the frame.
	 */
	public GridBagLayout2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0};
//		gbl_contentPane.rowHeights = new int[]{0};
//		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		// contentPane.setLayout(new GridBagLayout());

		/*
		 * gridbagconstraints: caracteristicas de cada elemento en el grid gridx gridy:
		 * colocacion en el grid( fila y columna ) x: vertical y: horizontal gridheight:
		 * dimension de filas y columnas fill: expansion para rrellenar o no por
		 * completo la celda ipadx ipady: paddings internos de la celda
		 */

		GridBagConstraints gblc1 = new GridBagConstraints();
		initGridBagLayout(gblc1, 0, 0, 2, 1, 0.5, 0.2); // la primera es la x y la segunda y
		GridBagConstraints gblc2 = new GridBagConstraints();
		initGridBagLayout(gblc2, 2, 0, 2, 1, 0.2, 0.5);
		GridBagConstraints gblc3 = new GridBagConstraints();
		initGridBagLayout(gblc3, 0, 1, 1, 1, 0.25, 0.2);
		GridBagConstraints gblc4 = new GridBagConstraints();
		initGridBagLayout(gblc4, 0, 2, 2, 3, 0.5, 0.6);
		GridBagConstraints gblc5 = new GridBagConstraints();
		initGridBagLayout(gblc5, 2, 2, 2, 2, 0.4, 0.5);

		JButton buttton1 = new JButton("Boton 1");
		JButton buttton2 = new JButton("Boton 2");
		JButton buttton3 = new JButton("Boton 3");
		JButton buttton4 = new JButton("Boton 4");
		JButton buttton5 = new JButton("Boton 5");

		contentPane.add(buttton1, gblc1);
		contentPane.add(buttton2, gblc2);
		contentPane.add(buttton3, gblc3);
		contentPane.add(buttton4, gblc4);
		contentPane.add(buttton5, gblc5);

	}

}
