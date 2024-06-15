package run.mone.ai.z.dto;

import java.util.List;
import java.io.Serializable;

public class QuotaHistoryInner implements Serializable {
    private List<Long> totalTokens;

    /*  8 */
    public void setTotalTokens(List<Long> totalTokens) {
        this.totalTokens = totalTokens;
    }

    private List<Long> promptTokens;
    private List<Long> completionTokens;

    public void setPromptTokens(List<Long> promptTokens) {
        this.promptTokens = promptTokens;
    }

    public void setCompletionTokens(List<Long> completionTokens) {
        this.completionTokens = completionTokens;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof QuotaHistoryInner)) return false;
        QuotaHistoryInner other = (QuotaHistoryInner) o;
        if (!other.canEqual(this)) return false;
        Object this$totalTokens = (Object) getTotalTokens(), other$totalTokens = (Object) other.getTotalTokens();
        if ((this$totalTokens == null) ? (other$totalTokens != null) : !this$totalTokens.equals(other$totalTokens))
            return false;
        Object this$promptTokens = (Object) getPromptTokens(), other$promptTokens = (Object) other.getPromptTokens();
        if ((this$promptTokens == null) ? (other$promptTokens != null) : !this$promptTokens.equals(other$promptTokens))
            return false;
        Object this$completionTokens = (Object) getCompletionTokens(), other$completionTokens = (Object) other.getCompletionTokens();
        return !((this$completionTokens == null) ? (other$completionTokens != null) : !this$completionTokens.equals(other$completionTokens));
    }

    protected boolean canEqual(Object other) {
        return other instanceof QuotaHistoryInner;
    }

    public int hashCode() {
                 int result = 1;
        Object $totalTokens = (Object) getTotalTokens();
        result = result * 59 + (($totalTokens == null) ? 43 : $totalTokens.hashCode());
        Object $promptTokens = (Object) getPromptTokens();
        result = result * 59 + (($promptTokens == null) ? 43 : $promptTokens.hashCode());
        Object $completionTokens = (Object) getCompletionTokens();
        return result * 59 + (($completionTokens == null) ? 43 : $completionTokens.hashCode());
    }

    public String toString() {
        return "QuotaHistoryInner(totalTokens=" + getTotalTokens() + ", promptTokens=" + getPromptTokens() + ", completionTokens=" + getCompletionTokens() + ")";
    }

    /* 10 */
    public List<Long> getTotalTokens() {
        return this.totalTokens;
    }

    /* 11 */
    public List<Long> getPromptTokens() {
        return this.promptTokens;
    }

    public List<Long> getCompletionTokens() {
        /* 12 */
        return this.completionTokens;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/QuotaHistoryInner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */