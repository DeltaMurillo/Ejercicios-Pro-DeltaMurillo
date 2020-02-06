package carrera;

public class EntradaCoche {

    public static void main(String[] args) {
        Coche cocheA = new Coche();
        Coche cocheB = new Coche("Ford", "1234ASD", 100);
        String result = "Empate";
    cocheA.mostrarDatos();
    cocheB.mostrarDatos();

        System.out.println("Acelerado coche A");
        cocheA.setVelocidad((int) (Math.random()*20)+10);
        cocheA.mostrarDatos();

        System.out.println("Modificando coche B");
        cocheB.setModelo("Opel");
        cocheB.setMatricula("1337ACAB");
        cocheB.setCv(1234);

        System.out.println("Acelerado coche B");
        cocheB.setVelocidad((int) (Math.random()*20)+10);
        cocheB.mostrarDatos();

        cocheA.acelerar(30);
        cocheB.acelerar(60);
        cocheA.acelerar(50);
        cocheB.acelerar(120);

        System.out.println("Se han acelerado los coches");
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();

        if(cocheA.getVelocidad() > cocheB.getVelocidad()){
            result = "El ganador es el coche A";
        }else if(cocheB.getVelocidad() > cocheA.getVelocidad()) {
            result = "El ganador es el coche B";
        }
        System.out.println(result);
    }





}
