package run.mone.ai.z.dto;

import java.io.Serializable;

public class ZTradeRes implements Serializable {
    private long id;
    private int amount;
    private long startTime;

    /*  7 */
    public void setId(long id) {
        this.id = id;
    }

    private Long endeTime;
    private String status;
    private String pToken;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndeTime(Long endeTime) {
        this.endeTime = endeTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPToken(String pToken) {
        this.pToken = pToken;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZTradeRes)) return false;
        ZTradeRes other = (ZTradeRes) o;
        if (!other.canEqual(this)) return false;
        if (getId() != other.getId()) return false;
        if (getAmount() != other.getAmount()) return false;
        if (getStartTime() != other.getStartTime()) return false;
        Object this$endeTime = getEndeTime(), other$endeTime = other.getEndeTime();
        if ((this$endeTime == null) ? (other$endeTime != null) : !this$endeTime.equals(other$endeTime)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$pToken = getPToken(), other$pToken = other.getPToken();
        return !((this$pToken == null) ? (other$pToken != null) : !this$pToken.equals(other$pToken));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZTradeRes;
    }

    public int hashCode() {
                 int result = 1;
        long $id = getId();
        result = result * 59 + (int) ($id >>> 32L ^ $id);
        result = result * 59 + getAmount();
        long $startTime = getStartTime();
        result = result * 59 + (int) ($startTime >>> 32L ^ $startTime);
        Object $endeTime = getEndeTime();
        result = result * 59 + (($endeTime == null) ? 43 : $endeTime.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $pToken = getPToken();
        return result * 59 + (($pToken == null) ? 43 : $pToken.hashCode());
    }

    public String toString() {
        return "ZTradeRes(id=" + getId() + ", amount=" + getAmount() + ", startTime=" + getStartTime() + ", endeTime=" + getEndeTime() + ", status=" + getStatus() + ", pToken=" + getPToken() + ")";
    }

    /*  9 */
    public long getId() {
        return this.id;
    }

    /* 10 */
    public int getAmount() {
        return this.amount;
    }

    /* 11 */
    public long getStartTime() {
        return this.startTime;
    }

    /* 12 */
    public Long getEndeTime() {
        return this.endeTime;
    }

    /* 13 */
    public String getStatus() {
        return this.status;
    }

    public String getPToken() {
        /* 14 */
        return this.pToken;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZTradeRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */