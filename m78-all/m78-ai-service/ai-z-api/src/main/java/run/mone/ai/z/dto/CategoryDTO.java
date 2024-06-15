package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;

public class CategoryDTO implements Serializable {
    @HttpApiDocClassDefine(value = "id", description = "id")
    private Long id;
    @HttpApiDocClassDefine(value = "name", description = "类目名称")
    private String name;

    public void setId(Long id) {
        /* 14 */
        this.id = id;
    }

    @HttpApiDocClassDefine(value = "creator", description = "创建者")
    private String creator;
    @HttpApiDocClassDefine(value = "level", description = "层级")
    private Integer level;
    @HttpApiDocClassDefine(value = "childList", description = "子类目")
    private List<CategoryDTO> childList;

    public void setName(String name) {
        this.name = name;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setChildList(List<CategoryDTO> childList) {
        this.childList = childList;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryDTO)) return false;
        CategoryDTO other = (CategoryDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$level = getLevel(), other$level = other.getLevel();
        if ((this$level == null) ? (other$level != null) : !this$level.equals(other$level)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$childList = (Object) getChildList(), other$childList = (Object) other.getChildList();
        return !((this$childList == null) ? (other$childList != null) : !this$childList.equals(other$childList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CategoryDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $level = getLevel();
        result = result * 59 + (($level == null) ? 43 : $level.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $childList = (Object) getChildList();
        return result * 59 + (($childList == null) ? 43 : $childList.hashCode());
    }

    public String toString() {
        return "CategoryDTO(id=" + getId() + ", name=" + getName() + ", creator=" + getCreator() + ", level=" + getLevel() + ", childList=" + getChildList() + ")";
    }


    public Long getId() {
        /* 18 */
        return this.id;
    }

    public String getName() {
        /* 21 */
        return this.name;
    }

    public String getCreator() {
        /* 24 */
        return this.creator;
    }

    public Integer getLevel() {
        /* 27 */
        return this.level;
    }

    public List<CategoryDTO> getChildList() {
        /* 30 */
        return this.childList;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/CategoryDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */