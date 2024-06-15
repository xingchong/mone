package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;


public class ZKnowledgeBaseDTO
        implements Serializable {
    private Long id;
    private Date gmtCreate;
    private Date gmtModified;
    private String creator;
    private String operator;
    private String name;
    private String remark;
    private Integer seq;
    private Integer status;
    private Integer auth;
    private String type;
    private Long categoryId;
    private Map<String, String> labels;

    public void setId(Long id) {
        /* 29 */
        this.id = id;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZKnowledgeBaseDTO)) return false;
        ZKnowledgeBaseDTO other = (ZKnowledgeBaseDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$seq = getSeq(), other$seq = other.getSeq();
        if ((this$seq == null) ? (other$seq != null) : !this$seq.equals(other$seq)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$auth = getAuth(), other$auth = other.getAuth();
        if ((this$auth == null) ? (other$auth != null) : !this$auth.equals(other$auth)) return false;
        Object this$categoryId = getCategoryId(), other$categoryId = other.getCategoryId();
        if ((this$categoryId == null) ? (other$categoryId != null) : !this$categoryId.equals(other$categoryId))
            return false;
        Object this$gmtCreate = getGmtCreate(), other$gmtCreate = other.getGmtCreate();
        if ((this$gmtCreate == null) ? (other$gmtCreate != null) : !this$gmtCreate.equals(other$gmtCreate))
            return false;
        Object this$gmtModified = getGmtModified(), other$gmtModified = other.getGmtModified();
        if ((this$gmtModified == null) ? (other$gmtModified != null) : !this$gmtModified.equals(other$gmtModified))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$operator = getOperator(), other$operator = other.getOperator();
        if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$remark = getRemark(), other$remark = other.getRemark();
        if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$labels = (Object) getLabels(), other$labels = (Object) other.getLabels();
        return !((this$labels == null) ? (other$labels != null) : !this$labels.equals(other$labels));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZKnowledgeBaseDTO;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $seq = getSeq();
        result = result * 59 + (($seq == null) ? 43 : $seq.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $auth = getAuth();
        result = result * 59 + (($auth == null) ? 43 : $auth.hashCode());
        Object $categoryId = getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        Object $gmtCreate = getGmtCreate();
        result = result * 59 + (($gmtCreate == null) ? 43 : $gmtCreate.hashCode());
        Object $gmtModified = getGmtModified();
        result = result * 59 + (($gmtModified == null) ? 43 : $gmtModified.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $operator = getOperator();
        result = result * 59 + (($operator == null) ? 43 : $operator.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $remark = getRemark();
        result = result * 59 + (($remark == null) ? 43 : $remark.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $labels = (Object) getLabels();
        return result * 59 + (($labels == null) ? 43 : $labels.hashCode());
    }

    public String toString() {
        return "ZKnowledgeBaseDTO(id=" + getId() + ", gmtCreate=" + getGmtCreate() + ", gmtModified=" + getGmtModified() + ", creator=" + getCreator() + ", operator=" + getOperator() + ", name=" + getName() + ", remark=" + getRemark() + ", seq=" + getSeq() + ", status=" + getStatus() + ", auth=" + getAuth() + ", type=" + getType() + ", categoryId=" + getCategoryId() + ", labels=" + getLabels() + ")";
    }

    public Long getId() {
        /* 32 */
        return this.id;
    }

    public Date getGmtCreate() {
        /* 34 */
        return this.gmtCreate;
    }

    public Date getGmtModified() {
        /* 36 */
        return this.gmtModified;
    }

    public String getCreator() {
        /* 38 */
        return this.creator;
    }

    public String getOperator() {
        /* 40 */
        return this.operator;
    }

    public String getName() {
        /* 42 */
        return this.name;
    }

    public String getRemark() {
        /* 44 */
        return this.remark;
    }

    public Integer getSeq() {
        /* 46 */
        return this.seq;
    }

    public Integer getStatus() {
        /* 48 */
        return this.status;
    }

    public Integer getAuth() {
        /* 50 */
        return this.auth;
    }

    public String getType() {
        /* 52 */
        return this.type;
    }

    public Long getCategoryId() {
        /* 54 */
        return this.categoryId;
    }

    public Map<String, String> getLabels() {
        /* 56 */
        return this.labels;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZKnowledgeBaseDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */