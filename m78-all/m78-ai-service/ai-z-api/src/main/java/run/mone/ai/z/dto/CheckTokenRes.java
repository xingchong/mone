package run.mone.ai.z.dto;

import java.io.Serializable;


public class CheckTokenRes
        implements Serializable {
    private Boolean isLegal;

    public String toString() {
        /* 12 */
        return "CheckTokenRes(isLegal=" + getIsLegal() + ")";
    }

    public int hashCode() {
                 int result = 1;
        Object $isLegal = getIsLegal();
        return result * 59 + (($isLegal == null) ? 43 : $isLegal.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof CheckTokenRes;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CheckTokenRes)) return false;
        CheckTokenRes other = (CheckTokenRes) o;
        if (!other.canEqual(this)) return false;
        Object this$isLegal = getIsLegal(), other$isLegal = other.getIsLegal();
        return !((this$isLegal == null) ? (other$isLegal != null) : !this$isLegal.equals(other$isLegal));
    }

    public void setIsLegal(Boolean isLegal) {
        this.isLegal = isLegal;
    }

    public Boolean getIsLegal() {
        /* 15 */
        return this.isLegal;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/CheckTokenRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */