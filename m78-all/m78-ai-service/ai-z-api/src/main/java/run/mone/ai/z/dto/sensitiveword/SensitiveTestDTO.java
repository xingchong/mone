  package run.mone.ai.z.dto.sensitiveword;


  public class SensitiveTestDTO
  {
    private String content;
    private Long id;
    private Boolean testAll;

    public SensitiveTestDTO() {}

    public SensitiveTestDTO(String content, Long id, Boolean testAll) {
/* 13 */     this.content = content; this.id = id; this.testAll = testAll;
/* 14 */   } public void setContent(String content) { this.content = content; } public void setId(Long id) { this.id = id; } public void setTestAll(Boolean testAll) { this.testAll = testAll; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof SensitiveTestDTO)) return false;  SensitiveTestDTO other = (SensitiveTestDTO)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$testAll = getTestAll(), other$testAll = other.getTestAll(); if ((this$testAll == null) ? (other$testAll != null) : !this$testAll.equals(other$testAll)) return false;  Object this$content = getContent(), other$content = other.getContent(); return !((this$content == null) ? (other$content != null) : !this$content.equals(other$content)); } protected boolean canEqual(Object other) { return other instanceof SensitiveTestDTO; } public int hashCode() {  int  result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $testAll = getTestAll(); result = result * 59 + (($testAll == null) ? 43 : $testAll.hashCode()); Object $content = getContent(); return result * 59 + (($content == null) ? 43 : $content.hashCode()); } public String toString() { return "SensitiveTestDTO(content=" + getContent() + ", id=" + getId() + ", testAll=" + getTestAll() + ")"; }
/* 15 */   public static SensitiveTestDTOBuilder builder() { return new SensitiveTestDTOBuilder(); } public static class SensitiveTestDTOBuilder { private String content; public SensitiveTestDTOBuilder content(String content) { this.content = content; return this; } private Long id; private Boolean testAll; public SensitiveTestDTOBuilder id(Long id) { this.id = id; return this; } public SensitiveTestDTOBuilder testAll(Boolean testAll) { this.testAll = testAll; return this; } public SensitiveTestDTO build() { return new SensitiveTestDTO(this.content, this.id, this.testAll); } public String toString() { return "SensitiveTestDTO.SensitiveTestDTOBuilder(content=" + this.content + ", id=" + this.id + ", testAll=" + this.testAll + ")"; }
       }
    public String getContent() {
/* 18 */     return this.content;
    } public Long getId() {
/* 20 */     return this.id;
    } public Boolean getTestAll() {
/* 22 */     return this.testAll;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/sensitiveword/SensitiveTestDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */