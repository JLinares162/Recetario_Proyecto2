package model;

import java.sql.Date;
import java.util.Calendar;

public class UsuarioModel{

    private String nombre;
    private String correoElectronico;
    private String contraseña;
    private Date fechaDeNacimiento;
    private Boolean sexo;
    private Double peso;
    private Double altura;
    private String objetivos;
    private String actividadFisica;
    private String preferencias;
    private String alergias;
    
    public UsuarioModel(String nombre, String correoElectronico, String contraseña, Date fechaDeNacimiento,
            Boolean sexo, Double peso, Double altura, String objetivos, String actividadFisica, String preferencias,
            String alergias) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.objetivos = objetivos;
        this.actividadFisica = actividadFisica;
        this.preferencias = preferencias;
        this.alergias = alergias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getActividadFisica() {
        return actividadFisica;
    }

    public void setActividadFisica(String actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @Override
    public String toString() {
        return "UsuarioModel [nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", contraseña="
                + contraseña + ", fechaDeNacimiento=" + fechaDeNacimiento + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + ", objetivos=" + objetivos + ", actividadFisica=" + actividadFisica
                + ", preferencias=" + preferencias + ", alergias=" + alergias + "]";
    }

    public int calcularEdad() {
        // Calcular la edad a partir de la fecha de nacimiento
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(fechaDeNacimiento);
        Calendar fechaActual = Calendar.getInstance();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);

        // Ajustar la edad si aún no ha cumplido años en este año
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public double calcularCaloriasDiarias() {
        int edad = calcularEdad();
        // Fórmula para calcular las calorías diarias necesarias (puedes ajustar los valores según tus necesidades)
        double tasaMetabolicaBasal;
        if (sexo) { // Si el usuario es masculino (sexo == true)
            tasaMetabolicaBasal = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
        } else { // Si el usuario es femenino (sexo == false)
            tasaMetabolicaBasal = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * edad);
        }

        // Dependiendo de los objetivos y la actividad física, puedes ajustar las calorías diarias recomendadas
        double caloriasDiarias;
        if (objetivos.equals("Perder Peso")) {
            caloriasDiarias = tasaMetabolicaBasal * 0.8; // Reducción del 20%
        } else if (objetivos.equals("Mantener Peso")) {
            caloriasDiarias = tasaMetabolicaBasal;
        } else {
            caloriasDiarias = tasaMetabolicaBasal * 1.2; // Aumento del 20%
        }
        return caloriasDiarias;
    }
}