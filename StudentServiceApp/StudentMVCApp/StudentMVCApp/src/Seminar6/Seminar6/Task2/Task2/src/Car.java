public class Car extends Venicle {
    int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double calculateAllowedSpeedCar(Car car) {
        return getMaxSpeed() * 0.8;
    }
}