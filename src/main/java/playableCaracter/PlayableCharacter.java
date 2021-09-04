package playableCaracter;

public class PlayableCharacter {

    private long id;
    private String characterName;
    private CharacterClass characterClass;
    private CharacterRace characterRace;
    private byte[] characterImg;
    private String characterSkill1;
    private String characterSkill2;
    private String characterSkill3;

    public PlayableCharacter() {
    }

    public PlayableCharacter(long id, String characterName, CharacterClass characterClass,
                             CharacterRace characterRace,
                             byte[] characterImg, String characterSkill1,
                             String characterSkill2, String characterSkill3) {
        this.id = id;
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.characterRace = characterRace;
        this.characterImg = characterImg;
        this.characterSkill1 = characterSkill1;
        this.characterSkill2 = characterSkill2;
        this.characterSkill3 = characterSkill3;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public CharacterRace getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(CharacterRace characterRace) {
        this.characterRace = characterRace;
    }

    public byte[] getCharacterImg() {
        return characterImg;
    }

    public void setCharacterImg(byte[] characterImg) {
        this.characterImg = characterImg;
    }

    public String getCharacterSkill1() {
        return characterSkill1;
    }

    public void setCharacterSkill1(String characterSkill1) {
        this.characterSkill1 = characterSkill1;
    }

    public String getCharacterSkill2() {
        return characterSkill2;
    }

    public void setCharacterSkill2(String characterSkill2) {
        this.characterSkill2 = characterSkill2;
    }

    public String getCharacterSkill3() {
        return characterSkill3;
    }

    public void setCharacterSkill3(String characterSkill3) {
        this.characterSkill3 = characterSkill3;
    }
}
