package run.mone.m78.api.bo.user;

import run.mone.m78.api.bo.model.ModelConfig;


public class UserConfigBuilder {
    private boolean id$set;
    private Integer id$value;
    private ModelConfig modelConfig;

    public UserConfigBuilder id(Integer id) {
        /* 15 */
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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/user/UserConfig$UserConfigBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */