package ch.bbzbl;

public class Sterberate {
    private String jahr;
    private int monat;
    private int woche_in_jahr;
    private String datum_wochenstart_sterbedatum;
    private int tag_in_jahr;
    private String wochentag;
    private String sterbedatum;
    private int anz_maenner_0_64;
    private int anz_maenner_65_plus;
    private int anz_frauen_0_64;
    private int anz_frauen_65_plus;
    private int anz_total;

    public Sterberate() {
        // Standardkonstruktor
    }

    public Sterberate(String jahr, int monat, int woche_in_jahr, String datum_wochenstart_sterbedatum,
                      int tag_in_jahr, String wochentag, String sterbedatum, int anz_maenner_0_64,
                      int anz_maenner_65_plus, int anz_frauen_0_64, int anz_frauen_65_plus, int anz_total) {
        this.jahr = jahr;
        this.monat = monat;
        this.woche_in_jahr = woche_in_jahr;
        this.datum_wochenstart_sterbedatum = datum_wochenstart_sterbedatum;
        this.tag_in_jahr = tag_in_jahr;
        this.wochentag = wochentag;
        this.sterbedatum = sterbedatum;
        this.anz_maenner_0_64 = anz_maenner_0_64;
        this.anz_maenner_65_plus = anz_maenner_65_plus;
        this.anz_frauen_0_64 = anz_frauen_0_64;
        this.anz_frauen_65_plus = anz_frauen_65_plus;
        this.anz_total = anz_total;
    }

    public String getJahr() {
        return jahr;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getWoche_in_jahr() {
        return woche_in_jahr;
    }

    public void setWoche_in_jahr(int woche_in_jahr) {
        this.woche_in_jahr = woche_in_jahr;
    }

    public String getDatum_wochenstart_sterbedatum() {
        return datum_wochenstart_sterbedatum;
    }

    public void setDatum_wochenstart_sterbedatum(String datum_wochenstart_sterbedatum) {
        this.datum_wochenstart_sterbedatum = datum_wochenstart_sterbedatum;
    }

    public int getTag_in_jahr() {
        return tag_in_jahr;
    }

    public void setTag_in_jahr(int tag_in_jahr) {
        this.tag_in_jahr = tag_in_jahr;
    }

    public String getWochentag() {
        return wochentag;
    }

    public void setWochentag(String wochentag) {
        this.wochentag = wochentag;
    }

    public String getSterbedatum() {
        return sterbedatum;
    }

    public void setSterbedatum(String sterbedatum) {
        this.sterbedatum = sterbedatum;
    }

    public int getAnz_maenner_0_64() {
        return anz_maenner_0_64;
    }

    public void setAnz_maenner_0_64(int anz_maenner_0_64) {
        this.anz_maenner_0_64 = anz_maenner_0_64;
    }

    public int getAnz_maenner_65_plus() {
        return anz_maenner_65_plus;
    }

    public void setAnz_maenner_65_plus(int anz_maenner_65_plus) {
        this.anz_maenner_65_plus = anz_maenner_65_plus;
    }

    public int getAnz_frauen_0_64() {
        return anz_frauen_0_64;
    }

    public void setAnz_frauen_0_64(int anz_frauen_0_64) {
        this.anz_frauen_0_64 = anz_frauen_0_64;
    }

    public int getAnz_frauen_65_plus() {
        return anz_frauen_65_plus;
    }

    public void setAnz_frauen_65_plus(int anz_frauen_65_plus) {
        this.anz_frauen_65_plus = anz_frauen_65_plus;
    }

    public int getAnz_total() {
        return anz_total;
    }

    public void setAnz_total(int anz_total) {
        this.anz_total = anz_total;
    }
}