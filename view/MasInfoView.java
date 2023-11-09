package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;

public class MasInfoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasInfoView frame = new MasInfoView();
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
	public MasInfoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	
	
		JLabel VolverLabel = new JLabel("Volver");
		VolverLabel.addMouseListener(new MouseAdapter() {
			@Override
	        public void mouseEntered(MouseEvent e) {
				VolverLabel.setText("<html><u><font color='blue'>Volver</font></u></html>");
	        }
	
	        @Override
	        public void mouseExited(MouseEvent e) {
	        	VolverLabel.setText("Volver");            
	        }
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            // Realizar la acción de cambiar a otra ventana aquí
	        	setVisible(false);
	        	InicioSesionView ventanaSecundaria = new InicioSesionView();
	            ventanaSecundaria.setVisible(true);
	        }
		});
		contentPane.setLayout(null);
		VolverLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		VolverLabel.setBounds(20, 10, 51, 24);
		contentPane.add(VolverLabel);
		
		JLabel lblMsInformacin = new JLabel("Más Información");
		lblMsInformacin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsInformacin.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblMsInformacin.setBounds(155, 40, 170, 74);
		contentPane.add(lblMsInformacin);
		
		JTextArea txtrEnNuestroRecetario = new JTextArea();
		txtrEnNuestroRecetario.setEditable(false);
		txtrEnNuestroRecetario.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtrEnNuestroRecetario.setLineWrap(true);
		txtrEnNuestroRecetario.setText("En nuestra aplicación de recetas personalizadas, la protección de tu privacidad es nuestra máxima prioridad. Tu información, que incluye edad, altura y peso, se utilizará exclusivamente para calcular las recetas que se adapten a tus necesidades individuales. Puedes confiar en que tus datos se manejarán de manera segura y confidencial.\r\n\r\nEstamos comprometidos a ayudarte a lograr tus objetivos de salud de manera precisa y personalizada. Si tienes alguna pregunta adicional sobre cómo gestionamos tus datos, no dudes en contactarnos. Tu bienestar es fundamental para nosotros.");
		txtrEnNuestroRecetario.setBounds(32, 164, 415, 329);
		contentPane.add(txtrEnNuestroRecetario);
	
	}
}