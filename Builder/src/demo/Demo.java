package demo;

import builders.Builder;
import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.CarType;
import cars.Manual;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;
import director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
        
        //No use Director
        CarManualBuilder builder2 = new CarManualBuilder();
        builder2.setCarType(CarType.SPORTS_CAR);
        builder2.setEngine(new Engine(3.0, 0));      
        builder2.setSeats(2);
        builder2.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder2.setTripComputer(new TripComputer());
        builder2.setGPSNavigator(new GPSNavigator());
        
        Manual carManual2 = builder2.getResult();
        System.out.println("\nCar2: " + carManual2.print());      
    }

}