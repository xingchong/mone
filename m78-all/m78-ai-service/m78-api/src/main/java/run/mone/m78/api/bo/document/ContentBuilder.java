  package run.mone.m78.api.bo.document;
  
  import javax.annotation.Nonnull;
  
  
  
  
  
  
  
  
  public class ContentBuilder
  {
    private String documentId;
    private String newContent;
    
    public ContentBuilder documentId(@Nonnull String documentId) {
/* 18 */     if (documentId == null) throw new NullPointerException("documentId is marked non-null but is null");  this.documentId = documentId; return this; } public ContentBuilder newContent(@Nonnull String newContent) { if (newContent == null) throw new NullPointerException("newContent is marked non-null but is null");  this.newContent = newContent; return this; } public Content build() { return new Content(this.documentId, this.newContent); } public String toString() { return "Content.ContentBuilder(documentId=" + this.documentId + ", newContent=" + this.newContent + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/Content$ContentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */