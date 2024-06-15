  package run.mone.m78.api.bo.table;





  public class M78ColumnInfoBuilder
  {
    private String name;
    private String desc;
    private String type;
    private Boolean necessary;
    private Boolean primaryKey;

    public M78ColumnInfoBuilder name(String name) {
/* 16 */     this.name = name; return this; } public M78ColumnInfoBuilder desc(String desc) { this.desc = desc; return this; } public M78ColumnInfoBuilder type(String type) { this.type = type; return this; } public M78ColumnInfoBuilder necessary(Boolean necessary) { this.necessary = necessary; return this; } public M78ColumnInfoBuilder primaryKey(Boolean primaryKey) { this.primaryKey = primaryKey; return this; } public M78ColumnInfo build() { return new M78ColumnInfo(this.name, this.desc, this.type, this.necessary, this.primaryKey); } public String toString() { return "M78ColumnInfo.M78ColumnInfoBuilder(name=" + this.name + ", desc=" + this.desc + ", type=" + this.type + ", necessary=" + this.necessary + ", primaryKey=" + this.primaryKey + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/M78ColumnInfo$M78ColumnInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */