package Garage;

import Garage.Parts.*;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        ICar car = new Car("Рено Лагуна2");

        Scanner in = new Scanner(System.in);
        System.out.println("Какой ключ от машины?");
        String myLock = in.nextLine();
        Lock lock = new Lock(myLock);
        System.out.println("Вставьте свой ключ");
        String myKey = in.nextLine();
        DefaultKey defaultKey = new DefaultKey(myKey);
        in.close();

        if (lock.open(defaultKey))
            System.out.println("Машина открыта!");
        else
                System.out.println("Не тот ключ");


        IParts engine = new Engine("abc123456789", 1.8);
        IParts tank = new FuelTank(70);
        IWheels wheels = new Wheels(EWheels.ЗИМНИЙ, 17);
        System.out.println("Автомобиль: "+ (car.getModel()));
        System.out.println("VIN код: "+ (((Engine) engine).getVin()));
        System.out.println("Объем двигателя: " +((Engine) engine).getVolume() + " литра");
        System.out.println("Объем бака: " + ((FuelTank) tank).getVolumeTank() + " литров");
        System.out.println("Тип шин: " + (((Wheels) wheels).getType() + ", радиус: " + (((Wheels) wheels).getRadius() )));
    }
}
