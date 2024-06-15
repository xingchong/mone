package run.mone.ai.z.dto.sensitiveword;

import java.io.Serializable;
import java.util.Date;

public class WordDto implements Serializable {
    private Long id;
    private String name;
    private Integer type;
    private String content;
    private Boolean available;

    /*  9 */
    public void setId(Long id) {
        this.id = id;
    }

    private Boolean isRegexMatch;
    private Boolean isCaseSensitive;
    private Boolean isDelete;
    private String creator;
    private Date createTime;
    private Date updateTime;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setIsRegexMatch(Boolean isRegexMatch) {
        this.isRegexMatch = isRegexMatch;
    }

    public void setIsCaseSensitive(Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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
        if (!(o instanceof WordDto)) return false;
        WordDto other = (WordDto) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$available = getAvailable(), other$available = other.getAvailable();
        if ((this$available == null) ? (other$available != null) : !this$available.equals(other$available))
            return false;
        Object this$isRegexMatch = getIsRegexMatch(), other$isRegexMatch = other.getIsRegexMatch();
        if ((this$isRegexMatch == null) ? (other$isRegexMatch != null) : !this$isRegexMatch.equals(other$isRegexMatch))
            return false;
        Object this$isCaseSensitive = getIsCaseSensitive(), other$isCaseSensitive = other.getIsCaseSensitive();
        if ((this$isCaseSensitive == null) ? (other$isCaseSensitive != null) : !this$isCaseSensitive.equals(other$isCaseSensitive))
            return false;
        Object this$isDelete = getIsDelete(), other$isDelete = other.getIsDelete();
        if ((this$isDelete == null) ? (other$isDelete != null) : !this$isDelete.equals(other$isDelete)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$content = getContent(), other$content = other.getContent();
        if ((this$content == null) ? (other$content != null) : !this$content.equals(other$content)) return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$updateTime = getUpdateTime(), other$updateTime = other.getUpdateTime();
        return !((this$updateTime == null) ? (other$updateTime != null) : !this$updateTime.equals(other$updateTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof WordDto;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $available = getAvailable();
        result = result * 59 + (($available == null) ? 43 : $available.hashCode());
        Object $isRegexMatch = getIsRegexMatch();
        result = result * 59 + (($isRegexMatch == null) ? 43 : $isRegexMatch.hashCode());
        Object $isCaseSensitive = getIsCaseSensitive();
        result = result * 59 + (($isCaseSensitive == null) ? 43 : $isCaseSensitive.hashCode());
        Object $isDelete = getIsDelete();
        result = result * 59 + (($isDelete == null) ? 43 : $isDelete.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $content = getContent();
        result = result * 59 + (($content == null) ? 43 : $content.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $updateTime = getUpdateTime();
        return result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
    }

    public String toString() {
        return "WordDto(id=" + getId() + ", name=" + getName() + ", type=" + getType() + ", content=" + getContent() + ", available=" + getAvailable() + ", isRegexMatch=" + getIsRegexMatch() + ", isCaseSensitive=" + getIsCaseSensitive() + ", isDelete=" + getIsDelete() + ", creator=" + getCreator() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
    }

    public Long getId() {
        /* 11 */
        return this.id;
    }

    public String getName() {
        /* 13 */
        return this.name;
    }


    public Integer getType() {
        /* 18 */
        return this.type;
    }

    public String getContent() {
        /* 21 */
        return this.content;
    }

    public Boolean getAvailable() {
        /* 24 */
        return this.available;
    }

    public Boolean getIsRegexMatch() {
        /* 27 */
        return this.isRegexMatch;
    }

    public Boolean getIsCaseSensitive() {
        /* 30 */
        return this.isCaseSensitive;
    }

    public Boolean getIsDelete() {
        /* 32 */
        return this.isDelete;
    }

    public String getCreator() {
        /* 34 */
        return this.creator;
    }

    public Date getCreateTime() {
        /* 36 */
        return this.createTime;
    }

    public Date getUpdateTime() {
        /* 38 */
        return this.updateTime;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/sensitiveword/WordDto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */