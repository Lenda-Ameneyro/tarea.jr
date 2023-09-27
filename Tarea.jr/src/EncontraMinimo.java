import javax.swing.JOptionPane;

public class EncontraMinimo {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Introduce el primer número:");
        String num2 = JOptionPane.showInputDialog("Introduce el segundo número:");
        String num3 = JOptionPane.showInputDialog("Introduce el tercer número:");

        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int numero3 = Integer.parseInt(num3);

        int minimo = Math.min(Math.min(numero1, numero2), numero3);

        JOptionPane.showMessageDialog(null, "El mínimo de los tres números es: " + minimo);
    }
}

