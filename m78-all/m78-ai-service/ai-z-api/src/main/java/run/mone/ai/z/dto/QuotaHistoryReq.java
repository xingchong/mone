package run.mone.ai.z.dto;

import java.io.Serializable;

public class QuotaHistoryReq implements Serializable {
    private Long startTime;

    /*  7 */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    private Long endTime;
    private String token;

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof QuotaHistoryReq)) return false;
        QuotaHistoryReq other = (QuotaHistoryReq) o;
        if (!other.canEqual(this)) return false;
        Object this$startTime = getStartTime(), other$startTime = other.getStartTime();
        if ((this$startTime == null) ? (other$startTime != null) : !this$startTime.equals(other$startTime))
            return false;
        Object this$endTime = getEndTime(), other$endTime = other.getEndTime();
        if ((this$endTime == null) ? (other$endTime != null) : !this$endTime.equals(other$endTime)) return false;
        Object this$token = getToken(), other$token = other.getToken();
        return !((this$token == null) ? (other$token != null) : !this$token.equals(other$token));
    }

    protected boolean canEqual(Object other) {
        return other instanceof QuotaHistoryReq;
    }

    public int hashCode() {
                 int result = 1;
        Object $startTime = getStartTime();
        result = result * 59 + (($startTime == null) ? 43 : $startTime.hashCode());
        Object $endTime = getEndTime();
        result = result * 59 + (($endTime == null) ? 43 : $endTime.hashCode());
        Object $token = getToken();
        return result * 59 + (($token == null) ? 43 : $token.hashCode());
    }

    public String toString() {
        return "QuotaHistoryReq(startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", token=" + getToken() + ")";
    }

    /*  9 */
    public Long getStartTime() {
        return this.startTime;
    }

    /* 10 */
    public Long getEndTime() {
        return this.endTime;
    }

    public String getToken() {
        /* 11 */
        return this.token;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/QuotaHistoryReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */