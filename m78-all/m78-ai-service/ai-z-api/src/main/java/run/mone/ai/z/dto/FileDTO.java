package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;


public class FileDTO
        implements Serializable {
    @HttpApiDocClassDefine(value = "fileId", description = "文件id")
    private Long fileId;
    @HttpApiDocClassDefine(value = "fileName", description = "文件名称")
    private String fileName;
    @HttpApiDocClassDefine(value = "filePath", description = "文件路径")
    private String filePath;
    @HttpApiDocClassDefine(value = "transferStatus", description = "任务流转状态 0-初始化 1-gpt分析完成 2-用户录入完成（终态）")
    private Integer transferStatus;

    public void setFileId(Long fileId) {
        /* 23 */
        this.fileId = fileId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FileDTO)) return false;
        FileDTO other = (FileDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$fileId = getFileId(), other$fileId = other.getFileId();
        if ((this$fileId == null) ? (other$fileId != null) : !this$fileId.equals(other$fileId)) return false;
        Object this$transferStatus = getTransferStatus(), other$transferStatus = other.getTransferStatus();
        if ((this$transferStatus == null) ? (other$transferStatus != null) : !this$transferStatus.equals(other$transferStatus))
            return false;
        Object this$fileName = getFileName(), other$fileName = other.getFileName();
        if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName)) return false;
        Object this$filePath = getFilePath(), other$filePath = other.getFilePath();
        return !((this$filePath == null) ? (other$filePath != null) : !this$filePath.equals(other$filePath));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FileDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $fileId = getFileId();
        result = result * 59 + (($fileId == null) ? 43 : $fileId.hashCode());
        Object $transferStatus = getTransferStatus();
        result = result * 59 + (($transferStatus == null) ? 43 : $transferStatus.hashCode());
        Object $fileName = getFileName();
        result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode());
        Object $filePath = getFilePath();
        return result * 59 + (($filePath == null) ? 43 : $filePath.hashCode());
    }

    public String toString() {
        return "CategoryFileDTO.FileDTO(fileId=" + getFileId() + ", fileName=" + getFileName() + ", filePath=" + getFilePath() + ", transferStatus=" + getTransferStatus() + ")";
    }

    public Long getFileId() {
        /* 26 */
        return this.fileId;
    }

    public String getFileName() {
        /* 28 */
        return this.fileName;
    }

    public String getFilePath() {
        /* 30 */
        return this.filePath;
    }

    public Integer getTransferStatus() {
        /* 32 */
        return this.transferStatus;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/CategoryFileDTO$FileDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */