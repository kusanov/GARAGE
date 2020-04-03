package Garage.Parts;


public class Engine  implements IEngine {

    public Engine(String vin, double volume) {
        this.vin = vin;
        this.volume = volume;}
    private double volume;
    private String vin;
        @Override
        public String getVin () {
            return vin;
        }

        @Override
        public double getVolume () {
            return volume;
        }
    }
