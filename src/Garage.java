import java.util.ArrayList;

public class Garage {
    private int id;
    private int uniqueld;
    ArrayList<Car> parkedCars = new ArrayList<Car>();
    private int maxCapacity;
    private boolean availableSpace;

    public Garage(int maxCapcity) {

    }

    public boolean CheckIfValid(Car car, License license) {
        boolean availableSpace = false;
        boolean licenseMatchesCar = license.getLicenseHolderPlate().equals(car.getLicensePlate());
        boolean licenseMatchesGarage = license.getValidInGarageId() == this.id;
        if (maxCapacity > parkedCars.size()) {
            availableSpace = true;

        }
        if (availableSpace == true && licenseMatchesCar == true && licenseMatchesGarage == true) {
            return true;
        } else {
            return false;
        }
    }

    public int getCapacity() {
        return parkedCars.size();
    }

    public boolean parkCar(Car car, License license) {
        if (CheckIfValid(car, license)) {
            parkedCars.add(car);
            return true;
        } else {
            return false;
        }
    }
    
}
