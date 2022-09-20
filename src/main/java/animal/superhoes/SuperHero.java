package animal.superhoes;

public class SuperHero {
    private String suit;
    private String tights;
    private String specialPower;

    public void useSpecialPower(){
        System.out.println("");

    }
    public void putOnsSuit(){
        System.out.println("putting on" + this.suit);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
