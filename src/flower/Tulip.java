package flower;

public class Tulip extends BaseFlower {
    public Tulip ( ) {
        this.setPrice ( 45 );
    }

    @Override
    public void show ( ) {
        System.out.println("Tiulpan!");
    }
}
