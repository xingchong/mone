  package run.mone.m78.api.bo.document;

  import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;
  import jakarta.validation.constraints.NotBlank;

  import java.io.Serializable;

  public class DataAnalyzeParam implements Serializable {
    @NotBlank
    @HttpApiDocClassDefine(value = "documentUuid", required = true, description = "文档uuid", defaultValue = "")
    private String documentUuid;
    @HttpApiDocClassDefine(value = "documentType", required = false, description = "文档类型", defaultValue = "")
    private Integer documentType;
    @NotBlank
    @HttpApiDocClassDefine(value = "chatContent", required = false, description = "输入内容", defaultValue = "")
    private String chatContent;
    @HttpApiDocClassDefine(value = "userName", required = false, description = "用户名", defaultValue = "")
    private String userName;

    public DataAnalyzeParam() {}

/* 17 */   public DataAnalyzeParam(String documentUuid, Integer documentType, String chatContent, String userName) { this.documentUuid = documentUuid; this.documentType = documentType; this.chatContent = chatContent; this.userName = userName; }
/* 18 */   public static DataAnalyzeParamBuilder builder() { return new DataAnalyzeParamBuilder(); } public static class DataAnalyzeParamBuilder { private String documentUuid; private Integer documentType; public DataAnalyzeParamBuilder documentUuid(String documentUuid) { this.documentUuid = documentUuid; return this; } private String chatContent; private String userName; public DataAnalyzeParamBuilder documentType(Integer documentType) { this.documentType = documentType; return this; } public DataAnalyzeParamBuilder chatContent(String chatContent) { this.chatContent = chatContent; return this; } public DataAnalyzeParamBuilder userName(String userName) { this.userName = userName; return this; } public DataAnalyzeParam build() { return new DataAnalyzeParam(this.documentUuid, this.documentType, this.chatContent, this.userName); } public String toString() { return "DataAnalyzeParam.DataAnalyzeParamBuilder(documentUuid=" + this.documentUuid + ", documentType=" + this.documentType + ", chatContent=" + this.chatContent + ", userName=" + this.userName + ")"; } }
/* 19 */   public void setDocumentUuid(String documentUuid) { this.documentUuid = documentUuid; } public void setDocumentType(Integer documentType) { this.documentType = documentType; } public void setChatContent(String chatContent) { this.chatContent = chatContent; } public void setUserName(String userName) { this.userName = userName; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof DataAnalyzeParam)) return false;  DataAnalyzeParam other = (DataAnalyzeParam)o; if (!other.canEqual(this)) return false;  Object this$documentType = getDocumentType(), other$documentType = other.getDocumentType(); if ((this$documentType == null) ? (other$documentType != null) : !this$documentType.equals(other$documentType)) return false;  Object this$documentUuid = getDocumentUuid(), other$documentUuid = other.getDocumentUuid(); if ((this$documentUuid == null) ? (other$documentUuid != null) : !this$documentUuid.equals(other$documentUuid)) return false;  Object this$chatContent = getChatContent(), other$chatContent = other.getChatContent(); if ((this$chatContent == null) ? (other$chatContent != null) : !this$chatContent.equals(other$chatContent)) return false;  Object this$userName = getUserName(), other$userName = other.getUserName(); return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)); } protected boolean canEqual(Object other) { return other instanceof DataAnalyzeParam; } public int hashCode() {  int  result = 1; Object $documentType = getDocumentType(); result = result * 59 + (($documentType == null) ? 43 : $documentType.hashCode()); Object $documentUuid = getDocumentUuid(); result = result * 59 + (($documentUuid == null) ? 43 : $documentUuid.hashCode()); Object $chatContent = getChatContent(); result = result * 59 + (($chatContent == null) ? 43 : $chatContent.hashCode()); Object $userName = getUserName(); return result * 59 + (($userName == null) ? 43 : $userName.hashCode()); } public String toString() { return "DataAnalyzeParam(documentUuid=" + getDocumentUuid() + ", documentType=" + getDocumentType() + ", chatContent=" + getChatContent() + ", userName=" + getUserName() + ")"; }



    public String getDocumentUuid() {
/* 24 */     return this.documentUuid;
    }
    public Integer getDocumentType() {
/* 27 */     return this.documentType;
    }

    public String getChatContent() {
/* 31 */     return this.chatContent;
    }
    public String getUserName() {
/* 34 */     return this.userName;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/DataAnalyzeParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */