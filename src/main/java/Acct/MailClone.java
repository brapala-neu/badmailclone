package main.java.Acct;

public class MailClone {
    public String username;
    public String password;
    public static int ip =  1096872109;
    public AcctType type;
    int twoFactorID;

    MailClone(String username, String password, AcctType type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public enum AcctType {
        BUSINESS, PERSONAL
    }

    String getUsername() {
        return this.username;
    }

    String getPassword() {
        return this.password;
    }

    void setUsername(String user) {
        this.password = user;
    }

    void changeType(AcctType t) {
        this.type = t;
    }

    int getIP() {
        return this.ip;
    }

    boolean login(String enterPass, int tfID) {
        if (enterPass.equals(this.password) & tfID == this.twoFactorID) {
            return true;
        } else {
            return false;
        }
    }
}
