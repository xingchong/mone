package run.mone.ai.z.dto;

import java.util.List;
import java.util.Map;
import java.io.Serializable;

public class QuotaHistoryRes implements Serializable {
    private long totalTokensSum;
    private long promptTokensSum;

    /*  9 */
    public void setTotalTokensSum(long totalTokensSum) {
        this.totalTokensSum = totalTokensSum;
    }

    private long completionTokensSum;
    private Map<String, QuotaHistoryInner> data;
    private List<Long> time;

    public void setPromptTokensSum(long promptTokensSum) {
        this.promptTokensSum = promptTokensSum;
    }

    public void setCompletionTokensSum(long completionTokensSum) {
        this.completionTokensSum = completionTokensSum;
    }

    public void setData(Map<String, QuotaHistoryInner> data) {
        this.data = data;
    }

    public void setTime(List<Long> time) {
        this.time = time;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof QuotaHistoryRes)) return false;
        QuotaHistoryRes other = (QuotaHistoryRes) o;
        if (!other.canEqual(this)) return false;
        if (getTotalTokensSum() != other.getTotalTokensSum()) return false;
        if (getPromptTokensSum() != other.getPromptTokensSum()) return false;
        if (getCompletionTokensSum() != other.getCompletionTokensSum()) return false;
        Object this$data = (Object) getData(), other$data = (Object) other.getData();
        if ((this$data == null) ? (other$data != null) : !this$data.equals(other$data)) return false;
        Object this$time = (Object) getTime(), other$time = (Object) other.getTime();
        return !((this$time == null) ? (other$time != null) : !this$time.equals(other$time));
    }

    protected boolean canEqual(Object other) {
        return other instanceof QuotaHistoryRes;
    }

    public int hashCode() {
                 int result = 1;
        long $totalTokensSum = getTotalTokensSum();
        result = result * 59 + (int) ($totalTokensSum >>> 32L ^ $totalTokensSum);
        long $promptTokensSum = getPromptTokensSum();
        result = result * 59 + (int) ($promptTokensSum >>> 32L ^ $promptTokensSum);
        long $completionTokensSum = getCompletionTokensSum();
        result = result * 59 + (int) ($completionTokensSum >>> 32L ^ $completionTokensSum);
        Object $data = (Object) getData();
        result = result * 59 + (($data == null) ? 43 : $data.hashCode());
        Object $time = (Object) getTime();
        return result * 59 + (($time == null) ? 43 : $time.hashCode());
    }

    public String toString() {
        return "QuotaHistoryRes(totalTokensSum=" + getTotalTokensSum() + ", promptTokensSum=" + getPromptTokensSum() + ", completionTokensSum=" + getCompletionTokensSum() + ", data=" + getData() + ", time=" + getTime() + ")";
    }

    /* 11 */
    public long getTotalTokensSum() {
        return this.totalTokensSum;
    }

    /* 12 */
    public long getPromptTokensSum() {
        return this.promptTokensSum;
    }

    /* 13 */
    public long getCompletionTokensSum() {
        return this.completionTokensSum;
    }

    /* 14 */
    public Map<String, QuotaHistoryInner> getData() {
        return this.data;
    }

    public List<Long> getTime() {
        /* 15 */
        return this.time;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/QuotaHistoryRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */