class Truk extends Mobil {

    private int tireCount;

    public Truk(String policeNumber, int year, int tireCount)    {
        super (policeNumber, year);
        this.tireCount = tireCount;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println();
    }

}