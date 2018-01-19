/*
*Ejercicio librerías
*/
package libreria_cod;

import javax.swing.JOptionPane;

/**
 * Esta clase contiene las siguientes funciones
 * 
 * @author mbacelofernandez
 */

public class Libreria {
    
    /**
     * Esta función muestra un mensaje en ventana, con dos opciones a escoger
     *(si/no)
     * @param mensaje muestra un mensaje de tipo String
     * @return devuelve si o no, dependiendo de la opción escogida
     */
    public static int hacerPregunta(String mensaje) {

        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "pregunta", JOptionPane.YES_NO_OPTION);
        return opcion;
    }
   
    /**
     * Esta función simplemente muestra un mensaje en ventana
     * @param texto muestra un mensaje de tipo String
     * @return no devuelve nada
     */
    public static String mostrarMensaje(String texto) {

        JOptionPane.showMessageDialog(null, texto);
        return texto;
    }
   
    /**
     * Muestra un mensaje en ventana y pide una respuesta de tipo String
     * @param respuesta muestra un mensaje de tipo String
     * @return devuelve un texto de tipo String
     */
    public static String pedirString(String respuesta) {

        JOptionPane.showInputDialog(respuesta);
        return respuesta;
    }
  
    /**
     * Muestra un mensaje en ventana y pide una respuesta de tipo float
     * @param respuesta muestra un mensaje de tipo String
     * @return devuelve un dato de tipo float
     */
    public static float pedirFoat(String respuesta) {

        float dato = Float.parseFloat(JOptionPane.showInputDialog(respuesta));
        return dato;
    }
    
    /**
     * Muestra un mensaje en ventana y pide una respuesta de tipo int
     * @param respuesta muestra un mensaje de tipo String
     * @return devuelve un dato de tipo int
     */
    public static int pedirInt(String respuesta) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog(respuesta));
        return dato;
    }
    
    /**
     *Muestra un mensaje en ventana y pide una respuesta de tipo double 
     * @param respuesta muestra un mensaje de tipo String
     * @return devuelve un dato de tipo double
     */
    public static double pedirDouble(String respuesta) {
        double dato = Double.parseDouble(JOptionPane.showInputDialog(respuesta));
        return dato;

    }
}
