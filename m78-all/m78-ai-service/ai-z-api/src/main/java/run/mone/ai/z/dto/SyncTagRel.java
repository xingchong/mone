package run.mone.ai.z.dto;

import java.io.Serializable;

public class SyncTagRel implements Serializable {
    private Long datasourceId;
    private Long tagId;

    /*  7 */
    public void setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncTagRel)) return false;
        SyncTagRel other = (SyncTagRel) o;
        if (!other.canEqual(this)) return false;
        Object this$datasourceId = getDatasourceId(), other$datasourceId = other.getDatasourceId();
        if ((this$datasourceId == null) ? (other$datasourceId != null) : !this$datasourceId.equals(other$datasourceId))
            return false;
        Object this$tagId = getTagId(), other$tagId = other.getTagId();
        return !((this$tagId == null) ? (other$tagId != null) : !this$tagId.equals(other$tagId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncTagRel;
    }

    public int hashCode() {
                 int result = 1;
        Object $datasourceId = getDatasourceId();
        result = result * 59 + (($datasourceId == null) ? 43 : $datasourceId.hashCode());
        Object $tagId = getTagId();
        return result * 59 + (($tagId == null) ? 43 : $tagId.hashCode());
    }

    public String toString() {
        return "SyncTagRel(datasourceId=" + getDatasourceId() + ", tagId=" + getTagId() + ")";
    }

    public Long getDatasourceId() {
        /*  9 */
        return this.datasourceId;
    }


    public Long getTagId() {
        /* 15 */
        return this.tagId;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/SyncTagRel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */