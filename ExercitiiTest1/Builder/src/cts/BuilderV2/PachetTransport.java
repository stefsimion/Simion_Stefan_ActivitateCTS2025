package cts.BuilderV1;

public class PachetTransport {
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;

    public PachetTransport(boolean hasWiFi, boolean hasAnimale, boolean isFumator) {
        this.hasWiFi = hasWiFi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean isHasAnimale() {
        return hasAnimale;
    }

    public void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    public boolean isFumator() {
        return isFumator;
    }

    public void setFumator(boolean fumator) {
        isFumator = fumator;
    }
}
