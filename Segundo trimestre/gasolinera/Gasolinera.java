package gasolinera;

import java.util.ArrayList;

public class Gasolinera {
    private String nombre;
    private ArrayList<Surtidor> surtidores = new ArrayList<>();
    private int ganancias;


    public Gasolinera(String nombre){
        this.nombre = nombre;
        int ganacias = this.ganancias;
    }

    public int obtenerGanancias(){
        return ganancias;
    }

    //--> G E T T E R   S E T T E R  <--\\


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }

    public void setSurtidores(ArrayList<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
