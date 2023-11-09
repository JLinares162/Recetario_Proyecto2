package model;

import java.util.ArrayList;

public class RecetaModel {
    
    private String nombre;
    private String instrucciones;
    private String detallesNutricionales;
    private ArrayList<String> ingredentes;
    private String tipo;
    private String tiempoElaboracion;
    private int proteina;
    private int carbohidratos;
    private int grasas;
    private int calorias;

    
    public RecetaModel(String nombre, String instrucciones, String detallesNutricionales, ArrayList<String> ingredentes,
            String tipo, String tiempoElaboracion, int proteina, int carbohidratos, int grasas, int calorias) {
        this.nombre = nombre;
        this.instrucciones = instrucciones;
        this.detallesNutricionales = detallesNutricionales;
        this.ingredentes = ingredentes;
        this.tipo = tipo;
        this.tiempoElaboracion = tiempoElaboracion;
        this.proteina = proteina;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        this.calorias = calorias;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getInstrucciones() {
        return instrucciones;
    }


    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }


    public String getDetallesNutricionales() {
        return detallesNutricionales;
    }


    public void setDetallesNutricionales(String detallesNutricionales) {
        this.detallesNutricionales = detallesNutricionales;
    }


    public ArrayList<String> getIngredentes() {
        return ingredentes;
    }


    public void setIngredentes(ArrayList<String> ingredentes) {
        this.ingredentes = ingredentes;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getTiempoElaboracion() {
        return tiempoElaboracion;
    }


    public void setTiempoElaboracion(String tiempoElaboracion) {
        this.tiempoElaboracion = tiempoElaboracion;
    }


    public int getProteina() {
        return proteina;
    }


    public void setProteina(int proteina) {
        this.proteina = proteina;
    }


    public int getCarbohidratos() {
        return carbohidratos;
    }


    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }


    public int getGrasas() {
        return grasas;
    }


    public void setGrasas(int grasas) {
        this.grasas = grasas;
    }


    public int getCalorias() {
        return calorias;
    }


    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }


    @Override
    public String toString() {
        return "RecetaModel [nombre=" + nombre + ", instrucciones=" + instrucciones + ", detallesNutricionales="
                + detallesNutricionales + ", ingredentes=" + ingredentes + ", tipo=" + tipo + ", tiempoElaboracion="
                + tiempoElaboracion + ", proteina=" + proteina + ", carbohidratos=" + carbohidratos + ", grasas="
                + grasas + ", calorias=" + calorias + "]";
    }
}