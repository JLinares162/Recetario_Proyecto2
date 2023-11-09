package controller;

import model.RecetaModel;
import model.UsuarioModel;

import java.util.ArrayList;

public class RecetasController {
    private ArrayList<RecetaModel> recetas;

    public RecetasController() {
        // Inicializar la lista de recetas
        recetas = new ArrayList<>();
    }

    public void agregarReceta(RecetaModel receta) {
        // Agregar una receta a la lista
        recetas.add(receta);
    }

    public RecetaModel buscarRecetaPorNombre(String nombreReceta) {
        // Buscar una receta por nombre
        for (RecetaModel receta : recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombreReceta)) {
                return receta;
            }
        }
        // Si no se encuentra la receta, devolver null o lanzar una excepción, según tu preferencia.
        return null;
    }

    public ArrayList<RecetaModel> obtenerTodasLasRecetas() {
        // Devolver todas las recetas en la lista
        System.out.println(recetas);
        return recetas;
    }

    public ArrayList<RecetaModel> recomendarRecetas(UsuarioModel usuario) {
        ArrayList<RecetaModel> recomendaciones = new ArrayList<>();
        double caloriasDiarias = usuario.calcularCaloriasDiarias();

        for (RecetaModel receta : recetas) {
            // Compara las calorías diarias del usuario con las propiedades de las recetas
            if (caloriasDiarias >= receta.getCalorias()){
                recomendaciones.add(receta);
            }
        }
        return recomendaciones;
    }
}
