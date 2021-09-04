package gameSession;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Game_Session {

    private long id;
    private DateTimeAtCompleted game_end_date;

    public Game_Session(DateTimeAtCompleted game_end_date) {
        this.game_end_date = game_end_date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DateTimeAtCompleted getGame_end_date() {
        return game_end_date;
    }

    public void setGame_end_date(DateTimeAtCompleted game_end_date) {
        this.game_end_date = game_end_date;
    }

    @Override
    public String toString() {
        return  id + " - " +
                game_end_date;
    }
}
