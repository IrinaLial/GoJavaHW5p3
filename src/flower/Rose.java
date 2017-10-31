package flower;

public class Rose extends BaseFlower {
    public Rose ( ) {
        this.setPrice ( 100 );
    }

    @Override
    public void show ( ) {
        System.out.println("Roza!");
    }
}
