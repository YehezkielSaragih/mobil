public class Sedan extends Mobil{

    // Attribute
    private int seatCapacity;

    // Constructor
    public Sedan(String policeNumber, int year, int seatCapacity){
        super(policeNumber, year);
        this.seatCapacity=seatCapacity;
    }

    // Set Get
    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Seat Capacity = "+ seatCapacity);
    }

}
