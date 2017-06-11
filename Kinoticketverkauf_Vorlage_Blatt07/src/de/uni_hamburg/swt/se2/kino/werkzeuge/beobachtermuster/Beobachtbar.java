/**
 * 
 */
package de.uni_hamburg.swt.se2.kino.werkzeuge.beobachtermuster;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Lou
 *
 */
public abstract class Beobachtbar {

	private Set<Beobachter> _beobachter;
	
	public Beobachtbar()
	{
		_beobachter = new HashSet<Beobachter>();
	}
	
	/**
	 * informiert über die aenderung, aenderung gibt den typ an
	 * @param aenderung
	 */
    public void informiereUeberAenderung(Object aenderung)
    {
        for(Beobachter b: _beobachter)
        {
            b.beachteAenderung(aenderung);
        }
    }
    
    public void setzeBeobachter(Beobachter b)
    {
        assert b != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.add(b);
    }
}

