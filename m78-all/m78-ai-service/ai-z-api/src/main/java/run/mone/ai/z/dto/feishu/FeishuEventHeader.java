  package run.mone.ai.z.dto.feishu;

  public class FeishuEventHeader {
    private String event_id;
    private String event_type;
    private String create_time;

/*  8 */   public void setEvent_id(String event_id) { this.event_id = event_id; } private String token; private String app_id; private String tenant_key; public void setEvent_type(String event_type) { this.event_type = event_type; } public void setCreate_time(String create_time) { this.create_time = create_time; } public void setToken(String token) { this.token = token; } public void setApp_id(String app_id) { this.app_id = app_id; } public void setTenant_key(String tenant_key) { this.tenant_key = tenant_key; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventHeader)) return false;  FeishuEventHeader other = (FeishuEventHeader)o; if (!other.canEqual(this)) return false;  Object this$event_id = getEvent_id(), other$event_id = other.getEvent_id(); if ((this$event_id == null) ? (other$event_id != null) : !this$event_id.equals(other$event_id)) return false;  Object this$event_type = getEvent_type(), other$event_type = other.getEvent_type(); if ((this$event_type == null) ? (other$event_type != null) : !this$event_type.equals(other$event_type)) return false;  Object this$create_time = getCreate_time(), other$create_time = other.getCreate_time(); if ((this$create_time == null) ? (other$create_time != null) : !this$create_time.equals(other$create_time)) return false;  Object this$token = getToken(), other$token = other.getToken(); if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;  Object this$app_id = getApp_id(), other$app_id = other.getApp_id(); if ((this$app_id == null) ? (other$app_id != null) : !this$app_id.equals(other$app_id)) return false;  Object this$tenant_key = getTenant_key(), other$tenant_key = other.getTenant_key(); return !((this$tenant_key == null) ? (other$tenant_key != null) : !this$tenant_key.equals(other$tenant_key)); } protected boolean canEqual(Object other) { return other instanceof FeishuEventHeader; } public int hashCode() {  int  result = 1; Object $event_id = getEvent_id(); result = result * 59 + (($event_id == null) ? 43 : $event_id.hashCode()); Object $event_type = getEvent_type(); result = result * 59 + (($event_type == null) ? 43 : $event_type.hashCode()); Object $create_time = getCreate_time(); result = result * 59 + (($create_time == null) ? 43 : $create_time.hashCode()); Object $token = getToken(); result = result * 59 + (($token == null) ? 43 : $token.hashCode()); Object $app_id = getApp_id(); result = result * 59 + (($app_id == null) ? 43 : $app_id.hashCode()); Object $tenant_key = getTenant_key(); return result * 59 + (($tenant_key == null) ? 43 : $tenant_key.hashCode()); } public String toString() { return "FeishuEventHeader(event_id=" + getEvent_id() + ", event_type=" + getEvent_type() + ", create_time=" + getCreate_time() + ", token=" + getToken() + ", app_id=" + getApp_id() + ", tenant_key=" + getTenant_key() + ")"; }

/* 10 */   public String getEvent_id() { return this.event_id; }
/* 11 */   public String getEvent_type() { return this.event_type; }
/* 12 */   public String getCreate_time() { return this.create_time; }
/* 13 */   public String getToken() { return this.token; }
/* 14 */   public String getApp_id() { return this.app_id; } public String getTenant_key() {
/* 15 */     return this.tenant_key;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventHeader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */