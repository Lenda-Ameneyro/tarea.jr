import javax.swing.JOptionPane;

public class NumeroDigitos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Introduce un número entero:");
        int numero = Integer.parseInt(numeroStr);
        int digitos = contarDigitos(numero);
        JOptionPane.showMessageDialog(null, "El número de dígitos en " + numero + " es: " + digitos);
    }
    public static int contarDigitos(int numero) {
        if (numero < 0) {
            numero = -numero;
        }

        if (numero == 0) {
            return 1; //
        }

        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}
