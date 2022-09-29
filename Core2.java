package core;

public class Core2 {

    public static void main (String[] args){

    Product product = new Product("Hleb", 233333, 50);

    System.out.println(product.getInfo());
        System.out.println("Konacna cena proizvoda: " + product.cena() + " dinara" + "\n");


        Chocolate chocolate = new Chocolate("Milka", 111000, 100, 100);

        System.out.println(chocolate.getInfo() + "\n");

        Wine wine = new Wine("Vranac", 563255, 500,0.7);
        System.out.println(wine.getInfo());
    }


}
