package cts.BuilderV1;

public class PachetTransportBuilder implements IBuilder{

    private PachetTransport pachetTransport;

    public PachetTransportBuilder() {
        pachetTransport = new PachetTransport(false,false,false);
    }

    @Override
    public PachetTransport build() {
        return pachetTransport;
    }

    @Override
    public IBuilder setHasWiFi(boolean hasWiFi) {
        this.pachetTransport.setHasWiFi(hasWiFi);
        return this;
    }

    @Override
    public IBuilder setHasAnimale(boolean hasAnimale) {
        this.pachetTransport.setHasAnimale(hasAnimale);
        return this;
    }

    @Override
    public IBuilder setFumator(boolean fumator) {
        this.pachetTransport.setFumator(fumator);
        return this;
    }
}
