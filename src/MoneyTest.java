import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {


    @Test
    public void CambiarEURPorUSD(){
        Money m = new Money();
        assertEquals(28.37, m.change(Divisa.EUR, Divisa.USD, 23.88));
    }

    @Test
    public void CambiarGBPPorEUR(){
        Money m = new Money();
        assertEquals(1165.83, m.change(Divisa.GBP, Divisa.EUR, 1000.0));
    }

    @Test
    public void CambiarEURPorGBP(){
        Money m = new Money();
        assertEquals(201.21, m.change(Divisa.EUR, Divisa.GBP, 234.56));
    }

    @Test
    public void CambiarUSDPorEUR(){
        Money m = new Money();
        assertEquals(37.51, m.change(Divisa.USD, Divisa.EUR, 44.56));
    }

    @Test
    public void CambiarGBPPorUSD(){
        Money m = new Money();
        assertEquals(138.49, m.change(Divisa.GBP, Divisa.USD, 100.0));
    }

    @Test
    public void CambiarUSDPorGBP(){
        Money m = new Money();
        assertEquals(722.14, m.change(Divisa.USD, Divisa.GBP, 1000.0));
    }

    @Test
    public void CambiarPTSPorEUR(){
        Money m = new Money();
        assertEquals(-1, m.change(Divisa.PTS, Divisa.EUR, 100.0));
    }

    @Test
    public void CambiarEURPorPTS(){
        Money m = new Money();
        assertEquals(-1, m.change(Divisa.EUR, Divisa.PTS, 123.3));
    }

    @Test
    public void CambiarUSDPorEUR2(){
        Money m = new Money();
        assertEquals(-1, m.change(Divisa.USD, Divisa.EUR, -167.34));
    }

}