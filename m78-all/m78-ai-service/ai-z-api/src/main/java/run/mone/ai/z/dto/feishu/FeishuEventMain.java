  package run.mone.ai.z.dto.feishu;
  public class FeishuEventMain {
    private String schema;
    private FeishuEventHeader header;
    private FeishuEventEvent event;
    private String challenge;
    private String token;
    private String type;
    
/* 10 */   public void setSchema(String schema) { this.schema = schema; } public void setHeader(FeishuEventHeader header) { this.header = header; } public void setEvent(FeishuEventEvent event) { this.event = event; } public void setChallenge(String challenge) { this.challenge = challenge; } public void setToken(String token) { this.token = token; } public void setType(String type) { this.type = type; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FeishuEventMain)) return false;  FeishuEventMain other = (FeishuEventMain)o; if (!other.canEqual(this)) return false;  Object this$schema = getSchema(), other$schema = other.getSchema(); if ((this$schema == null) ? (other$schema != null) : !this$schema.equals(other$schema)) return false;  Object this$header = getHeader(), other$header = other.getHeader(); if ((this$header == null) ? (other$header != null) : !this$header.equals(other$header)) return false;  Object this$event = getEvent(), other$event = other.getEvent(); if ((this$event == null) ? (other$event != null) : !this$event.equals(other$event)) return false;  Object this$challenge = getChallenge(), other$challenge = other.getChallenge(); if ((this$challenge == null) ? (other$challenge != null) : !this$challenge.equals(other$challenge)) return false;  Object this$token = getToken(), other$token = other.getToken(); if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;  Object this$type = getType(), other$type = other.getType(); return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type)); } protected boolean canEqual(Object other) { return other instanceof FeishuEventMain; } public int hashCode() {  int  result = 1; Object $schema = getSchema(); result = result * 59 + (($schema == null) ? 43 : $schema.hashCode()); Object $header = getHeader(); result = result * 59 + (($header == null) ? 43 : $header.hashCode()); Object $event = getEvent(); result = result * 59 + (($event == null) ? 43 : $event.hashCode()); Object $challenge = getChallenge(); result = result * 59 + (($challenge == null) ? 43 : $challenge.hashCode()); Object $token = getToken(); result = result * 59 + (($token == null) ? 43 : $token.hashCode()); Object $type = getType(); return result * 59 + (($type == null) ? 43 : $type.hashCode()); } public String toString() { return "FeishuEventMain(schema=" + getSchema() + ", header=" + getHeader() + ", event=" + getEvent() + ", challenge=" + getChallenge() + ", token=" + getToken() + ", type=" + getType() + ")"; }
  
    
/* 13 */   public String getSchema() { return this.schema; }
/* 14 */   public FeishuEventHeader getHeader() { return this.header; }
/* 15 */   public FeishuEventEvent getEvent() { return this.event; }
/* 16 */   public String getChallenge() { return this.challenge; }
/* 17 */   public String getToken() { return this.token; } public String getType() {
/* 18 */     return this.type;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/feishu/FeishuEventMain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */