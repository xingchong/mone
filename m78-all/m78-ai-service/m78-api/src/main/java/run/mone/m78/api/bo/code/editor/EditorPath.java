package run.mone.m78.api.bo.code.editor;

import java.util.List;

public class EditorPath {
    private boolean dir;
    private String name;
    private List<EditorPath> dirChild;

    /* 10 */
    public void setDir(boolean dir) {
        this.dir = dir;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirChild(List<EditorPath> dirChild) {
        this.dirChild = dirChild;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EditorPath)) return false;
        EditorPath other = (EditorPath) o;
        if (!other.canEqual(this)) return false;
        if (isDir() != other.isDir()) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$dirChild = (Object) getDirChild(), other$dirChild = (Object) other.getDirChild();
        return !((this$dirChild == null) ? (other$dirChild != null) : !this$dirChild.equals(other$dirChild));
    }

    protected boolean canEqual(Object other) {
        return other instanceof EditorPath;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + (isDir() ? 79 : 97);
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $dirChild = (Object) getDirChild();
        return result * 59 + (($dirChild == null) ? 43 : $dirChild.hashCode());
    }

    public String toString() {
        return "EditorPath(dir=" + isDir() + ", name=" + getName() + ", dirChild=" + getDirChild() + ")";
    }

    public EditorPath() {
    }

    /* 12 */
    public EditorPath(boolean dir, String name, List<EditorPath> dirChild) {
        this.dir = dir;
        this.name = name;
        this.dirChild = dirChild;
    }

    /* 13 */
    public static EditorPathBuilder builder() {
        return new EditorPathBuilder();
    }

    public static class EditorPathBuilder {
        private boolean dir;

        public EditorPathBuilder dir(boolean dir) {
            this.dir = dir;
            return this;
        }

        private String name;
        private List<EditorPath> dirChild;

        public EditorPathBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EditorPathBuilder dirChild(List<EditorPath> dirChild) {
            this.dirChild = dirChild;
            return this;
        }

        public EditorPath build() {
            return new EditorPath(this.dir, this.name, this.dirChild);
        }

        public String toString() {
            return "EditorPath.EditorPathBuilder(dir=" + this.dir + ", name=" + this.name + ", dirChild=" + this.dirChild + ")";
        }
    }

    /* 15 */
    public boolean isDir() {
        return this.dir;
    }

    /* 16 */
    public String getName() {
        return this.name;
    }

    public List<EditorPath> getDirChild() {
        /* 17 */
        return this.dirChild;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/editor/EditorPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */