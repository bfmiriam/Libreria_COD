package libreria_cod;

import javax.swing.JOptionPane;


public class Libreria {

    public static int hacerPregunta() {

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea mas informacion?","pregunta",JOptionPane.YES_NO_OPTION);
        return opcion;
    }
}
