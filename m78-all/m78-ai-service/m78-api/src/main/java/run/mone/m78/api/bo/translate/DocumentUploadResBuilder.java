  package run.mone.m78.api.bo.translate;
  
  public class DocumentUploadResBuilder
  {
    private String name;
    private Long size;
    private String type;
    private String content;
    
    public DocumentUploadResBuilder name(String name) {
/* 11 */     this.name = name; return this; } public DocumentUploadResBuilder size(Long size) { this.size = size; return this; } public DocumentUploadResBuilder type(String type) { this.type = type; return this; } public DocumentUploadResBuilder content(String content) { this.content = content; return this; } public DocumentUploadRes build() { return new DocumentUploadRes(this.name, this.size, this.type, this.content); } public String toString() { return "DocumentUploadRes.DocumentUploadResBuilder(name=" + this.name + ", size=" + this.size + ", type=" + this.type + ", content=" + this.content + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/DocumentUploadRes$DocumentUploadResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */