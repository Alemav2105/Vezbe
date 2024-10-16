// Klasa za naplatu
public class PaymentProcessor {
    // Metod za prihvatanje objekta klase Card i izvršavanje naplate
    public void processPayment(Card card, double amount) {
        if (card.charge(amount)) {
            System.out.println("Naplata od " + amount + " je uspešna. Preostalo stanje: " + card.getBalance());
        } else {
            System.out.println("Naplata nije uspešna.");
        }
    }

    public static void main(String[] args) {
        // Primer korišćenja
        Card myCard = new Card(1000.00); // Inicijalno stanje na računu
        PaymentProcessor processor = new PaymentProcessor();

        // Pokušaj naplate
        processor.processPayment(myCard, 200.00); // Uspešna naplata
        processor.processPayment(myCard, 900.00); // Neuspešna naplata
    }
}
