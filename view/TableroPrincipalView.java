package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;

public class TableroPrincipalView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroPrincipalView frame = new TableroPrincipalView();
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
	public TableroPrincipalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(10, 475, 1166, 18);
		contentPane.add(scrollBar);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 177, 350, 276);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Primera Comida");
		lblNewLabel_1.setBounds(116, 5, 107, 33);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\pollo.png"));
		lblNewLabel_3.setBounds(56, 23, 253, 121);
		panel.add(lblNewLabel_3);
		
		JTextPane txtpnLoremIpsumDolor = new JTextPane();
		txtpnLoremIpsumDolor.setEditable(false);
		txtpnLoremIpsumDolor.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
		txtpnLoremIpsumDolor.setBounds(53, 154, 236, 63);
		panel.add(txtpnLoremIpsumDolor);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 227, 287, 2);
		panel.add(separator);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\calorias.png"));
		lblNewLabel_5.setBounds(43, 233, 45, 33);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\proteinas.png"));
		lblNewLabel_6.setBounds(150, 227, 45, 39);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\carbs.png"));
		lblNewLabel_7.setBounds(251, 239, 45, 27);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(417, 177, 350, 276);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Segunda Comida");
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(812, 177, 350, 276);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Proteínas");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblNewLabel.setBounds(223, 123, 116, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblCarbohidratos = new JLabel("Carbohidratos");
		lblCarbohidratos.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblCarbohidratos.setBounds(395, 123, 166, 21);
		contentPane.add(lblCarbohidratos);
		
		JLabel lblGrasas = new JLabel("Grasas");
		lblGrasas.setFont(new Font("Dialog", Font.PLAIN, 22));
		lblGrasas.setBounds(594, 123, 116, 21);
		contentPane.add(lblGrasas);
		
		JLabel lblR = new JLabel("Recetas del Día");
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setFont(new Font("Dialog", Font.PLAIN, 32));
		lblR.setBounds(453, 8, 258, 29);
		contentPane.add(lblR);
		
		JLabel lblNewLabel_4 = new JLabel("2500.kcal");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 32));
		lblNewLabel_4.setBounds(56, 74, 147, 35);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Lista de Compras");
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnNewButton.setBounds(848, 69, 220, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver");
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1.setBounds(848, 146, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cambiar");
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_2.setBounds(938, 146, 130, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\casa.png"));
		btnNewButton_3.setBounds(897, 16, 85, 43);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\config.png"));
		btnNewButton_4.setBounds(996, 16, 85, 43);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\perfil.png"));
		btnNewButton_5.setBounds(1091, 16, 85, 43);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("00.g");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Dialog", Font.PLAIN, 32));
		lblNewLabel_4_1.setBounds(223, 74, 116, 35);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("00.g");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Dialog", Font.PLAIN, 32));
		lblNewLabel_4_1_1.setBounds(395, 74, 116, 35);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("00.g");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setFont(new Font("Dialog", Font.PLAIN, 32));
		lblNewLabel_4_1_2.setBounds(564, 74, 116, 35);
		contentPane.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\carrito.png"));
		lblNewLabel_8.setBounds(778, 69, 64, 35);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\ver.png"));
		lblNewLabel_9.setBounds(871, 123, 50, 21);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Recetario\\src\\img\\cambiar.png"));
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_1.setBounds(983, 108, 50, 36);
		contentPane.add(lblNewLabel_9_1);
	}
}
