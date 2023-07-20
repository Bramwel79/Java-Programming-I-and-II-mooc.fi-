public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer(){
        hundredths = new ClockHand(100);
        seconds = new ClockHand(60);

    }

    public String toString(){
        return seconds + ":" + hundredths;
    }

    public void advance(){
        hundredths.advance();

        if(hundredths.value() == 0){
             seconds.advance();
        }

    }
}
