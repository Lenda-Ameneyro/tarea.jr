import javax.swing.JOptionPane;

public class AñoBisiesto {
    public static void main(String[] args) {

        String anoStr = JOptionPane.showInputDialog("Introduce un año:");

        int año = Integer.parseInt(anoStr);

        boolean esBisiesto = verificarBisiesto(año);


        if (esBisiesto) {
            JOptionPane.showMessageDialog(null, año + " es un año bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, año + " no es un año bisiesto.");
        }
    }
    public static boolean verificarBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
