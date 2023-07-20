
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return (rooms * squares) > (compared.rooms * compared.squares);
    }

    public int priceDifference(Apartment compared){
        return Math.abs((squares * pricePerSquare) - (compared.squares * compared.pricePerSquare));
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return pricePerSquare > compared.pricePerSquare;
    }
}
