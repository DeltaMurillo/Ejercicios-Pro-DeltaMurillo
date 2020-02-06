package cajero.data;

import java.util.ArrayList;

public class datos {

    private ArrayList<Cuenta> listaDatos;
    public datos() {
        //listaDatos = new ArrayList<>();
    }

    public ArrayList<Cuenta> getListaDatos() {
        return listaDatos;
    }

    public void checkID(String dni) {
        for (Cuenta cuenta : listaDatos) {
            if (cuenta.getDni() == dni){
                checkPass(1);
            } else {
                System.out.println("Usuario no encontrado");
            }
        }
    }

    public void checkPass(int pin){
        for(Cuenta cuenta: listaDatos){
            if (cuenta.getPin() == pin){
                //PanelControl(ID)
            }
        }
    }
}
