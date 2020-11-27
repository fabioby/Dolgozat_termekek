abstract class Termek {
    private String nev;
    protected int egysegar;

    public Termek(String nev, int egysegar) {
        this.nev = nev;
        this.egysegar = egysegar;
    }

    abstract int mennyibeKerul();

    @Override
    public String toString() {
        return this.nev + this.egysegar + " Ft";
    }
}
