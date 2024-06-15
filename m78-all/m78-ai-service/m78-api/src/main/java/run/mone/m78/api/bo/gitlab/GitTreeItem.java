  package run.mone.m78.api.bo.gitlab;

  import java.io.Serializable;











  public class GitTreeItem
    implements Serializable
  {
    private static final long serialVersionUID = 1L;
    private String id;
    private String parentId;
    private String mode;
    private String name;
    private String path;
    private String type;

    public void setId(String id) {
/* 27 */     this.id = id; } public void setParentId(String parentId) { this.parentId = parentId; } public void setMode(String mode) { this.mode = mode; } public void setName(String name) { this.name = name; } public void setPath(String path) { this.path = path; } public void setType(String type) { this.type = type; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof GitTreeItem)) return false;  GitTreeItem other = (GitTreeItem)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$parentId = getParentId(), other$parentId = other.getParentId(); if ((this$parentId == null) ? (other$parentId != null) : !this$parentId.equals(other$parentId)) return false;  Object this$mode = getMode(), other$mode = other.getMode(); if ((this$mode == null) ? (other$mode != null) : !this$mode.equals(other$mode)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$path = getPath(), other$path = other.getPath(); if ((this$path == null) ? (other$path != null) : !this$path.equals(other$path)) return false;  Object this$type = getType(), other$type = other.getType(); return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type)); } protected boolean canEqual(Object other) { return other instanceof GitTreeItem; } public int hashCode() {  int  result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $parentId = getParentId(); result = result * 59 + (($parentId == null) ? 43 : $parentId.hashCode()); Object $mode = getMode(); result = result * 59 + (($mode == null) ? 43 : $mode.hashCode()); Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $path = getPath(); result = result * 59 + (($path == null) ? 43 : $path.hashCode()); Object $type = getType(); return result * 59 + (($type == null) ? 43 : $type.hashCode()); } public String toString() { return "GitTreeItem(id=" + getId() + ", parentId=" + getParentId() + ", mode=" + getMode() + ", name=" + getName() + ", path=" + getPath() + ", type=" + getType() + ")"; }


    public String getId() {
/* 31 */     return this.id;
    } public String getParentId() {
/* 33 */     return this.parentId;
    } public String getMode() {
/* 35 */     return this.mode;
    } public String getName() {
/* 37 */     return this.name;
    } public String getPath() {
/* 39 */     return this.path;
    } public String getType() {
/* 41 */     return this.type;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/gitlab/GitTreeItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */