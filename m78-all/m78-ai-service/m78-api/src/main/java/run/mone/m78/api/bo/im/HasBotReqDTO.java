package run.mone.m78.api.bo.im;

import java.io.Serializable;

public class HasBotReqDTO
        implements Serializable {
    private String user;
    private Integer imType;

    public void setUser(String user) {
        /* 12 */
        this.user = user;
    }

    public void setImType(Integer imType) {
        this.imType = imType;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof HasBotReqDTO)) return false;
        HasBotReqDTO other = (HasBotReqDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$imType = getImType(), other$imType = other.getImType();
        if ((this$imType == null) ? (other$imType != null) : !this$imType.equals(other$imType)) return false;
        Object this$user = getUser(), other$user = other.getUser();
        return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user));
    }

    protected boolean canEqual(Object other) {
        return other instanceof HasBotReqDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $imType = getImType();
        result = result * 59 + (($imType == null) ? 43 : $imType.hashCode());
        Object $user = getUser();
        return result * 59 + (($user == null) ? 43 : $user.hashCode());
    }

    public String toString() {
        return "HasBotReqDTO(user=" + getUser() + ", imType=" + getImType() + ")";
    }


    /* 15 */
    public String getUser() {
        return this.user;
    }

    public Integer getImType() {
        /* 16 */
        return this.imType;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/HasBotReqDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */