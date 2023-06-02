;
public class App {
    public static void main(String[] args) throws Exception {
        Buss buss1 = new Buss(200);
        int maxSpeed = buss1.getMaxSpeed();
        double allowedSpeed = (double) buss1.calculateAllowedSpeedBuss(maxSpeed);
        System.out.println("Maximum speed: " + maxSpeed);
        System.out.println("Allowed speed: " + allowedSpeed);
    }
}     
