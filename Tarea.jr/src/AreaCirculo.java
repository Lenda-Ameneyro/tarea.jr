import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main(String[] args) {
        String radioStr = JOptionPane.showInputDialog("Introduce el radio del círculo:");

        double radio = Double.parseDouble(radioStr);

        double area = Math.PI * Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
    }
}

