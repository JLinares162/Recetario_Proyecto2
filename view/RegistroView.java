package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.UsuarioController;
import model.UsuarioModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class RegistroView extends JFrame {

	private JPanel contentPane;
	private JTextField NombreTextField;
	private JTextField EmailTextField;
	private JPasswordField passwordField;
	private JTextField PesoTextField;
	private JTextField AlturaTextField;
	private JTextField FechaNacimientoTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroView frame = new RegistroView();
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
	public RegistroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuevo Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblNewLabel.setBounds(157, 10, 170, 74);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(63, 94, 115, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(250, 94, 115, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email:");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(63, 133, 115, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(63, 188, 162, 29);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Sexo:");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(63, 227, 115, 29);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Peso:");
		lblNewLabel_1_5.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(271, 227, 115, 29);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Objetivos:");
		lblNewLabel_1_6.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(63, 305, 115, 29);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Nivel Actividad Física:");
		lblNewLabel_1_7.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_7.setBounds(63, 344, 179, 29);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Preferencias:");
		lblNewLabel_1_8.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_8.setBounds(63, 383, 115, 29);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Alergias:");
		lblNewLabel_1_9.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_9.setBounds(63, 422, 115, 29);
		contentPane.add(lblNewLabel_1_9);
		
		NombreTextField = new JTextField();
		NombreTextField.setFont(new Font("Dialog", Font.PLAIN, 16));
		NombreTextField.setBounds(125, 94, 115, 29);
		contentPane.add(NombreTextField);
		NombreTextField.setColumns(10);
		
		EmailTextField = new JTextField();
		EmailTextField.setFont(new Font("Dialog", Font.PLAIN, 16));
		EmailTextField.setColumns(10);
		EmailTextField.setBounds(110, 134, 350, 27);
		contentPane.add(EmailTextField);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 16));
		passwordField.setBounds(339, 94, 121, 29);
		contentPane.add(passwordField);
		
		PesoTextField = new JTextField();
		PesoTextField.setFont(new Font("Dialog", Font.PLAIN, 16));
		PesoTextField.setColumns(10);
		PesoTextField.setBounds(324, 228, 136, 27);
		contentPane.add(PesoTextField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(63, 176, 397, 2);
		contentPane.add(separator);
		
		JComboBox ObjetivosComboBox = new JComboBox();
		ObjetivosComboBox.setModel(new DefaultComboBoxModel(new String[] {"Bajar de Peso (Deficit)", "Aumentar masa Muscular (SuperHabit)"}));
		ObjetivosComboBox.setBounds(137, 308, 323, 28);
		contentPane.add(ObjetivosComboBox);
		
		JComboBox AcividadFisicaComboBox = new JComboBox();
		AcividadFisicaComboBox.setModel(new DefaultComboBoxModel(new String[] {"1 (Sedentario)", "2 (Poco Sedentario)", "3 (Poco ejercicio)", "4 (Ejercicio constante)", "5 (Ejercicio diario)"}));
		AcividadFisicaComboBox.setBounds(233, 347, 227, 28);
		contentPane.add(AcividadFisicaComboBox);
		
		JComboBox PreferenciasComboBox = new JComboBox();
		PreferenciasComboBox.setModel(new DefaultComboBoxModel(new String[] {"Dieta Vegana", "Dieta Vegetariana", "De todo"}));
		PreferenciasComboBox.setBounds(174, 386, 286, 28);
		contentPane.add(PreferenciasComboBox);
		
		JComboBox SexoComboBox = new JComboBox();
		SexoComboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		SexoComboBox.setBounds(110, 230, 151, 28);
		contentPane.add(SexoComboBox);
		
		JComboBox AlergiasComboBox = new JComboBox();
		AlergiasComboBox.setModel(new DefaultComboBoxModel(new String[] {"Intolerante a la Lactosa", "Nueces", "Ninguna"}));
		AlergiasComboBox.setBounds(136, 425, 324, 28);
		contentPane.add(AlergiasComboBox);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(20, 53, 17, 427);
		contentPane.add(scrollBar);
		
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
		VolverLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		VolverLabel.setBounds(20, 10, 79, 21);
		contentPane.add(VolverLabel);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Altura:");
		lblNewLabel_1_4_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_1_4_1.setBounds(63, 269, 115, 29);
		contentPane.add(lblNewLabel_1_4_1);
		
		AlturaTextField = new JTextField();
		AlturaTextField.setFont(new Font("Dialog", Font.PLAIN, 16));
		AlturaTextField.setColumns(10);
		AlturaTextField.setBounds(110, 268, 151, 27);
		contentPane.add(AlturaTextField);
		
		FechaNacimientoTextField = new JTextField();
		FechaNacimientoTextField.setFont(new Font("Dialog", Font.PLAIN, 16));
		FechaNacimientoTextField.setColumns(10);
		FechaNacimientoTextField.setBounds(226, 188, 234, 29);
		contentPane.add(FechaNacimientoTextField);
		
		JButton RegistrarButton = new JButton("Registrar");
		RegistrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtener los datos del formulario
                String nombre = NombreTextField.getText();
                String correo = EmailTextField.getText();
                String contraseña = new String(passwordField.getPassword());
                Date fechaNacimiento = Date.valueOf(FechaNacimientoTextField.getText());
                Boolean sexo = SexoComboBox.getSelectedItem().equals("Hombre"); // Asumiendo que "Hombre" es una de las opciones del combo
                Double peso = Double.parseDouble(PesoTextField.getText());
                Double altura = Double.parseDouble(AlturaTextField.getText());
                String objetivos = ObjetivosComboBox.getSelectedItem().toString();
                String actividadFisica = AcividadFisicaComboBox.getSelectedItem().toString();
                String preferencias = PreferenciasComboBox.getSelectedItem().toString();
                String alergias = AlergiasComboBox.getSelectedItem().toString();

                // Validar los datos, por ejemplo, verificar que no haya campos vacíos y que la fecha de nacimiento sea válida

                if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(contentPane, "Por favor, complete todos los campos obligatorios.", "Error de registro", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Crear un objeto UsuarioModel con los datos
                    UsuarioModel nuevoUsuario = new UsuarioModel(alergias, alergias, alergias, fechaNacimiento, sexo, altura, altura, alergias, alergias, alergias, alergias);
                    nuevoUsuario.setNombre(nombre);
                    nuevoUsuario.setCorreoElectronico(correo);
                    nuevoUsuario.setContraseña(contraseña);
                    nuevoUsuario.setFechaDeNacimiento(fechaNacimiento);
                    nuevoUsuario.setSexo(sexo);
                    nuevoUsuario.setPeso(peso);
                    nuevoUsuario.setAltura(altura);
                    nuevoUsuario.setObjetivos(objetivos);
                    nuevoUsuario.setActividadFisica(actividadFisica);
                    nuevoUsuario.setPreferencias(preferencias);
                    nuevoUsuario.setAlergias(alergias);

                    // Llamar al controlador para registrar el usuario
                    UsuarioController controller = new UsuarioController();
                    controller.registrarUsuario(nuevoUsuario);
                    System.out.println(nuevoUsuario);
                    System.out.println(controller.usuarios);

                    // Mostrar un mensaje de éxito
                    JOptionPane.showMessageDialog(contentPane, "Usuario registrado con éxito", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);

                    // Limpiar los campos del formulario si es necesario
                    NombreTextField.setText("");
                    EmailTextField.setText("");
                    passwordField.setText("");
                    FechaNacimientoTextField.setText("");
                    SexoComboBox.setSelectedIndex(0); // Puedes configurar un valor predeterminado
                    PesoTextField.setText("");
                    AlturaTextField.setText("");
                    ObjetivosComboBox.setSelectedIndex(0); // Puedes configurar un valor predeterminado
                    AcividadFisicaComboBox.setSelectedIndex(0); // Puedes configurar un valor predeterminado
                    PreferenciasComboBox.setSelectedIndex(0); // Puedes configurar un valor predeterminado
                    AlergiasComboBox.setSelectedIndex(0); // Puedes configurar un valor predeterminado
                }	
			}
		});
		RegistrarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		RegistrarButton.setFont(new Font("Dialog", Font.PLAIN, 14));
		RegistrarButton.setBounds(193, 463, 115, 30);
		contentPane.add(RegistrarButton);
	}
}
