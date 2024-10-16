// Klasa Card
class Card {
    private double balance; // Stanje na računu

    // Konstruktor
    public Card(double initialBalance) {
        this.balance = initialBalance;
    }

    // Metod charge za naplatu
    public boolean charge(double amount) {
        if (amount <= balance) {
            balance -= amount; // Smanjujemo stanje
            return true; // Naplata je uspešna
        } else {
            System.out.println("Nema dovoljno sredstava na računu.");
            return false; // Naplata nije uspešna
        }
    }

    // Getter za balance
    public double getBalance() {
        return balance;
    }
}

