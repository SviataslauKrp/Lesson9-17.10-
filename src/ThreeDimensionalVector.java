public class ThreeDimensionalVector extends Vector {

    private static final String DESCRIPTION = "Это вектор для трёхмерной системы координат";

    public static String getDescription() {
        return DESCRIPTION;
    }

    public ThreeDimensionalVector(double... coords) throws Exception {
        super(coords);
    }
}
