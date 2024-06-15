  package run.mone.ai.z.dto.feishu;
  
  public class FeishuEventEvent
  {
    private FeishuEventSender sender;
    private FeishuEventMessage message;
    
    public void setSender(FeishuEventSender sender) {
/*  9 */     this.sender = sender; } public void setMessage(FeishuEventMessage message) { this.message = message; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventEvent)) return false;  FeishuEventEvent other = (FeishuEventEvent)o; if (!other.canEqual(this)) return false;  Object this$sender = getSender(), other$sender = other.getSender(); if ((this$sender == null) ? (other$sender != null) : !this$sender.equals(other$sender)) return false;  Object this$message = getMessage(), other$message = other.getMessage(); return !((this$message == null) ? (other$message != null) : !this$message.equals(other$message)); } protected boolean canEqual(Object other) { return other instanceof FeishuEventEvent; } public int hashCode() {  int  result = 1; Object $sender = getSender(); result = result * 59 + (($sender == null) ? 43 : $sender.hashCode()); Object $message = getMessage(); return result * 59 + (($message == null) ? 43 : $message.hashCode()); } public String toString() { return "FeishuEventEvent(sender=" + getSender() + ", message=" + getMessage() + ")"; }
    
/* 11 */   public FeishuEventSender getSender() { return this.sender; } public FeishuEventMessage getMessage() {
/* 12 */     return this.message;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */