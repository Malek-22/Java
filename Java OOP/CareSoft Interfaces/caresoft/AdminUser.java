import com.caresoft.clinicapp.HIPAACompliantAdmin;
import com.caresoft.clinicapp.HIPAACompliantUser;
import java.util.ArrayList;

class AdminUser implements HIPAACompliantUser, HIPAACompliantAdmin {
    private int pin;
    private Integer id;
    private ArrayList<String> securityIncidents = new ArrayList<String>();

    public AdminUser(Integer id){
        this.id = id;
    }

    @Override
    public boolean assignPIN(int pin){
        if(pin >= 100000) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if(this.id.equals(confirmedAuthID)) {
            return true;
        } else {
            // Log the incident if authentication fails
            this.authIncident();
            return false;
        }
    }

    private void authIncident() {
        String report = "AUTHORIZATION ATTEMPT FAILED FOR USER ID: " + this.id + " at " + java.time.LocalDateTime.now();
        securityIncidents.add(report);
    }
    
    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }
}