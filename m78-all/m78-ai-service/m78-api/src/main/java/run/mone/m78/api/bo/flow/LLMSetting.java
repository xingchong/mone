  package run.mone.m78.api.bo.flow;
  
  import java.io.Serializable;
  
  public class LLMSetting implements Serializable {
    private String gptModel;
    private String temperature;
    private String promptContent;
    private String timeout;
    
/* 11 */   public void setGptModel(String gptModel) { this.gptModel = gptModel; } public void setTemperature(String temperature) { this.temperature = temperature; } public void setPromptContent(String promptContent) { this.promptContent = promptContent; } public void setTimeout(String timeout) { this.timeout = timeout; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof LLMSetting)) return false;  LLMSetting other = (LLMSetting)o; if (!other.canEqual(this)) return false;  Object this$gptModel = getGptModel(), other$gptModel = other.getGptModel(); if ((this$gptModel == null) ? (other$gptModel != null) : !this$gptModel.equals(other$gptModel)) return false;  Object this$temperature = getTemperature(), other$temperature = other.getTemperature(); if ((this$temperature == null) ? (other$temperature != null) : !this$temperature.equals(other$temperature)) return false;  Object this$promptContent = getPromptContent(), other$promptContent = other.getPromptContent(); if ((this$promptContent == null) ? (other$promptContent != null) : !this$promptContent.equals(other$promptContent)) return false;  Object this$timeout = getTimeout(), other$timeout = other.getTimeout(); return !((this$timeout == null) ? (other$timeout != null) : !this$timeout.equals(other$timeout)); } protected boolean canEqual(Object other) { return other instanceof LLMSetting; } public int hashCode() {  int  result = 1; Object $gptModel = getGptModel(); result = result * 59 + (($gptModel == null) ? 43 : $gptModel.hashCode()); Object $temperature = getTemperature(); result = result * 59 + (($temperature == null) ? 43 : $temperature.hashCode()); Object $promptContent = getPromptContent(); result = result * 59 + (($promptContent == null) ? 43 : $promptContent.hashCode()); Object $timeout = getTimeout(); return result * 59 + (($timeout == null) ? 43 : $timeout.hashCode()); } public String toString() { return "LLMSetting(gptModel=" + getGptModel() + ", temperature=" + getTemperature() + ", promptContent=" + getPromptContent() + ", timeout=" + getTimeout() + ")"; }
    
    public String getGptModel() {
/* 14 */     return this.gptModel;
    } public String getTemperature() {
/* 16 */     return this.temperature;
    } public String getPromptContent() {
/* 18 */     return this.promptContent;
    } public String getTimeout() {
/* 20 */     return this.timeout;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/flow/LLMSetting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */