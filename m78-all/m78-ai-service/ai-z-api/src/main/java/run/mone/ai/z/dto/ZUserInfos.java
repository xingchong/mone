package run.mone.ai.z.dto;

import java.io.Serializable;

public class ZUserInfos implements Serializable {
    private String athenaVersion;
    private String ideVersion;
    private String systemVersion;

    /*  7 */
    public void setAthenaVersion(String athenaVersion) {
        this.athenaVersion = athenaVersion;
    }

    private String token;
    private boolean isPrivate;
    private String invitationCode;

    public void setIdeVersion(String ideVersion) {
        this.ideVersion = ideVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZUserInfos)) return false;
        ZUserInfos other = (ZUserInfos) o;
        if (!other.canEqual(this)) return false;
        if (isPrivate() != other.isPrivate()) return false;
        Object this$athenaVersion = getAthenaVersion(), other$athenaVersion = other.getAthenaVersion();
        if ((this$athenaVersion == null) ? (other$athenaVersion != null) : !this$athenaVersion.equals(other$athenaVersion))
            return false;
        Object this$ideVersion = getIdeVersion(), other$ideVersion = other.getIdeVersion();
        if ((this$ideVersion == null) ? (other$ideVersion != null) : !this$ideVersion.equals(other$ideVersion))
            return false;
        Object this$systemVersion = getSystemVersion(), other$systemVersion = other.getSystemVersion();
        if ((this$systemVersion == null) ? (other$systemVersion != null) : !this$systemVersion.equals(other$systemVersion))
            return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;
        Object this$invitationCode = getInvitationCode(), other$invitationCode = other.getInvitationCode();
        return !((this$invitationCode == null) ? (other$invitationCode != null) : !this$invitationCode.equals(other$invitationCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZUserInfos;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + (isPrivate() ? 79 : 97);
        Object $athenaVersion = getAthenaVersion();
        result = result * 59 + (($athenaVersion == null) ? 43 : $athenaVersion.hashCode());
        Object $ideVersion = getIdeVersion();
        result = result * 59 + (($ideVersion == null) ? 43 : $ideVersion.hashCode());
        Object $systemVersion = getSystemVersion();
        result = result * 59 + (($systemVersion == null) ? 43 : $systemVersion.hashCode());
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $invitationCode = getInvitationCode();
        return result * 59 + (($invitationCode == null) ? 43 : $invitationCode.hashCode());
    }

    public String toString() {
        return "ZUserInfos(athenaVersion=" + getAthenaVersion() + ", ideVersion=" + getIdeVersion() + ", systemVersion=" + getSystemVersion() + ", token=" + getToken() + ", isPrivate=" + isPrivate() + ", invitationCode=" + getInvitationCode() + ")";
    }

    /*  9 */
    public String getAthenaVersion() {
        return this.athenaVersion;
    }

    /* 10 */
    public String getIdeVersion() {
        return this.ideVersion;
    }

    /* 11 */
    public String getSystemVersion() {
        return this.systemVersion;
    }

    /* 12 */
    public String getToken() {
        return this.token;
    }

    /* 13 */
    public boolean isPrivate() {
        return this.isPrivate;
    }

    public String getInvitationCode() {
        /* 14 */
        return this.invitationCode;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZUserInfos.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */