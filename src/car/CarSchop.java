package car;

import car.Car;

/**
 * Created by Rafal Gromek ON 15.12.2018.
 */
public class CarSchop {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";

        String audiInfo = audi.brand + " " + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelsColor
                + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");
        System.out.println(audiInfo);
    }
}
