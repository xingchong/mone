  package run.mone.m78.api.bo.translate;

  public class LanguageTypeAnalyzeParam
  {
    private String content;
    private String userName;

    public void setContent(String content) {
/*  9 */     this.content = content; } public void setUserName(String userName) { this.userName = userName; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof LanguageTypeAnalyzeParam)) return false;  LanguageTypeAnalyzeParam other = (LanguageTypeAnalyzeParam)o; if (!other.canEqual(this)) return false;  Object this$content = getContent(), other$content = other.getContent(); if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;  Object this$userName = getUserName(), other$userName = other.getUserName(); return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)); } protected boolean canEqual(Object other) { return other instanceof LanguageTypeAnalyzeParam; } public int hashCode() {  int  result = 1; Object $content = getContent(); result = result * 59 + (($content == null) ? 43 : $content.hashCode()); Object $userName = getUserName(); return result * 59 + (($userName == null) ? 43 : $userName.hashCode()); } public String toString() { return "LanguageTypeAnalyzeParam(content=" + getContent() + ", userName=" + getUserName() + ")"; }

    public String getContent() {
/* 12 */     return this.content;
    } public String getUserName() {
/* 14 */     return this.userName;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/LanguageTypeAnalyzeParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */