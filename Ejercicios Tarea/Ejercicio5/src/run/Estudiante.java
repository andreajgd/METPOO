package run;

public class Estudiante {
    String nombre;
    String matricula;
    double promedio;

    public Estudiante(String nombre, String matricula, double promedio){
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public Estudiante(){

    }

    public String Promedio(){
        if(promedio >= 70){
            return "Aprobado!";
        }
        if(promedio < 70 ){
            return "Reprobado.";
        }
        else{
            return "Intenta de nuevo.";
        }
    }
}
