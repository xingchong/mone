  package run.mone.ai.z.dto.feishu;
  
  public class FeishuEventMentionId {
    private String union_id;
    private String user_id;
    private String open_id;
    
/*  8 */   public void setUnion_id(String union_id) { this.union_id = union_id; } public void setUser_id(String user_id) { this.user_id = user_id; } public void setOpen_id(String open_id) { this.open_id = open_id; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventMentionId)) return false;  FeishuEventMentionId other = (FeishuEventMentionId)o; if (!other.canEqual(this)) return false;  Object this$union_id = getUnion_id(), other$union_id = other.getUnion_id(); if ((this$union_id == null) ? (other$union_id != null) : !this$union_id.equals(other$union_id)) return false;  Object this$user_id = getUser_id(), other$user_id = other.getUser_id(); if ((this$user_id == null) ? (other$user_id != null) : !this$user_id.equals(other$user_id)) return false;  Object this$open_id = getOpen_id(), other$open_id = other.getOpen_id(); return !((this$open_id == null) ? (other$open_id != null) : !this$open_id.equals(other$open_id)); } protected boolean canEqual(Object other) { return other instanceof FeishuEventMentionId; } public int hashCode() {  int  result = 1; Object $union_id = getUnion_id(); result = result * 59 + (($union_id == null) ? 43 : $union_id.hashCode()); Object $user_id = getUser_id(); result = result * 59 + (($user_id == null) ? 43 : $user_id.hashCode()); Object $open_id = getOpen_id(); return result * 59 + (($open_id == null) ? 43 : $open_id.hashCode()); } public String toString() { return "FeishuEventMentionId(union_id=" + getUnion_id() + ", user_id=" + getUser_id() + ", open_id=" + getOpen_id() + ")"; }
    
/* 10 */   public String getUnion_id() { return this.union_id; }
/* 11 */   public String getUser_id() { return this.user_id; } public String getOpen_id() {
/* 12 */     return this.open_id;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventMentionId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */