package run.mone.m78.api.bo.knowledge;

import java.util.List;


public class KnowledgeConfig {
    private Long knowledgeBaseId;
    private List<Long> fileIdList;

    KnowledgeConfig(Long knowledgeBaseId, List<Long> fileIdList) {
        /* 12 */
        this.knowledgeBaseId = knowledgeBaseId;
        this.fileIdList = fileIdList;
    }

    public static KnowledgeConfigBuilder builder() {
        return new KnowledgeConfigBuilder();
    }

    public static class KnowledgeConfigBuilder {
        private Long knowledgeBaseId;

        public KnowledgeConfigBuilder knowledgeBaseId(Long knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        private List<Long> fileIdList;

        public KnowledgeConfigBuilder fileIdList(List<Long> fileIdList) {
            this.fileIdList = fileIdList;
            return this;
        }

        public KnowledgeConfig build() {
            return new KnowledgeConfig(this.knowledgeBaseId, this.fileIdList);
        }

        public String toString() {
            return "KnowledgeConfig.KnowledgeConfigBuilder(knowledgeBaseId=" + this.knowledgeBaseId + ", fileIdList=" + this.fileIdList + ")";
        }
    }

    /* 13 */
    public void setKnowledgeBaseId(Long knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public void setFileIdList(List<Long> fileIdList) {
        this.fileIdList = fileIdList;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof KnowledgeConfig)) return false;
        KnowledgeConfig other = (KnowledgeConfig) o;
        if (!other.canEqual(this)) return false;
        Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId();
        if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId))
            return false;
        Object this$fileIdList = (Object) getFileIdList(), other$fileIdList = (Object) other.getFileIdList();
        return !((this$fileIdList == null) ? (other$fileIdList != null) : !this$fileIdList.equals(other$fileIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof KnowledgeConfig;
    }

    public int hashCode() {
        int result = 1;
        Object $knowledgeBaseId = getKnowledgeBaseId();
        result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode());
        Object $fileIdList = (Object) getFileIdList();
        return result * 59 + (($fileIdList == null) ? 43 : $fileIdList.hashCode());
    }

    public String toString() {
        return "KnowledgeConfig(knowledgeBaseId=" + getKnowledgeBaseId() + ", fileIdList=" + getFileIdList() + ")";
    }

    public Long getKnowledgeBaseId() {
        /* 16 */
        return this.knowledgeBaseId;
    }

    public List<Long> getFileIdList() {
        /* 18 */
        return this.fileIdList;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/knowledge/KnowledgeConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */