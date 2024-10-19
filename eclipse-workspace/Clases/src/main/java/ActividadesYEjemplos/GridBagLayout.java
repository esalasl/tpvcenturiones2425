//package ActividadesYEjemplos;
//
//import java.awt.EventQueue;
//import java.awt.GridBagConstraints;
//import java.awt.LayoutManager;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//
//public class GridBagLayout extends JFrame {
//
//	private static final long serialVersionUID = 1L;
//	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GridBagLayout frame = new GridBagLayout();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	public GridBagLayout() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
//		setContentPane(contentPane);
//		GridBagLayout gbl_contentPane = new GridBagLayout();
////		gbl_contentPane.columnWidths = new int[]{0};
////		gbl_contentPane.rowHeights = new int[]{0};
////		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
////		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
//		contentPane.setLayout(gbl_contentPane);
//
//		GridBagConstraints gblc1 = new GridBagConstraints();
//		initGridBagLayout(gblc1, 0, 0, 2, 1);
//		GridBagConstraints gblc2 = new GridBagConstraints();
//		initGridBagLayout(gblc2, 0, 2, 2, 1);
//		GridBagConstraints gblc3 = new GridBagConstraints();
//		initGridBagLayout(gblc3, 1, 0, 1, 1);
//		GridBagConstraints gblc4 = new GridBagConstraints();
//		initGridBagLayout(gblc4, 2, 0, 3, 2);
//		GridBagConstraints gblc5 = new GridBagConstraints();
//		initGridBagLayout(gblc5, 2, 2, 2, 2);
//
////		gblc.gridx=0;
////		gblc.gridy=0;
////		gblc.gridwidth=0;
////		gblc.gridheight=0;
////		gblc.fill=GridBagConstraints.BOTH;//rellenar
////		
//
//		JButton button1 = new JButton("BOTON 1");
//		JButton button2 = new JButton("BOTON 2");
//		JButton button3 = new JButton("BOTON 3");
//		JButton button4 = new JButton("BOTON 4");
//		JButton button5 = new JButton("BOTON 5");
//
//		contentPane.add(button1, gblc1);
//		contentPane.add(button2, gblc2);
//		contentPane.add(button3, gblc3);
//		contentPane.add(button4, gblc4);
//		contentPane.add(button5, gblc5);
//
//	}
//
//	public void initGridBagLayout(GridBagConstraints gblc, int x, int y, int w, int h, double wx, double wh) {
//
//		gblc.gridx = x;
//		gblc.gridy = y;
//		gblc.gridwidth = w;
//		gblc.gridheight = h;
//		gblc.weightx = wx;
//		gblc.weighty = wh;
//		gblc.fill = GridBagConstraints.BOTH;// rellenar
//	}
//
//}