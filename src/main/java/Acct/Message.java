package main.java.Acct;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Message {
    public String sender;
    public String receiver;
    public String header;
    public String body;
    public DateFormat df;

    Message(String sender, String receiver, String header, String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.header = header;
        this.body = body;
        this.df = new SimpleDateFormat("dd.MM.yyyy");
    }


}
