package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.List;

public class SyncAll implements Serializable {
    private List<SyncData> dataList;
    private List<SyncTag> tagList;
    private List<SyncTagRel> tagRelList;
    private List<SyncLabel> labelList;

    /*  8 */
    public void setDataList(List<SyncData> dataList) {
        this.dataList = dataList;
    }

    private boolean syncData;
    private boolean syncTag;
    private boolean syncLabel;
    private String token;

    public void setTagList(List<SyncTag> tagList) {
        this.tagList = tagList;
    }

    public void setTagRelList(List<SyncTagRel> tagRelList) {
        this.tagRelList = tagRelList;
    }

    public void setLabelList(List<SyncLabel> labelList) {
        this.labelList = labelList;
    }

    public void setSyncData(boolean syncData) {
        this.syncData = syncData;
    }

    public void setSyncTag(boolean syncTag) {
        this.syncTag = syncTag;
    }

    public void setSyncLabel(boolean syncLabel) {
        this.syncLabel = syncLabel;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SyncAll)) return false;
        SyncAll other = (SyncAll) o;
        if (!other.canEqual(this)) return false;
        if (isSyncData() != other.isSyncData()) return false;
        if (isSyncTag() != other.isSyncTag()) return false;
        if (isSyncLabel() != other.isSyncLabel()) return false;
        Object this$dataList = (Object) getDataList(), other$dataList = (Object) other.getDataList();
        if ((this$dataList == null) ? (other$dataList != null) : !this$dataList.equals(other$dataList)) return false;
        Object this$tagList = (Object) getTagList(), other$tagList = (Object) other.getTagList();
        if ((this$tagList == null) ? (other$tagList != null) : !this$tagList.equals(other$tagList)) return false;
        Object this$tagRelList = (Object) getTagRelList(), other$tagRelList = (Object) other.getTagRelList();
        if ((this$tagRelList == null) ? (other$tagRelList != null) : !this$tagRelList.equals(other$tagRelList))
            return false;
        Object this$labelList = (Object) getLabelList(), other$labelList = (Object) other.getLabelList();
        if ((this$labelList == null) ? (other$labelList != null) : !this$labelList.equals(other$labelList))
            return false;
        Object this$token = getToken(), other$token = other.getToken();
        return !((this$token == null) ? (other$token != null) : !this$token.equals(other$token));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncAll;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + (isSyncData() ? 79 : 97);
        result = result * 59 + (isSyncTag() ? 79 : 97);
        result = result * 59 + (isSyncLabel() ? 79 : 97);
        Object $dataList = (Object) getDataList();
        result = result * 59 + (($dataList == null) ? 43 : $dataList.hashCode());
        Object $tagList = (Object) getTagList();
        result = result * 59 + (($tagList == null) ? 43 : $tagList.hashCode());
        Object $tagRelList = (Object) getTagRelList();
        result = result * 59 + (($tagRelList == null) ? 43 : $tagRelList.hashCode());
        Object $labelList = (Object) getLabelList();
        result = result * 59 + (($labelList == null) ? 43 : $labelList.hashCode());
        Object $token = getToken();
        return result * 59 + (($token == null) ? 43 : $token.hashCode());
    }

    public String toString() {
        return "SyncAll(dataList=" + getDataList() + ", tagList=" + getTagList() + ", tagRelList=" + getTagRelList() + ", labelList=" + getLabelList() + ", syncData=" + isSyncData() + ", syncTag=" + isSyncTag() + ", syncLabel=" + isSyncLabel() + ", token=" + getToken() + ")";
    }

    /* 10 */
    public List<SyncData> getDataList() {
        return this.dataList;
    }

    /* 11 */
    public List<SyncTag> getTagList() {
        return this.tagList;
    }

    /* 12 */
    public List<SyncTagRel> getTagRelList() {
        return this.tagRelList;
    }

    public List<SyncLabel> getLabelList() {
        /* 13 */
        return this.labelList;
    }

    /* 15 */
    public boolean isSyncData() {
        return this.syncData;
    }

    /* 16 */
    public boolean isSyncTag() {
        return this.syncTag;
    }

    /* 17 */
    public boolean isSyncLabel() {
        return this.syncLabel;
    }

    public String getToken() {
        /* 18 */
        return this.token;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/SyncAll.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */