
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public boolean lessThan(Money compared){
        int firstTotal = (euros() * 100) + cents();
        int secondTotal = (compared.euros() * 100) + compared.cents();

        return firstTotal < secondTotal;
    }

    public Money minus(Money decreaser){
        int firstTotal = (euros() * 100) + cents();
        int secondTotal = (decreaser.euros() * 100) + decreaser.cents();
        int diff = firstTotal - secondTotal;
        if(diff < 0){
            diff = 0;
        }

        Money minusMoney = new Money(0, diff);

        return minusMoney;
    }


    public Money plus(Money addition){
        int whole = euros() + addition.euros();
        int rem = cents() + addition.cents();

        Money newMoney = new Money(whole, rem);

        return newMoney;

    }
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
