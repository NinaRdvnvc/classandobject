package core;

public class Wine extends Product{

    double zapreminaBoce;
    private static final double DODATNI_POREZ =1.1;

    public Wine(String nazivProizvoda, int barKod, double osnovnaCena, double zapreminaBoce) {
        super(nazivProizvoda, barKod, osnovnaCena);
        this.zapreminaBoce=zapreminaBoce;
    }

    @Override
    public double cena() {
        return super.cena() * DODATNI_POREZ;
    }

    @Override
    public String getInfo() {
        return "Naziv vina: " + nazivProizvoda + "\n" +
                "Barkod vina: " + barKod + "\n" +
                "Osnovna cena vina: " + osnovnaCena + " dinara" + "\n" +
                "Konacna cena vina: " + cena() + " dinara" + "\n" +
                "Tezina boce vina: " + zapreminaBoce + " L" ;
    }
}
