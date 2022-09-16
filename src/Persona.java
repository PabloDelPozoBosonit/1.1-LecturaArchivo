
/**
 * @author  Pablo del Pozo Vizueta
 * Este POJO contiene atributos, setters y getters de nombre localidad y edad
 * */
public class Persona {
    String nombre,
            localidad,
            edad;



    public Persona(String nombre, String localidad, String edad) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.edad = edad;
    }

    public Persona(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
