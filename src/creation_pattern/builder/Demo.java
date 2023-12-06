package creation_pattern.builder;

import creation_pattern.builder.builders.CarBuilder;
import creation_pattern.builder.builders.CarManualBuilder;
import creation_pattern.builder.cars.Car;
import creation_pattern.builder.cars.Manual;
import creation_pattern.builder.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete creation_pattern.builder object from the client
        // (application code). That's because application knows better which
        // creation_pattern.builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a creation_pattern.builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}