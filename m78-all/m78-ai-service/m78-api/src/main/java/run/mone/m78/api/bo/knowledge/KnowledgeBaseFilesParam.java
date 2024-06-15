  package run.mone.m78.api.bo.knowledge;
  public class KnowledgeBaseFilesParam {
    private Long knowledgeBaseId;
    private String filePath;
    private String fileName;
    private Long fileId;
    private String separator;
    
/*  9 */   public void setKnowledgeBaseId(Long knowledgeBaseId) { this.knowledgeBaseId = knowledgeBaseId; } public void setFilePath(String filePath) { this.filePath = filePath; } public void setFileName(String fileName) { this.fileName = fileName; } public void setFileId(Long fileId) { this.fileId = fileId; } public void setSeparator(String separator) { this.separator = separator; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof KnowledgeBaseFilesParam)) return false;  KnowledgeBaseFilesParam other = (KnowledgeBaseFilesParam)o; if (!other.canEqual(this)) return false;  Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId(); if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId)) return false;  Object this$fileId = getFileId(), other$fileId = other.getFileId(); if ((this$fileId == null) ? (other$fileId != null) : !this$fileId.equals(other$fileId)) return false;  Object this$filePath = getFilePath(), other$filePath = other.getFilePath(); if ((this$filePath == null) ? (other$filePath != null) : !this$filePath.equals(other$filePath)) return false;  Object this$fileName = getFileName(), other$fileName = other.getFileName(); if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName)) return false;  Object this$separator = getSeparator(), other$separator = other.getSeparator(); return !((this$separator == null) ? (other$separator != null) : !this$separator.equals(other$separator)); } protected boolean canEqual(Object other) { return other instanceof KnowledgeBaseFilesParam; } public int hashCode() {  int  result = 1; Object $knowledgeBaseId = getKnowledgeBaseId(); result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode()); Object $fileId = getFileId(); result = result * 59 + (($fileId == null) ? 43 : $fileId.hashCode()); Object $filePath = getFilePath(); result = result * 59 + (($filePath == null) ? 43 : $filePath.hashCode()); Object $fileName = getFileName(); result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode()); Object $separator = getSeparator(); return result * 59 + (($separator == null) ? 43 : $separator.hashCode()); } public String toString() { return "KnowledgeBaseFilesParam(knowledgeBaseId=" + getKnowledgeBaseId() + ", filePath=" + getFilePath() + ", fileName=" + getFileName() + ", fileId=" + getFileId() + ", separator=" + getSeparator() + ")"; }
    
    public Long getKnowledgeBaseId() {
/* 12 */     return this.knowledgeBaseId;
    } public String getFilePath() {
/* 14 */     return this.filePath;
    } public String getFileName() {
/* 16 */     return this.fileName;
    } public Long getFileId() {
/* 18 */     return this.fileId;
    } public String getSeparator() {
/* 20 */     return this.separator;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/knowledge/KnowledgeBaseFilesParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */