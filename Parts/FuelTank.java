package Garage.Parts;

public class FuelTank implements IFuelTank {


    public FuelTank(int volume){
        this.volume = volume;
    }

    private int volume;
    @Override
    public int getVolumeTank() {
        return volume;
    }
}
