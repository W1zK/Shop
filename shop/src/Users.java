
public class Users {
    private int userId;
    private String userName;
    private String email;
    private String signUp;
    boolean ifSend;


    public Users(int userId, String userName, String email, String signUp, boolean sender) {
        /*SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(signUp));*/
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.signUp = signUp;//sdf.format(c.getTime());
        this.ifSend = sender;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSignUp() {
        return signUp;
    }

    public void setSignUp(String signUp) {
        this.signUp = signUp;
    }

    public boolean isIfSend() {
        return ifSend;
    }

    public void setIfSend(boolean ifSend) {
        this.ifSend = ifSend;
    }
}
