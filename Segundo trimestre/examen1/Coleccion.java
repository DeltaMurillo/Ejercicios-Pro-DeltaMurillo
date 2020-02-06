import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    Scanner teclado = new Scanner(System.in);
    int id;
    int peso;
    int aBorrar;
    int posicion;
    String titulo;
    String autor;
    ArrayList<Elemento> coleccion = new ArrayList<>();

    public void anadirColeccion() {
        System.out.println("Dime la id:");
        id = teclado.nextInt();
        System.out.println("Dime el autor");
        autor = teclado.next();
        System.out.println("Dime el titulo");
        titulo = teclado.next();
        System.out.println("Dime el peso");
        peso = teclado.nextInt();
        coleccion.add(new Elemento(id, autor, titulo, peso));
    }


    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getaBorrar() {
        return aBorrar;
    }

    public void setaBorrar(int aBorrar) {
        this.aBorrar = aBorrar;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void eliminarColeccion() {
        System.out.println("Cual es la id:\n");
        aBorrar = teclado.nextInt();
    }
}