import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de materias que desea registar");
        int numero = scanner.nextInt();
        for (int i=0; i>numero;i++){
            System.out.println("Ingrese el nombre de la materia :");
            String materias = scanner.nextLine();
            System.out.println("Ingrese la calificación de la materia :");
            double cali = scanner.nextDouble();
            String [i] materias = materias;
            double [i] cali = cali;
        }
        double[] calificacion = obtenerCalificaciones(materias);

        int size = calificacion.length;
        double pro = 0;
        for (int i = 0; i < size; i++) {
            pro += calificacion[i] / size;
            System.out.println("Nombre de materia: " + materias[i] + " Calificación de parcial: " + calificacion[i]);
        }
        System.out.println("El promedio del parcial es: " + truncar(pro));
    }

    public static double[] obtenerCalificaciones(String[] arr) {
        int size = arr.length;
        double[] cal = new double[size];
        for (int i = 0; i < size; i++) {
            int p1 = arr[i].indexOf("[");
            int p2 = arr[i].indexOf("]");
            String c = arr[i].substring(p1 + 1, p2);
            cal[i] = Double.parseDouble(c);
        }
        return cal;
    }
    public static String truncar(double numero) {
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(numero);
    }
}
