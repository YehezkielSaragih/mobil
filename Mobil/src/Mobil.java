public class Mobil {

    // Attribute
    private String policeNumber;
    private int year;

    // Constructor
    public Mobil(String policeNumber, int year){
        this.policeNumber = policeNumber;
        this.year = year;
    }

    // Set Get
    public void setPoliceNumber(String policeNumber) {
        this.policeNumber = policeNumber;
    }
    public String getPoliceNumber() {
        return policeNumber;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    // Method
    public void printInfo() {
        System.out.println("Info Mobil\n");
        System.out.println("Police Number = "+getPoliceNumber());
        System.out.println("Year = "+getYear());
    }
}
