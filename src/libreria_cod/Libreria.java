package libreria_cod;

import javax.swing.JOptionPane;

public class Libreria {

    public static int hacerPregunta(String mensaje) {

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "pregunta", JOptionPane.YES_NO_OPTION);
        return opcion;
    }
}
