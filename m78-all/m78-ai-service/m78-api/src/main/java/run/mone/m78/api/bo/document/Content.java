  package run.mone.m78.api.bo.document;

  import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;
  import javax.annotation.Nonnull;

  public class Content {
    @Nonnull
    @HttpApiDocClassDefine(value = "documentId", required = true, description = "documentId", defaultValue = "")
    private String documentId;
    @Nonnull
    @HttpApiDocClassDefine(value = "newContent", required = true, description = "newContent", defaultValue = "")
    private String newContent;

    public Content() {}

/* 16 */   public Content(@Nonnull String documentId, @Nonnull String newContent) { if (documentId == null) throw new NullPointerException("documentId is marked non-null but is null");  if (newContent == null) throw new NullPointerException("newContent is marked non-null but is null");  this.documentId = documentId; this.newContent = newContent; }
/* 17 */   public void setDocumentId(@Nonnull String documentId) { if (documentId == null) throw new NullPointerException("documentId is marked non-null but is null");  this.documentId = documentId; } public void setNewContent(@Nonnull String newContent) { if (newContent == null) throw new NullPointerException("newContent is marked non-null but is null");  this.newContent = newContent; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof Content)) return false;  Content other = (Content)o; if (!other.canEqual(this)) return false;  Object this$documentId = getDocumentId(), other$documentId = other.getDocumentId(); if ((this$documentId == null) ? (other$documentId != null) : !this$documentId.equals(other$documentId)) return false;  Object this$newContent = getNewContent(), other$newContent = other.getNewContent(); return !((this$newContent == null) ? (other$newContent != null) : !this$newContent.equals(other$newContent)); } protected boolean canEqual(Object other) { return other instanceof Content; } public int hashCode() {  int  result = 1; Object $documentId = getDocumentId(); result = result * 59 + (($documentId == null) ? 43 : $documentId.hashCode()); Object $newContent = getNewContent(); return result * 59 + (($newContent == null) ? 43 : $newContent.hashCode()); } public String toString() { return "Content(documentId=" + getDocumentId() + ", newContent=" + getNewContent() + ")"; }
/* 18 */   public static ContentBuilder builder() { return new ContentBuilder(); } public static class ContentBuilder { private String documentId; public ContentBuilder documentId(@Nonnull String documentId) { if (documentId == null) throw new NullPointerException("documentId is marked non-null but is null");  this.documentId = documentId; return this; } private String newContent; public ContentBuilder newContent(@Nonnull String newContent) { if (newContent == null) throw new NullPointerException("newContent is marked non-null but is null");  this.newContent = newContent; return this; } public Content build() { return new Content(this.documentId, this.newContent); } public String toString() { return "Content.ContentBuilder(documentId=" + this.documentId + ", newContent=" + this.newContent + ")"; }
       }

    @Nonnull
    public String getDocumentId() {
/* 23 */     return this.documentId;
    }
    @Nonnull
    public String getNewContent() {
/* 27 */     return this.newContent;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/Content.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */