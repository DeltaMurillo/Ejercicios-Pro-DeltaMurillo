package equipo;

public class entradaEquipo {
    public static void main(String[] args) {

        Equipo Equipo1 = new Equipo("Real Madrid");
        Equipo Equipo2 = new Equipo("Atlético de Madrid");
        while (true) {
            Equipo1.atacar();
            Equipo2.atacar();

            Equipo1.mostrarDatos();
            Equipo2.mostrarDatos();
        }

    }
}

