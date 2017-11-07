import flower.BaseFlower;
import flower.FlowerLoader;
import flower.FlowerSaver;

public class Main {
    static final String FILE = "src/files/bouquet.txt";

    public static void main ( String[] args ){
        Store store = new Store ( );
        BaseFlower[] bouquet1 = store.sell(4, 3, 5);
        for (BaseFlower flower : bouquet1) {
            flower.show ( );
        }
            System.out.println();
        BaseFlower[] bouquet2 = store.sellSequence(3, 5, 4);
            for (BaseFlower flower : bouquet2) {
                flower.show();
            }
        FlowerSaver.save(bouquet1,FILE);

        if (FlowerLoader.load(FILE) != null) {
            FlowerLoader.load ( FILE );
        }
    System.out.println();
        System.out.println("Incomes: " + store.getWallet());
    }}