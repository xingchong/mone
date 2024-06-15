 
package run.mone.m78.api.bo.plugins;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

  public class BotPluginDTO implements Serializable {
    private static final long serialVersionUID = -1354236482542765218L;
    @HttpApiDocClassDefine(value = "id", required = true, description = "组件id", defaultValue = "更新时需要传递")
      private Long id;
    @HttpApiDocClassDefine(value = "orgId", required = true, description = "组件所属插件id", defaultValue = "组件所属插件id")
      private Long orgId;

     
    @HttpApiDocClassDefine(value = "name", required = true, description = "组件名称", defaultValue = "")
      private String name;
     
    @HttpApiDocClassDefine(value = "userName", required = false, description = "用户名，即创建人", defaultValue = "")
      private String userName;
     
    @HttpApiDocClassDefine(value = "modifier", required = false, description = "更新人", defaultValue = "")
      private String modifier;
     
    @HttpApiDocClassDefine(value = "status", required = false, description = "组件启用状态", defaultValue = "0：启用，1：不启用")
      private Integer status;
     
    @HttpApiDocClassDefine(value = "debugStatus", required = false, description = "组件调试状态", defaultValue = "0：未调试，1：调试成功，2：调试失败")
      private Integer debugStatus;
     
    @HttpApiDocClassDefine(value = "createTime", required = false, description = "组件创建时间", defaultValue = "组件创建时间")
      private String createTime;

     
    /*  18 */
    public BotPluginDTO(Long id, Long orgId, String name, String userName, String modifier, Integer status, Integer debugStatus, String createTime, String apiUrl, String avatarUrl, String type, Long featureRouterId, String meta, BotPluginMeta botPluginMeta, String desc, String display) {
        this.id = id;
        this.orgId = orgId;
        this.name = name;
        this.userName = userName;
        this.modifier = modifier;
        this.status = status;
        this.debugStatus = debugStatus;
        this.createTime = createTime;
        this.apiUrl = apiUrl;
        this.avatarUrl = avatarUrl;
        this.type = type;
        this.featureRouterId = featureRouterId;
        this.meta = meta;
        this.botPluginMeta = botPluginMeta;
        this.desc = desc;
        this.display = display;
    }

    @HttpApiDocClassDefine(value = "apiUrl", required = false, description = "组件访问url", defaultValue = "")
    private String apiUrl;
    @HttpApiDocClassDefine(value = "avatarUrl", required = false, description = "组件头像的地址", defaultValue = "")
    private String avatarUrl;
    @HttpApiDocClassDefine(value = "type", required = false, description = "组件类型,http/dubbo/grpc(目前只有http，可以不传)", defaultValue = "")
    private String type;
    @HttpApiDocClassDefine(value = "featureRouterId", required = false, description = "关联的featureRouterId", defaultValue = "无需传递")
    private Long featureRouterId;
    @HttpApiDocClassDefine(value = "meta", required = false, description = "请求元信息, 形如:{\"http_headers\": {\"content-type\": \"application/json\"}, \"http_method\": \"POST\"}", defaultValue = "")
    private String meta;
    @HttpApiDocClassDefine(value = "meta", required = false, description = "请求元信息, 对象格式", defaultValue = "")
    private BotPluginMeta botPluginMeta;
    @HttpApiDocClassDefine(value = "desc", required = false, description = "组件描述", defaultValue = "创建时就需要传递")
    private String desc;
    @HttpApiDocClassDefine(value = "display", required = false, description = "插件返回内容展示字段", defaultValue = "插件返回内容展示字段")
    /*  19 */ private String display;

    public BotPluginDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setDebugStatus(Integer debugStatus) {
        this.debugStatus = debugStatus;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFeatureRouterId(Long featureRouterId) {
        this.featureRouterId = featureRouterId;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public void setBotPluginMeta(BotPluginMeta botPluginMeta) {
        this.botPluginMeta = botPluginMeta;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof BotPluginDTO)) return false;
        BotPluginDTO other = (BotPluginDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$orgId = getOrgId(), other$orgId = other.getOrgId();
        if ((this$orgId == null) ? (other$orgId != null) : !this$orgId.equals(other$orgId)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$debugStatus = getDebugStatus(), other$debugStatus = other.getDebugStatus();
        if ((this$debugStatus == null) ? (other$debugStatus != null) : !this$debugStatus.equals(other$debugStatus))
            return false;
        Object this$featureRouterId = getFeatureRouterId(), other$featureRouterId = other.getFeatureRouterId();
        if ((this$featureRouterId == null) ? (other$featureRouterId != null) : !this$featureRouterId.equals(other$featureRouterId))
            return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$modifier = getModifier(), other$modifier = other.getModifier();
        if ((this$modifier == null) ? (other$modifier != null) : !this$modifier.equals(other$modifier)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        if ((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime))
            return false;
        Object this$apiUrl = getApiUrl(), other$apiUrl = other.getApiUrl();
        if ((this$apiUrl == null) ? (other$apiUrl != null) : !this$apiUrl.equals(other$apiUrl)) return false;
        Object this$avatarUrl = getAvatarUrl(), other$avatarUrl = other.getAvatarUrl();
        if ((this$avatarUrl == null) ? (other$avatarUrl != null) : !this$avatarUrl.equals(other$avatarUrl))
            return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$meta = getMeta(), other$meta = other.getMeta();
        if ((this$meta == null) ? (other$meta != null) : !this$meta.equals(other$meta)) return false;
        Object this$botPluginMeta = getBotPluginMeta(), other$botPluginMeta = other.getBotPluginMeta();
        if ((this$botPluginMeta == null) ? (other$botPluginMeta != null) : !this$botPluginMeta.equals(other$botPluginMeta))
            return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
        Object this$display = getDisplay(), other$display = other.getDisplay();
        return !((this$display == null) ? (other$display != null) : !this$display.equals(other$display));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BotPluginDTO;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $orgId = getOrgId();
        result = result * 59 + (($orgId == null) ? 43 : $orgId.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $debugStatus = getDebugStatus();
        result = result * 59 + (($debugStatus == null) ? 43 : $debugStatus.hashCode());
        Object $featureRouterId = getFeatureRouterId();
        result = result * 59 + (($featureRouterId == null) ? 43 : $featureRouterId.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $modifier = getModifier();
        result = result * 59 + (($modifier == null) ? 43 : $modifier.hashCode());
        Object $createTime = getCreateTime();
        result = result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
        Object $apiUrl = getApiUrl();
        result = result * 59 + (($apiUrl == null) ? 43 : $apiUrl.hashCode());
        Object $avatarUrl = getAvatarUrl();
        result = result * 59 + (($avatarUrl == null) ? 43 : $avatarUrl.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $meta = getMeta();
        result = result * 59 + (($meta == null) ? 43 : $meta.hashCode());
        Object $botPluginMeta = getBotPluginMeta();
        result = result * 59 + (($botPluginMeta == null) ? 43 : $botPluginMeta.hashCode());
        Object $desc = getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        Object $display = getDisplay();
        return result * 59 + (($display == null) ? 43 : $display.hashCode());
    }

    public String toString() {
        return "BotPluginDTO(id=" + getId() + ", orgId=" + getOrgId() + ", name=" + getName() + ", userName=" + getUserName() + ", modifier=" + getModifier() + ", status=" + getStatus() + ", debugStatus=" + getDebugStatus() + ", createTime=" + getCreateTime() + ", apiUrl=" + getApiUrl() + ", avatarUrl=" + getAvatarUrl() + ", type=" + getType() + ", featureRouterId=" + getFeatureRouterId() + ", meta=" + getMeta() + ", botPluginMeta=" + getBotPluginMeta() + ", desc=" + getDesc() + ", display=" + getDisplay() + ")";
    }

    /*  20 */
    public static BotPluginDTOBuilder builder() {
        return new BotPluginDTOBuilder();
    }

    public static class BotPluginDTOBuilder {
        private Long id;
        private Long orgId;
        private String name;
        private String userName;
        private String modifier;
        private Integer status;
        private Integer debugStatus;
        private String createTime;
        private String apiUrl;
        private String avatarUrl;
        private String type;
        private Long featureRouterId;
        private String meta;
        private BotPluginDTO.BotPluginMeta botPluginMeta;
        private String desc;
        private String display;

        public BotPluginDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public BotPluginDTOBuilder orgId(Long orgId) {
            this.orgId = orgId;
            return this;
        }

        public BotPluginDTOBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BotPluginDTOBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public BotPluginDTOBuilder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        public BotPluginDTOBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public BotPluginDTOBuilder debugStatus(Integer debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }

        public BotPluginDTOBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public BotPluginDTOBuilder apiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
            return this;
        }

        public BotPluginDTOBuilder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public BotPluginDTOBuilder type(String type) {
            this.type = type;
            return this;
        }

        public BotPluginDTOBuilder featureRouterId(Long featureRouterId) {
            this.featureRouterId = featureRouterId;
            return this;
        }

        public BotPluginDTOBuilder meta(String meta) {
            this.meta = meta;
            return this;
        }

        public BotPluginDTOBuilder botPluginMeta(BotPluginDTO.BotPluginMeta botPluginMeta) {
            this.botPluginMeta = botPluginMeta;
            return this;
        }

        public BotPluginDTOBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public BotPluginDTOBuilder display(String display) {
            this.display = display;
            return this;
        }

        public BotPluginDTO build() {
            return new BotPluginDTO(this.id, this.orgId, this.name, this.userName, this.modifier, this.status, this.debugStatus, this.createTime, this.apiUrl, this.avatarUrl, this.type, this.featureRouterId, this.meta, this.botPluginMeta, this.desc, this.display);
        }

        public String toString() {
            return "BotPluginDTO.BotPluginDTOBuilder(id=" + this.id + ", orgId=" + this.orgId + ", name=" + this.name + ", userName=" + this.userName + ", modifier=" + this.modifier + ", status=" + this.status + ", debugStatus=" + this.debugStatus + ", createTime=" + this.createTime + ", apiUrl=" + this.apiUrl + ", avatarUrl=" + this.avatarUrl + ", type=" + this.type + ", featureRouterId=" + this.featureRouterId + ", meta=" + this.meta + ", botPluginMeta=" + this.botPluginMeta + ", desc=" + this.desc + ", display=" + this.display + ")";
        }
         
    }

     
     
     
     
    public Long getId() {
        /*  26 */
        return this.id;
         
    }

     
    public Long getOrgId() {
        /*  29 */
        return this.orgId;
         
    }

     
    public String getName() {
        /*  32 */
        return this.name;
         
    }

     
    public String getUserName() {
        /*  35 */
        return this.userName;
         
    }

     
    public String getModifier() {
        /*  38 */
        return this.modifier;
         
    }

     
    public Integer getStatus() {
        /*  41 */
        return this.status;
         
    }

     
    public Integer getDebugStatus() {
        /*  44 */
        return this.debugStatus;
         
    }

     
    public String getCreateTime() {
        /*  47 */
        return this.createTime;
         
    }

     
    public String getApiUrl() {
        /*  50 */
        return this.apiUrl;
         
    }

     
    public String getAvatarUrl() {
        /*  53 */
        return this.avatarUrl;
         
    }

     
    public String getType() {
        /*  56 */
        return this.type;
         
    }

     
    public Long getFeatureRouterId() {
        /*  59 */
        return this.featureRouterId;
         
    }

     
    public String getMeta() {
        /*  62 */
        return this.meta;
         
    }

     
    public BotPluginMeta getBotPluginMeta() {
        /*  65 */
        return this.botPluginMeta;
         
    }

     
    public String getDesc() {
        /*  68 */
        return this.desc;
         
    }

     
    public String getDisplay() {
        /*  71 */
        return this.display;
         
    }

    public static class BotPluginMeta implements Serializable {
        private static final long serialVersionUID = -8187551393789090633L;
        private String desc;
        private Map<String, String> http_headers;
        private String http_method;
        private List<BotPluginMetaParam> input;
        private List<BotPluginDTO.BotPluginMetaParam> output;
        private String display;
        private int resContentType;

         
        public BotPluginMeta() {
        }

        /*  74 */
        public BotPluginMeta(String desc, Map<String, String> http_headers, String http_method, List<BotPluginDTO.BotPluginMetaParam> input, List<BotPluginDTO.BotPluginMetaParam> output, String display, int resContentType) {
            this.desc = desc;
            this.http_headers = http_headers;
            this.http_method = http_method;
            this.input = input;
            this.output = output;
            this.display = display;
            this.resContentType = resContentType;
        }

        /*  75 */
        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setHttp_headers(Map<String, String> http_headers) {
            this.http_headers = http_headers;
        }

        public void setHttp_method(String http_method) {
            this.http_method = http_method;
        }

        public void setInput(List<BotPluginDTO.BotPluginMetaParam> input) {
            this.input = input;
        }

        public void setOutput(List<BotPluginDTO.BotPluginMetaParam> output) {
            this.output = output;
        }

        public void setDisplay(String display) {
            this.display = display;
        }

        public void setResContentType(int resContentType) {
            this.resContentType = resContentType;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof BotPluginMeta)) return false;
            BotPluginMeta other = (BotPluginMeta) o;
            if (!other.canEqual(this)) return false;
            if (getResContentType() != other.getResContentType()) return false;
            Object this$desc = getDesc(), other$desc = other.getDesc();
            if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
            Object this$http_headers = (Object) getHttp_headers(), other$http_headers = (Object) other.getHttp_headers();
            if ((this$http_headers == null) ? (other$http_headers != null) : !this$http_headers.equals(other$http_headers))
                return false;
            Object this$http_method = getHttp_method(), other$http_method = other.getHttp_method();
            if ((this$http_method == null) ? (other$http_method != null) : !this$http_method.equals(other$http_method))
                return false;
            Object this$input = (Object) getInput(), other$input = (Object) other.getInput();
            if ((this$input == null) ? (other$input != null) : !this$input.equals(other$input)) return false;
            Object this$output = (Object) getOutput(), other$output = (Object) other.getOutput();
            if ((this$output == null) ? (other$output != null) : !this$output.equals(other$output)) return false;
            Object this$display = getDisplay(), other$display = other.getDisplay();
            return !((this$display == null) ? (other$display != null) : !this$display.equals(other$display));
        }

        protected boolean canEqual(Object other) {
            return other instanceof BotPluginMeta;
        }

        public int hashCode() {
            int result = 1;
            result = result * 59 + getResContentType();
            Object $desc = getDesc();
            result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
            Object $http_headers = (Object) getHttp_headers();
            result = result * 59 + (($http_headers == null) ? 43 : $http_headers.hashCode());
            Object $http_method = getHttp_method();
            result = result * 59 + (($http_method == null) ? 43 : $http_method.hashCode());
            Object $input = (Object) getInput();
            result = result * 59 + (($input == null) ? 43 : $input.hashCode());
            Object $output = (Object) getOutput();
            result = result * 59 + (($output == null) ? 43 : $output.hashCode());
            Object $display = getDisplay();
            return result * 59 + (($display == null) ? 43 : $display.hashCode());
        }

        public String toString() {
            return "BotPluginDTO.BotPluginMeta(desc=" + getDesc() + ", http_headers=" + getHttp_headers() + ", http_method=" + getHttp_method() + ", input=" + getInput() + ", output=" + getOutput() + ", display=" + getDisplay() + ", resContentType=" + getResContentType() + ")";
        }

        /*  76 */
        public static BotPluginMetaBuilder builder() {
            return new BotPluginMetaBuilder();
        }

        public static class BotPluginMetaBuilder {
            private String desc;
            private Map<String, String> http_headers;
            private String http_method;
            private List<BotPluginDTO.BotPluginMetaParam> input;
            private List<BotPluginDTO.BotPluginMetaParam> output;
            private String display;
            private int resContentType;

            public BotPluginMetaBuilder desc(String desc) {
                this.desc = desc;
                return this;
            }

            public BotPluginMetaBuilder http_headers(Map<String, String> http_headers) {
                this.http_headers = http_headers;
                return this;
            }

            public BotPluginMetaBuilder http_method(String http_method) {
                this.http_method = http_method;
                return this;
            }

            public BotPluginMetaBuilder input(List<BotPluginDTO.BotPluginMetaParam> input) {
                this.input = input;
                return this;
            }

            public BotPluginMetaBuilder output(List<BotPluginDTO.BotPluginMetaParam> output) {
                this.output = output;
                return this;
            }

            public BotPluginMetaBuilder display(String display) {
                this.display = display;
                return this;
            }

            public BotPluginMetaBuilder resContentType(int resContentType) {
                this.resContentType = resContentType;
                return this;
            }

            public BotPluginDTO.BotPluginMeta build() {
                return new BotPluginDTO.BotPluginMeta(this.desc, this.http_headers, this.http_method, this.input, this.output, this.display, this.resContentType);
            }

            public String toString() {
                return "BotPluginDTO.BotPluginMeta.BotPluginMetaBuilder(desc=" + this.desc + ", http_headers=" + this.http_headers + ", http_method=" + this.http_method + ", input=" + this.input + ", output=" + this.output + ", display=" + this.display + ", resContentType=" + this.resContentType + ")";
            }
             
        }

         
         
         
        public String getDesc() {
            /*  81 */
            return this.desc;
            /*  82 */
        }

        public Map<String, String> getHttp_headers() {
            return this.http_headers;
        }

        /*  83 */
        public String getHttp_method() {
            return this.http_method;
        }

        /*  84 */
        public List<BotPluginDTO.BotPluginMetaParam> getInput() {
            return this.input;
        }

        /*  85 */
        public List<BotPluginDTO.BotPluginMetaParam> getOutput() {
            return this.output;
        }

        public String getDisplay() {
            /*  86 */
            return this.display;
             
        }

         
         
        public int getResContentType() {
            /*  90 */
            return this.resContentType;
             
        }
    }

        public static class BotPluginMetaParam implements Serializable {
        private static final long serialVersionUID = -6229927767805613601L;
        private String id;
        private String name;
        private String valueType;
        private String originalType;
        private String desc;
        private List<BotPluginMetaParam> children;
        private Boolean required;

         
        public BotPluginMetaParam() {
        }

        /*  94 */
        public BotPluginMetaParam(String id, String name, String valueType, String originalType, String desc, List<BotPluginMetaParam> children, Boolean required) {
            this.id = id;
            this.name = name;
            this.valueType = valueType;
            this.originalType = originalType;
            this.desc = desc;
            this.children = children;
            this.required = required;
        }

        /*  95 */
        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setValueType(String valueType) {
            this.valueType = valueType;
        }

        public void setOriginalType(String originalType) {
            this.originalType = originalType;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setChildren(List<BotPluginMetaParam> children) {
            this.children = children;
        }

        public void setRequired(Boolean required) {
            this.required = required;
        }

        public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof BotPluginMetaParam)) return false;
            BotPluginMetaParam other = (BotPluginMetaParam) o;
            if (!other.canEqual(this)) return false;
            Object this$required = getRequired(), other$required = other.getRequired();
            if ((this$required == null) ? (other$required != null) : !this$required.equals(other$required))
                return false;
            Object this$id = getId(), other$id = other.getId();
            if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
            Object this$name = getName(), other$name = other.getName();
            if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
            Object this$valueType = getValueType(), other$valueType = other.getValueType();
            if ((this$valueType == null) ? (other$valueType != null) : !this$valueType.equals(other$valueType))
                return false;
            Object this$originalType = getOriginalType(), other$originalType = other.getOriginalType();
            if ((this$originalType == null) ? (other$originalType != null) : !this$originalType.equals(other$originalType))
                return false;
            Object this$desc = getDesc(), other$desc = other.getDesc();
            if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
            Object this$children = (Object) getChildren(), other$children = (Object) other.getChildren();
            return !((this$children == null) ? (other$children != null) : !this$children.equals(other$children));
        }

        protected boolean canEqual(Object other) {
            return other instanceof BotPluginMetaParam;
        }

        public int hashCode() {
            int result = 1;
            Object $required = getRequired();
            result = result * 59 + (($required == null) ? 43 : $required.hashCode());
            Object $id = getId();
            result = result * 59 + (($id == null) ? 43 : $id.hashCode());
            Object $name = getName();
            result = result * 59 + (($name == null) ? 43 : $name.hashCode());
            Object $valueType = getValueType();
            result = result * 59 + (($valueType == null) ? 43 : $valueType.hashCode());
            Object $originalType = getOriginalType();
            result = result * 59 + (($originalType == null) ? 43 : $originalType.hashCode());
            Object $desc = getDesc();
            result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
            Object $children = (Object) getChildren();
            return result * 59 + (($children == null) ? 43 : $children.hashCode());
        }

        public String toString() {
            return "BotPluginDTO.BotPluginMetaParam(id=" + getId() + ", name=" + getName() + ", valueType=" + getValueType() + ", originalType=" + getOriginalType() + ", desc=" + getDesc() + ", children=" + getChildren() + ", required=" + getRequired() + ")";
        }

        /*  96 */
        public static BotPluginMetaParamBuilder builder() {
            return new BotPluginMetaParamBuilder();
        }

        public static class BotPluginMetaParamBuilder {
            private String id;
            private String name;
            private String valueType;
            private String originalType;
            private String desc;
            private List<BotPluginDTO.BotPluginMetaParam> children;
            private Boolean required;

            public BotPluginMetaParamBuilder id(String id) {
                this.id = id;
                return this;
            }

            public BotPluginMetaParamBuilder name(String name) {
                this.name = name;
                return this;
            }

            public BotPluginMetaParamBuilder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public BotPluginMetaParamBuilder originalType(String originalType) {
                this.originalType = originalType;
                return this;
            }

            public BotPluginMetaParamBuilder desc(String desc) {
                this.desc = desc;
                return this;
            }

            public BotPluginMetaParamBuilder children(List<BotPluginDTO.BotPluginMetaParam> children) {
                this.children = children;
                return this;
            }

            public BotPluginMetaParamBuilder required(Boolean required) {
                this.required = required;
                return this;
            }

            public BotPluginDTO.BotPluginMetaParam build() {
                return new BotPluginDTO.BotPluginMetaParam(this.id, this.name, this.valueType, this.originalType, this.desc, this.children, this.required);
            }

            public String toString() {
                return "BotPluginDTO.BotPluginMetaParam.BotPluginMetaParamBuilder(id=" + this.id + ", name=" + this.name + ", valueType=" + this.valueType + ", originalType=" + this.originalType + ", desc=" + this.desc + ", children=" + this.children + ", required=" + this.required + ")";
            }
             
        }

         
         
         
        public String getId() {
            /* 101 */
            return this.id;
             
        }

        public String getName() {
            /* 103 */
            return this.name;
             
        }

         
         
         
         
         
        public String getValueType() {
            /* 110 */
            return this.valueType;
             
        }

        public String getOriginalType() {
            /* 112 */
            return this.originalType;
             
        }

        public String getDesc() {
            /* 114 */
            return this.desc;
             
        }

        public List<BotPluginMetaParam> getChildren() {
            /* 116 */
            return this.children;
             
        }

        public Boolean getRequired() {
            /* 118 */
            return this.required;
             
        }
    }
     
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */