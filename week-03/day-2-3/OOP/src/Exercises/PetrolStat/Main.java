package DataStructures.PetrolStat;

class PetrolStation {
    public static void main(String[] args) {

        Station station = new Station();
        Car car = new Car();

        System.out.println(car.getGasAmount());
        station.refill(car);
        System.out.println(car.getGasAmount());
        System.out.println(station.getGasAmount());
    }
}
