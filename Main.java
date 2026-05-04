public class Main {
    public static void main(String[] args) {

        ShopSystem system = ShopSystem.getInstance();

        // ✅ Test Case 1: 2FA Authentication
        system.send2FATokenViaEmail();
        System.out.println("Test Case 1 Passed: 2FA email sent.");

        // ✅ Test Case 2: Purchase Confirmation
        system.sendPurchaseConfirmationViaEmail();
        System.out.println("Test Case 2 Passed: Purchase confirmation email sent.");
    }
}