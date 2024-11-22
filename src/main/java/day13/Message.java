package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String messageText;
    private Date sendDate;

    public Message(User sender, User receiver, String messageText) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageText = messageText;
        this.sendDate = new Date();
    }
    public String toString(){
        return "FROM: " + this.sender.getUsername() + "\n" +
                "TO: " + this.receiver.getUsername() + "\n" +
                "ON: " + this.sendDate + "\n" +
                this.messageText + "\n";
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getMessageText() {
        return messageText;
    }

    public Date getSendDate() {
        return sendDate;
    }
}
