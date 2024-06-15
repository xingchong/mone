package run.mone.ai.z.dto;

import java.io.Serializable;


public class CheckTokenReq
        implements Serializable {
    private String token;

    public String toString() {
        /* 12 */
        return "CheckTokenReq(token=" + getToken() + ")";
    }

    public int hashCode() {
                 int result = 1;
        Object $token = getToken();
        return result * 59 + (($token == null) ? 43 : $token.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof CheckTokenReq;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CheckTokenReq)) return false;
        CheckTokenReq other = (CheckTokenReq) o;
        if (!other.canEqual(this)) return false;
        Object this$token = getToken(), other$token = other.getToken();
        return !((this$token == null) ? (other$token != null) : !this$token.equals(other$token));
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        /* 15 */
        return this.token;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/CheckTokenReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */