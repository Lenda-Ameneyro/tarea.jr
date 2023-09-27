import javax.swing.JOptionPane;

public class VerificarNumero {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog("Introduce un número:");


        double numero = Double.parseDouble(numeroStr);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, numero + " es un número positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, numero + " es un número negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es cero.");
        }
    }
}
