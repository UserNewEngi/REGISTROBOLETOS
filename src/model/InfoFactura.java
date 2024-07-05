package model;

public class InfoFactura {

    private static final double igv = 0.18; // 18% igv
    private double total;

    public InfoFactura(double total) {
        this.total = total;
    }

    public double getOpInafecta() {
        return 0.0;
    }

    public double getSubTotal() {
        return total / (1 + igv);
    }

    public double getIGV() {
        return total - getSubTotal();
    }

    public double getTotal() {
        return total;
    }
}
