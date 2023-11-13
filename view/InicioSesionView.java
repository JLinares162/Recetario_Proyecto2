package view;
import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.UsuarioController;
import model.UsuarioModel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;

public class InicioSesionView extends JFrame {
	
	private String nombreDeUsuario;
	private String contraseñaDeUsuario;

	private JPanel contentPane;
	private JTextField UserTextField;
	private JPasswordField PasswordField;
	private UsuarioController user = new UsuarioController();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesionView frame = new InicioSesionView();
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
	public InicioSesionView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(39, 250, 67, 57);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Proyecto Progra\\src\\img\\password.png"));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(39, 147, 67, 48);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Proyecto Progra\\src\\img\\user.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(186, 10, 124, 116);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\linar\\Desktop\\Proyecto Progra\\src\\img\\user1.png"));
		contentPane.add(lblNewLabel_1);
		
		JLabel RegistrarseLabel = new JLabel("Registrarse");
		RegistrarseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegistrarseLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		RegistrarseLabel.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseEntered(MouseEvent e) {
				RegistrarseLabel.setText("<html><u><font color='blue'>Registrarse</font></u></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	RegistrarseLabel.setText("Registrarse");            
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                // Realizar la acción de cambiar a otra ventana aquí
            	setVisible(false);
            	RegistroView ventanaSecundaria = new RegistroView();
                ventanaSecundaria.setVisible(true);
            }
		});
		RegistrarseLabel.setBounds(107, 462, 124, 31);
		contentPane.add(RegistrarseLabel);
		
		JLabel MasInfoLabel = new JLabel("Más Info");
		MasInfoLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		MasInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MasInfoLabel.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseEntered(MouseEvent e) {
				MasInfoLabel.setText("<html><u><font color='blue'>Más Info</font></u></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	MasInfoLabel.setText("Más Info");            
            }
            
		});
		
		
		MasInfoLabel.setBounds(272, 462, 135, 31);
		contentPane.add(MasInfoLabel);
		
		JLabel UserEmpty = new JLabel("No deje campos vacios");
		UserEmpty.setHorizontalAlignment(SwingConstants.CENTER);
		UserEmpty.setFont(new Font("Dialog", Font.PLAIN, 16));
		UserEmpty.setForeground(new Color(255, 0, 0));
		UserEmpty.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				UserEmpty.setBackground(Color.green);
			}
		});
		UserEmpty.setBounds(136, 216, 245, 33);
		contentPane.add(UserEmpty);
		UserEmpty.setVisible(false);
		
		UserTextField = new JTextField();
		UserTextField.setFont(new Font("Dialog", Font.PLAIN, 18));
		UserTextField.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
                nombreDeUsuario = UserTextField.getText();
                System.out.println("Nombre de usuario: " + nombreDeUsuario);

                if (nombreDeUsuario == null || nombreDeUsuario.isEmpty()) {
                    UserEmpty.setVisible(true);
                } else {
                    UserEmpty.setVisible(false);
                }
            }
		});
		UserTextField.setBounds(116, 147, 291, 48);
		contentPane.add(UserTextField);
		UserTextField.setColumns(10);
		
		JLabel PasswordEmpty = new JLabel("No deje campos vacio");
		PasswordEmpty.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordEmpty.setFont(new Font("Dialog", Font.PLAIN, 16));
		PasswordEmpty.setForeground(new Color(255, 0, 0));
		PasswordEmpty.setBounds(153, 317, 204, 28);
		contentPane.add(PasswordEmpty);
		PasswordEmpty.setVisible(false);

		
		PasswordField = new JPasswordField();
		PasswordField.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		PasswordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contraseñaDeUsuario = PasswordField.getText();
				System.out.println("Contraseña de usuario: " + contraseñaDeUsuario);
				
				if (contraseñaDeUsuario == null || contraseñaDeUsuario.isEmpty()) {
					PasswordEmpty.setVisible(true);
                } else {
                	PasswordEmpty.setVisible(false);
                }
			}
		});
		PasswordField.setBounds(116, 259, 291, 48);
		contentPane.add(PasswordField);
		
		JButton IniciarSesionButton = new JButton("Iniciar Sesión ");
		IniciarSesionButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	user.leerDatos();
		    	user.mostrarUsuarios();
		        contraseñaDeUsuario = PasswordField.getText();
		        nombreDeUsuario = UserTextField.getText();
		        
		        
		        if (nombreDeUsuario == null || nombreDeUsuario.isEmpty() || contraseñaDeUsuario == null || contraseñaDeUsuario.isEmpty()) {
		            // Mostrar un mensaje de error si los campos están vacíos
		            UserEmpty.setVisible(true);
		            PasswordEmpty.setVisible(true);
		        } else {
		            // Llamar al controlador para autenticar al usuario
		            System.out.println(user.usuarios + "sadasdas");
		            UsuarioModel usuarioAutenticado = user.autenticarUsuario(nombreDeUsuario, contraseñaDeUsuario);
		            

		            if (usuarioAutenticado != null) {
		                // Usuario autenticado con éxito
		                // Puedes redirigir a una vista de perfil o realizar otras acciones aquí
		                System.out.println("Inicio de sesión exitoso");
		                // Realizar la acción de cambiar a otra ventana aquí
		            	setVisible(false);
		            	TableroPrincipalView ventanaSecundaria = new TableroPrincipalView();
		                ventanaSecundaria.setVisible(true);
		            } else {
		                // Mostrar un mensaje de error si la autenticación falla
		                System.out.println("Error: Credenciales incorrectas");
		            }
		        }
		    
		    }
		});
		IniciarSesionButton.setBackground(new Color(64, 128, 128));
		IniciarSesionButton.setForeground(new Color(255, 255, 255));
		IniciarSesionButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		IniciarSesionButton.setBounds(153, 378, 188, 57);
		
		IniciarSesionButton.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseEntered(MouseEvent e) {
				IniciarSesionButton.setBackground(new Color(64, 128, 150));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	IniciarSesionButton.setBackground(new Color(10, 128, 150));          
            }
		});
		contentPane.add(IniciarSesionButton);
		
		
	
	}
}