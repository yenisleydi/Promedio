import java.text.DecimalFormat;
import java.util.Scanner;

public class ObtenerCalificacion {
    public static void main(String[] args) {
        Scanner materia = new Scanner(System.in);
        Scanner cali = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la materia :");
        String mat1= materia.nextLine();
        System.out.println("Ingrese la calificación de la materia :");
        double cal1 = cali.nextDouble();
        System.out.println("Ingrese el nombre de la materia :");
        String mat2 = materia.nextLine();
        System.out.println("Ingrese la calificación de la materia ");
        double cal2 = cali.nextDouble();
        System.out.println("Ingrese el nombre de la materia :");
        String mat3 = materia.nextLine();
        System.out.println("Ingrese la calificación de la materia :");
        double cal3 = cali.nextDouble();
        System.out.println("Ingrese el nombre de la materia :");
        String mat4 = materia.nextLine();
        System.out.println("Ingrese la calificación de la materia :");
        double cal4 = cali.nextDouble();
        System.out.println("Ingrese el nombre de la materia :");
        String mat5 = materia.nextLine();
        System.out.println("Ingrese la calificación de la materia :");
        double cal5 = cali.nextDouble();

        String[] materiaCal = {mat1 + " [" + cal1 + "]", mat2 + " [" + cal2 + "]", mat3 + " [" + cal3 + "]", mat4 + " [" + cal4 + "]", mat5 + " [" + cal5 + "]"};

        double[] calificacion = obtenerCalificaciones(materiaCal);
        String[] nombres = obtenerNombreMateria(materiaCal);

        int size = calificacion.length;
        double pro = 0;
        for (int i = 0; i < size; i++) {
            pro += calificacion[i] / size;
            System.out.println("Nombre de materia: " + nombres[i] + " Calificación de parcial: " + calificacion[i]);
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

    public static String[] obtenerNombreMateria(String[] arr) {
        int size = arr.length;
        String[] mat = new String[size];
        for (int i = 0; i < size; i++) {
            int p1 = arr[i].indexOf(" ");
            String c = arr[i].substring(0, p1);
            mat[i] = c;
        }
        return mat;
    }

    public static String truncar(double numero) {
        DecimalFormat df = new DecimalFormat("#.0");
        return df.format(numero);
    }
}
