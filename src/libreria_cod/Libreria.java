package libreria_cod;

import javax.swing.JOptionPane;

public class Libreria {

    public static int hacerPregunta(String mensaje) {

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "pregunta", JOptionPane.YES_NO_OPTION);
        return opcion;
    }

    public static String mostrarMensaje(String texto) {

        JOptionPane.showMessageDialog(null, texto);
        return texto;
    }

    public static String pedirString(String respuesta) {

        JOptionPane.showInputDialog(respuesta);
        return respuesta;
    }

    public static float pedirFoat(String respuesta) {

        float dato = Float.parseFloat(JOptionPane.showInputDialog(respuesta));
        return dato;
    }
}
