  package run.mone.ai.z.dto;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class EmbeddingFile
  {
    private Long id;
    private String fileName;
    private String md5;
    private Integer embeddingStatus;
    
    public void setId(Long id) {
/* 40 */     this.id = id; } public void setFileName(String fileName) { this.fileName = fileName; } public void setMd5(String md5) { this.md5 = md5; } public void setEmbeddingStatus(Integer embeddingStatus) { this.embeddingStatus = embeddingStatus; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof EmbeddingFile)) return false;  EmbeddingFile other = (EmbeddingFile)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$embeddingStatus = getEmbeddingStatus(), other$embeddingStatus = other.getEmbeddingStatus(); if ((this$embeddingStatus == null) ? (other$embeddingStatus != null) : !this$embeddingStatus.equals(other$embeddingStatus)) return false;  Object this$fileName = getFileName(), other$fileName = other.getFileName(); if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName)) return false;  Object this$md5 = getMd5(), other$md5 = other.getMd5(); return !((this$md5 == null) ? (other$md5 != null) : !this$md5.equals(other$md5)); } protected boolean canEqual(Object other) { return other instanceof EmbeddingFile; } public int hashCode() {  int  result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $embeddingStatus = getEmbeddingStatus(); result = result * 59 + (($embeddingStatus == null) ? 43 : $embeddingStatus.hashCode()); Object $fileName = getFileName(); result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode()); Object $md5 = getMd5(); return result * 59 + (($md5 == null) ? 43 : $md5.hashCode()); } public String toString() { return "ZKnowledgeBaseFilesResp.EmbeddingFile(id=" + getId() + ", fileName=" + getFileName() + ", md5=" + getMd5() + ", embeddingStatus=" + getEmbeddingStatus() + ")"; }
     public Long getId() {
/* 42 */     return this.id;
    } public String getFileName() {
/* 44 */     return this.fileName;
    } public String getMd5() {
/* 46 */     return this.md5;
    } public Integer getEmbeddingStatus() {
/* 48 */     return this.embeddingStatus;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseFilesResp$EmbeddingFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */