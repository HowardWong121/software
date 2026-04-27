public class ShopSystem {

    private static ShopSystem instance;

    private boolean sessionActive;

    private ShopSystem() {
        sessionActive = false;
    }

    public static ShopSystem getInstance() {
        if (instance == null) {
            instance = new ShopSystem();
        }
        return instance;
    }

    public void sendPurchaseConfirmationViaEmail() {
        System.out.println("Sending purchase confirmation email...");
    }

    public void sendReservationConfirmationViaEmail() {
        System.out.println("Sending reservation confirmation email...");
    }

    public void sendStockAvailabilityViaEmail() {
        System.out.println("Sending stock availability email...");
    }

    public void send2FATokenViaEmail() {
        System.out.println("Sending 2FA token via email...");
    }

    public void enforceSingleActiveSession() {
        System.out.println("Enforcing single active session...");
    }

    public void logAllActivities() {
        System.out.println("Logging system activities...");
    }

    public boolean isSessionActive() {
        return sessionActive;
    }

    public void setSessionActive(boolean sessionActive) {
        this.sessionActive = sessionActive;
    }
}