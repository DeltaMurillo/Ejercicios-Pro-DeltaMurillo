package cajero.data;

import java.util.ArrayList;

public class Cuenta {
    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    private String nombre, apellido, dni;
    private int id, pin;
    private double saldo;

    private Cuenta(String nombre, String apellido, String dni, int id, int pin, double saldo) {
    }


    public void comprobarCuenta(int id) {
        for (int i = 0; i < cuentas.size(); i++) {

        }
    }

    public void agregarCuenta(String nombre, String apellido, String dni, int id, int pin, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id = id;
        this.pin = pin;
        this.saldo = saldo;
        cuentas.add(new Cuenta(nombre, apellido, dni, id, pin, saldo));
    }


    // ------------------------------------- \\
    //    G E T T E R S      S E T T E R S     \\
    //-------------------------------------------\\

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}