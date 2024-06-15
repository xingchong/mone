  package run.mone.m78.api.bo.model;

  public class ModelConfig {
    private String chatModel;
    private String codeModel;
    private String documentModel;
    private String translateModel;

    ModelConfig(String chatModel, String codeModel, String documentModel, String translateModel) {
/* 10 */     this.chatModel = chatModel; this.codeModel = codeModel; this.documentModel = documentModel; this.translateModel = translateModel; } public static ModelConfigBuilder builder() { return new ModelConfigBuilder(); } public static class ModelConfigBuilder { private String chatModel; private String codeModel; public ModelConfigBuilder chatModel(String chatModel) { this.chatModel = chatModel; return this; } private String documentModel; private String translateModel; public ModelConfigBuilder codeModel(String codeModel) { this.codeModel = codeModel; return this; } public ModelConfigBuilder documentModel(String documentModel) { this.documentModel = documentModel; return this; } public ModelConfigBuilder translateModel(String translateModel) { this.translateModel = translateModel; return this; } public ModelConfig build() { return new ModelConfig(this.chatModel, this.codeModel, this.documentModel, this.translateModel); } public String toString() { return "ModelConfig.ModelConfigBuilder(chatModel=" + this.chatModel + ", codeModel=" + this.codeModel + ", documentModel=" + this.documentModel + ", translateModel=" + this.translateModel + ")"; } }
/* 11 */   public void setChatModel(String chatModel) { this.chatModel = chatModel; } public void setCodeModel(String codeModel) { this.codeModel = codeModel; } public void setDocumentModel(String documentModel) { this.documentModel = documentModel; } public void setTranslateModel(String translateModel) { this.translateModel = translateModel; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ModelConfig)) return false;  ModelConfig other = (ModelConfig)o; if (!other.canEqual(this)) return false;  Object this$chatModel = getChatModel(), other$chatModel = other.getChatModel(); if ((this$chatModel == null) ? (other$chatModel != null) : !this$chatModel.equals(other$chatModel)) return false;  Object this$codeModel = getCodeModel(), other$codeModel = other.getCodeModel(); if ((this$codeModel == null) ? (other$codeModel != null) : !this$codeModel.equals(other$codeModel)) return false;  Object this$documentModel = getDocumentModel(), other$documentModel = other.getDocumentModel(); if ((this$documentModel == null) ? (other$documentModel != null) : !this$documentModel.equals(other$documentModel)) return false;  Object this$translateModel = getTranslateModel(), other$translateModel = other.getTranslateModel(); return !((this$translateModel == null) ? (other$translateModel != null) : !this$translateModel.equals(other$translateModel)); } protected boolean canEqual(Object other) { return other instanceof ModelConfig; } public int hashCode() {  int  result = 1; Object $chatModel = getChatModel(); result = result * 59 + (($chatModel == null) ? 43 : $chatModel.hashCode()); Object $codeModel = getCodeModel(); result = result * 59 + (($codeModel == null) ? 43 : $codeModel.hashCode()); Object $documentModel = getDocumentModel(); result = result * 59 + (($documentModel == null) ? 43 : $documentModel.hashCode()); Object $translateModel = getTranslateModel(); return result * 59 + (($translateModel == null) ? 43 : $translateModel.hashCode()); } public String toString() { return "ModelConfig(chatModel=" + getChatModel() + ", codeModel=" + getCodeModel() + ", documentModel=" + getDocumentModel() + ", translateModel=" + getTranslateModel() + ")"; }

/* 13 */   public String getChatModel() { return this.chatModel; }
/* 14 */   public String getCodeModel() { return this.codeModel; }
/* 15 */   public String getDocumentModel() { return this.documentModel; } public String getTranslateModel() {
/* 16 */     return this.translateModel;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/model/ModelConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */