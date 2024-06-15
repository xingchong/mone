  package run.mone.m78.api.bo.code.editor;
  
  import java.util.List;
  
  
  public class EditorPathBuilder
  {
    private boolean dir;
    private String name;
    private List<EditorPath> dirChild;
    
    public EditorPathBuilder dir(boolean dir) {
/* 13 */     this.dir = dir; return this; } public EditorPathBuilder name(String name) { this.name = name; return this; } public EditorPathBuilder dirChild(List<EditorPath> dirChild) { this.dirChild = dirChild; return this; } public EditorPath build() { return new EditorPath(this.dir, this.name, this.dirChild); } public String toString() { return "EditorPath.EditorPathBuilder(dir=" + this.dir + ", name=" + this.name + ", dirChild=" + this.dirChild + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/EditorPath$EditorPathBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */