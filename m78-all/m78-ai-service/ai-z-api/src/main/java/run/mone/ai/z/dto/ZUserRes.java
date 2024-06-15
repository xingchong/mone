package run.mone.ai.z.dto;

import java.io.Serializable;

public class ZUserRes extends ZUserInfos implements Serializable {
    private String userName;
    private long lastUpdateTime;

    /*  7 */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    private long id;
    private boolean isPrivate;

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZUserRes)) return false;
        ZUserRes other = (ZUserRes) o;
        if (!other.canEqual(this)) return false;
        if (getLastUpdateTime() != other.getLastUpdateTime()) return false;
        if (getId() != other.getId()) return false;
        if (isPrivate() != other.isPrivate()) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZUserRes;
    }

    public int hashCode() {
                 int result = 1;
        long $lastUpdateTime = getLastUpdateTime();
        result = result * 59 + (int) ($lastUpdateTime >>> 32L ^ $lastUpdateTime);
        long $id = getId();
        result = result * 59 + (int) ($id >>> 32L ^ $id);
        result = result * 59 + (isPrivate() ? 79 : 97);
        Object $userName = getUserName();
        return result * 59 + (($userName == null) ? 43 : $userName.hashCode());
    }

    public String toString() {
        return "ZUserRes(userName=" + getUserName() + ", lastUpdateTime=" + getLastUpdateTime() + ", id=" + getId() + ", isPrivate=" + isPrivate() + ")";
    }

    /*  9 */
    public String getUserName() {
        return this.userName;
    }

    /* 10 */
    public long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /* 11 */
    public long getId() {
        return this.id;
    }

    public boolean isPrivate() {
        /* 12 */
        return this.isPrivate;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZUserRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */