package controller;

import java.sql.Date;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.UsuarioModel;

public class UsuarioController {
    public List<UsuarioModel> usuarios; // Almacenar usuarios registrados
    //Constructor
    public UsuarioController() {
        usuarios = new ArrayList<>();
    }

    // Función para autenticar un usuario
    public UsuarioModel autenticarUsuario(String correoElectronico, String contraseña) {
        for (UsuarioModel usuario : usuarios) {
            if (usuario.getCorreoElectronico().equals(correoElectronico) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        return null; // Usuario no encontrado
    }

    // Función para registrar un nuevo usuario
    public void registrarUsuario(UsuarioModel usuario) {
        usuarios.add(usuario);
    }

    // Función para gestionar el perfil de un usuario (actualizar datos)
    public void gestionarPerfilUsuario(UsuarioModel usuario, String nuevoNombre, Date nuevaFechaNacimiento, 
                                       Boolean nuevoSexo, Double nuevoPeso, Double nuevaAltura,
                                       String nuevosObjetivos, String nuevaActividadFisica,
                                       String nuevasPreferencias, String nuevasAlergias) {
        // Actualizar los campos del usuario
        usuario.setNombre(nuevoNombre);
        usuario.setFechaDeNacimiento(nuevaFechaNacimiento);
        usuario.setSexo(nuevoSexo);
        usuario.setPeso(nuevoPeso);
        usuario.setAltura(nuevaAltura);
        usuario.setObjetivos(nuevosObjetivos);
        usuario.setActividadFisica(nuevaActividadFisica);
        usuario.setPreferencias(nuevasPreferencias);
        usuario.setAlergias(nuevasAlergias);
    }
    
  /**
   * Al registrar un usuario se agrega en el csv
   * @param user
   * @throws IOException
   */
    public void escribirDatos(UsuarioModel user) throws IOException{    
    	//Pegar aca la direccion del csv si su dispositivo no es mac.
    	String archivo = "/Users/GadielOcana/Downloads/Recetario/datosLogin.csv";
    	PrintWriter writer = new PrintWriter(new FileWriter(archivo, true));
    	String line = "";
    	  line = line + user.getNombre()+","+user.getCorreoElectronico()+","+user.getContraseña()+","+user.getFechaDeNacimiento()+","+user.getSexo()+
    			  ","+user.getPeso()+","+user.getAltura()+","+user.getObjetivos()+","+user.getActividadFisica()+","+user.getPreferencias()+
    			  ","+","+user.getAlergias();
    	  
    	  writer.println(line);
    	  writer.close();
    	  System.out.println("Usuario guardado con exito.");
    	
    }
    /**
     * Lee el archivo csv y los carga en la lista
     */
    public void leerDatos(){
    	//Pegar aca la direccion del csv si su dispositivo no es mac.
        String archivo = "/Users/GadielOcana/Downloads/Recetario/datosLogin.csv";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while((line = bufferedReader.readLine())!=null){
                try{
                    if(!line.trim().isEmpty()){
                        String[] fields = line.split(",");
                        String nombre  = fields[0];
                        String correo = fields[1];
                        String contrasena = fields[2];
                        Date fechaNacimiento = Date.valueOf(fields[3]);
                        Boolean sexo = Boolean.parseBoolean(fields[4]);
                        Double peso = Double.parseDouble(fields[5]);
                        Double altura = Double.parseDouble(fields[6]);
                        String objetivos = fields[7];
                        String actividadFisica = fields[8];
                        String preferencias = fields[9];
                        String alergias = fields[10];
                        //Abajo crear objeto y agregar a lista
                        UsuarioModel nuevoUsuario = new UsuarioModel(nombre,correo,contrasena,fechaNacimiento,sexo,peso,altura,objetivos,actividadFisica,preferencias,alergias);
                        registrarUsuario(nuevoUsuario);
                        System.out.println("Se han cargado con exito los usuarios.");
           
                    }
                }catch (Exception e){
                    System.out.println(" - Verifique el formato de la siguiente linea: "+line);
                }
            }
        }catch (IOException e){
            System.out.println("Revise el nombre del archivo");
        }
   
    }
    /**
     * Muestra los usuarios cargados por el csv
     */
    public void mostrarUsuarios() {
    	for(UsuarioModel u: usuarios) {
    		u.toString();
    	}
    	
    }
}