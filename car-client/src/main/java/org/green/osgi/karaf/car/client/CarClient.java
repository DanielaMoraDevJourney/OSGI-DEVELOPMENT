package org.green.osgi.karaf.car.client;

import org.green.osgi.karaf.car.api.CarService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component
public class CarClient {

    private CarService carService;

    @Reference
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    public void printManufacturer() {
        if (carService != null) {
            System.out.println("Manufacturer: " + carService.getmanufacturer());
        } else {
            System.out.println("CarService is not available!");
        }
    }
}
