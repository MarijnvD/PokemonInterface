import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    public WaterPokemon(String type, String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy){

    };
    void hydroPump(Pokemon name, Pokemon enemy){

    };
    void hydroCanon(Pokemon name, Pokemon enemy){

    };
    void rainDance(Pokemon name, Pokemon enemy){

    };

    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");


}
