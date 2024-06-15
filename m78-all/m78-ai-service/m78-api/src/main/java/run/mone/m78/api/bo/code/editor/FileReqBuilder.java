  package run.mone.m78.api.bo.code.editor;

  public class FileReqBuilder {
    private String url;
    private String token;
    private String branch;
    private String path;
    private String content;
    private String commitMsg;

/* 11 */   public FileReqBuilder url(String url) { this.url = url; return this; } public FileReqBuilder token(String token) { this.token = token; return this; } public FileReqBuilder branch(String branch) { this.branch = branch; return this; } public FileReqBuilder path(String path) { this.path = path; return this; } public FileReqBuilder content(String content) { this.content = content; return this; } public FileReqBuilder commitMsg(String commitMsg) { this.commitMsg = commitMsg; return this; } public FileReq build() { return new FileReq(this.url, this.token, this.branch, this.path, this.content, this.commitMsg); } public String toString() { return "FileReq.FileReqBuilder(url=" + this.url + ", token=" + this.token + ", branch=" + this.branch + ", path=" + this.path + ", content=" + this.content + ", commitMsg=" + this.commitMsg + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/FileReq$FileReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */