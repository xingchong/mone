package run.mone.m78.api.bo.feature.router;


import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.Map;

public class FeatureRouterReq implements Serializable {
    private static final long serialVersionUID = 5034370673249708885L;
    @HttpApiDocClassDefine(value = "id", required = false, description = "FeatureRouter的Id", defaultValue = "")
    private Long id;
    @HttpApiDocClassDefine(value = "labelId", required = true, description = "关联的chatInfo的id", defaultValue = "")
    private Long labelId;
    @HttpApiDocClassDefine(value = "datasourceId", required = true, description = "使用数据源管理时传递数据源id; 文档上传场景中置空", defaultValue = "")
    private Long datasourceId;
    @HttpApiDocClassDefine(value = "name", required = true, description = "featureRouter的name", defaultValue = "")
    private String name;
    @HttpApiDocClassDefine(value = "userName", required = false, description = "userName", defaultValue = "")
    private String userName;

    /* 17 */
    public FeatureRouterReq(Long id, Long labelId, Long datasourceId, String name, String userName, Map<String, Object> reqData, Integer type, Integer routerType, Integer page, Integer pageSize, String content) {
        this.id = id;
        this.labelId = labelId;
        this.datasourceId = datasourceId;
        this.name = name;
        this.userName = userName;
        this.reqData = reqData;
        this.type = type;
        this.routerType = routerType;
        this.page = page;
        this.pageSize = pageSize;
        this.content = content;
    }

    @HttpApiDocClassDefine(value = "reqData", required = false, description = "导出http调用时，请求的参数", defaultValue = "")
    private Map<String, Object> reqData;
    @HttpApiDocClassDefine(value = "type", required = false, description = "类型, 0: sql, 1: script", defaultValue = "0")
    private Integer type;
    @HttpApiDocClassDefine(value = "routerType", required = false, description = "router类型, 0: ChatBased, 1: Probot", defaultValue = "0")
    private Integer routerType;
    @HttpApiDocClassDefine(value = "page", required = false, description = "pageNum, 和pageSize需同时传递，否则查询全量", defaultValue = "")
    private Integer page;
    @HttpApiDocClassDefine(value = "pageSize", required = false, description = "pageSize, 和pageSize需同时传递，否则查询全量", defaultValue = "")
    private Integer pageSize;
    @HttpApiDocClassDefine(value = "content", required = false, description = "更新关联的mappingContent, 注意为null时不更新", defaultValue = "")
    /* 18 */ private String content;

    public FeatureRouterReq() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public void setDatasourceId(Long datasourceId) {
        this.datasourceId = datasourceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setReqData(Map<String, Object> reqData) {
        this.reqData = reqData;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setRouterType(Integer routerType) {
        this.routerType = routerType;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FeatureRouterReq)) return false;
        FeatureRouterReq other = (FeatureRouterReq) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$labelId = getLabelId(), other$labelId = other.getLabelId();
        if ((this$labelId == null) ? (other$labelId != null) : !this$labelId.equals(other$labelId)) return false;
        Object this$datasourceId = getDatasourceId(), other$datasourceId = other.getDatasourceId();
        if ((this$datasourceId == null) ? (other$datasourceId != null) : !this$datasourceId.equals(other$datasourceId))
            return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$routerType = getRouterType(), other$routerType = other.getRouterType();
        if ((this$routerType == null) ? (other$routerType != null) : !this$routerType.equals(other$routerType))
            return false;
        Object this$page = getPage(), other$page = other.getPage();
        if ((this$page == null) ? (other$page != null) : !this$page.equals(other$page)) return false;
        Object this$pageSize = getPageSize(), other$pageSize = other.getPageSize();
        if ((this$pageSize == null) ? (other$pageSize != null) : !this$pageSize.equals(other$pageSize)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$reqData = (Object) getReqData(), other$reqData = (Object) other.getReqData();
        if ((this$reqData == null) ? (other$reqData != null) : !this$reqData.equals(other$reqData)) return false;
        Object this$content = getContent(), other$content = other.getContent();
        return !((this$content == null) ? (other$content != null) : !this$content.equals(other$content));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FeatureRouterReq;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $labelId = getLabelId();
        result = result * 59 + (($labelId == null) ? 43 : $labelId.hashCode());
        Object $datasourceId = getDatasourceId();
        result = result * 59 + (($datasourceId == null) ? 43 : $datasourceId.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $routerType = getRouterType();
        result = result * 59 + (($routerType == null) ? 43 : $routerType.hashCode());
        Object $page = getPage();
        result = result * 59 + (($page == null) ? 43 : $page.hashCode());
        Object $pageSize = getPageSize();
        result = result * 59 + (($pageSize == null) ? 43 : $pageSize.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $reqData = (Object) getReqData();
        result = result * 59 + (($reqData == null) ? 43 : $reqData.hashCode());
        Object $content = getContent();
        return result * 59 + (($content == null) ? 43 : $content.hashCode());
    }

    public String toString() {
        return "FeatureRouterReq(id=" + getId() + ", labelId=" + getLabelId() + ", datasourceId=" + getDatasourceId() + ", name=" + getName() + ", userName=" + getUserName() + ", reqData=" + getReqData() + ", type=" + getType() + ", routerType=" + getRouterType() + ", page=" + getPage() + ", pageSize=" + getPageSize() + ", content=" + getContent() + ")";
    }

    /* 19 */
    public static FeatureRouterReqBuilder builder() {
        return new FeatureRouterReqBuilder();
    }

    public static class FeatureRouterReqBuilder {
        private Long id;
        private Long labelId;
        private Long datasourceId;
        private String name;
        private String userName;
        private Map<String, Object> reqData;
        private Integer type;
        private Integer routerType;
        private Integer page;
        private Integer pageSize;
        private String content;

        public FeatureRouterReqBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public FeatureRouterReqBuilder labelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }

        public FeatureRouterReqBuilder datasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }

        public FeatureRouterReqBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FeatureRouterReqBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public FeatureRouterReqBuilder reqData(Map<String, Object> reqData) {
            this.reqData = reqData;
            return this;
        }

        public FeatureRouterReqBuilder type(Integer type) {
            this.type = type;
            return this;
        }

        public FeatureRouterReqBuilder routerType(Integer routerType) {
            this.routerType = routerType;
            return this;
        }

        public FeatureRouterReqBuilder page(Integer page) {
            this.page = page;
            return this;
        }

        public FeatureRouterReqBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public FeatureRouterReqBuilder content(String content) {
            this.content = content;
            return this;
        }

        public FeatureRouterReq build() {
            return new FeatureRouterReq(this.id, this.labelId, this.datasourceId, this.name, this.userName, this.reqData, this.type, this.routerType, this.page, this.pageSize, this.content);
        }

        public String toString() {
            return "FeatureRouterReq.FeatureRouterReqBuilder(id=" + this.id + ", labelId=" + this.labelId + ", datasourceId=" + this.datasourceId + ", name=" + this.name + ", userName=" + this.userName + ", reqData=" + this.reqData + ", type=" + this.type + ", routerType=" + this.routerType + ", page=" + this.page + ", pageSize=" + this.pageSize + ", content=" + this.content + ")";
        }
    }


    public Long getId() {
        /* 27 */
        return this.id;
    }


    public Long getLabelId() {
        /* 33 */
        return this.labelId;
    }


    public Long getDatasourceId() {
        /* 39 */
        return this.datasourceId;
    }


    public String getName() {
        /* 45 */
        return this.name;
    }

    public String getUserName() {
        /* 49 */
        return this.userName;
    }

    public Map<String, Object> getReqData() {
        /* 53 */
        return this.reqData;
    }

    public Integer getType() {
        /* 56 */
        return this.type;
    }

    public Integer getRouterType() {
        /* 59 */
        return this.routerType;
    }

    public Integer getPage() {
        /* 62 */
        return this.page;
    }

    public Integer getPageSize() {
        /* 65 */
        return this.pageSize;
    }

    public String getContent() {
        /* 68 */
        return this.content;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/feature/router/FeatureRouterReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */