public class Cube{
    private int sideLength;

    public Cube(int edgeLength){
         sideLength = edgeLength;
    }
    
    public int volume(){
        return sideLength * sideLength * sideLength;
    }

    public String toString(){
        return "The length of the edge is " + sideLength + " and the volume " + volume();
    }
    
}