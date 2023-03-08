package ObjClVehicleCatalogue05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Car> carsList = new ArrayList<>();
        List<Truck> trucksList = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] arr = input.split("\\s+");
            String type = arr[0];
            String model = arr[1];
            String color = arr[2];
            int horsepower = Integer.parseInt(arr[3]);

            if (type.equals("car")) {
                Car carObject = new Car(model, color, horsepower);
                carsList.add(carObject);
            } else if (type.equals("truck")) {
                Truck truckObject = new Truck(model, color, horsepower);
                trucksList.add(truckObject);
            }

            input = scan.nextLine();
        }

        String modelInput = scan.nextLine();

        while (!modelInput.equals("Close the Catalogue")) {
            for (Car car : carsList) {
                if (car.getModel().equals(modelInput)) {
                    System.out.println("Type: Car");
                    System.out.println("Model: " + car.getModel());
                    System.out.println("Color: " + car.getColor());
                    System.out.println("Horsepower: " + car.getHorsepower());
                }
            }

            for (Truck truck : trucksList) {
                if (truck.getModel().equals(modelInput)) {
                    System.out.println("Type: Truck");
                    System.out.println("Model: " + truck.getModel());
                    System.out.println("Color: " + truck.getColor());
                    System.out.println("Horsepower: " + truck.getHorsepower());
                }
            }
            modelInput = scan.nextLine();
        }
        double totalPowerCars = 0;
        double avCars = 0;
        if (carsList.size() > 0) {
            for (int c = 0; c < carsList.size(); c++) {
                int currentPowerCar = carsList.get(c).getHorsepower();
                totalPowerCars += currentPowerCar;
            }
            avCars = totalPowerCars / carsList.size();
        }

        double totalPowerTrucks = 0;
        double avTrucks = 0;
        if (trucksList.size() > 0) {
            for (int t = 0; t < trucksList.size(); t++) {
                int currentPowerTruck = trucksList.get(t).getHorsepower();
                totalPowerTrucks += currentPowerTruck;
            }
            avTrucks = totalPowerTrucks / trucksList.size();
        }

        System.out.printf("Cars have average horsepower of: %.02f.", avCars);
        System.out.println();
        System.out.printf("Trucks have average horsepower of: %.02f.", avTrucks);
    }
}
