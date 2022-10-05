public abstract class Pokemon {

    private String type; /*""*/
    private String name;/*""*/
    private int level;
    private int hp;
    private String food;/*""*/
    private String sound;/*""*/

    public Pokemon (String type, String name, int level, int hp, String food, String sound) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    //Getters
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getHp(){
        return hp;
    }
    public String getFood(){
        return food;
    }
    public String getSound(){
        return sound;
    }

    //Setters
    public void setHp(int hp) {
        this.hp = hp;
    }
}
