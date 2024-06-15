 
package run.mone.m78.api.bo.plugins;
 
 

import java.io.Serializable;
  import java.util.List;


public class BotPluginMetaParam
          implements Serializable
          {
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

     
     
    public BotPluginMetaParam(String id, String name, String valueType, String originalType, String desc, List<BotPluginMetaParam> children, Boolean required) {
        /*  94 */
        this.id = id;
        this.name = name;
        this.valueType = valueType;
        this.originalType = originalType;
        this.desc = desc;
        this.children = children;
        this.required = required;
        /*  95 */
    }

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
        if ((this$required == null) ? (other$required != null) : !this$required.equals(other$required)) return false;
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

        public BotPluginMetaParamBuilder id(String id) {
            this.id = id;
            return this;
        }

        private String originalType;
        private String desc;
        private List<BotPluginDTO.BotPluginMetaParam> children;
        private Boolean required;

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/plugins/BotPluginDTO$BotPluginMetaParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */