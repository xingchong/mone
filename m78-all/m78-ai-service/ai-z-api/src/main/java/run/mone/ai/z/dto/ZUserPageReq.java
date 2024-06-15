package run.mone.ai.z.dto;

import java.io.Serializable;

public class ZUserPageReq extends ZPageReq implements Serializable {
    private String userName;
    private Long id;

    /*  7 */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZUserPageReq)) return false;
        ZUserPageReq other = (ZUserPageReq) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZUserPageReq;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $userName = getUserName();
        return result * 59 + (($userName == null) ? 43 : $userName.hashCode());
    }

    public String toString() {
        return "ZUserPageReq(userName=" + getUserName() + ", id=" + getId() + ")";
    }

    /*  9 */
    public String getUserName() {
        return this.userName;
    }

    public Long getId() {
        /* 10 */
        return this.id;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZUserPageReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */