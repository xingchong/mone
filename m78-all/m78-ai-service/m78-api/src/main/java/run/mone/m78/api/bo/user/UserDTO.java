package run.mone.m78.api.bo.user;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private String user;
    private String username;
    private String email;
    private String phoneNum;

    /*  9 */
    public void setUser(String user) {
        this.user = user;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UserDTO)) return false;
        UserDTO other = (UserDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$user = getUser(), other$user = other.getUser();
        if ((this$user == null) ? (other$user != null) : !this$user.equals(other$user)) return false;
        Object this$username = getUsername(), other$username = other.getUsername();
        if ((this$username == null) ? (other$username != null) : !this$username.equals(other$username)) return false;
        Object this$email = getEmail(), other$email = other.getEmail();
        if ((this$email == null) ? (other$email != null) : !this$email.equals(other$email)) return false;
        Object this$phoneNum = getPhoneNum(), other$phoneNum = other.getPhoneNum();
        return !((this$phoneNum == null) ? (other$phoneNum != null) : !this$phoneNum.equals(other$phoneNum));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UserDTO;
    }

    public int hashCode() {
        int result = 1;
        Object $user = getUser();
        result = result * 59 + (($user == null) ? 43 : $user.hashCode());
        Object $username = getUsername();
        result = result * 59 + (($username == null) ? 43 : $username.hashCode());
        Object $email = getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        Object $phoneNum = getPhoneNum();
        return result * 59 + (($phoneNum == null) ? 43 : $phoneNum.hashCode());
    }

    public String toString() {
        return "UserDTO(user=" + getUser() + ", username=" + getUsername() + ", email=" + getEmail() + ", phoneNum=" + getPhoneNum() + ")";
    }

    public UserDTO(String user, String username, String email, String phoneNum) {
        /* 10 */
        this.user = user;
        this.username = username;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public UserDTO() {
    }

    /* 13 */
    public String getUser() {
        return this.user;
    }

    /* 14 */
    public String getUsername() {
        return this.username;
    }

    /* 15 */
    public String getEmail() {
        return this.email;
    }

    public String getPhoneNum() {
        /* 16 */
        return this.phoneNum;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/user/UserDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */