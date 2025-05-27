package paradigmas.poo.principios.abstraccion;

import java.util.List;

public class Origen {
    private String nombre;
    private String descripcion;
    private List<Mensajero> mensajeros;


    public Origen(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
