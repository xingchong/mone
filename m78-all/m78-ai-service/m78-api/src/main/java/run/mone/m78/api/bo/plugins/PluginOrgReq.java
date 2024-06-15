package run.mone.m78.api.bo.plugins;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

public class PluginOrgReq {
    @HttpApiDocClassDefine(value = "id", required = false, description = "插件id", defaultValue = "")
    private Long id;
    @HttpApiDocClassDefine(value = "workspaceId", required = false, description = "插件所属workspaceId", defaultValue = "")
    private Long workspaceId;
    @HttpApiDocClassDefine(value = "name", required = false, description = "插件名称", defaultValue = "")
    private String name;
    @HttpApiDocClassDefine(value = "categoryId", required = false, description = "插件类型id", defaultValue = "")
    private String categoryId;
    @HttpApiDocClassDefine(value = "userName", required = false, description = "插件用户名", defaultValue = "")
    private String userName;
    @HttpApiDocClassDefine(value = "pageSize", required = false, description = "页大小", defaultValue = "")
    private Integer pageSize;

    /* 14 */
    public PluginOrgReq(Long id, Long workspaceId, String name, String categoryId, String userName, Integer pageSize, Integer pageNum, String scope, String order, boolean orgOnly, Integer status, Integer subStatus) {
        this.id = id;
        this.workspaceId = workspaceId;
        this.name = name;
        this.categoryId = categoryId;
        this.userName = userName;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.scope = scope;
        this.order = order;
        this.orgOnly = orgOnly;
        this.status = status;
        this.subStatus = subStatus;
    }

    @HttpApiDocClassDefine(value = "pageNum", required = false, description = "页码", defaultValue = "")
    private Integer pageNum;
    @HttpApiDocClassDefine(value = "scope", required = false, description = "显示范围", defaultValue = "all/mine/favorite")
    private String scope;
    @HttpApiDocClassDefine(value = "order", required = false, description = "排序", defaultValue = "popular/latest, now only create_time/modify_time")
    private String order;
    @HttpApiDocClassDefine(value = "orgOnly", required = false, description = "是否只展示插件(不返回插件下的组件列表)", defaultValue = "false")
    private boolean orgOnly;
    @HttpApiDocClassDefine(value = "status", required = false, description = "插件发布状态，0(已发布)，1(未发布)", defaultValue = "1")
    private Integer status;
    @HttpApiDocClassDefine(value = "subStatus", required = false, description = "插件下组件启用状态，0(启用)，1(未启用)", defaultValue = "0")
    /* 15 */ private Integer subStatus;

