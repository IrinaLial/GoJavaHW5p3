package flower;

public class Rose extends Flowers {
    public Rose ( ) {
        this.setPrice ( 100 );
    }

    @Override
    public void show ( ) {
        System.out.println("Roza!");
    }
}
