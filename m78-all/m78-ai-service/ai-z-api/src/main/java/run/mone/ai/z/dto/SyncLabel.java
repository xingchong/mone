package run.mone.ai.z.dto;

import java.io.Serializable;

public class SyncLabel implements Serializable {
    private Long dataId;

    /*  7 */
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    private String labelKey;
    private String labelValue;

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncLabel)) return false;
        SyncLabel other = (SyncLabel) o;
        if (!other.canEqual(this)) return false;
        Object this$dataId = getDataId(), other$dataId = other.getDataId();
        if ((this$dataId == null) ? (other$dataId != null) : !this$dataId.equals(other$dataId)) return false;
        Object this$labelKey = getLabelKey(), other$labelKey = other.getLabelKey();
        if ((this$labelKey == null) ? (other$labelKey != null) : !this$labelKey.equals(other$labelKey)) return false;
        Object this$labelValue = getLabelValue(), other$labelValue = other.getLabelValue();
        return !((this$labelValue == null) ? (other$labelValue != null) : !this$labelValue.equals(other$labelValue));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncLabel;
    }

    public int hashCode() {
                 int result = 1;
        Object $dataId = getDataId();
        result = result * 59 + (($dataId == null) ? 43 : $dataId.hashCode());
        Object $labelKey = getLabelKey();
        result = result * 59 + (($labelKey == null) ? 43 : $labelKey.hashCode());
        Object $labelValue = getLabelValue();
        return result * 59 + (($labelValue == null) ? 43 : $labelValue.hashCode());
    }

    public String toString() {
        return "SyncLabel(dataId=" + getDataId() + ", labelKey=" + getLabelKey() + ", labelValue=" + getLabelValue() + ")";
    }

    public Long getDataId() {
        /*  9 */
        return this.dataId;
    }


    public String getLabelKey() {
        /* 14 */
        return this.labelKey;
    }

    public String getLabelValue() {
        /* 16 */
        return this.labelValue;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/SyncLabel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */