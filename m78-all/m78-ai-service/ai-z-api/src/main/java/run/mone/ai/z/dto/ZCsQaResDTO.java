package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;

public class ZCsQaResDTO implements Serializable {
    @HttpApiDocClassDefine(value = "fileId", description = "文件id", required = true)
    private Long fileId;
    @HttpApiDocClassDefine(value = "fileContent", description = "文件内容")
    private String fileName;
    @HttpApiDocClassDefine(value = "creator", description = "创建人", required = true)
    private String creator;
    @HttpApiDocClassDefine(value = "qAList", description = "Q&A记录", required = true)
    private List<ZQARes> qAList;

    /* 17 */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setQAList(List<ZQARes> qAList) {
        this.qAList = qAList;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZCsQaResDTO)) return false;
        ZCsQaResDTO other = (ZCsQaResDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$fileId = getFileId(), other$fileId = other.getFileId();
        if ((this$fileId == null) ? (other$fileId != null) : !this$fileId.equals(other$fileId)) return false;
        Object this$fileName = getFileName(), other$fileName = other.getFileName();
        if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName)) return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$qAList = (Object) getQAList(), other$qAList = (Object) other.getQAList();
        return !((this$qAList == null) ? (other$qAList != null) : !this$qAList.equals(other$qAList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZCsQaResDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $fileId = getFileId();
        result = result * 59 + (($fileId == null) ? 43 : $fileId.hashCode());
        Object $fileName = getFileName();
        result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $qAList = (Object) getQAList();
        return result * 59 + (($qAList == null) ? 43 : $qAList.hashCode());
    }

    public String toString() {
        return "ZCsQaResDTO(fileId=" + getFileId() + ", fileName=" + getFileName() + ", creator=" + getCreator() + ", qAList=" + getQAList() + ")";
    }

    /* 18 */
    public static ZCsQaResDTOBuilder builder() {
        return new ZCsQaResDTOBuilder();
    }

    public static class ZCsQaResDTOBuilder {
        private Long fileId;
        private String fileName;

        public ZCsQaResDTOBuilder fileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }

        private String creator;
        private List<ZQARes> qAList;

        public ZCsQaResDTOBuilder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public ZCsQaResDTOBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public ZCsQaResDTOBuilder qAList(List<ZQARes> qAList) {
            this.qAList = qAList;
            return this;
        }

        public ZCsQaResDTO build() {
            return new ZCsQaResDTO(this.fileId, this.fileName, this.creator, this.qAList);
        }

        public String toString() {
            return "ZCsQaResDTO.ZCsQaResDTOBuilder(fileId=" + this.fileId + ", fileName=" + this.fileName + ", creator=" + this.creator + ", qAList=" + this.qAList + ")";
        }
    }

    public ZCsQaResDTO() {
    }

    public ZCsQaResDTO(Long fileId, String fileName, String creator, List<ZQARes> qAList) {
        /* 20 */
        this.fileId = fileId;
        this.fileName = fileName;
        this.creator = creator;
        this.qAList = qAList;
    }

    public Long getFileId() {
        /* 24 */
        return this.fileId;
    }

    public String getFileName() {
        /* 27 */
        return this.fileName;
    }


    public String getCreator() {
        /* 33 */
        return this.creator;
    }


    public List<ZQARes> getQAList() {
        /* 39 */
        return this.qAList;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZCsQaResDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */