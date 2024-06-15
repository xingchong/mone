package run.mone.ai.z.dto;

import java.io.Serializable;

public class ZHistoryPageReq extends ZPageReq implements Serializable {
    private String userName;
    private Long dataID;

    /*  7 */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDataID(Long dataID) {
        this.dataID = dataID;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZHistoryPageReq)) return false;
        ZHistoryPageReq other = (ZHistoryPageReq) o;
        if (!other.canEqual(this)) return false;
        Object this$dataID = getDataID(), other$dataID = other.getDataID();
        if ((this$dataID == null) ? (other$dataID != null) : !this$dataID.equals(other$dataID)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZHistoryPageReq;
    }

    public int hashCode() {
                 int result = 1;
        Object $dataID = getDataID();
        result = result * 59 + (($dataID == null) ? 43 : $dataID.hashCode());
        Object $userName = getUserName();
        return result * 59 + (($userName == null) ? 43 : $userName.hashCode());
    }

    public String toString() {
        return "ZHistoryPageReq(userName=" + getUserName() + ", dataID=" + getDataID() + ")";
    }

    /*  9 */
    public String getUserName() {
        return this.userName;
    }

    public Long getDataID() {
        /* 10 */
        return this.dataID;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZHistoryPageReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */