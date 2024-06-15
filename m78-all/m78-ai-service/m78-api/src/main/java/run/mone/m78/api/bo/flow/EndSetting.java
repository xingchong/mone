  package run.mone.m78.api.bo.flow;
  
  import java.io.Serializable;
  
  public class EndSetting
    implements Serializable {
    private String type;
    private String answerContent;
    
    public void setType(String type) {
/* 11 */     this.type = type; } public void setAnswerContent(String answerContent) { this.answerContent = answerContent; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof EndSetting)) return false;  EndSetting other = (EndSetting)o; if (!other.canEqual(this)) return false;  Object this$type = getType(), other$type = other.getType(); if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;  Object this$answerContent = getAnswerContent(), other$answerContent = other.getAnswerContent(); return !((this$answerContent == null) ? (other$answerContent != null) : !this$answerContent.equals(other$answerContent)); } protected boolean canEqual(Object other) { return other instanceof EndSetting; } public int hashCode() {  int  result = 1; Object $type = getType(); result = result * 59 + (($type == null) ? 43 : $type.hashCode()); Object $answerContent = getAnswerContent(); return result * 59 + (($answerContent == null) ? 43 : $answerContent.hashCode()); } public String toString() { return "EndSetting(type=" + getType() + ", answerContent=" + getAnswerContent() + ")"; }
  
    
    public String getType() {
/* 15 */     return this.type;
    } public String getAnswerContent() {
/* 17 */     return this.answerContent;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/EndSetting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */