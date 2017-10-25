import flower.Flowers;
import flower.FlowerLoader;
import flower.FlowerSaver;

public class Main {
    private static final String file = "src/files/bouquet.txt";

    public static void main ( String[] args ){
        Store store = new Store ( );
        Flowers[] bouquet1 = store.sell(4, 3, 5);
        for (Flowers flower : bouquet1) {
            flower.show ( );
        }
            System.out.println();
            Flowers[] bouquet2 = store.sellSequence(3, 5, 4);
            for (Flowers flower : bouquet2) {
                flower.show();
            }

        FlowerSaver.save(bouquet1, file);
        if (FlowerLoader.load(file) != null) {
            FlowerLoader.load ( file );
        }
    System.out.println();
        System.out.println("Incomes: " + store.getWallet());
    }}