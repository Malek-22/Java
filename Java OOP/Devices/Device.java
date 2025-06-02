public class Device {
    int battery;

    public Device() {
        battery = 100;
    }

    public void showBattery() {
        System.out.println("Battery remaining: " + battery);
    }
}
