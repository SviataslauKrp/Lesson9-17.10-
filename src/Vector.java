import java.util.Arrays;

public class Vector {

    private double[] coords;

    public double[] getCoords() {
        return coords;
    }

    public static final String DESCRIPTION = "Это вектор для n-мерной системы координат:";

    public static String getDescription() {
        return DESCRIPTION;
    }

    public Vector(double... coords) throws Exception {
        if (coords.length < 2) throw new Exception();
        this.coords = coords;
    }

    public double length() {
        System.out.println("Длина вектора: ");
        double sum = 0;
        for (double coord : coords) {
            sum += coord * coord;
        }
        return Math.sqrt(sum);
    }

    public double scalarProduct(Vector vector) {
        System.out.println("Скалярное произведение:");
        double res = 0;

        for (int i = 0; i < coords.length; i++) {
            res += coords[i] * vector.coords[i];
        }
        return res;
    }

    public Vector add(Vector vector) throws Exception {

        System.out.println("Сложение:");

        if (vector.coords.length != this.coords.length) throw new Exception("Разномерные векторы");
        double[] another = new double[coords.length];

        for (int i = 0; i < coords.length; i++) {
            another[i] = coords[i] + vector.coords[i];
        }
        return new Vector(another);
    }

    public Vector subtract(Vector vector) throws Exception {

        System.out.println("Разность:");

        if (vector.coords.length != this.coords.length) throw new Exception("Разномерные векторы");

        double[] another = new double[coords.length];

        for (int i = 0; i < coords.length; i++) {
            another[i] = coords[i] - vector.coords[i];
        }
        return new Vector(another);
    }

    private static double[] generateRandomArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static Vector[] generate(int n, int dimension) throws Exception {
        System.out.println("Случайные векторы:");
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(generateRandomArray(dimension));
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "coords=" + Arrays.toString(coords) +
                '}';
    }
}
