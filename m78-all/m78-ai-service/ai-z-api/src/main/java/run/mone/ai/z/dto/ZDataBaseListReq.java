package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;

public class ZDataBaseListReq implements Serializable {
    @HttpApiDocClassDefine(value = "type", required = false, description = "类型", defaultValue = "")
    private Integer type;
    @HttpApiDocClassDefine(value = "info", required = false, description = "信息", defaultValue = "")
    private String info;
    @HttpApiDocClassDefine(value = "name", required = false, description = "名称", defaultValue = "")
    private String name;
    @HttpApiDocClassDefine(value = "structure", required = false, description = "数据结构", defaultValue = "")
    private Integer structure;
    @HttpApiDocClassDefine(value = "collectionOnly", required = false, description = "只包含收藏", defaultValue = "")
    private Boolean collectionOnly;

    /*  8 */
    public void setType(Integer type) {
        this.type = type;
    }

    @HttpApiDocClassDefine(value = "createOnly", required = false, description = "只包含创建", defaultValue = "")
    private Boolean createOnly;
    @HttpApiDocClassDefine(value = "pageNum", required = true, description = "分页", defaultValue = "")
    private Integer pageNum;
    @HttpApiDocClassDefine(value = "pageSize", required = true, description = "分页", defaultValue = "")
    private Integer pageSize;
    @HttpApiDocClassDefine(value = "tag", required = false, description = "标签", defaultValue = "")
    private Long tags;
    @HttpApiDocClassDefine(value = "token", required = false, description = "token", defaultValue = "")
    private String token;
    @HttpApiDocClassDefine(value = "sortByUsedTimes", required = false, description = "sortByUsedTimes", defaultValue = "")
    private boolean sortByUsedTimes;

    public void setInfo(String info) {
        this.info = info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStructure(Integer structure) {
        this.structure = structure;
    }

    public void setCollectionOnly(Boolean collectionOnly) {
        this.collectionOnly = collectionOnly;
    }

    public void setCreateOnly(Boolean createOnly) {
        this.createOnly = createOnly;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTags(Long tags) {
        this.tags = tags;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setSortByUsedTimes(boolean sortByUsedTimes) {
        this.sortByUsedTimes = sortByUsedTimes;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZDataBaseListReq)) return false;
        ZDataBaseListReq other = (ZDataBaseListReq) o;
        if (!other.canEqual(this)) return false;
        if (isSortByUsedTimes() != other.isSortByUsedTimes()) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$structure = getStructure(), other$structure = other.getStructure();
        if ((this$structure == null) ? (other$structure != null) : !this$structure.equals(other$structure))
            return false;
        Object this$collectionOnly = getCollectionOnly(), other$collectionOnly = other.getCollectionOnly();
        if ((this$collectionOnly == null) ? (other$collectionOnly != null) : !this$collectionOnly.equals(other$collectionOnly))
            return false;
        Object this$createOnly = getCreateOnly(), other$createOnly = other.getCreateOnly();
        if ((this$createOnly == null) ? (other$createOnly != null) : !this$createOnly.equals(other$createOnly))
            return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;
        Object this$tags = getTags(), other$tags = other.getTags();
        if ((this$tags == null) ? (other$tags != null) : !this$tags.equals(other$tags)) return false;
        Object this$info = getInfo(), other$info = other.getInfo();
        if ((this$info == null) ? (other$info != null) : !this$info.equals(other$info)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$token = getToken(), other$token = other.getToken();
        return !((this$token == null) ? (other$token != null) : !this$token.equals(other$token));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZDataBaseListReq;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + (isSortByUsedTimes() ? 79 : 97);
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $structure = getStructure();
        result = result * 59 + (($structure == null) ? 43 : $structure.hashCode());
        Object $collectionOnly = getCollectionOnly();
        result = result * 59 + (($collectionOnly == null) ? 43 : $collectionOnly.hashCode());
        Object $createOnly = getCreateOnly();
        result = result * 59 + (($createOnly == null) ? 43 : $createOnly.hashCode());
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $tags = getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        Object $info = getInfo();
        result = result * 59 + (($info == null) ? 43 : $info.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $token = getToken();
        return result * 59 + (($token == null) ? 43 : $token.hashCode());
    }

    public String toString() {
        return "ZDataBaseListReq(type=" + getType() + ", info=" + getInfo() + ", name=" + getName() + ", structure=" + getStructure() + ", collectionOnly=" + getCollectionOnly() + ", createOnly=" + getCreateOnly() + ", pageNum=" + getPageNum() + ", pageSize=" + getPageSize() + ", tags=" + getTags() + ", token=" + getToken() + ", sortByUsedTimes=" + isSortByUsedTimes() + ")";
    }

    public Integer getType() {
        /* 11 */
        return this.type;
    }

    public String getInfo() {
        /* 13 */
        return this.info;
    }

    public String getName() {
        /* 15 */
        return this.name;
    }

    public Integer getStructure() {
        /* 17 */
        return this.structure;
    }

    public Boolean getCollectionOnly() {
        /* 19 */
        return this.collectionOnly;
    }

    public Boolean getCreateOnly() {
        /* 21 */
        return this.createOnly;
    }

    public Integer getPageNum() {
        /* 23 */
        return this.pageNum;
    }

    public Integer getPageSize() {
        /* 25 */
        return this.pageSize;
    }

    public Long getTags() {
        /* 27 */
        return this.tags;
    }

    public String getToken() {
        /* 29 */
        return this.token;
    }

    public boolean isSortByUsedTimes() {
        /* 31 */
        return this.sortByUsedTimes;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZDataBaseListReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */