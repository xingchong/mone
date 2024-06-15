  package run.mone.m78.api.bo.textVoice;



  public class TextToVoiceParam
  {
    private String text;

    public String toString() {
/* 10 */     return "TextToVoiceParam(text=" + getText() + ")"; } public int hashCode() {  int  result = 1; Object $text = getText(); return result * 59 + (($text == null) ? 43 : $text.hashCode()); } protected boolean canEqual(Object other) { return other instanceof TextToVoiceParam; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof TextToVoiceParam)) return false;  TextToVoiceParam other = (TextToVoiceParam)o; if (!other.canEqual(this)) return false;  Object this$text = getText(), other$text = other.getText(); return !((this$text == null) ? (other$text != null) : !this$text.equals(other$text)); } public void setText(String text) { this.text = text; }
     public String getText() {
/* 12 */     return this.text;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/textVoice/TextToVoiceParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */