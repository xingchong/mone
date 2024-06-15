  package run.mone.m78.api.bo.translate;

  public class AudioParam
  {
    private String text;
    private String dialect;

    public void setText(String text) {
/*  9 */     this.text = text; } public void setDialect(String dialect) { this.dialect = dialect; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof AudioParam)) return false;  AudioParam other = (AudioParam)o; if (!other.canEqual(this)) return false;  Object this$text = getText(), other$text = other.getText(); if ((this$text == null) ? (other$text != null) : !this$text.equals(other$text)) return false;  Object this$dialect = getDialect(), other$dialect = other.getDialect(); return !((this$dialect == null) ? (other$dialect != null) : !this$dialect.equals(other$dialect)); } protected boolean canEqual(Object other) { return other instanceof AudioParam; } public int hashCode() {  int  result = 1; Object $text = getText(); result = result * 59 + (($text == null) ? 43 : $text.hashCode()); Object $dialect = getDialect(); return result * 59 + (($dialect == null) ? 43 : $dialect.hashCode()); } public String toString() { return "AudioParam(text=" + getText() + ", dialect=" + getDialect() + ")"; }

/* 11 */   public String getText() { return this.text; } public String getDialect() {
/* 12 */     return this.dialect;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/AudioParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */