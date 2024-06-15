  package run.mone.ai.z.dto.feishu;
  
  
  
  public class FeishuUserInfo
  {
    private FeishuUserBaseInfo user;
    
    public String toString() {
/* 10 */     return "FeishuUserInfo(user=" + getUser() + ")"; } public int hashCode() {  int  result = 1; Object $user = getUser(); return result * 59 + (($user == null) ? 43 : $user.hashCode()); } protected boolean canEqual(Object other) { return other instanceof FeishuUserInfo; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuUserInfo)) return false;  FeishuUserInfo other = (FeishuUserInfo)o; if (!other.canEqual(this)) return false;  Object this$user = getUser(), other$user = other.getUser(); return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user)); } public void setUser(FeishuUserBaseInfo user) { this.user = user; }
     public FeishuUserBaseInfo getUser() {
/* 12 */     return this.user;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuUserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */