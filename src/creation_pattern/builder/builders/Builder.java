package creation_pattern.builder.builders;

import creation_pattern.builder.cars.CarType;
import creation_pattern.builder.components.Engine;
import creation_pattern.builder.components.GPSNavigator;
import creation_pattern.builder.components.Transmission;
import creation_pattern.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}