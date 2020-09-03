package interfaces2;

public class Purple implements Red, Blue {

    // MUSZÁJ OVERRIDEOLNI MERT MIND2 IF-ben egyforma nevű metódus van
    public void display() {
        System.out.println("It is purple!");
    }

    public void print() {
        System.out.println("Printed from purple!");
    }
}
