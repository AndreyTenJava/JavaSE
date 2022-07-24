package ServerSocket;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    private String userName;
    private String messageText;
    private Date setDate = new Date();

    public MessageData() {}

    public MessageData(String userName, String messageText) {
        this.userName = userName;
        this.messageText = messageText;
        this.setDate = new Date();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public String toString (){
        return userName + ": " + messageText + " " + setDate;

    }
}
