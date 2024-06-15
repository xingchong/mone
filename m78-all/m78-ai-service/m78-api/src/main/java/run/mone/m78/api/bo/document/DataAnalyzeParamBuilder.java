  package run.mone.m78.api.bo.document;
  
  
  
  
  
  
  
  
  public class DataAnalyzeParamBuilder
  {
    private String documentUuid;
    private Integer documentType;
    private String chatContent;
    private String userName;
    
    public DataAnalyzeParamBuilder documentUuid(String documentUuid) {
/* 18 */     this.documentUuid = documentUuid; return this; } public DataAnalyzeParamBuilder documentType(Integer documentType) { this.documentType = documentType; return this; } public DataAnalyzeParamBuilder chatContent(String chatContent) { this.chatContent = chatContent; return this; } public DataAnalyzeParamBuilder userName(String userName) { this.userName = userName; return this; } public DataAnalyzeParam build() { return new DataAnalyzeParam(this.documentUuid, this.documentType, this.chatContent, this.userName); } public String toString() { return "DataAnalyzeParam.DataAnalyzeParamBuilder(documentUuid=" + this.documentUuid + ", documentType=" + this.documentType + ", chatContent=" + this.chatContent + ", userName=" + this.userName + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/DataAnalyzeParam$DataAnalyzeParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */