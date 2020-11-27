public class Salata extends Termek{
    private int darab;

    public Salata(int egysegar, int darab) {
        super("salata",egysegar);
        this.darab = darab;
    }

    @Override
    public int mennyibeKerul() {
        return this.darab * this.egysegar;
    }

    @Override
    public String toString() {
        return this.darab + " db saláta - " + this.egysegar + " Ft";
    }
}
