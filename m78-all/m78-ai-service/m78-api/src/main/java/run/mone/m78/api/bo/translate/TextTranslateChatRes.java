  package run.mone.m78.api.bo.translate;
  
  
  public class TextTranslateChatRes
  {
    private String aiDetail;
    private String toNewText;
    
    public void setAiDetail(String aiDetail) {
/* 10 */     this.aiDetail = aiDetail; } public void setToNewText(String toNewText) { this.toNewText = toNewText; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof TextTranslateChatRes)) return false;  TextTranslateChatRes other = (TextTranslateChatRes)o; if (!other.canEqual(this)) return false;  Object this$aiDetail = getAiDetail(), other$aiDetail = other.getAiDetail(); if ((this$aiDetail == null) ? (other$aiDetail != null) : !this$aiDetail.equals(other$aiDetail)) return false;  Object this$toNewText = getToNewText(), other$toNewText = other.getToNewText(); return !((this$toNewText == null) ? (other$toNewText != null) : !this$toNewText.equals(other$toNewText)); } protected boolean canEqual(Object other) { return other instanceof TextTranslateChatRes; } public int hashCode() {  int  result = 1; Object $aiDetail = getAiDetail(); result = result * 59 + (($aiDetail == null) ? 43 : $aiDetail.hashCode()); Object $toNewText = getToNewText(); return result * 59 + (($toNewText == null) ? 43 : $toNewText.hashCode()); } public String toString() { return "TextTranslateChatRes(aiDetail=" + getAiDetail() + ", toNewText=" + getToNewText() + ")"; }
/* 11 */   TextTranslateChatRes(String aiDetail, String toNewText) { this.aiDetail = aiDetail; this.toNewText = toNewText; } public static TextTranslateChatResBuilder builder() { return new TextTranslateChatResBuilder(); } public static class TextTranslateChatResBuilder { private String aiDetail; public TextTranslateChatResBuilder aiDetail(String aiDetail) { this.aiDetail = aiDetail; return this; } private String toNewText; public TextTranslateChatResBuilder toNewText(String toNewText) { this.toNewText = toNewText; return this; } public TextTranslateChatRes build() { return new TextTranslateChatRes(this.aiDetail, this.toNewText); } public String toString() { return "TextTranslateChatRes.TextTranslateChatResBuilder(aiDetail=" + this.aiDetail + ", toNewText=" + this.toNewText + ")"; }
       }
    public String getAiDetail() {
/* 14 */     return this.aiDetail;
    } public String getToNewText() {
/* 16 */     return this.toNewText;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateChatRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */