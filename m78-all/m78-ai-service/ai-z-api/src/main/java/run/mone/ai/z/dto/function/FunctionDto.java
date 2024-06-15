package run.mone.ai.z.dto.function;

import java.io.Serializable;
import java.util.Date;

public class FunctionDto implements Serializable {
    private Long id;
    private String name;
    private String metadata;

    /*  8 */
    public void setId(Long id) {
        this.id = id;
    }

    private String scriptContent;
    private String creator;
    private Date createTime;
    private Date updateTime;

    public void setName(String name) {
        this.name = name;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public void setScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FunctionDto)) return false;
        FunctionDto other = (FunctionDto) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$metadata = getMetadata(), other$metadata = other.getMetadata();
        if ((this$metadata == null) ? (other$metadata != null) : !this$metadata.equals(other$metadata)) return false;
        Object this$scriptContent = getScriptContent(), other$scriptContent = other.getScriptContent();
        if ((this$scriptContent == null) ? (other$scriptContent != null) : !this$scriptContent.equals(other$scriptContent))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$updateTime = getUpdateTime(), other$updateTime = other.getUpdateTime();
        return !((this$updateTime == null) ? (other$updateTime != null) : !this$updateTime.equals(other$updateTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FunctionDto;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $metadata = getMetadata();
        result = result * 59 + (($metadata == null) ? 43 : $metadata.hashCode());
        Object $scriptContent = getScriptContent();
        result = result * 59 + (($scriptContent == null) ? 43 : $scriptContent.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $updateTime = getUpdateTime();
        return result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
    }

    public String toString() {
        return "FunctionDto(id=" + getId() + ", name=" + getName() + ", metadata=" + getMetadata() + ", scriptContent=" + getScriptContent() + ", creator=" + getCreator() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
    }

    public Long getId() {
        /* 10 */
        return this.id;
    }

    public String getName() {
        /* 12 */
        return this.name;
    }

    public String getMetadata() {
        /* 14 */
        return this.metadata;
    }

    public String getScriptContent() {
        /* 16 */
        return this.scriptContent;
    }

    public String getCreator() {
        /* 18 */
        return this.creator;
    }

    public Date getCreateTime() {
        /* 20 */
        return this.createTime;
    }

    public Date getUpdateTime() {
        /* 22 */
        return this.updateTime;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/function/FunctionDto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */