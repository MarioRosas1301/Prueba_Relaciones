
package dominio;

import java.util.ArrayList;

public class Facultad {
    private String Director;
    private ArrayList<Carrera> carreras;
    private ArrayList<Profesor> profesores;

    public Facultad(ArrayList<Carrera> carreras, ArrayList<Profesor> profesores) {
        this.carreras = carreras;
        this.profesores = profesores;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
 
}
