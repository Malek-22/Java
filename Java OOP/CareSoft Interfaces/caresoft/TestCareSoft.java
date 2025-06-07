import java.util.ArrayList;

public class TestCareSoft {
    public static void main(String[] args) {
        testPhysician();
        System.out.println("----------------------------");
        testAdminUser();
    }

    private static void testPhysician() {
        System.out.println("Testing Physician...");
        
        Physician physician = new Physician(1);
        
        boolean validPinResult = physician.assignPIN(1234);
        System.out.println("Physician.assignPIN(1234) - Expected true, got: " + validPinResult);
        
        boolean invalidPinResult = physician.assignPIN(999);
        System.out.println("Physician.assignPIN(999) - Expected false, got: " + invalidPinResult);
        
        boolean authResult1 = physician.accessAuthorized(1);
        System.out.println("Physician.accessAuthorized(1) - Expected true, got: " + authResult1);
        
        boolean authResult2 = physician.accessAuthorized(2);
        System.out.println("Physician.accessAuthorized(2) - Expected false, got: " + authResult2);
    }
    
    private static void testAdminUser() {
        System.out.println("Testing AdminUser...");
        
        AdminUser adminUser = new AdminUser(100);

        boolean validPinResult = adminUser.assignPIN(123456);
        System.out.println("AdminUser.assignPIN(123456) - Expected true, got: " + validPinResult);
        
        boolean invalidPinResult = adminUser.assignPIN(12345);
        System.out.println("AdminUser.assignPIN(12345) - Expected false, got: " + invalidPinResult);
        
        boolean authResult1 = adminUser.accessAuthorized(100);
        System.out.println("AdminUser.accessAuthorized(100) - Expected true, got: " + authResult1);
        
        boolean authResult2 = adminUser.accessAuthorized(99);
        System.out.println("AdminUser.accessAuthorized(99) - Expected false, got: " + authResult2);
        
        ArrayList<String> incidents = adminUser.reportSecurityIncidents();
        System.out.println("Reported Security Incidents: ");
        if (incidents.size() > 0) {
            for(String incident : incidents) {
                System.out.println(incident);
            }
        } else {
            System.out.println("No security incidents reported.");
        }
    }
}