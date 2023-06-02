public class Buss extends Venicle {
    int maxSpeed;

    public Buss(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double calculateAllowedSpeedBuss(int maxSpeed2) {
        return getMaxSpeed() * 0.6;

    }
}
