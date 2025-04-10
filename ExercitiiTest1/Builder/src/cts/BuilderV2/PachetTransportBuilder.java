package cts.BuilderV2;

public class PachetTransportBuilder implements IBuilder {
    private boolean hasWiFi;
    private boolean hasAnimale;
    private boolean isFumator;

    public PachetTransportBuilder() {
        this.hasWiFi = false;
        this.hasAnimale = false;
        this.isFumator = false;
    }

    @Override
    public PachetTransport build() {
        return new PachetTransport(this.hasWiFi,this.hasAnimale,this.isFumator);
    }

    @Override
    public IBuilder setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
        return this;
    }

    @Override
    public IBuilder setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
        return this;
    }

    @Override
    public IBuilder setFumator(boolean fumator) {
        this.isFumator = fumator;
        return this;
    }
}
