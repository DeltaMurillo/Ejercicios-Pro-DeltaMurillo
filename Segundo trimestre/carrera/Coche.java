package carrera;
import java.util.Scanner;

public class Coche {

    private int cv = 0, velocidad = 0;
    private String matricula, modelo;
    private Double kmRecorridos;
    Scanner key = new Scanner(System.in);
    public Coche() {
        cv = 0;
        velocidad = 0;
        matricula = "000AAA";
        modelo = "Sin especificar";
        kmRecorridos = 0.0;
    }

    public Coche(String modelo, String matricula, int cv){
        modelo = this.modelo;
        matricula = this.matricula;
        cv = this.cv;
    }

    public void acelerar(int newSpeed){
            if (newSpeed > 180){
                System.out.println("Vas demasiado rápido");
                newSpeed = 180;
            }
        this.velocidad = newSpeed;
    }

    public void frenar(int newSpeed){
            if (newSpeed <= 0){
                System.out.println("Has frenado de golpe");
                newSpeed = 0;
            }
         this.velocidad = newSpeed;
    }

    public void parar(){
        this.velocidad = 0;
    }

    public void resetear(){
        this.velocidad = 0;
        this.cv = 0;
    }

    public void setVelocidad(int newSpeed){
        if (newSpeed <= 0){
            System.out.println("Has frenado de golpe");
            newSpeed = 0;
        }
        if (newSpeed > 180){
            System.out.println("Vas demasiado rápido");
            newSpeed = 180;
        }
        this.velocidad = newSpeed;
    }

    public void setCv(int newCV){
        this.cv = newCV;
    }

    public void setMatricula(String newMatricula){
        this.matricula = newMatricula;
    }

    public void setModelo(String newModelo){
        this.modelo = newModelo;
    }

    public void setKmRecorridos(Double newKM){
        this.kmRecorridos = newKM;
    }

    public int getCv() {
        return cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getKmRecorridos() {
        return kmRecorridos;
    }

    public Scanner getKey() {
        return key;
    }

    public void setKey(Scanner key) {
        this.key = key;
    }

    public void mostrarDatos(){
        System.out.println("Matrícula: "+this.matricula+"  Modelo: "+this.modelo+"  CV: "+this.cv+"  Velocidad: "+this.velocidad+"  Kilómetros: "+this.kmRecorridos);
    }

}

