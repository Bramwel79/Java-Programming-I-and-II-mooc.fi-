public class PaymentCard{
    private double balance;

    public PaymentCard(double openingBalance){
        balance = openingBalance;
    }

    public void eatAffordably(){
        if(balance >= 2.60){
            balance -= 2.60; 
        }
        
    }

    public void eatHeartily(){
        if(balance >= 4.60){
            balance -= 4.60; 
        }
        
    }

    public void addMoney(double amount){
        if(amount > 0){
            double bal = 0.0;
            bal = balance + amount;
            if(bal > 150){
                balance = 150;
            }else{
                balance = bal;
            }
        } 
    }

    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }
}