
package dominio;

import java.util.ArrayList;


public class Profesor {
    private String nombreProfesorFacultad;
    private ArrayList<Materia> nombreMateria;

    public Profesor(ArrayList<Materia> nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreProfesorFacultad() {
        return nombreProfesorFacultad;
    }

    public void setNombreProfesorFacultad(String nombreProfesorFacultad) {
        this.nombreProfesorFacultad = nombreProfesorFacultad;
    }
}
