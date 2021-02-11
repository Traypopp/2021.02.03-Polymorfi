package no.hiof.tmwasbra;

public class Main {

    public static void main(String[] args) {
        Fly boeing737 = new Fly("Boeing-737", 0, 150);

        boeing737.leggTilEnPassansjer();
        boeing737.leggTilEnPassansjer();
        boeing737.leggTilEnPassansjer();

        System.out.println(boeing737);

        System.out.println("Modell: " + boeing737.getModell() + " har passansjerer: "
                + boeing737.getPassansjerer());

        Transportfly an225 = new Transportfly("AN-225", 0, 10, 10000);

        an225.leggTilEnPakke(5,5,5);

        System.out.println("Brukt " + an225.getBruktLast() + " av " + an225.getMaksLast());

        an225.leggTilEnPassansjer();
        an225.leggTilEnPassansjer();
        an225.leggTilEnPassansjer();

        System.out.println(an225.getModell() + " har " + an225.getPassansjerer() + " passansjerer ombord");

        System.out.println(an225);
    }
}
