package cts.BuilderV2;

public interface IBuilder {
    PachetTransport build();

    IBuilder setHasWiFi(boolean hasWiFi);

    IBuilder setHasAnimale(boolean hasAnimale);

    IBuilder setFumator(boolean fumator);
}
