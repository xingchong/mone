package run.mone.m78.api.bo.feature.router;

import java.io.Serializable;
import java.util.Map;

public class FeatureRouterDTO implements Serializable {
    private static final long serialVersionUID = -8622719959957696877L;
    private long id;
    private String name;
    private String userName;
    private Long labelId;
    private Integer status;
    private String createTime;
    private String updateTime;
    private Map<String, String> routerMeta;
    private String curl;
    private String content;
    private Integer type;

    public FeatureRouterDTO() {
    }

    /* 16 */
    public FeatureRouterDTO(long id, String name, String userName, Long labelId, Integer status, String createTime, String updateTime, Map<String, String> routerMeta, String curl, String content, Integer type) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.labelId = labelId;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.routerMeta = routerMeta;
        this.curl = curl;
        this.content = content;
        this.type = type;
    }

    /* 17 */
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setRouterMeta(Map<String, String> routerMeta) {
        this.routerMeta = routerMeta;
    }

    public void setCurl(String curl) {
        this.curl = curl;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof FeatureRouterDTO)) return false;
        FeatureRouterDTO other = (FeatureRouterDTO) o;
        if (!other.canEqual(this)) return false;
        if (getId() != other.getId()) return false;
        Object this$labelId = getLabelId(), other$labelId = other.getLabelId();
        if ((this$labelId == null) ? (other$labelId != null) : !this$labelId.equals(other$labelId)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$updateTime = getUpdateTime(), other$updateTime = other.getUpdateTime();
        if ((this$updateTime == null) ? (other$updateTime != null) : !this$updateTime.equals(other$updateTime))
            return false;
        Object this$routerMeta = (Object) getRouterMeta(), other$routerMeta = (Object) other.getRouterMeta();
        if ((this$routerMeta == null) ? (other$routerMeta != null) : !this$routerMeta.equals(other$routerMeta))
            return false;
        Object this$curl = getCurl(), other$curl = other.getCurl();
        if ((this$curl == null) ? (other$curl != null) : !this$curl.equals(other$curl)) return false;
        Object this$content = getContent(), other$content = other.getContent();
        return !((this$content == null) ? (other$content != null) : !this$content.equals(other$content));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FeatureRouterDTO;
    }

    public int hashCode() {
        int result = 1;
        long $id = getId();
        result = result * 59 + (int) ($id >>> 32L ^ $id);
        Object $labelId = getLabelId();
        result = result * 59 + (($labelId == null) ? 43 : $labelId.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $updateTime = getUpdateTime();
        result = result * 59 + (($updateTime == null) ? 43 : $updateTime.hashCode());
        Object $routerMeta = (Object) getRouterMeta();
        result = result * 59 + (($routerMeta == null) ? 43 : $routerMeta.hashCode());
        Object $curl = getCurl();
        result = result * 59 + (($curl == null) ? 43 : $curl.hashCode());
        Object $content = getContent();
        return result * 59 + (($content == null) ? 43 : $content.hashCode());
    }

    public String toString() {
        return "FeatureRouterDTO(id=" + getId() + ", name=" + getName() + ", userName=" + getUserName() + ", labelId=" + getLabelId() + ", status=" + getStatus() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", routerMeta=" + getRouterMeta() + ", curl=" + getCurl() + ", content=" + getContent() + ", type=" + getType() + ")";
    }

    /* 18 */
    public static FeatureRouterDTOBuilder builder() {
        return new FeatureRouterDTOBuilder();
    }

    public static class FeatureRouterDTOBuilder {
        private long id;
        private String name;
        private String userName;
        private Long labelId;
        private Integer status;

        public FeatureRouterDTOBuilder id(long id) {
            this.id = id;
            return this;
        }

        private String createTime;
        private String updateTime;
        private Map<String, String> routerMeta;
        private String curl;
        private String content;
        private Integer type;

        public FeatureRouterDTOBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FeatureRouterDTOBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public FeatureRouterDTOBuilder labelId(Long labelId) {
            this.labelId = labelId;
            return this;
        }

        public FeatureRouterDTOBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public FeatureRouterDTOBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public FeatureRouterDTOBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public FeatureRouterDTOBuilder routerMeta(Map<String, String> routerMeta) {
            this.routerMeta = routerMeta;
            return this;
        }

        public FeatureRouterDTOBuilder curl(String curl) {
            this.curl = curl;
            return this;
        }

        public FeatureRouterDTOBuilder content(String content) {
            this.content = content;
            return this;
        }

        public FeatureRouterDTOBuilder type(Integer type) {
            this.type = type;
            return this;
        }

        public FeatureRouterDTO build() {
            return new FeatureRouterDTO(this.id, this.name, this.userName, this.labelId, this.status, this.createTime, this.updateTime, this.routerMeta, this.curl, this.content, this.type);
        }

        public String toString() {
            return "FeatureRouterDTO.FeatureRouterDTOBuilder(id=" + this.id + ", name=" + this.name + ", userName=" + this.userName + ", labelId=" + this.labelId + ", status=" + this.status + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", routerMeta=" + this.routerMeta + ", curl=" + this.curl + ", content=" + this.content + ", type=" + this.type + ")";
        }
    }


    public long getId() {
        /* 23 */
        return this.id;
    }

    public String getName() {
        /* 25 */
        return this.name;
    }

    public String getUserName() {
        /* 27 */
        return this.userName;
    }

    public Long getLabelId() {
        /* 29 */
        return this.labelId;
    }

    public Integer getStatus() {
        /* 31 */
        return this.status;
    }

    public String getCreateTime() {
        /* 33 */
        return this.createTime;
    }

    public String getUpdateTime() {
        /* 35 */
        return this.updateTime;
    }

    public Map<String, String> getRouterMeta() {
        /* 37 */
        return this.routerMeta;
    }

    public String getCurl() {
        /* 39 */
        return this.curl;
    }

    public String getContent() {
        /* 41 */
        return this.content;
    }

    public Integer getType() {
        /* 43 */
        return this.type;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/feature/router/FeatureRouterDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */