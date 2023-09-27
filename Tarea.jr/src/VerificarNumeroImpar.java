import javax.swing.JOptionPane;

public class VerificarNumeroImpar {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Introduce un número:");
        int numero = Integer.parseInt(numeroStr);

        if (numero % 2 != 0) {
            JOptionPane.showMessageDialog(null, numero + " es un número impar.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número impar.");
        }
    }
}

