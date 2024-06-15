package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.List;

public class ZCsQaReqDTO
        implements Serializable {
    private Long fileId;
    private List<ZQARes> qaList;
    private Long categoryId;

    public void setFileId(Long fileId) {
        /* 13 */
        this.fileId = fileId;
    }

    public void setQaList(List<ZQARes> qaList) {
        this.qaList = qaList;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZCsQaReqDTO)) return false;
        ZCsQaReqDTO other = (ZCsQaReqDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$fileId = getFileId(), other$fileId = other.getFileId();
        if ((this$fileId == null) ? (other$fileId != null) : !this$fileId.equals(other$fileId)) return false;
        Object this$categoryId = getCategoryId(), other$categoryId = other.getCategoryId();
        if ((this$categoryId == null) ? (other$categoryId != null) : !this$categoryId.equals(other$categoryId))
            return false;
        Object this$qaList = (Object) getQaList(), other$qaList = (Object) other.getQaList();
        return !((this$qaList == null) ? (other$qaList != null) : !this$qaList.equals(other$qaList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZCsQaReqDTO;
    }

    public int hashCode() {
        int result = 1;
        Object $fileId = getFileId();
        result = result * 59 + (($fileId == null) ? 43 : $fileId.hashCode());
        Object $categoryId = getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        Object $qaList = (Object) getQaList();
        return result * 59 + (($qaList == null) ? 43 : $qaList.hashCode());
    }

    public String toString() {
        return "ZCsQaReqDTO(fileId=" + getFileId() + ", qaList=" + getQaList() + ", categoryId=" + getCategoryId() + ")";
    }

    public Long getFileId() {
        /* 16 */
        return this.fileId;
    }

    public List<ZQARes> getQaList() {
        /* 18 */
        return this.qaList;
    }

    public Long getCategoryId() {
        /* 20 */
        return this.categoryId;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZCsQaReqDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */