  package run.mone.m78.api.bo.document;
  
  
  
  
  
  
  public class ColumnModification
  {
    private String column;
    private String columnComment;
    
    public ColumnModification() {}
    
    public ColumnModification(String column, String columnComment) {
/* 16 */     this.column = column; this.columnComment = columnComment;
/* 17 */   } public static ColumnModificationBuilder builder() { return new ColumnModificationBuilder(); } public static class ColumnModificationBuilder { private String column; public ColumnModificationBuilder column(String column) { this.column = column; return this; } private String columnComment; public ColumnModificationBuilder columnComment(String columnComment) { this.columnComment = columnComment; return this; } public ColumnModification build() { return new ColumnModification(this.column, this.columnComment); } public String toString() { return "ColumnModification.ColumnModificationBuilder(column=" + this.column + ", columnComment=" + this.columnComment + ")"; } }
/* 18 */   public void setColumn(String column) { this.column = column; } public void setColumnComment(String columnComment) { this.columnComment = columnComment; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ColumnModification)) return false;  ColumnModification other = (ColumnModification)o; if (!other.canEqual(this)) return false;  Object this$column = getColumn(), other$column = other.getColumn(); if ((this$column == null) ? (other$column != null) : !this$column.equals(other$column)) return false;  Object this$columnComment = getColumnComment(), other$columnComment = other.getColumnComment(); return !((this$columnComment == null) ? (other$columnComment != null) : !this$columnComment.equals(other$columnComment)); } protected boolean canEqual(Object other) { return other instanceof ColumnModification; } public int hashCode() {  int  result = 1; Object $column = getColumn(); result = result * 59 + (($column == null) ? 43 : $column.hashCode()); Object $columnComment = getColumnComment(); return result * 59 + (($columnComment == null) ? 43 : $columnComment.hashCode()); } public String toString() { return "ColumnModification(column=" + getColumn() + ", columnComment=" + getColumnComment() + ")"; }
    
    public String getColumn() {
/* 21 */     return this.column;
    } public String getColumnComment() {
/* 23 */     return this.columnComment;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/ColumnModification.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */