package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.List;


public class ZKnowledgeReq
        implements Serializable {
    private String userName;
    private Long knowledgeBaseId;
    private List<Long> fileIdLst;
    private String queryText;

    public void setUserName(String userName) {
        /* 28 */
        this.userName = userName;
    }

    public void setKnowledgeBaseId(Long knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public void setFileIdLst(List<Long> fileIdLst) {
        this.fileIdLst = fileIdLst;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZKnowledgeReq)) return false;
        ZKnowledgeReq other = (ZKnowledgeReq) o;
        if (!other.canEqual(this)) return false;
        Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId();
        if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId))
            return false;
        Object this$limit = getLimit(), other$limit = other.getLimit();
        if ((this$limit == null) ? (other$limit != null) : !this$limit.equals(other$limit)) return false;
        Object this$similarity = getSimilarity(), other$similarity = other.getSimilarity();
        if ((this$similarity == null) ? (other$similarity != null) : !this$similarity.equals(other$similarity))
            return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$fileIdLst = (Object) getFileIdLst(), other$fileIdLst = (Object) other.getFileIdLst();
        if ((this$fileIdLst == null) ? (other$fileIdLst != null) : !this$fileIdLst.equals(other$fileIdLst))
            return false;
        Object this$queryText = getQueryText(), other$queryText = other.getQueryText();
        return !((this$queryText == null) ? (other$queryText != null) : !this$queryText.equals(other$queryText));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZKnowledgeReq;
    }

    public int hashCode() {
        int result = 1;
        Object $knowledgeBaseId = getKnowledgeBaseId();
        result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode());
        Object $limit = getLimit();
        result = result * 59 + (($limit == null) ? 43 : $limit.hashCode());
        Object $similarity = getSimilarity();
        result = result * 59 + (($similarity == null) ? 43 : $similarity.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $fileIdLst = (Object) getFileIdLst();
        result = result * 59 + (($fileIdLst == null) ? 43 : $fileIdLst.hashCode());
        Object $queryText = getQueryText();
        return result * 59 + (($queryText == null) ? 43 : $queryText.hashCode());
    }

    public String toString() {
        return "ZKnowledgeReq(userName=" + getUserName() + ", knowledgeBaseId=" + getKnowledgeBaseId() + ", fileIdLst=" + getFileIdLst() + ", queryText=" + getQueryText() + ", limit=" + getLimit() + ", similarity=" + getSimilarity() + ")";
    }

    public String getUserName() {
        /* 31 */
        return this.userName;
    }

    public Long getKnowledgeBaseId() {
        /* 33 */
        return this.knowledgeBaseId;
    }

    public List<Long> getFileIdLst() {
        /* 35 */
        return this.fileIdLst;
    }

    public String getQueryText() {
        /* 37 */
        return this.queryText;
    }

    /* 39 */   private Integer limit = Integer.valueOf(3);
    private Double similarity;

    public Integer getLimit() {
        return this.limit;
    }

    public Double getSimilarity() {
        /* 41 */
        return this.similarity;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */