  package run.mone.m78.api.bo.translate;

  public class TextTranslateRes
  {
    private String uuid;
    private String fromText;
    private String toText;

    public void setUuid(String uuid) {
/* 10 */     this.uuid = uuid; } public void setFromText(String fromText) { this.fromText = fromText; } public void setToText(String toText) { this.toText = toText; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof TextTranslateRes)) return false;  TextTranslateRes other = (TextTranslateRes)o; if (!other.canEqual(this)) return false;  Object this$uuid = getUuid(), other$uuid = other.getUuid(); if ((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)) return false;  Object this$fromText = getFromText(), other$fromText = other.getFromText(); if ((this$fromText == null) ? (other$fromText != null) : !this$fromText.equals(other$fromText)) return false;  Object this$toText = getToText(), other$toText = other.getToText(); return !((this$toText == null) ? (other$toText != null) : !this$toText.equals(other$toText)); } protected boolean canEqual(Object other) { return other instanceof TextTranslateRes; } public int hashCode() {  int  result = 1; Object $uuid = getUuid(); result = result * 59 + (($uuid == null) ? 43 : $uuid.hashCode()); Object $fromText = getFromText(); result = result * 59 + (($fromText == null) ? 43 : $fromText.hashCode()); Object $toText = getToText(); return result * 59 + (($toText == null) ? 43 : $toText.hashCode()); } public String toString() { return "TextTranslateRes(uuid=" + getUuid() + ", fromText=" + getFromText() + ", toText=" + getToText() + ")"; }
/* 11 */   TextTranslateRes(String uuid, String fromText, String toText) { this.uuid = uuid; this.fromText = fromText; this.toText = toText; } public static TextTranslateResBuilder builder() { return new TextTranslateResBuilder(); } public static class TextTranslateResBuilder { private String uuid; public TextTranslateResBuilder uuid(String uuid) { this.uuid = uuid; return this; } private String fromText; private String toText; public TextTranslateResBuilder fromText(String fromText) { this.fromText = fromText; return this; } public TextTranslateResBuilder toText(String toText) { this.toText = toText; return this; } public TextTranslateRes build() { return new TextTranslateRes(this.uuid, this.fromText, this.toText); } public String toString() { return "TextTranslateRes.TextTranslateResBuilder(uuid=" + this.uuid + ", fromText=" + this.fromText + ", toText=" + this.toText + ")"; }
       }
    public String getUuid() {
/* 14 */     return this.uuid;
    } public String getFromText() {
/* 16 */     return this.fromText;
    } public String getToText() {
/* 18 */     return this.toText;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */