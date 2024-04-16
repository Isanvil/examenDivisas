public class Money {
    private final double EURaUSD = 1.18798;
    private final double USDaEUR = 0.841815;
    private final double EURaGBP = 0.857839;
    private final double GBPaEUR = 1.165826;

    public Money(){

    }
    public float change(TipoMoneda tipoMonedaEntrada, TipoMoneda tipoMonedaSalida, Double cantidad) {
        float cambio = 0;
        if (tipoMonedaEntrada.equals(TipoMoneda.PTS) || tipoMonedaSalida.equals(TipoMoneda.PTS) || cantidad < 0) {
            cambio = -1;
        } else if (tipoMonedaEntrada.equals(TipoMoneda.EUR) && tipoMonedaSalida.equals(TipoMoneda.USD)) {
            cambio = (float) (cantidad * EURaUSD);
        } else if (tipoMonedaEntrada.equals(TipoMoneda.USD) && tipoMonedaSalida.equals(TipoMoneda.EUR)) {
            cambio = (float) (cantidad * USDaEUR);
        } else if (tipoMonedaEntrada.equals(TipoMoneda.EUR) && tipoMonedaSalida.equals(TipoMoneda.GBP)) {
            cambio = (float) (cantidad * EURaGBP);
        } else if (tipoMonedaEntrada.equals(TipoMoneda.EUR) && tipoMonedaSalida.equals(TipoMoneda.USD)) {
            cambio = (float) (cantidad * EURaGBP);
        } else if (tipoMonedaEntrada.equals(TipoMoneda.GBP) && tipoMonedaSalida.equals(TipoMoneda.USD)) {
            cambio = (float) ((cantidad * GBPaEUR) * EURaGBP);
        } else if (tipoMonedaEntrada.equals(TipoMoneda.USD) && tipoMonedaSalida.equals(TipoMoneda.GBP)) {
            cambio = (float) ((cantidad * USDaEUR) * EURaUSD);
        }

        return cambio;

    }
}
