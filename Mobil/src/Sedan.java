public class Sedan extends Mobil{

    // Attribute
    private int seatCapacity;

    // Constructor
    public Sedan(String policeNumber, int year, int seatCapacity){
        super(policeNumber, seatCapacity);
        this.seatCapacity=seatCapacity;
    }

    // Set Get
    public void setCaoacity(String caoacity) {
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
