package no.hiof.tmwasbra;

public class Transportfly extends Fly{
    private double maksLast, bruktLast;

    public Transportfly() {
        maksLast = 1000;
    }

    public Transportfly(String modell, int passansjerer, int seter, double maksLast) {
        super(modell, passansjerer, seter);
        this.maksLast = maksLast;
    }

    public void leggTilEnPakke(double hoyde, double bredde, double dybde){
        double storrelsen = bredde * dybde * hoyde;

        if (harLedigLagringsPlass(storrelsen))
            bruktLast += storrelsen;

        else
            System.out.println("Du vil overskride makslast");
    }

    private boolean harLedigLagringsPlass(double storrelsen) {
        return bruktLast + storrelsen <= maksLast;
    }

    public double getMaksLast() {
        return maksLast;
    }

    public double getBruktLast() {
        return bruktLast;
    }

    @Override
    public String toString() {
        return getModell() + "  har en maks last på " + maksLast;
    }
}
