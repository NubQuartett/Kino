package de.uni_hamburg.swt.se2.kino.werkzeuge.beobachtermuster;
import java.util.HashSet;
import java.util.Set;
/**
 * Die abstrakte Klasse beobachtbar. Alle implementierenden Klassen
 * können von einem Beobachter beobachtet werden und diesen
 * über Änderungen informieren.
 */
public abstract class Beobachtbar {

    /**
     * Das Set von Beobachtern. In diesem konkreten System gibt es
     * nur einen einzigen Beobachter: das Kassenwerkzeug.
     */
    private Set<Beobachter> _beobachter;
   
    /**
     * Der Konstruktor der Klasse Beobachtbar. Es wird ein neues HashSet
     * für die Beobachter erzeugt.
     */
    public Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }
   
    /**
     * Mit dieser Methode informieren die beobachteten Klassen
     * ihren Beobachter über eine Änderung an einem
     * konkreten Objekt.
     * @param aenderung das Objekt, an dem sich etwas geändert hat
     */
    public void informiereUeberAenderung(Object aenderung)
    {
        for(Beobachter b: _beobachter)
        {
            b.beachteAenderung(aenderung);
        }
    }
   
    /**
     * Ein Beobachter wird als Parameter übergeben und dieser wird in das
     * HashSet von Beobachtern der beobachtbaren Klasse hinzugefügt.
     *
     * @param b der Beobachter
     */
    public void setzeBeobachter(Beobachter b)
    {
        assert b != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.add(b);
    }
}
