public class PromedioArreglo {
    public static void main(String[] args) {
        double[] numeros = { 10.5, 5.2, 7.8, 3.6, 8.0 };
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        double promedio = suma / numeros.length;

        System.out.println("El promedio de los números es: " + promedio);
    }
}

