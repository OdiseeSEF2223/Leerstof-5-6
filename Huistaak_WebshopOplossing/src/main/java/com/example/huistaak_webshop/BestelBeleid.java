package com.example.huistaak_webshop;

public interface BestelBeleid {
    public double berekenProductenPrijs(final Winkelmand winkelmand);

    public double berekenVerzendPrijs(final Winkelmand winkelmand);

    public double berekenTotaalPrijs(final Winkelmand winkelmand);

    public int bepaalWachtTermijn(final Winkelmand winkelmand);
}
