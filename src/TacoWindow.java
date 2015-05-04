import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;


public class TacoWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TacoWindow(int x, int y) {
		ImageIcon imageIcon = new ImageIcon("E:\\workspace\\TestSplashScreen\\taco.png");
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(x, y, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		getContentPane().setLayout(new BorderLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		setBackground(new Color(0, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		
		lblNewLabel.setSize(new Dimension(imageIcon.getIconWidth(), imageIcon.getIconHeight()));
		lblNewLabel.setIcon(imageIcon);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TacoWindow windowArray[][] = new TacoWindow[5][3];
					for(int i = 0; i < 600; i+=200){
						for(int j = 0; j < 1000; j+=200){
							windowArray[j/200][i/200] = new TacoWindow(j, i);
							windowArray[j/200][i/200].setVisible(true);
							Thread.sleep(250);
						}
					}
					
					for(int i = 0; i < 600; i+=200){
						for(int j = 0; j < 1000; j+=200){
							windowArray[j/200][i/200].dispose();
							Thread.sleep(250);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
