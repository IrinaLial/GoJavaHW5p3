package flower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FlowerLoader {
    public static BaseFlower []load(String file){
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String nextLine = bufferedReader.readLine();
            if (nextLine.equals("-1")) {
                System.out.println("Error!");
                System.out.println(bufferedReader.readLine());
            }
            else {
                BaseFlower[] bouquet = new BaseFlower[ Integer.parseInt ( nextLine ) ];
                for ( int i = 0 ; i < bouquet.length ; i++ ) {
                    nextLine = bufferedReader.readLine ( );
                    switch ( nextLine ) {
                        case "Rose":
                            bouquet[ i ] = new Rose ();
                            break;
                        case "Chamomile":
                            bouquet[ i ] = new Chamomile ();
                            break;
                        case "Tulip":
                            bouquet[ i ] = new Tulip ();
                            break;
                    }
                }
                return bouquet;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

}

