package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.List;


public class ZKnowledgeBaseFilesResp
        implements Serializable {
    private Boolean success;
    private Integer successCnt;
    private Integer total;
    private List<EmbeddingFile> files;

    public void setSuccess(Boolean success) {
        /* 28 */
        this.success = success;
    }

    public void setSuccessCnt(Integer successCnt) {
        this.successCnt = successCnt;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public void setFiles(List<EmbeddingFile> files) {
        this.files = files;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZKnowledgeBaseFilesResp)) return false;
        ZKnowledgeBaseFilesResp other = (ZKnowledgeBaseFilesResp) o;
        if (!other.canEqual(this)) return false;
        Object this$success = getSuccess(), other$success = other.getSuccess();
        if ((this$success == null) ? (other$success != null) : !this$success.equals(other$success)) return false;
        Object this$successCnt = getSuccessCnt(), other$successCnt = other.getSuccessCnt();
        if ((this$successCnt == null) ? (other$successCnt != null) : !this$successCnt.equals(other$successCnt))
            return false;
        Object this$total = getTotal(), other$total = other.getTotal();
        if ((this$total == null) ? (other$total != null) : !this$total.equals(other$total)) return false;
        Object this$files = (Object) getFiles(), other$files = (Object) other.getFiles();
        return !((this$files == null) ? (other$files != null) : !this$files.equals(other$files));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZKnowledgeBaseFilesResp;
    }

    public int hashCode() {
        int result = 1;
        Object $success = getSuccess();
        result = result * 59 + (($success == null) ? 43 : $success.hashCode());
        Object $successCnt = getSuccessCnt();
        result = result * 59 + (($successCnt == null) ? 43 : $successCnt.hashCode());
        Object $total = getTotal();
        result = result * 59 + (($total == null) ? 43 : $total.hashCode());
        Object $files = (Object) getFiles();
        return result * 59 + (($files == null) ? 43 : $files.hashCode());
    }

    public String toString() {
        return "ZKnowledgeBaseFilesResp(success=" + getSuccess() + ", successCnt=" + getSuccessCnt() + ", total=" + getTotal() + ", files=" + getFiles() + ")";
    }

    public Boolean getSuccess() {
        /* 31 */
        return this.success;
    }

    public Integer getSuccessCnt() {
        /* 34 */
        return this.successCnt;
    }

    public Integer getTotal() {
        /* 36 */
        return this.total;
    }

    public List<EmbeddingFile> getFiles() {
        /* 38 */
        return this.files;
    }

    public static class EmbeddingFile {
        /* 40 */     private Long id;
        private String fileName;

        public void setId(Long id) {
            this.id = id;
        }

        private String md5;
        private Integer embeddingStatus;

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public void setEmbeddingStatus(Integer embeddingStatus) {
            this.embeddingStatus = embeddingStatus;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof EmbeddingFile)) return false;
            EmbeddingFile other = (EmbeddingFile) o;
            if (!other.canEqual(this)) return false;
            Object this$id = getId(), other$id = other.getId();
            if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
            Object this$embeddingStatus = getEmbeddingStatus(), other$embeddingStatus = other.getEmbeddingStatus();
            if ((this$embeddingStatus == null) ? (other$embeddingStatus != null) : !this$embeddingStatus.equals(other$embeddingStatus))
                return false;
            Object this$fileName = getFileName(), other$fileName = other.getFileName();
            if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName))
                return false;
            Object this$md5 = getMd5(), other$md5 = other.getMd5();
            return !((this$md5 == null) ? (other$md5 != null) : !this$md5.equals(other$md5));
        }

        protected boolean canEqual(Object other) {
            return other instanceof EmbeddingFile;
        }

        public int hashCode() {
            int result = 1;
            Object $id = getId();
            result = result * 59 + (($id == null) ? 43 : $id.hashCode());
            Object $embeddingStatus = getEmbeddingStatus();
            result = result * 59 + (($embeddingStatus == null) ? 43 : $embeddingStatus.hashCode());
            Object $fileName = getFileName();
            result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode());
            Object $md5 = getMd5();
            return result * 59 + (($md5 == null) ? 43 : $md5.hashCode());
        }

        public String toString() {
            return "ZKnowledgeBaseFilesResp.EmbeddingFile(id=" + getId() + ", fileName=" + getFileName() + ", md5=" + getMd5() + ", embeddingStatus=" + getEmbeddingStatus() + ")";
        }

        public Long getId() {
            /* 42 */
            return this.id;
        }

        public String getFileName() {
            /* 44 */
            return this.fileName;
        }

        public String getMd5() {
            /* 46 */
            return this.md5;
        }

        public Integer getEmbeddingStatus() {
            /* 48 */
            return this.embeddingStatus;
        }
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseFilesResp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */