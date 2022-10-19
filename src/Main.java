import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner console = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Введите мерность вектора");

        while (!console.hasNextInt()) {
            System.out.println("Введите мерность вектора целым числом");
            console.next();
        }
        int dimension = console.nextInt();

        while (dimension < 2) {
            System.out.println("Введите мерность вектора целым числом большим, чем 2");
            while (!console.hasNextInt()) {
                System.out.println("Введите мерность вектора");
                console.next();
            }
            dimension = console.nextInt();
            if (dimension > 2) break;
        }

        switch (dimension) {
            case 2: twoDimensions();
            break;
            case 3: threeDimensions();
            break;
            default: nDimensions();
        }

    }

    private static void nDimensions() throws Exception {
        System.out.println("На примере четырёхмерного вектора");

        Vector vector1 = new Vector(5.2, 3.6, 7.5, 9.2);
        Vector vector2 = new TwoDimensionalVector(4.8, 7.1, 3.3, 3.9);

        System.out.println(Vector.getDescription());
        System.out.println(Arrays.toString(vector1.getCoords()) + "\n" + vector1.length());
        System.out.println(Arrays.toString(vector2.getCoords()) + "\n" + vector2.length());

        System.out.println(vector1.scalarProduct(vector2));

        System.out.println(vector1.add(vector2));
        System.out.println(vector1.subtract(vector2));
        System.out.println("====================");

        Vector[] vectors = Vector.generate(5, 4);
        for (Vector vector : vectors) {
            System.out.println(vector);
        }

    }

    private static void twoDimensions() throws Exception {
        //2-мерные
        Vector vector1 = new TwoDimensionalVector(5.2, 3.6);
        Vector vector2 = new TwoDimensionalVector(4.8, 7.1);

        System.out.println(TwoDimensionalVector.getDescription());
        System.out.println(Arrays.toString(vector1.getCoords()) + "\n" + vector1.length());
        System.out.println(Arrays.toString(vector2.getCoords()) + "\n" + vector2.length());

        System.out.println(vector1.scalarProduct(vector2));

        System.out.println(vector1.add(vector2));
        System.out.println(vector1.subtract(vector2));
        System.out.println("====================");

        Vector[] vectors = Vector.generate(5, 2);
        for (Vector vector : vectors) {
            System.out.println(vector);
        }
    }

    private static void threeDimensions() throws Exception {
        Vector vector1 = new TwoDimensionalVector(4.1, 4.6, 7.8);
        Vector vector2 = new TwoDimensionalVector(1.1, 3.2, 8.8);

        System.out.println(ThreeDimensionalVector.getDescription());
        System.out.println(Arrays.toString(vector1.getCoords()) + "\n" + vector1.length());
        System.out.println(Arrays.toString(vector2.getCoords()) + "\n" + vector2.length());

        System.out.println(vector1.scalarProduct(vector2));

        System.out.println(vector1.add(vector2));
        System.out.println(vector1.subtract(vector2));
        System.out.println("====================");

        Vector[] vectors = Vector.generate(5, 3);
        for (Vector vector : vectors) {
            System.out.println(vector);
        }
    }


    }