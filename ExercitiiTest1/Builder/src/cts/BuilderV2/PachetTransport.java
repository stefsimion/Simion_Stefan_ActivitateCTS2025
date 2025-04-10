package cts.BuilderV2;

public class PachetTransport {
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;

    protected PachetTransport(boolean hasWiFi, boolean hasAnimale, boolean isFumator) {
        this.hasWiFi = hasWiFi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
    }

    protected boolean isHasWiFi() {
        return hasWiFi;
    }

    protected void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    protected boolean isHasAnimale() {
        return hasAnimale;
    }

    protected void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    protected boolean isFumator() {
        return isFumator;
    }

    protected void setFumator(boolean fumator) {
        isFumator = fumator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("hasWiFi=").append(hasWiFi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append('}');
        return sb.toString();
    }
}
