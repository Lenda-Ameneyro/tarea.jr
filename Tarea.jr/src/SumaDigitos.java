import javax.swing.JOptionPane;

public class SumaDigitos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Introduce un número con más de 4 dígitos:");


        int numero = Integer.parseInt(numeroStr);

        if (numero >= 10000) {
            int suma = 0;
            while (numero > 0) {
                int digito = numero % 10;
                suma += digito;
                numero /= 10;
            }

            JOptionPane.showMessageDialog(null, "La suma de los dígitos es: " + suma);
        } else {
            JOptionPane.showMessageDialog(null, "El número debe tener más de 4 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

