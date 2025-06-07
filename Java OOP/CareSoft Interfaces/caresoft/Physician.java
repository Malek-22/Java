import com.caresoft.clinicapp.HIPAACompliantUser;

public class Physician implements HIPAACompliantUser {
    private int pin;
    private Integer id;

    public Physician(Integer id) {
        this.id = id;
    }

    @Override
    public boolean assignPIN(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return this.id.equals(confirmedAuthID);
    }
}