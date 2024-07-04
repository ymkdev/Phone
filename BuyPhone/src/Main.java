public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Iphone("잡스");
        Phone phone2 = new Samsung("재용");

        phone1.purchase();
        phone1.turnOn();
        phone2.purchase();
        phone2.turnOn();

    }
}