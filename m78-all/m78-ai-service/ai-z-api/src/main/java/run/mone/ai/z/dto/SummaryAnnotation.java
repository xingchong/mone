package run.mone.ai.z.dto;

import java.io.Serializable;


public class SummaryAnnotation
        implements Serializable {
    private String blockAnchor;
    private String abs;

    public void setBlockAnchor(String blockAnchor) {
        /* 35 */
        this.blockAnchor = blockAnchor;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SummaryAnnotation)) return false;
        SummaryAnnotation other = (SummaryAnnotation) o;
        if (!other.canEqual(this)) return false;
        Object this$blockAnchor = getBlockAnchor(), other$blockAnchor = other.getBlockAnchor();
        if ((this$blockAnchor == null) ? (other$blockAnchor != null) : !this$blockAnchor.equals(other$blockAnchor))
            return false;
        Object this$abs = getAbs(), other$abs = other.getAbs();
        return !((this$abs == null) ? (other$abs != null) : !this$abs.equals(other$abs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SummaryAnnotation;
    }

    public int hashCode() {
        int result = 1;
        Object $blockAnchor = getBlockAnchor();
        result = result * 59 + (($blockAnchor == null) ? 43 : $blockAnchor.hashCode());
        Object $abs = getAbs();
        return result * 59 + (($abs == null) ? 43 : $abs.hashCode());
    }

    public String toString() {
        return "ZKnowledgeBaseAnswer.SummaryAnnotation(blockAnchor=" + getBlockAnchor() + ", abs=" + getAbs() + ")";
    }

    public String getBlockAnchor() {
        /* 37 */
        return this.blockAnchor;
    }

    public String getAbs() {
        /* 39 */
        return this.abs;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseAnswer$SummaryAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */