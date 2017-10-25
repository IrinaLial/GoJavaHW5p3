package flower;
import java.io.FileWriter;
import java.io.IOException;

public abstract class FlowerSaver {
    public static void save ( Flowers[] bouquet,String file  ) {
        try {
            FileWriter fileWriter = new FileWriter ( file );
            fileWriter.write ( bouquet.length + "\n" );

            for ( Flowers flower : bouquet ) {
                if ( flower instanceof Rose ) fileWriter.write ( "Rose\n" );
                else if ( flower instanceof Chamomile ) fileWriter.write ( "Chamomile\n" );
                else if ( flower instanceof Tulip ) fileWriter.write ( "Tulip\n" );
                else fileWriter.write ( "Flower\n" );
            }
            fileWriter.flush ( );
            fileWriter.close ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}