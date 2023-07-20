public class Counter {
    private int number;

    public Counter(int startValue){
        number = startValue;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return number;
    }

    public void increase(){
        number += 1;
    }
    
    public void decrease(){
        number -= 1;
    }

    public void increase(int increaseBy){
        if(increaseBy > 0){
            number += increaseBy;
        }
    }

    public void decrease(int decreaseBy){
        if(decreaseBy > 0){
            number -= decreaseBy;
        }
    }
   


}
