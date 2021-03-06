import flower.BaseFlower;
import flower.Chamomile;
import flower.Rose;
import flower.Tulip;

public class Store {
    private double wallet = 0;

    public double getWallet ( ) {
        return wallet;
    }

public BaseFlower[] sell( int roses, int tulips, int chamomiles) {
    int s = roses + tulips + chamomiles;
    BaseFlower[] bouquet = new BaseFlower[ s ];

    for ( int i = 0 ; i < bouquet.length ; i++ ) {
        if ( i < roses ) {
            bouquet[ i ] = new Rose ( );
        }
        else if ( i < ( roses + chamomiles )){
            bouquet[ i ] = new Chamomile ( );
        }
        else bouquet[ i ] = new Tulip ( );
    }
    return ( bouquet );
}
    public BaseFlower[] sellSequence( int roses, int chamomiles, int tulips) {
        int s = roses + chamomiles + tulips;
        BaseFlower[] bouquet = new BaseFlower[ s ];
        int i = 0;
        while (i < bouquet.length) {
            if (roses > 0) {
                bouquet[i] = new Rose();
                wallet += bouquet[i++].getPrice();
                roses--;
            }
            if (chamomiles > 0) {
                bouquet[i] = new Chamomile();
                wallet += bouquet[i++].getPrice();
                chamomiles--;
            }
            if (tulips > 0) {
                bouquet[i] = new Tulip();
                wallet += bouquet[i++].getPrice();
               tulips--;
            }
        }
        return bouquet;

    }}