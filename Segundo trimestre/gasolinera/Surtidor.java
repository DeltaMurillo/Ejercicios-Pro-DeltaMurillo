package gasolinera;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.function.IntFunction;

public class Surtidor{
    private ArrayList<Surtidor> surtidores = new ArrayList<>();
    private int capacidadTotal, capacidadActual;
    private String tipoFuel;
    private Boolean funciona;

    public Surtidor(int capacidadTotal, Boolean funciona, String tipoFuel) {
        this.funciona = true;
        this.capacidadTotal = capacidadTotal;
        this.tipoFuel = tipoFuel;
        this.capacidadActual = capacidadTotal;
    }
    public void setGasolinera(int surtidor){
        
    }

    public Surtidor(String tipoFuel) {
        int capacidadTotal = this.capacidadTotal;
        int capacidadActual = this.capacidadActual;
        Boolean funciona = this.funciona;
        this.tipoFuel = tipoFuel;
    }

    public void arreglar() {
        funciona = true;
    }

    public void rellenar(int cantidad) {
        capacidadActual += cantidad;
    }

    public void quitarGasolina(int cantidad) {
        if (!this.funciona) {
            System.out.println("No funciona el surtidor");
        } else {
            if (this.capacidadActual > cantidad) {
                this.capacidadActual -= cantidad;
            } else {
                System.out.println("No hay suficiente gasolina en el depósito");
            }
        }
    }

    //--->  G E T T E R  &  S E T T E R  <---\\

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

     public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoFuel() {
        return tipoFuel;
    }

    public void setTipoFuel(String tipoFuel) {
        this.tipoFuel = tipoFuel;
    }

    public Boolean getFunciona() {
        return funciona;
    }

    public void setFunciona(Boolean funciona) {
        this.funciona = funciona;
    }
}

