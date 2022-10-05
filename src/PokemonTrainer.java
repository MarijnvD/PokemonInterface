import java.util.List;
public class PokemonTrainer {
    ElectricPokemon raichu = new ElectricPokemon("Electric", "Raichu", 80, 50, "BOOOM", "wefd");
    GrassPokemon venusaur = new GrassPokemon("Grass", "Venusaur", 88, 100, "grumble", "qwdq" );
    GrassPokemon ditto = new GrassPokemon("Normal", "Ditto", 56, 100, "sssssssh", "qwdq" );
    FirePokemon charizard = new FirePokemon("Fire", "Charizard", 50, 100, "rommeldebommel", "qwdq" );
    WaterPokemon blastoise = new WaterPokemon("Water", "Blastoise", 75, 100, "whoosh", "qwdq" );
    WaterPokemon gyarados = new WaterPokemon("Water", "Gyarados", 60, 100, "what?", "qwdq" );
    List<Pokemon> pokemons;
    private String name;
    public PokemonTrainer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //    public void setName(String name) {
//        this.name = name;
//    }
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public ElectricPokemon getRaichu() {
        return raichu;
    }
    public GrassPokemon getVenusaur() {
        return venusaur;
    }
    public GrassPokemon getDitto() {
        return ditto;
    }
    public FirePokemon getCharizard() {
        return charizard;
    }
    public WaterPokemon getBlastoise() {
        return blastoise;
    }
    public WaterPokemon getGyarados() {
        return gyarados;
    }
}