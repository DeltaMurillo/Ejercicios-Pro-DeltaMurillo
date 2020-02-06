package equipo;

public class Equipo {

 private String nombre;
 private int nivelAtaque, nivelCentro, nivelDefensa, goles;

 public Equipo(String nombre){
     this.nombre = nombre;
     this.nivelAtaque = (int) Math.random()*100;
     this.nivelCentro = (int) Math.random()*100;
     this.nivelDefensa = (int) Math.random()*100;
     this.goles = 0;
 }
    public Equipo(String nombre, int nivelAtaque, int nivelMedio, int nivelDefensa){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelCentro = nivelDefensa;
    }

    public boolean atacar(){
     int valor = this.nivelAtaque * ((int)Math.random()*2) + (nivelCentro * (int)Math.random()*2)/2;
     if(valor > 90){
         return true;
        } else{
        return false;
     }
}



    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre+"  Ataque: "+this.nivelAtaque+"  Defensa: "+this.nivelDefensa+"  Centro: "+this.nivelCentro+"  Goles: "+this.goles);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}

