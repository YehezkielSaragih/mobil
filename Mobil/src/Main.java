//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Mobil mobil = new Mobil("B1807DZY", 2015);
        Sedan sedanYehez = new Sedan("B269YEZ", 2025, 6);
        Truk trukSteven = new Truk("B801STE", 2025, 6);

        System.out.println("\nSedan Police Number = " + sedanYehez.getPoliceNumber());
        System.out.println("Sedan Year = " + sedanYehez.getYear());
        System.out.println("Sedan Seat Capacity = " + sedanYehez.getSeatCapacity());
        sedanYehez.drive();
        sedanYehez.brake();

        System.out.println("\nTruk Police Number = " + trukSteven.getPoliceNumber());
        System.out.println("Truk Year = " + trukSteven.getYear());
        System.out.println("Truk Tire Count = " + trukSteven.getTireCount());
        trukSteven.drive();
        trukSteven.brake();
    }

}