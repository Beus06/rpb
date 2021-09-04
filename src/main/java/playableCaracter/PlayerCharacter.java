package playableCaracter;

public class PlayerCharacter {

    private long id;
    private String playerName;
    private Character character;

    public PlayerCharacter() {
    }

    public PlayerCharacter(long id, String playerName, Character character) {
        this.id = id;
        this.playerName = playerName;
        this.character = character;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
