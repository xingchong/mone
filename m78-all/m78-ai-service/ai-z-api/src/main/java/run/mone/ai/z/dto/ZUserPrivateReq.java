package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Map;

public class ZUserPrivateReq
        implements Serializable {
    private String zuToken;
    private Long dataId;
    private Map<String, String> userLabels;

    public void setZuToken(String zuToken) {
        /* 13 */
        this.zuToken = zuToken;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public void setUserLabels(Map<String, String> userLabels) {
        this.userLabels = userLabels;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZUserPrivateReq)) return false;
        ZUserPrivateReq other = (ZUserPrivateReq) o;
        if (!other.canEqual(this)) return false;
        Object this$dataId = getDataId(), other$dataId = other.getDataId();
        if ((this$dataId == null) ? (other$dataId != null) : !this$dataId.equals(other$dataId)) return false;
        Object this$zuToken = getZuToken(), other$zuToken = other.getZuToken();
        if ((this$zuToken == null) ? (other$zuToken != null) : !this$zuToken.equals(other$zuToken)) return false;
        Object this$userLabels = (Object) getUserLabels(), other$userLabels = (Object) other.getUserLabels();
        return !((this$userLabels == null) ? (other$userLabels != null) : !this$userLabels.equals(other$userLabels));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZUserPrivateReq;
    }

    public int hashCode() {
        int result = 1;
        Object $dataId = getDataId();
        result = result * 59 + (($dataId == null) ? 43 : $dataId.hashCode());
        Object $zuToken = getZuToken();
        result = result * 59 + (($zuToken == null) ? 43 : $zuToken.hashCode());
        Object $userLabels = (Object) getUserLabels();
        return result * 59 + (($userLabels == null) ? 43 : $userLabels.hashCode());
    }

    public String toString() {
        return "ZUserPrivateReq(zuToken=" + getZuToken() + ", dataId=" + getDataId() + ", userLabels=" + getUserLabels() + ")";
    }

    public String getZuToken() {
        /* 16 */
        return this.zuToken;
    }

    public Long getDataId() {
        /* 18 */
        return this.dataId;
    }

    public Map<String, String> getUserLabels() {
        /* 20 */
        return this.userLabels;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZUserPrivateReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */