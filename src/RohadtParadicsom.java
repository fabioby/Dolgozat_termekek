public class RohadtParadicsom extends Termek implements Akciozhato {
    private double tomeg;

    public RohadtParadicsom(int egysegar, double tomeg) {
        super("rohadt paradicsom",egysegar);
        this.tomeg = tomeg;
    }

    @Override
    public int akciosAr() {
        return Math.round((float)egysegar / 100 * 80);
    }

    @Override
    public int mennyibeKerul() {
        return (int) (Math.round(this.tomeg) * this.egysegar);
    }

    @Override
    public String toString() {
        return this.tomeg + " kg rohadt paradicsom - " + this.egysegar + " Ft";
    }
}
