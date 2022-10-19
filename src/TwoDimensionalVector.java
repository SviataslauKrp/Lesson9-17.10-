public class TwoDimensionalVector extends Vector {

    private static final String DESCRIPTION = "Это вектор для двумерной системы координат";
    public static String getDescription() {
        return DESCRIPTION;
    }
    public TwoDimensionalVector(double... cords) throws Exception {

        super(cords);

    }

}
