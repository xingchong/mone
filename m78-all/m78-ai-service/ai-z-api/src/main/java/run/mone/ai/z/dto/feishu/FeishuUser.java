  package run.mone.ai.z.dto.feishu;
  
  public class FeishuUser {
    private Integer code;
    private String msg;
    private FeishuUserInfo data;
    
    public void setCode(Integer code) {
/*  9 */     this.code = code; } public void setMsg(String msg) { this.msg = msg; } public void setData(FeishuUserInfo data) { this.data = data; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuUser)) return false;  FeishuUser other = (FeishuUser)o; if (!other.canEqual(this)) return false;  Object this$code = getCode(), other$code = other.getCode(); if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code)) return false;  Object this$msg = getMsg(), other$msg = other.getMsg(); if ((this$msg == null) ? (other$msg != null) : !this$msg.equals(other$msg)) return false;  Object this$data = getData(), other$data = other.getData(); return !((this$data == null) ? (other$data != null) : !this$data.equals(other$data)); } protected boolean canEqual(Object other) { return other instanceof FeishuUser; } public int hashCode() {  int  result = 1; Object $code = getCode(); result = result * 59 + (($code == null) ? 43 : $code.hashCode()); Object $msg = getMsg(); result = result * 59 + (($msg == null) ? 43 : $msg.hashCode()); Object $data = getData(); return result * 59 + (($data == null) ? 43 : $data.hashCode()); } public String toString() { return "FeishuUser(code=" + getCode() + ", msg=" + getMsg() + ", data=" + getData() + ")"; }
    
/* 11 */   public Integer getCode() { return this.code; }
/* 12 */   public String getMsg() { return this.msg; } public FeishuUserInfo getData() {
/* 13 */     return this.data;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */