  package run.mone.m78.api.bo.code;



  public class CodeReq
  {
    private String comment;
    private String model;

    public CodeReq() {}

    public CodeReq(String comment, String model) {
/* 13 */     this.comment = comment; this.model = model;
/* 14 */   } public void setComment(String comment) { this.comment = comment; } public void setModel(String model) { this.model = model; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof CodeReq)) return false;  CodeReq other = (CodeReq)o; if (!other.canEqual(this)) return false;  Object this$comment = getComment(), other$comment = other.getComment(); if ((this$comment == null) ? (other$comment != null) : !this$comment.equals(other$comment)) return false;  Object this$model = getModel(), other$model = other.getModel(); return !((this$model == null) ? (other$model != null) : !this$model.equals(other$model)); } protected boolean canEqual(Object other) { return other instanceof CodeReq; } public int hashCode() {  int  result = 1; Object $comment = getComment(); result = result * 59 + (($comment == null) ? 43 : $comment.hashCode()); Object $model = getModel(); return result * 59 + (($model == null) ? 43 : $model.hashCode()); } public String toString() { return "CodeReq(comment=" + getComment() + ", model=" + getModel() + ")"; }
/* 15 */   public static CodeReqBuilder builder() { return new CodeReqBuilder(); } public static class CodeReqBuilder { private String comment; public CodeReqBuilder comment(String comment) { this.comment = comment; return this; } private String model; public CodeReqBuilder model(String model) { this.model = model; return this; } public CodeReq build() { return new CodeReq(this.comment, this.model); } public String toString() { return "CodeReq.CodeReqBuilder(comment=" + this.comment + ", model=" + this.model + ")"; }
       }
    public String getComment() {
/* 18 */     return this.comment;
    } public String getModel() {
/* 20 */     return this.model;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/CodeReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */