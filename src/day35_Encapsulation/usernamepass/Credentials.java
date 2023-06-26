package day35_Encapsulation.usernamepass;

public class Credentials {

    private String username;
    private String password;

    public boolean isStrongPassword(String password) {
        boolean isLong = password.length() >= 8 || !password.isBlank();
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        char[] passwordChar = password.toCharArray();
        for (char each : passwordChar) {
            if (Character.isDigit(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isUpperCase(each)) {
                r4 = true;
            } else
                r5 = true;
        }
        boolean isStrong = isLong && r2 && r3 && r4 && r5;
        return isStrong;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {

        if (!isStrongPassword(password)){
            return;
        }
        this.password = password;
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
