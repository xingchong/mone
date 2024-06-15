  package run.mone.ai.z.dto.feishu;
  public class FeishuEventMessageContentBody {
    private String tag;
    private String user_id;
    private String user_name;
    private String text;
    
/*  8 */   public void setTag(String tag) { this.tag = tag; } public void setUser_id(String user_id) { this.user_id = user_id; } public void setUser_name(String user_name) { this.user_name = user_name; } public void setText(String text) { this.text = text; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventMessageContentBody)) return false;  FeishuEventMessageContentBody other = (FeishuEventMessageContentBody)o; if (!other.canEqual(this)) return false;  Object this$tag = getTag(), other$tag = other.getTag(); if ((this$tag == null) ? (other$tag != null) : !this$tag.equals(other$tag)) return false;  Object this$user_id = getUser_id(), other$user_id = other.getUser_id(); if ((this$user_id == null) ? (other$user_id != null) : !this$user_id.equals(other$user_id)) return false;  Object this$user_name = getUser_name(), other$user_name = other.getUser_name(); if ((this$user_name == null) ? (other$user_name != null) : !this$user_name.equals(other$user_name)) return false;  Object this$text = getText(), other$text = other.getText(); return !((this$text == null) ? (other$text != null) : !this$text.equals(other$text)); } protected boolean canEqual(Object other) { return other instanceof FeishuEventMessageContentBody; } public int hashCode() {  int  result = 1; Object $tag = getTag(); result = result * 59 + (($tag == null) ? 43 : $tag.hashCode()); Object $user_id = getUser_id(); result = result * 59 + (($user_id == null) ? 43 : $user_id.hashCode()); Object $user_name = getUser_name(); result = result * 59 + (($user_name == null) ? 43 : $user_name.hashCode()); Object $text = getText(); return result * 59 + (($text == null) ? 43 : $text.hashCode()); } public String toString() { return "FeishuEventMessageContentBody(tag=" + getTag() + ", user_id=" + getUser_id() + ", user_name=" + getUser_name() + ", text=" + getText() + ")"; }
    
/* 10 */   public String getTag() { return this.tag; }
/* 11 */   public String getUser_id() { return this.user_id; }
/* 12 */   public String getUser_name() { return this.user_name; } public String getText() {
/* 13 */     return this.text;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventMessageContentBody.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */