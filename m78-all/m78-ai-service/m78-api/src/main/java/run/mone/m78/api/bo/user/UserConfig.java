package run.mone.m78.api.bo.user;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import run.mone.m78.api.bo.model.ModelConfig;

public class UserConfig
        implements Serializable {
    private Integer id;
    private ModelConfig modelConfig;

    public void setId(Integer id) {
        /* 14 */
        this.id = id;
    }

    public void setModelConfig(ModelConfig modelConfig) {
        this.modelConfig = modelConfig;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UserConfig)) return false;
        UserConfig other = (UserConfig) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$modelConfig = getModelConfig(), other$modelConfig = other.getModelConfig();
        return !((this$modelConfig == null) ? (other$modelConfig != null) : !this$modelConfig.equals(other$modelConfig));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UserConfig;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $modelConfig = getModelConfig();
        return result * 59 + (($modelConfig == null) ? 43 : $modelConfig.hashCode());
    }

    public String toString() {
        return "UserConfig(id=" + getId() + ", modelConfig=" + getModelConfig() + ")";
    }

    /* 15 */
    public static Integer $default$id() {
        return  Integer.valueOf(-1);
    }

    UserConfig(Integer id, ModelConfig modelConfig) {
        this.id = id;
        this.modelConfig = modelConfig;
    }

    public Integer getId() {
        return this.id;
    }

    public static UserConfigBuilder builder() {
        return new UserConfigBuilder();
    }

    /* 22 */
    public ModelConfig getModelConfig() {
        return this.modelConfig;
    }

    public static class UserConfigBuilder {
        private boolean id$set;
        private Integer id$value;
        /* 26 */     private ModelConfig modelConfig;

        public UserConfigBuilder id(Integer id) {
            this.id$value = id;
            this.id$set = true;
            return this;
        }

        public UserConfigBuilder modelConfig(ModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }

        public UserConfig build() {
            Integer id$value = this.id$value;
            if (!this.id$set) id$value = UserConfig.$default$id();
            return new UserConfig(id$value, this.modelConfig);
        }

        public String toString() {
            return "UserConfig.UserConfigBuilder(id$value=" + this.id$value + ", modelConfig=" + this.modelConfig + ")";
        }
    }

    public String getTranslateModel(String defaultValue) {
        return StringUtils.isNotBlank(this.modelConfig.getTranslateModel()) ?
                /* 27 */       this.modelConfig.getTranslateModel() :
                /* 28 */       defaultValue;
    }


    public String getCodeModel(String defaultValue) {
        /* 32 */
        return StringUtils.isNotBlank(this.modelConfig.getCodeModel()) ?
                /* 33 */       this.modelConfig.getCodeModel() :
                /* 34 */       defaultValue;
    }

    public String getChatModel(String defaultValue) {
        /* 38 */
        return StringUtils.isNotBlank(this.modelConfig.getChatModel()) ?
                /* 39 */       this.modelConfig.getChatModel() :
                /* 40 */       defaultValue;
    }

    public String getDocumentModel(String defaultValue) {
        /* 44 */
        return StringUtils.isNotBlank(this.modelConfig.getDocumentModel()) ?
                /* 45 */       this.modelConfig.getDocumentModel() :
                /* 46 */       defaultValue;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/user/UserConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */