  package run.mone.m78.api.bo.translate;
  
  public class DocumentUploadRes {
    private String name;
    private Long size;
    private String type;
    private String content;
    
    public void setName(String name) {
/* 10 */     this.name = name; } public void setSize(Long size) { this.size = size; } public void setType(String type) { this.type = type; } public void setContent(String content) { this.content = content; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof DocumentUploadRes)) return false;  DocumentUploadRes other = (DocumentUploadRes)o; if (!other.canEqual(this)) return false;  Object this$size = getSize(), other$size = other.getSize(); if ((this$size == null) ? (other$size != null) : !this$size.equals(other$size)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$type = getType(), other$type = other.getType(); if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;  Object this$content = getContent(), other$content = other.getContent(); return !((this$content == null) ? (other$content != null) : !this$content.equals(other$content)); } protected boolean canEqual(Object other) { return other instanceof DocumentUploadRes; } public int hashCode() {  int  result = 1; Object $size = getSize(); result = result * 59 + (($size == null) ? 43 : $size.hashCode()); Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $type = getType(); result = result * 59 + (($type == null) ? 43 : $type.hashCode()); Object $content = getContent(); return result * 59 + (($content == null) ? 43 : $content.hashCode()); } public String toString() { return "DocumentUploadRes(name=" + getName() + ", size=" + getSize() + ", type=" + getType() + ", content=" + getContent() + ")"; }
/* 11 */   DocumentUploadRes(String name, Long size, String type, String content) { this.name = name; this.size = size; this.type = type; this.content = content; } public static DocumentUploadResBuilder builder() { return new DocumentUploadResBuilder(); } public static class DocumentUploadResBuilder { private String name; private Long size; public DocumentUploadResBuilder name(String name) { this.name = name; return this; } private String type; private String content; public DocumentUploadResBuilder size(Long size) { this.size = size; return this; } public DocumentUploadResBuilder type(String type) { this.type = type; return this; } public DocumentUploadResBuilder content(String content) { this.content = content; return this; } public DocumentUploadRes build() { return new DocumentUploadRes(this.name, this.size, this.type, this.content); } public String toString() { return "DocumentUploadRes.DocumentUploadResBuilder(name=" + this.name + ", size=" + this.size + ", type=" + this.type + ", content=" + this.content + ")"; }
       }
    public String getName() {
/* 14 */     return this.name;
    } public Long getSize() {
/* 16 */     return this.size;
    } public String getType() {
/* 18 */     return this.type;
    } public String getContent() {
/* 20 */     return this.content;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/DocumentUploadRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */