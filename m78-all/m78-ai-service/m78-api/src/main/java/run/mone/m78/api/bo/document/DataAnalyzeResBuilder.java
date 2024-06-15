  package run.mone.m78.api.bo.document;

  import java.util.List;
  import java.util.Map;



  public class DataAnalyzeResBuilder
  {
    private String chatUuid;
    private String chatContentUuid;
    private List<Map<String, Object>> data;
    private String sql;

    public DataAnalyzeResBuilder chatUuid(String chatUuid) {
/* 16 */     this.chatUuid = chatUuid; return this; } public DataAnalyzeResBuilder chatContentUuid(String chatContentUuid) { this.chatContentUuid = chatContentUuid; return this; } public DataAnalyzeResBuilder data(List<Map<String, Object>> data) { this.data = data; return this; } public DataAnalyzeResBuilder sql(String sql) { this.sql = sql; return this; } public DataAnalyzeRes build() { return new DataAnalyzeRes(this.chatUuid, this.chatContentUuid, this.data, this.sql); } public String toString() { return "DataAnalyzeRes.DataAnalyzeResBuilder(chatUuid=" + this.chatUuid + ", chatContentUuid=" + this.chatContentUuid + ", data=" + this.data + ", sql=" + this.sql + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/DataAnalyzeRes$DataAnalyzeResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */