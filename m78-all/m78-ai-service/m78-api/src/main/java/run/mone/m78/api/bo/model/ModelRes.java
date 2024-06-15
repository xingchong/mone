  package run.mone.m78.api.bo.model;




  public class ModelRes
  {
    private String name;
    private String cname;

    public void setName(String name) {
/* 12 */     this.name = name; } public void setCname(String cname) { this.cname = cname; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ModelRes)) return false;  ModelRes other = (ModelRes)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$cname = getCname(), other$cname = other.getCname(); return !((this$cname == null) ? (other$cname != null) : !this$cname.equals(other$cname)); } protected boolean canEqual(Object other) { return other instanceof ModelRes; } public int hashCode() {  int  result = 1; Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $cname = getCname(); return result * 59 + (($cname == null) ? 43 : $cname.hashCode()); } public String toString() { return "ModelRes(name=" + getName() + ", cname=" + getCname() + ")"; }
/* 13 */   public static ModelResBuilder builder() { return new ModelResBuilder(); } public static class ModelResBuilder { private String name; public ModelResBuilder name(String name) { this.name = name; return this; } private String cname; public ModelResBuilder cname(String cname) { this.cname = cname; return this; } public ModelRes build() { return new ModelRes(this.name, this.cname); } public String toString() { return "ModelRes.ModelResBuilder(name=" + this.name + ", cname=" + this.cname + ")"; } } public ModelRes(String name, String cname) {
/* 14 */     this.name = name; this.cname = cname;
    }
    public ModelRes() {}
    public String getName() {
/* 18 */     return this.name;
    } public String getCname() {
/* 20 */     return this.cname;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/model/ModelRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */