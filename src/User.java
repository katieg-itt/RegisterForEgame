/**
 * Created by Katie on 03/12/2016.
 */
public class User {

    private String fName;
    private String lName;
    private String userName;
    private String password;
    private int userID;


    public User (String fName,String lName,String userName,String password, int userID){
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.password = password;
        this.userID = userID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }


    public String toString() {
        return ("Name: "+ this.fName + " " + this.lName + " Username: " + this.userName + " Password Hash: " + this.password);
    }

}
