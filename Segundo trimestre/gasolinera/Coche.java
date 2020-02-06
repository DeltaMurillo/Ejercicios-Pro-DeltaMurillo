package gasolinera;

import org.jetbrains.annotations.NotNull;

public class Coche {
    private String gasolina;
    private int litrosDeposito;
    private Surtidor surtidores;
    private int cantidad;


    public Coche(String gasolina) {
        this.gasolina = gasolina;
        this.litrosDeposito = 0;
    }
}