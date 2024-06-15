  package run.mone.m78.api.bo.code.editor;


  public class ScriptReqBuilder
  {
    private Long scriptId;
    private String content;
    private String param;

    public ScriptReqBuilder scriptId(Long scriptId) {
/* 11 */     this.scriptId = scriptId; return this; } public ScriptReqBuilder content(String content) { this.content = content; return this; } public ScriptReqBuilder param(String param) { this.param = param; return this; } public ScriptReq build() { return new ScriptReq(this.scriptId, this.content, this.param); } public String toString() { return "ScriptReq.ScriptReqBuilder(scriptId=" + this.scriptId + ", content=" + this.content + ", param=" + this.param + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/ScriptReq$ScriptReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */