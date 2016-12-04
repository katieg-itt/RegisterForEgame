import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by Katie on 21/11/2016.
 */
public class Register {
    private String fName;
    private String lName;
    private String address;
    private String userName;
    private String password;
    private String email;
    private int userId;
    private int phoneNo;
    private String passwordToHash = "password";
    private byte[] salt;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPasswordToHash() {
        return passwordToHash;
    }

    public void setPasswordToHash(String passwordToHash) {
        this.passwordToHash = passwordToHash;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }


    public Register(String fName, String lName, String address, String userName, String password, String email, int userId, int phoneNo) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userId = userId;
        this.phoneNo = phoneNo;
        try {
            this.salt = getSalt();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    void katieWillNameMeLater() {
        String securePassword = get_SHA_256_SecurePassword(passwordToHash, salt);
        System.out.println(securePassword);
    }


    private String get_SHA_1_SecurePassword(String passwordToHash, byte[] salt) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(salt);
            byte[] bytes = md.digest(passwordToHash.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    private String get_SHA_256_SecurePassword(String passwordToHash, byte[] salt) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md.toString();
    }

    private byte[] getSalt() throws NoSuchAlgorithmException {
        return "THUISISTHESALT".getBytes();
    }

    public String toString() {
        return (userName + "You have sucessfully registered");
    }
}


