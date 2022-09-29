package core;

public class Product {

    public String nazivProizvoda;
    public int barKod;
    public double osnovnaCena;
    private static final double POREZ=1.2;

    public Product(){}

    public Product(String nazivProizvoda, int barKod, double osnovnaCena) {
        this.nazivProizvoda = nazivProizvoda;
        this.barKod = barKod;
        this.osnovnaCena = osnovnaCena;

    }

   public double cena(){
       return osnovnaCena * POREZ;
   }

   public String getInfo(){
       return  "Naziv proizvoda: " + nazivProizvoda + "\n" +
               "Barkod proizvoda: " + barKod + "\n" +
               "Osnovna cena proizvoda: " + osnovnaCena + " dinara";

   }

}
