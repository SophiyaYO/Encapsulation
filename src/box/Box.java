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
        if (length < 1d) {
            dataValidation("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width < 1d) {
            dataValidation("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height < 1d) {
            dataValidation("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    private void dataValidation(String message) {
        throw new IllegalArgumentException(message);
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

    public double calculateVolume() {

        return this.height * this.width * this.length;
    }

}
