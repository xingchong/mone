  package run.mone.ai.z.dto.function;

  import java.io.Serializable;

  public class FunctionLightDto
    implements Serializable
  {
    private String title;
    private String content;

    public void setTitle(String title) {
/* 12 */     this.title = title; } public void setContent(String content) { this.content = content; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FunctionLightDto)) return false;  FunctionLightDto other = (FunctionLightDto)o; if (!other.canEqual(this)) return false;  Object this$title = getTitle(), other$title = other.getTitle(); if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;  Object this$content = getContent(), other$content = other.getContent(); return !((this$content == null) ? (other$content != null) : !this$content.equals(other$content)); } protected boolean canEqual(Object other) { return other instanceof FunctionLightDto; } public int hashCode() {  int  result = 1; Object $title = getTitle(); result = result * 59 + (($title == null) ? 43 : $title.hashCode()); Object $content = getContent(); return result * 59 + (($content == null) ? 43 : $content.hashCode()); } public String toString() { return "FunctionLightDto(title=" + getTitle() + ", content=" + getContent() + ")"; }

    public String getTitle() {
/* 15 */     return this.title;
    } public String getContent() {
/* 17 */     return this.content;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/function/FunctionLightDto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */