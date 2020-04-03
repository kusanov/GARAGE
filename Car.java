package Garage;

public class Car implements ICar {
    public Car(String model) {
        this.model = model;}
        private String model;
        @Override
        public String getModel () {
            return model;
        }

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public boolean fillTank() {
        return false;
    }

    @Override
    public boolean drive() {
        return false;
    }

    @Override
    public boolean open() {
        return false;
    }
}
