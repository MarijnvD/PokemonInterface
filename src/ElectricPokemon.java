import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
    public ElectricPokemon(String type, String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    void thunderPunch(Pokemon name, Pokemon enemy){

    };
    void electroBall(Pokemon name, Pokemon enemy){

    };
    void thunder(Pokemon name, Pokemon enemy){

    };
    void voltTackle(Pokemon name, Pokemon enemy){

    };
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
}
