  package run.mone.m78.api.bo.code.editor;public class FileReq { private String url;
    private String token;
    private String branch;
    private String path;
    private String content;
    private String commitMsg;

/*  8 */   public void setUrl(String url) { this.url = url; } public void setToken(String token) { this.token = token; } public void setBranch(String branch) { this.branch = branch; } public void setPath(String path) { this.path = path; } public void setContent(String content) { this.content = content; } public void setCommitMsg(String commitMsg) { this.commitMsg = commitMsg; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FileReq)) return false;  FileReq other = (FileReq)o; if (!other.canEqual(this)) return false;  Object this$url = getUrl(), other$url = other.getUrl(); if ((this$url == null) ? (other$url != null) : !this$url.equals(other$url)) return false;  Object this$token = getToken(), other$token = other.getToken(); if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;  Object this$branch = getBranch(), other$branch = other.getBranch(); if ((this$branch == null) ? (other$branch != null) : !this$branch.equals(other$branch)) return false;  Object this$path = getPath(), other$path = other.getPath(); if ((this$path == null) ? (other$path != null) : !this$path.equals(other$path)) return false;  Object this$content = getContent(), other$content = other.getContent(); if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;  Object this$commitMsg = getCommitMsg(), other$commitMsg = other.getCommitMsg(); return !((this$commitMsg == null) ? (other$commitMsg != null) : !this$commitMsg.equals(other$commitMsg)); } protected boolean canEqual(Object other) { return other instanceof FileReq; } public int hashCode() {  int  result = 1; Object $url = getUrl(); result = result * 59 + (($url == null) ? 43 : $url.hashCode()); Object $token = getToken(); result = result * 59 + (($token == null) ? 43 : $token.hashCode()); Object $branch = getBranch(); result = result * 59 + (($branch == null) ? 43 : $branch.hashCode()); Object $path = getPath(); result = result * 59 + (($path == null) ? 43 : $path.hashCode()); Object $content = getContent(); result = result * 59 + (($content == null) ? 43 : $content.hashCode()); Object $commitMsg = getCommitMsg(); return result * 59 + (($commitMsg == null) ? 43 : $commitMsg.hashCode()); } public String toString() { return "FileReq(url=" + getUrl() + ", token=" + getToken() + ", branch=" + getBranch() + ", path=" + getPath() + ", content=" + getContent() + ", commitMsg=" + getCommitMsg() + ")"; }
     public FileReq() {}
/* 10 */   public FileReq(String url, String token, String branch, String path, String content, String commitMsg) { this.url = url; this.token = token; this.branch = branch; this.path = path; this.content = content; this.commitMsg = commitMsg; }
/* 11 */   public static FileReqBuilder builder() { return new FileReqBuilder(); } public static class FileReqBuilder { private String url; private String token; private String branch; public FileReqBuilder url(String url) { this.url = url; return this; } private String path; private String content; private String commitMsg; public FileReqBuilder token(String token) { this.token = token; return this; } public FileReqBuilder branch(String branch) { this.branch = branch; return this; } public FileReqBuilder path(String path) { this.path = path; return this; } public FileReqBuilder content(String content) { this.content = content; return this; } public FileReqBuilder commitMsg(String commitMsg) { this.commitMsg = commitMsg; return this; } public FileReq build() { return new FileReq(this.url, this.token, this.branch, this.path, this.content, this.commitMsg); } public String toString() { return "FileReq.FileReqBuilder(url=" + this.url + ", token=" + this.token + ", branch=" + this.branch + ", path=" + this.path + ", content=" + this.content + ", commitMsg=" + this.commitMsg + ")"; }
       }
/* 13 */   public String getUrl() { return this.url; }
/* 14 */   public String getToken() { return this.token; }
/* 15 */   public String getBranch() { return this.branch; }
/* 16 */   public String getPath() { return this.path; }
/* 17 */   public String getContent() { return this.content; } public String getCommitMsg() {
/* 18 */     return this.commitMsg;
    } }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/FileReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */