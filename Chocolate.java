package core;

public class Chocolate extends  Product{

    public int tezina;

    public Chocolate(String nazivProizvoda, int barKod, double osnovnaCena, int tezina) {
        super(nazivProizvoda, barKod, osnovnaCena);
        this.tezina = tezina;
    }

    @Override
    public String getInfo() {
        return "Naziv cokolade: " + nazivProizvoda + "\n" +
                "Barkod cokolade: " + barKod + "\n" +
                "Osnovna cena cokolade: " + osnovnaCena +" dinara"+ "\n" +
                "Konacna cena cokolade: " + cena() +" dinara"+ "\n" +
                "Tezina cokolade: " + tezina + " gr" ;
    }
}
