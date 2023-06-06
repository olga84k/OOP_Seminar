import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<itemGenerator> generatorList  = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        for(int i = 0; i<10; i++){
            itemGenerator itemGenerator = generatorList.get(1);
            itemGenerator.openRerward();    
        }
    }
}