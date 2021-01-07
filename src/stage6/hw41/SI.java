package stage6.hw41;

public enum SI {

    M("length"),
    KG("mass"),
    S("time");

    public final String quantityName;

    SI(String quantityName) {
        this.quantityName = quantityName;
    }

    public String getQuantity() {
        return this.quantityName;
    }
}
