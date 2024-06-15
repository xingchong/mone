  package run.mone.m78.api.bo.model;
  
  
  
  
  
  public class ModelResBuilder
  {
    private String name;
    private String cname;
    
    public ModelResBuilder name(String name) {
/* 13 */     this.name = name; return this; } public ModelResBuilder cname(String cname) { this.cname = cname; return this; } public ModelRes build() { return new ModelRes(this.name, this.cname); } public String toString() { return "ModelRes.ModelResBuilder(name=" + this.name + ", cname=" + this.cname + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/model/ModelRes$ModelResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */