  package run.mone.m78.api.bo.knowledge;

  import java.util.List;


  public class KnowledgeConfigBuilder
  {
    private Long knowledgeBaseId;
    private List<Long> fileIdList;

    public KnowledgeConfigBuilder knowledgeBaseId(Long knowledgeBaseId) {
/* 12 */     this.knowledgeBaseId = knowledgeBaseId; return this; } public KnowledgeConfigBuilder fileIdList(List<Long> fileIdList) { this.fileIdList = fileIdList; return this; } public KnowledgeConfig build() { return new KnowledgeConfig(this.knowledgeBaseId, this.fileIdList); } public String toString() { return "KnowledgeConfig.KnowledgeConfigBuilder(knowledgeBaseId=" + this.knowledgeBaseId + ", fileIdList=" + this.fileIdList + ")"; }

  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/knowledge/KnowledgeConfig$KnowledgeConfigBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */