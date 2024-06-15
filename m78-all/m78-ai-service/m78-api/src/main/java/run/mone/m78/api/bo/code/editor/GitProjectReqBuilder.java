  package run.mone.m78.api.bo.code.editor;
  
  
  public class GitProjectReqBuilder
  {
    private String url;
    private String token;
    private String branch;
    
    public GitProjectReqBuilder url(String url) {
/* 11 */     this.url = url; return this; } public GitProjectReqBuilder token(String token) { this.token = token; return this; } public GitProjectReqBuilder branch(String branch) { this.branch = branch; return this; } public GitProjectReq build() { return new GitProjectReq(this.url, this.token, this.branch); } public String toString() { return "GitProjectReq.GitProjectReqBuilder(url=" + this.url + ", token=" + this.token + ", branch=" + this.branch + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/GitProjectReq$GitProjectReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */