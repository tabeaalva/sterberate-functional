package ch.bbzbl;

public class Sterberate {

    private String jahr;
    private int monat;
    private String wochentag;
    private String sterbedatum;
    private String anz_total;

    public Sterberate() {
    }

    public Sterberate(String jahr, int monat, String wochentag, String sterbedatum, String anz_total) {
        this.jahr = jahr;
        this.monat = monat;
        this.wochentag = wochentag;
        this.sterbedatum = sterbedatum;
        this.anz_total = anz_total;
    }

    public String getJahr() {
        return jahr;
    }

    public int getMonat() {
        return monat;
    }

    public String getWochentag() {
        return wochentag;
    }

    public String getSterbedatum() {
        return sterbedatum;
    }

    public String getAnzTotal() {
        return anz_total;
    }
}
