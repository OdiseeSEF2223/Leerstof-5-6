package com.example.geheledeling;

/**
 * De klasse beheert de logica om delingen uit te voeren (geen link meer naar de UI)
 * hier kan dus wel mee getest worden
 */
public class GeheleDeling {

    /**
     * voert een gehele deling in
     * @param x deeltal
     * @param y deler
     * @return resultaat van x/y (na afronden naar beneden)
     */
    int bereken(final double x, final double y){
        return (int) (x/y);
    }
}
