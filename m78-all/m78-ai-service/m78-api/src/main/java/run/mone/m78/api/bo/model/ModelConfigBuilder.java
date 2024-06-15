  package run.mone.m78.api.bo.model;

  public class ModelConfigBuilder {
    private String chatModel;
    private String codeModel;
    private String documentModel;
    private String translateModel;

    public ModelConfigBuilder chatModel(String chatModel) {
/* 10 */     this.chatModel = chatModel; return this; } public ModelConfigBuilder codeModel(String codeModel) { this.codeModel = codeModel; return this; } public ModelConfigBuilder documentModel(String documentModel) { this.documentModel = documentModel; return this; } public ModelConfigBuilder translateModel(String translateModel) { this.translateModel = translateModel; return this; } public ModelConfig build() { return new ModelConfig(this.chatModel, this.codeModel, this.documentModel, this.translateModel); } public String toString() { return "ModelConfig.ModelConfigBuilder(chatModel=" + this.chatModel + ", codeModel=" + this.codeModel + ", documentModel=" + this.documentModel + ", translateModel=" + this.translateModel + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/model/ModelConfig$ModelConfigBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */