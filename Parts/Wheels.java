package Garage.Parts;

public class Wheels implements IWheels {


    public Wheels (EWheels type, int radius) {
        this.type = type;
        this.radius = radius;
    }

    private  EWheels type;
    private int radius;
    @Override
    public EWheels getType() {
        return type;
    }

    @Override
    public int getRadius() {
        return radius;
    }
}
