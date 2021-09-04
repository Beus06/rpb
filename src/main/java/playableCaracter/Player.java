package playableCaracter;

import java.util.Date;

public class Player {

    private String userName;
    private String emailAddress;
    private Date regDate;

    public Player() {
    }

    public Player(String userName, String emailAddress, Date regDate) {
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.regDate = regDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}