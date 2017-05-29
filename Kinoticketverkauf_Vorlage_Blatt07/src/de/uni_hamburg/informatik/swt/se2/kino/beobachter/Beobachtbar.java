package de.uni_hamburg.informatik.swt.se2.kino.beobachter;

import java.util.HashSet;
import java.util.Set;

public abstract class Beobachtbar
{
    private Set<Beobachter> _beobachter;
    
    public Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }
    
    public void meldeVorstellungsAenderung()
    {
        for(Beobachter b: _beobachter)
        {
            b.beachteVorstellungsAenderung();
        }
    }
    
    public void meldeDatumsAenderung()
    {
        for(Beobachter b: _beobachter)
        {
            b.beachteDatumsAenderung();
        }
    }
    
    public void setzeBeobachter(Beobachter b)
    {
        assert b != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.add(b);
    }
}
