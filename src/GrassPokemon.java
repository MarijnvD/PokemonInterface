import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    public GrassPokemon(String type, String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy){

        System.out.println(name.getName() + " performed LeafStorm " + enemy.getName());
        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp, it's very effective!");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp, it's effective!");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp, it's not very effective..");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");


    };
    public void solarBeam(Pokemon name, Pokemon enemy){

    };
    public void leechSeed(Pokemon name, Pokemon enemy){

    };
    public void leaveBlade(Pokemon name, Pokemon enemy){

    };

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
}
