  package run.mone.ai.z.dto;
  public class FileRequest { String account;
    Long knowledgeId;
    ZKnowledgeBaseFileBlockDTO dto;

/*  6 */   public void setAccount(String account) { this.account = account; } public void setKnowledgeId(Long knowledgeId) { this.knowledgeId = knowledgeId; } public void setDto(ZKnowledgeBaseFileBlockDTO dto) { this.dto = dto; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FileRequest)) return false;  FileRequest other = (FileRequest)o; if (!other.canEqual(this)) return false;  Object this$knowledgeId = getKnowledgeId(), other$knowledgeId = other.getKnowledgeId(); if ((this$knowledgeId == null) ? (other$knowledgeId != null) : !this$knowledgeId.equals(other$knowledgeId)) return false;  Object this$account = getAccount(), other$account = other.getAccount(); if ((this$account == null) ? (other$account != null) : !this$account.equals(other$account)) return false;  Object this$dto = getDto(), other$dto = other.getDto(); return !((this$dto == null) ? (other$dto != null) : !this$dto.equals(other$dto)); } protected boolean canEqual(Object other) { return other instanceof FileRequest; } public int hashCode() {  int  result = 1; Object $knowledgeId = getKnowledgeId(); result = result * 59 + (($knowledgeId == null) ? 43 : $knowledgeId.hashCode()); Object $account = getAccount(); result = result * 59 + (($account == null) ? 43 : $account.hashCode()); Object $dto = getDto(); return result * 59 + (($dto == null) ? 43 : $dto.hashCode()); } public String toString() { return "FileRequest(account=" + getAccount() + ", knowledgeId=" + getKnowledgeId() + ", dto=" + getDto() + ")"; }

/*  8 */   public String getAccount() { return this.account; }
/*  9 */   public Long getKnowledgeId() { return this.knowledgeId; } public ZKnowledgeBaseFileBlockDTO getDto() {
/* 10 */     return this.dto;
    } }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/FileRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */