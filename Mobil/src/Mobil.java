public class Mobil {

    // Attribute
    private String policeNumber;
    private int year;

    // Constructor
    public Mobil(String policeNumber, int tahun){
        this.policeNumber = policeNumber;
        this.year = tahun;
    }

    // Set Get
    public void setPoliceNumber(String nama) {
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
        System.out.println("Info Mobil");
    }
}
