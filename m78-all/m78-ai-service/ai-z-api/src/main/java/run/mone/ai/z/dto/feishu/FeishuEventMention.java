  package run.mone.ai.z.dto.feishu;
  public class FeishuEventMention {
    private String key;
    private FeishuEventMentionId id;
    private String name;
    private String tenant_key;
    
/*  8 */   public void setKey(String key) { this.key = key; } public void setId(FeishuEventMentionId id) { this.id = id; } public void setName(String name) { this.name = name; } public void setTenant_key(String tenant_key) { this.tenant_key = tenant_key; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventMention)) return false;  FeishuEventMention other = (FeishuEventMention)o; if (!other.canEqual(this)) return false;  Object this$key = getKey(), other$key = other.getKey(); if ((this$key == null) ? (other$key != null) : !this$key.equals(other$key)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$tenant_key = getTenant_key(), other$tenant_key = other.getTenant_key(); return !((this$tenant_key == null) ? (other$tenant_key != null) : !this$tenant_key.equals(other$tenant_key)); } protected boolean canEqual(Object other) { return other instanceof FeishuEventMention; } public int hashCode() {  int  result = 1; Object $key = getKey(); result = result * 59 + (($key == null) ? 43 : $key.hashCode()); Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $tenant_key = getTenant_key(); return result * 59 + (($tenant_key == null) ? 43 : $tenant_key.hashCode()); } public String toString() { return "FeishuEventMention(key=" + getKey() + ", id=" + getId() + ", name=" + getName() + ", tenant_key=" + getTenant_key() + ")"; }
    
/* 10 */   public String getKey() { return this.key; }
/* 11 */   public FeishuEventMentionId getId() { return this.id; }
/* 12 */   public String getName() { return this.name; } public String getTenant_key() {
/* 13 */     return this.tenant_key;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventMention.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */