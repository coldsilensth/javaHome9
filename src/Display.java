public class Display {
    double diagonal;
    String displayBrand;
    String matrix;

    public Display(double diagonal, String displayBrand, String matrix) {
        this.diagonal = diagonal;
        this.displayBrand = displayBrand;
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", displayBrand='" + displayBrand + '\'' +
                ", matrix='" + matrix + '\'' +
                '}';
    }
}

