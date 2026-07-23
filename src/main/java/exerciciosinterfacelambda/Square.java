package exerciciosinterfacelambda;

// @author Marcelo Neves

public record Square(double side) implements GeometricForm {
    @Override
    public double getArea() {
        return side * side;
    }
}
