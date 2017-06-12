package de.uni_hamburg.swt.se2.kino.werkzeuge.beobachtermuster;

/**
 * Das Interface Beobachter. Alle implementierenden Klassen
 * können als Beobachter von beobachtbaren Klasse gesetzt werden.
 */
public interface Beobachter {

   /**
    * Dem Beobachter wurde eine Änderung an einem Objekt mitgeteilt, von einer
    * Klasse, die er beobachtet.
    * Der Beobachter handelt entsprechend dieser Änderung.
    *
    * @param aenderung das veränderte Objekt
    */
    public void beachteAenderung(Object aenderung);
}
