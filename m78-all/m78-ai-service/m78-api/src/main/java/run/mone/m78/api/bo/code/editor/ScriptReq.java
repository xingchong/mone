  package run.mone.m78.api.bo.code.editor;
  
  public class ScriptReq {
    private Long scriptId;
    private String content;
    private String param;
    
/*  8 */   public void setScriptId(Long scriptId) { this.scriptId = scriptId; } public void setContent(String content) { this.content = content; } public void setParam(String param) { this.param = param; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ScriptReq)) return false;  ScriptReq other = (ScriptReq)o; if (!other.canEqual(this)) return false;  Object this$scriptId = getScriptId(), other$scriptId = other.getScriptId(); if ((this$scriptId == null) ? (other$scriptId != null) : !this$scriptId.equals(other$scriptId)) return false;  Object this$content = getContent(), other$content = other.getContent(); if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;  Object this$param = getParam(), other$param = other.getParam(); return !((this$param == null) ? (other$param != null) : !this$param.equals(other$param)); } protected boolean canEqual(Object other) { return other instanceof ScriptReq; } public int hashCode() {  int  result = 1; Object $scriptId = getScriptId(); result = result * 59 + (($scriptId == null) ? 43 : $scriptId.hashCode()); Object $content = getContent(); result = result * 59 + (($content == null) ? 43 : $content.hashCode()); Object $param = getParam(); return result * 59 + (($param == null) ? 43 : $param.hashCode()); } public String toString() { return "ScriptReq(scriptId=" + getScriptId() + ", content=" + getContent() + ", param=" + getParam() + ")"; }
     public ScriptReq() {}
/* 10 */   public ScriptReq(Long scriptId, String content, String param) { this.scriptId = scriptId; this.content = content; this.param = param; }
/* 11 */   public static ScriptReqBuilder builder() { return new ScriptReqBuilder(); } public static class ScriptReqBuilder { private Long scriptId; public ScriptReqBuilder scriptId(Long scriptId) { this.scriptId = scriptId; return this; } private String content; private String param; public ScriptReqBuilder content(String content) { this.content = content; return this; } public ScriptReqBuilder param(String param) { this.param = param; return this; } public ScriptReq build() { return new ScriptReq(this.scriptId, this.content, this.param); } public String toString() { return "ScriptReq.ScriptReqBuilder(scriptId=" + this.scriptId + ", content=" + this.content + ", param=" + this.param + ")"; }
       }
/* 13 */   public Long getScriptId() { return this.scriptId; }
/* 14 */   public String getContent() { return this.content; } public String getParam() {
/* 15 */     return this.param;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/ScriptReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */