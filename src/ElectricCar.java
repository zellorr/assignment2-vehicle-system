public class ElectricCar extends  Car{
    private double batteryCapacity;

    public ElectricCar(String brand,int year,int doors,String fuelType,double batteryCapacity){
        super(brand,year,doors,fuelType);
        this.batteryCapacity=batteryCapacity;
    }

    @Override
    public void startEngine(){
        System.out.println("Electric car engine starting silently...");
    }

    @Override
    public void stopEngine(){
        System.out.println("Electric car stopping without noise...");
    }
}
