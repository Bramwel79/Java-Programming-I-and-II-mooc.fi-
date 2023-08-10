public class Container {
    private int capacity;

    public Container(){
        capacity = 0;
    }

    public int contains(){
        return capacity;
    }
    
    public void setCapacity(int amount){
        if(amount > 0 && amount <= 100){
            capacity = amount;
        }
    }
    
    public void add(int amount){
        if(amount > 0){
            int temp = amount + capacity;
            if(!(temp > 100)){
                capacity = temp;
            }else{
                capacity = 100;
            }
        }

    }

    public void remove(int amount){
        if(amount > 0){
            if(capacity > amount){
                capacity -= amount;
            }else{
                capacity = 0;
            }
            
        }
    }

    public String toString(){
        return capacity + "/100";
    }
}
