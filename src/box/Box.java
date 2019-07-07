package box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        dataValidation(length, "Length cannot be zero or negative.");
        this.length = length;
    }

    private void setWidth(double width) {
        dataValidation(width, "Width cannot be zero or negative.");
        this.width = width;
    }

    private void setHeight(double height) {
        dataValidation(height, "Height cannot be zero or negative.");
        this.height = height;
    }

    private void dataValidation(double length, String s) {
        if (length < 1) {
            throw new IllegalArgumentException(s);
        }
    }

    public double calculateSurfaceArea() {

        double thirdFace = 2 * this.width * this.height;

        return calculateLateralSurfaceArea() + thirdFace;
    }

    public double calculateLateralSurfaceArea() {
        double firstFace = 2 * this.length * this.width;
        double secondFace = 2 * this.length * this.height;

        return firstFace + secondFace;
    }

}
