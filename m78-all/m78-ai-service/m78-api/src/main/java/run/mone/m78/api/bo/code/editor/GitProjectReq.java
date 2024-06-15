  package run.mone.m78.api.bo.code.editor;

  public class GitProjectReq {
    private String url;
    private String token;
    private String branch;

/*  8 */   public void setUrl(String url) { this.url = url; } public void setToken(String token) { this.token = token; } public void setBranch(String branch) { this.branch = branch; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof GitProjectReq)) return false;  GitProjectReq other = (GitProjectReq)o; if (!other.canEqual(this)) return false;  Object this$url = getUrl(), other$url = other.getUrl(); if ((this$url == null) ? (other$url != null) : !this$url.equals(other$url)) return false;  Object this$token = getToken(), other$token = other.getToken(); if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;  Object this$branch = getBranch(), other$branch = other.getBranch(); return !((this$branch == null) ? (other$branch != null) : !this$branch.equals(other$branch)); } protected boolean canEqual(Object other) { return other instanceof GitProjectReq; } public int hashCode() {  int  result = 1; Object $url = getUrl(); result = result * 59 + (($url == null) ? 43 : $url.hashCode()); Object $token = getToken(); result = result * 59 + (($token == null) ? 43 : $token.hashCode()); Object $branch = getBranch(); return result * 59 + (($branch == null) ? 43 : $branch.hashCode()); } public String toString() { return "GitProjectReq(url=" + getUrl() + ", token=" + getToken() + ", branch=" + getBranch() + ")"; }
     public GitProjectReq() {}
/* 10 */   public GitProjectReq(String url, String token, String branch) { this.url = url; this.token = token; this.branch = branch; }
/* 11 */   public static GitProjectReqBuilder builder() { return new GitProjectReqBuilder(); } public static class GitProjectReqBuilder { private String url; public GitProjectReqBuilder url(String url) { this.url = url; return this; } private String token; private String branch; public GitProjectReqBuilder token(String token) { this.token = token; return this; } public GitProjectReqBuilder branch(String branch) { this.branch = branch; return this; } public GitProjectReq build() { return new GitProjectReq(this.url, this.token, this.branch); } public String toString() { return "GitProjectReq.GitProjectReqBuilder(url=" + this.url + ", token=" + this.token + ", branch=" + this.branch + ")"; }
       }
/* 13 */   public String getUrl() { return this.url; }
/* 14 */   public String getToken() { return this.token; } public String getBranch() {
/* 15 */     return this.branch;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/GitProjectReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */