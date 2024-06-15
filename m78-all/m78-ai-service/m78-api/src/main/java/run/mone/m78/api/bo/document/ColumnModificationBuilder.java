  package run.mone.m78.api.bo.document;









  public class ColumnModificationBuilder
  {
    private String column;
    private String columnComment;

    public ColumnModificationBuilder column(String column) {
/* 17 */     this.column = column; return this; } public ColumnModificationBuilder columnComment(String columnComment) { this.columnComment = columnComment; return this; } public ColumnModification build() { return new ColumnModification(this.column, this.columnComment); } public String toString() { return "ColumnModification.ColumnModificationBuilder(column=" + this.column + ", columnComment=" + this.columnComment + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/ColumnModification$ColumnModificationBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */