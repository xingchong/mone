  package run.mone.ai.z.dto.feishu;

  public class FeishuEventSender {
    private FeishuEventSender_id sender_id;
    private String sender_type;
    private String tenant_key;

    public void setSender_id(FeishuEventSender_id sender_id) {
/*  9 */     this.sender_id = sender_id; } public void setSender_type(String sender_type) { this.sender_type = sender_type; } public void setTenant_key(String tenant_key) { this.tenant_key = tenant_key; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventSender)) return false;  FeishuEventSender other = (FeishuEventSender)o; if (!other.canEqual(this)) return false;  Object this$sender_id = getSender_id(), other$sender_id = other.getSender_id(); if ((this$sender_id == null) ? (other$sender_id != null) : !this$sender_id.equals(other$sender_id)) return false;  Object this$sender_type = getSender_type(), other$sender_type = other.getSender_type(); if ((this$sender_type == null) ? (other$sender_type != null) : !this$sender_type.equals(other$sender_type)) return false;  Object this$tenant_key = getTenant_key(), other$tenant_key = other.getTenant_key(); return !((this$tenant_key == null) ? (other$tenant_key != null) : !this$tenant_key.equals(other$tenant_key)); } protected boolean canEqual(Object other) { return other instanceof FeishuEventSender; } public int hashCode() {  int  result = 1; Object $sender_id = getSender_id(); result = result * 59 + (($sender_id == null) ? 43 : $sender_id.hashCode()); Object $sender_type = getSender_type(); result = result * 59 + (($sender_type == null) ? 43 : $sender_type.hashCode()); Object $tenant_key = getTenant_key(); return result * 59 + (($tenant_key == null) ? 43 : $tenant_key.hashCode()); } public String toString() { return "FeishuEventSender(sender_id=" + getSender_id() + ", sender_type=" + getSender_type() + ", tenant_key=" + getTenant_key() + ")"; }

/* 11 */   public FeishuEventSender_id getSender_id() { return this.sender_id; }
/* 12 */   public String getSender_type() { return this.sender_type; } public String getTenant_key() {
/* 13 */     return this.tenant_key;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventSender.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */