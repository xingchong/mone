package run.mone.m78.api.bo.plugins;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;

public class PluginReq implements Serializable {
    private static final long serialVersionUID = 1572696491548329920L;
    @HttpApiDocClassDefine(value = "id", required = false, description = "组件id", defaultValue = "")
    private Long id;
    @HttpApiDocClassDefine(value = "orgId", required = false, description = "插件id", defaultValue = "")
    private Long orgId;
    @HttpApiDocClassDefine(value = "workspaceId", required = false, description = "组件所属空间id", defaultValue = "")
    private Long workspaceId;
    @HttpApiDocClassDefine(value = "name", required = false, description = "组件名称", defaultValue = "")
    private String name;
    @HttpApiDocClassDefine(value = "categoryName", required = false, description = "类型名称", defaultValue = "")
    private String categoryName;
    @HttpApiDocClassDefine(value = "categoryId", required = false, description = "类型id", defaultValue = "")
    private Long categoryId;

    /* 16 */
    public PluginReq(Long id, Long orgId, Long workspaceId, String name, String categoryName, Long categoryId, String userName, Integer type, String scale, String order, Integer pageSize, Integer pageNum, Integer status) {
        this.id = id;
        this.orgId = orgId;
        this.workspaceId = workspaceId;
        this.name = name;
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.userName = userName;
        this.type = type;
        this.scale = scale;
        this.order = order;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.status = status;
    }

    @HttpApiDocClassDefine(value = "userName", required = false, description = "用户名", defaultValue = "")
    private String userName;
    @HttpApiDocClassDefine(value = "type", required = false, description = "内置类型名", defaultValue = "")
    private Integer type;
    @HttpApiDocClassDefine(value = "scale", required = false, description = "范围, 全部/我的/收藏 (all/mine/favorite)", defaultValue = "all")
    private String scale;
    @HttpApiDocClassDefine(value = "order", required = false, description = "排序, 最受欢迎/最近发布 (favorite/latested)", defaultValue = "lasted")
    private String order;
    @HttpApiDocClassDefine(value = "pageSize", required = false, description = "页大小", defaultValue = "")
    private Integer pageSize;
    @HttpApiDocClassDefine(value = "pageNum", required = false, description = "页码", defaultValue = "")
    private Integer pageNum;
    @HttpApiDocClassDefine(value = "status", required = false, description = "插件下组件启用状态，0(启用)，1(未启用)", defaultValue = "0")
    /* 17 */ private Integer status;

    public PluginReq() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PluginReq)) return false;
        PluginReq other = (PluginReq) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$orgId = getOrgId(), other$orgId = other.getOrgId();
        if ((this$orgId == null) ? (other$orgId != null) : !this$orgId.equals(other$orgId)) return false;
        Object this$workspaceId = getWorkspaceId(), other$workspaceId = other.getWorkspaceId();
        if ((this$workspaceId == null) ? (other$workspaceId != null) : !this$workspaceId.equals(other$workspaceId))
            return false;
        Object this$categoryId = getCategoryId(), other$categoryId = other.getCategoryId();
        if ((this$categoryId == null) ? (other$categoryId != null) : !this$categoryId.equals(other$categoryId))
            return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$categoryName = getCategoryName(), other$categoryName = other.getCategoryName();
        if ((this$categoryName == null) ? (other$categoryName != null) : !this$categoryName.equals(other$categoryName))
            return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$scale = getScale(), other$scale = other.getScale();
        if ((this$scale == null) ? (other$scale != null) : !this$scale.equals(other$scale)) return false;
        Object this$order = getOrder(), other$order = other.getOrder();
        return !((this$order == null) ? (other$order != null) : !this$order.equals(other$order));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PluginReq;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $orgId = getOrgId();
        result = result * 59 + (($orgId == null) ? 43 : $orgId.hashCode());
        Object $workspaceId = getWorkspaceId();
        result = result * 59 + (($workspaceId == null) ? 43 : $workspaceId.hashCode());
        Object $categoryId = getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $categoryName = getCategoryName();
        result = result * 59 + (($categoryName == null) ? 43 : $categoryName.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $scale = getScale();
        result = result * 59 + (($scale == null) ? 43 : $scale.hashCode());
        Object $order = getOrder();
        return result * 59 + (($order == null) ? 43 : $order.hashCode());
    }

    public String toString() {
        return "PluginReq(id=" + getId() + ", orgId=" + getOrgId() + ", workspaceId=" + getWorkspaceId() + ", name=" + getName() + ", categoryName=" + getCategoryName() + ", categoryId=" + getCategoryId() + ", userName=" + getUserName() + ", type=" + getType() + ", scale=" + getScale() + ", order=" + getOrder() + ", pageSize=" + getPageSize() + ", pageNum=" + getPageNum() + ", status=" + getStatus() + ")";
    }

    /* 18 */
    public static PluginReqBuilder builder() {
        return new PluginReqBuilder();
    }

    public static class PluginReqBuilder {
        private Long id;
        private Long orgId;
        private Long workspaceId;
        private String name;
        private String categoryName;
        private Long categoryId;
        private String userName;
        private Integer type;
        private String scale;
        private String order;
        private Integer pageSize;
        private Integer pageNum;
        private Integer status;

        public PluginReqBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PluginReqBuilder orgId(Long orgId) {
            this.orgId = orgId;
            return this;
        }

        public PluginReqBuilder workspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public PluginReqBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PluginReqBuilder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        public PluginReqBuilder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public PluginReqBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PluginReqBuilder type(Integer type) {
            this.type = type;
            return this;
        }

        public PluginReqBuilder scale(String scale) {
            this.scale = scale;
            return this;
        }

        public PluginReqBuilder order(String order) {
            this.order = order;
            return this;
        }

        public PluginReqBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public PluginReqBuilder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public PluginReqBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public PluginReq build() {
            return new PluginReq(this.id, this.orgId, this.workspaceId, this.name, this.categoryName, this.categoryId, this.userName, this.type, this.scale, this.order, this.pageSize, this.pageNum, this.status);
        }

        public String toString() {
            return "PluginReq.PluginReqBuilder(id=" + this.id + ", orgId=" + this.orgId + ", workspaceId=" + this.workspaceId + ", name=" + this.name + ", categoryName=" + this.categoryName + ", categoryId=" + this.categoryId + ", userName=" + this.userName + ", type=" + this.type + ", scale=" + this.scale + ", order=" + this.order + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", status=" + this.status + ")";
        }
    }


    public Long getId() {
        /* 24 */
        return this.id;
    }

    public Long getOrgId() {
        /* 27 */
        return this.orgId;
    }

    public Long getWorkspaceId() {
        /* 30 */
        return this.workspaceId;
    }

    public String getName() {
        /* 33 */
        return this.name;
    }

    public String getCategoryName() {
        /* 36 */
        return this.categoryName;
    }

    public Long getCategoryId() {
        /* 39 */
        return this.categoryId;
    }

    public String getUserName() {
        /* 42 */
        return this.userName;
    }

    public Integer getType() {
        /* 45 */
        return this.type;
    }

    public String getScale() {
        /* 48 */
        return this.scale;
    }

    public String getOrder() {
        /* 51 */
        return this.order;
    }

    public Integer getPageSize() {
        /* 54 */
        return this.pageSize;
    }

    public Integer getPageNum() {
        /* 57 */
        return this.pageNum;
    }

    public Integer getStatus() {
        /* 60 */
        return this.status;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/PluginReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */