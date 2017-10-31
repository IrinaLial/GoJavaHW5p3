package flower;

public class Chamomile extends BaseFlower {
    public Chamomile ( ) {
        this.setPrice ( 70 );
    }

    @Override
    public void show ( ) {
        System.out.println("Romashka!");
    }
}
