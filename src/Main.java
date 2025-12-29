public class Main {
    public static void main(String[] args){
        Driver driver1=new Driver("Abylaikhan Mutalipov","12345");
        Driver driver2=new Driver("Abilmansur Adilzhan","22812");

        Car car=new Car("Toyota",2020,4,"Gasoline");
        car.setDriver(driver1);

        Motorcycle motorcycle=new Motorcycle("Honda",2018,false);
        motorcycle.setDriver(driver1);

        Truck truck=new Truck("Ford",2022,10.5,3);
        truck.setDriver(driver2);

        ElectricCar electricCar=new ElectricCar("Tesla",2023,4,"Electric",75.0);
        electricCar.setDriver(driver2);

        Vehicle[] vehicles={car,motorcycle,truck,electricCar};

        for(Vehicle vehicle :vehicles){
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.stopEngine();
            if(vehicle.getDriver() !=null){
                vehicle.getDriver().displayDriverInfo();
            }
            System.out.println();
        }
    }
}