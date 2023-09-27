import javax.swing.JOptionPane;

public class FibonacciIterativo {
    public static void main(String[] args) {
        String nStr = JOptionPane.showInputDialog("Introduce la cantidad de términos de la secuencia de Fibonacci:");
        int n = Integer.parseInt(nStr);

        long[] fibonacci = new long[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }


        StringBuilder resultado = new StringBuilder("Secuencia de Fibonacci:");
        for (long numero : fibonacci) {
            resultado.append(" ").append(numero);
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}

