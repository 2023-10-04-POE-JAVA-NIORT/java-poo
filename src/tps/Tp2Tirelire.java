package tps;

public class Tp2Tirelire {
    private int amount;

    public Tp2Tirelire(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount > 0 ? String.format("Vous avez %d €", amount) : "Vous êtes sans le sou";
    }

    public int getAmount() {
        return amount;
    }

    public void shake() {
        if (amount > 0) {
            System.out.println("Bing bing!!");
            return;
        }
        System.out.println("Vous êtes sans le sou.");
    }

    public void fill(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Seuls les montants positifs sont acceptés.");
        }
        this.amount = amount;
    }

    public void empty() {
        amount = 0;
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Seuls les montants positifs sont acceptés");
        }
        this.amount -= amount;
        if (amount > this.amount) {
            empty();
        }
    }

    public int calculateBalance(int budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("Seuls les montants positifs sont acceptés");
        }
        return amount - budget;
    }
}
