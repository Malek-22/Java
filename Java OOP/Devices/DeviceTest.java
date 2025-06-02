public class DeviceTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.makeCall(); // 95
        myPhone.makeCall(); // 90
        myPhone.makeCall(); // 85

        myPhone.playGame(); // 65
        myPhone.playGame(); // 45

        myPhone.charge();   // 95
    }
}
