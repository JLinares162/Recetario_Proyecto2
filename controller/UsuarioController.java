package controller;

import java.sql.Date;
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
    
    public void cargarDatos(){
        
    }
}