    public PluginOrgReq() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setOrgOnly(boolean orgOnly) {
        this.orgOnly = orgOnly;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setSubStatus(Integer subStatus) {
        this.subStatus = subStatus;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PluginOrgReq)) return false;
        PluginOrgReq other = (PluginOrgReq) o;
        if (!other.canEqual(this)) return false;
        if (isOrgOnly() != other.isOrgOnly()) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$workspaceId = getWorkspaceId(), other$workspaceId = other.getWorkspaceId();
        if ((this$workspaceId == null) ? (other$workspaceId != null) : !this$workspaceId.equals(other$workspaceId))
            return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;
        Object this$pageNum = getPageNum(), other$pageNum = other.getPageNum();
        if ((this$pageNum == null) ? (other$pageNum != null) : !this$pageNum.equals(other$pageNum)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$subStatus = getSubStatus(), other$subStatus = other.getSubStatus();
        if ((this$subStatus == null) ? (other$subStatus != null) : !this$subStatus.equals(other$subStatus))
            return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$categoryId = getCategoryId(), other$categoryId = other.getCategoryId();
        if ((this$categoryId == null) ? (other$categoryId != null) : !this$categoryId.equals(other$categoryId))
            return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$scope = getScope(), other$scope = other.getScope();
        if ((this$scope == null) ? (other$scope != null) : !this$scope.equals(other$scope)) return false;
        Object this$order = getOrder(), other$order = other.getOrder();
        return !((this$order == null) ? (other$order != null) : !this$order.equals(other$order));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PluginOrgReq;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + (isOrgOnly() ? 79 : 97);
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $workspaceId = getWorkspaceId();
        result = result * 59 + (($workspaceId == null) ? 43 : $workspaceId.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $pageNum = getPageNum();
        result = result * 59 + (($pageNum == null) ? 43 : $pageNum.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $subStatus = getSubStatus();
        result = result * 59 + (($subStatus == null) ? 43 : $subStatus.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $categoryId = getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $scope = getScope();
        result = result * 59 + (($scope == null) ? 43 : $scope.hashCode());
        Object $order = getOrder();
        return result * 59 + (($order == null) ? 43 : $order.hashCode());
    }

    public String toString() {
        return "PluginOrgReq(id=" + getId() + ", workspaceId=" + getWorkspaceId() + ", name=" + getName() + ", categoryId=" + getCategoryId() + ", userName=" + getUserName() + ", pageSize=" + getPageSize() + ", pageNum=" + getPageNum() + ", scope=" + getScope() + ", order=" + getOrder() + ", orgOnly=" + isOrgOnly() + ", status=" + getStatus() + ", subStatus=" + getSubStatus() + ")";
    }

    /* 16 */
    public static PluginOrgReqBuilder builder() {
        return new PluginOrgReqBuilder();
    }

    public static class PluginOrgReqBuilder {
        private Long id;
        private Long workspaceId;
        private String name;
        private String categoryId;
        private String userName;
        private Integer pageSize;
        private Integer pageNum;
        private String scope;
        private String order;
        private boolean orgOnly;
        private Integer status;
        private Integer subStatus;

        public PluginOrgReqBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PluginOrgReqBuilder workspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public PluginOrgReqBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PluginOrgReqBuilder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public PluginOrgReqBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PluginOrgReqBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public PluginOrgReqBuilder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public PluginOrgReqBuilder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public PluginOrgReqBuilder order(String order) {
            this.order = order;
            return this;
        }

        public PluginOrgReqBuilder orgOnly(boolean orgOnly) {
            this.orgOnly = orgOnly;
            return this;
        }

        public PluginOrgReqBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public PluginOrgReqBuilder subStatus(Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public PluginOrgReq build() {
            return new PluginOrgReq(this.id, this.workspaceId, this.name, this.categoryId, this.userName, this.pageSize, this.pageNum, this.scope, this.order, this.orgOnly, this.status, this.subStatus);
        }

        public String toString() {
            return "PluginOrgReq.PluginOrgReqBuilder(id=" + this.id + ", workspaceId=" + this.workspaceId + ", name=" + this.name + ", categoryId=" + this.categoryId + ", userName=" + this.userName + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ", scope=" + this.scope + ", order=" + this.order + ", orgOnly=" + this.orgOnly + ", status=" + this.status + ", subStatus=" + this.subStatus + ")";
        }
    }

    public Long getId() {
        /* 20 */
        return this.id;
    }

    public Long getWorkspaceId() {
        /* 23 */
        return this.workspaceId;
    }

    public String getName() {
        /* 26 */
        return this.name;
    }

    public String getCategoryId() {
        /* 29 */
        return this.categoryId;
    }

    public String getUserName() {
        /* 32 */
        return this.userName;
    }

    public Integer getPageSize() {
        /* 35 */
        return this.pageSize;
    }

    public Integer getPageNum() {
        /* 38 */
        return this.pageNum;
    }

    public String getScope() {
        /* 41 */
        return this.scope;
    }

    public String getOrder() {
        /* 44 */
        return this.order;
    }

    public boolean isOrgOnly() {
        /* 47 */
        return this.orgOnly;
    }

    public Integer getStatus() {
        /* 50 */
        return this.status;
    }

    public Integer getSubStatus() {
        /* 53 */
        return this.subStatus;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/PluginOrgReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */