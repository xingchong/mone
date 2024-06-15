  package run.mone.m78.api.bo.gitlab;
  
  import java.io.Serializable;
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class GitLabReq
    implements Serializable
  {
    private String branch;
    private String gitDomain;
    private String gitToken;
    private String projectId;
    private String filePath;
    
    public void setBranch(String branch) {
/* 27 */     this.branch = branch; } public void setGitDomain(String gitDomain) { this.gitDomain = gitDomain; } public void setGitToken(String gitToken) { this.gitToken = gitToken; } public void setProjectId(String projectId) { this.projectId = projectId; } public void setFilePath(String filePath) { this.filePath = filePath; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof GitLabReq)) return false;  GitLabReq other = (GitLabReq)o; if (!other.canEqual(this)) return false;  Object this$branch = getBranch(), other$branch = other.getBranch(); if ((this$branch == null) ? (other$branch != null) : !this$branch.equals(other$branch)) return false;  Object this$gitDomain = getGitDomain(), other$gitDomain = other.getGitDomain(); if ((this$gitDomain == null) ? (other$gitDomain != null) : !this$gitDomain.equals(other$gitDomain)) return false;  Object this$gitToken = getGitToken(), other$gitToken = other.getGitToken(); if ((this$gitToken == null) ? (other$gitToken != null) : !this$gitToken.equals(other$gitToken)) return false;  Object this$projectId = getProjectId(), other$projectId = other.getProjectId(); if ((this$projectId == null) ? (other$projectId != null) : !this$projectId.equals(other$projectId)) return false;  Object this$filePath = getFilePath(), other$filePath = other.getFilePath(); return !((this$filePath == null) ? (other$filePath != null) : !this$filePath.equals(other$filePath)); } protected boolean canEqual(Object other) { return other instanceof GitLabReq; } public int hashCode() {  int  result = 1; Object $branch = getBranch(); result = result * 59 + (($branch == null) ? 43 : $branch.hashCode()); Object $gitDomain = getGitDomain(); result = result * 59 + (($gitDomain == null) ? 43 : $gitDomain.hashCode()); Object $gitToken = getGitToken(); result = result * 59 + (($gitToken == null) ? 43 : $gitToken.hashCode()); Object $projectId = getProjectId(); result = result * 59 + (($projectId == null) ? 43 : $projectId.hashCode()); Object $filePath = getFilePath(); return result * 59 + (($filePath == null) ? 43 : $filePath.hashCode()); } public String toString() { return "GitLabReq(branch=" + getBranch() + ", gitDomain=" + getGitDomain() + ", gitToken=" + getGitToken() + ", projectId=" + getProjectId() + ", filePath=" + getFilePath() + ")"; }
    
    public String getBranch() {
/* 30 */     return this.branch;
    } public String getGitDomain() {
/* 32 */     return this.gitDomain;
    } public String getGitToken() {
/* 34 */     return this.gitToken;
    } public String getProjectId() {
/* 36 */     return this.projectId;
    } public String getFilePath() {
/* 38 */     return this.filePath;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/gitlab/GitLabReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */