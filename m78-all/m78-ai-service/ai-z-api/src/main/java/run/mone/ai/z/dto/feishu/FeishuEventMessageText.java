  package run.mone.ai.z.dto.feishu;
  
  
  public class FeishuEventMessageText
  {
    private String text;
    
    public String toString() {
/*  9 */     return "FeishuEventMessageText(text=" + getText() + ")"; } public int hashCode() {  int  result = 1; Object $text = getText(); return result * 59 + (($text == null) ? 43 : $text.hashCode()); } protected boolean canEqual(Object other) { return other instanceof FeishuEventMessageText; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventMessageText)) return false;  FeishuEventMessageText other = (FeishuEventMessageText)o; if (!other.canEqual(this)) return false;  Object this$text = getText(), other$text = other.getText(); return !((this$text == null) ? (other$text != null) : !this$text.equals(other$text)); } public void setText(String text) { this.text = text; }
     public String getText() {
/* 11 */     return this.text;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventMessageText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */