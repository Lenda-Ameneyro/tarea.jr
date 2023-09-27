import javax.swing.JOptionPane;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        String numero1Str = JOptionPane.showInputDialog("Introduce el primer número:");
        String numero2Str = JOptionPane.showInputDialog("Introduce el segundo número:");

        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int mcd = calcularMCD(numero1, numero2);

        JOptionPane.showMessageDialog(null, "El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
    }
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

