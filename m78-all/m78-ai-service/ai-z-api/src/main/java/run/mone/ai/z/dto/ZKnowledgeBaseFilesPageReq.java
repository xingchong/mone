  package run.mone.ai.z.dto;

  import java.io.Serializable;
















  public class ZKnowledgeBaseFilesPageReq
    implements Serializable
  {
    private Long knowledgeBaseId;
    private String fileName;

    public void setKnowledgeBaseId(Long knowledgeBaseId) {
/* 27 */     this.knowledgeBaseId = knowledgeBaseId; } public void setFileName(String fileName) { this.fileName = fileName; } public void setPageSize(Integer pageSize) { this.pageSize = pageSize; } public void setPageNum(Integer pageNum) { this.pageNum = pageNum; } public void setProjectName(String projectName) { this.projectName = projectName; } public void setModuleName(String moduleName) { this.moduleName = moduleName; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ZKnowledgeBaseFilesPageReq)) return false;  ZKnowledgeBaseFilesPageReq other = (ZKnowledgeBaseFilesPageReq)o; if (!other.canEqual(this)) return false;  Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId(); if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId)) return false;  Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize(); if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;  Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum(); if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;  Object this$fileName = getFileName(), other$fileName = other.getFileName(); if ((this$fileName == null) ? (other$fileName != null) : !this$fileName.equals(other$fileName)) return false;  Object this$projectName = getProjectName(), other$projectName = other.getProjectName(); if ((this$projectName == null) ? (other$projectName != null) : !this$projectName.equals(other$projectName)) return false;  Object this$moduleName = getModuleName(), other$moduleName = other.getModuleName(); return !((this$moduleName == null) ? (other$moduleName != null) : !this$moduleName.equals(other$moduleName)); } protected boolean canEqual(Object other) { return other instanceof ZKnowledgeBaseFilesPageReq; } public int hashCode() {  int  result = 1; Object $knowledgeBaseId = getKnowledgeBaseId(); result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode()); Object $pageSize = getPageSize(); result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode()); Object $pageNum = getPageNum(); result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode()); Object $fileName = getFileName(); result = result * 59 + (($fileName == null) ? 43 : $fileName.hashCode()); Object $projectName = getProjectName(); result = result * 59 + (($projectName == null) ? 43 : $projectName.hashCode()); Object $moduleName = getModuleName(); return result * 59 + (($moduleName == null) ? 43 : $moduleName.hashCode()); } public String toString() { return "ZKnowledgeBaseFilesPageReq(knowledgeBaseId=" + getKnowledgeBaseId() + ", fileName=" + getFileName() + ", pageSize=" + getPageSize() + ", pageNum=" + getPageNum() + ", projectName=" + getProjectName() + ", moduleName=" + getModuleName() + ")"; }

    public Long getKnowledgeBaseId() {
/* 30 */     return this.knowledgeBaseId;
    } public String getFileName() {
/* 32 */     return this.fileName;
    }
/* 34 */   private Integer pageSize = Integer.valueOf(15); public Integer getPageSize() { return this.pageSize; }

/* 36 */   private String projectName; private Integer pageNum = Integer.valueOf(0); private String moduleName; public Integer getPageNum() { return this.pageNum; }
     public String getProjectName() {
/* 38 */     return this.projectName;
    } public String getModuleName() {
/* 40 */     return this.moduleName;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseFilesPageReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */