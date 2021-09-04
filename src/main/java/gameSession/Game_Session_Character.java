package gameSession;

public class Game_Session_Character {

    private long id;
    private long chr_lvl;
    private long chr_xp;

    public Game_Session_Character(long chr_lvl, long chr_xp) {
        this.chr_lvl = chr_lvl;
        this.chr_xp = chr_xp;
    }

    public long getChr_lvl() {
        return chr_lvl;
    }

    public void setChr_lvl(long chr_lvl) {
        this.chr_lvl = chr_lvl;
    }

    public long getChr_xp() {
        return chr_xp;
    }

    public void setChr_xp(long chr_xp) {
        this.chr_xp = chr_xp;
    }

    @Override
    public String toString() {
        return  id + " - " +
                chr_lvl + " - " +
                chr_xp;
    }
}
