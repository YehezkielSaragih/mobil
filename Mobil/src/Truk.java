class Truk extends Mobil {

    private int tireCount;

    public Truk(String policeNumber, int year, int tireCount)    {
        super (policeNumber, year);
        this.tireCount = tireCount;
    }

    // Set Get
    public  void setTireCount(int tireCount) {
        this.tireCount = tireCount;
    }
    public int getTireCount() {
        return tireCount;
    }

    //
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire count = "+tireCount);
    }
}