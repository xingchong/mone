  package run.mone.m78.api.bo.code;
  
  
  
  
  
  
  
  public class CodeReqBuilder
  {
    private String comment;
    private String model;
    
    public CodeReqBuilder comment(String comment) {
/* 15 */     this.comment = comment; return this; } public CodeReqBuilder model(String model) { this.model = model; return this; } public CodeReq build() { return new CodeReq(this.comment, this.model); } public String toString() { return "CodeReq.CodeReqBuilder(comment=" + this.comment + ", model=" + this.model + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/CodeReq$CodeReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */