package run.mone.m78.api.bo.im;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class M78IMRelationDTO implements Serializable {
    private BigInteger id;
    private BigInteger botId;
    private String botName;
    private Integer imTypeId;
    private String relationFlag;
    private String creator;
    private Integer deleted;
    private LocalDateTime createTime;

    public M78IMRelationDTO() {
    }

    /* 19 */
    public M78IMRelationDTO(BigInteger id, BigInteger botId, String botName, Integer imTypeId, String relationFlag, String creator, Integer deleted, LocalDateTime createTime) {
        this.id = id;
        this.botId = botId;
        this.botName = botName;
        this.imTypeId = imTypeId;
        this.relationFlag = relationFlag;
        this.creator = creator;
        this.deleted = deleted;
        this.createTime = createTime;
    }

    /* 20 */
    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setBotId(BigInteger botId) {
        this.botId = botId;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setImTypeId(Integer imTypeId) {
        this.imTypeId = imTypeId;
    }

    public void setRelationFlag(String relationFlag) {
        this.relationFlag = relationFlag;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof M78IMRelationDTO)) return false;
        M78IMRelationDTO other = (M78IMRelationDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$imTypeId = getImTypeId(), other$imTypeId = other.getImTypeId();
        if ((this$imTypeId == null) ? (other$imTypeId != null) : !this$imTypeId.equals(other$imTypeId)) return false;
        Object this$deleted = getDeleted(), other$deleted = other.getDeleted();
        if ((this$deleted == null) ? (other$deleted != null) : !this$deleted.equals(other$deleted)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$botId = getBotId(), other$botId = other.getBotId();
        if ((this$botId == null) ? (other$botId != null) : !this$botId.equals(other$botId)) return false;
        Object this$botName = getBotName(), other$botName = other.getBotName();
        if ((this$botName == null) ? (other$botName != null) : !this$botName.equals(other$botName)) return false;
        Object this$relationFlag = getRelationFlag(), other$relationFlag = other.getRelationFlag();
        if ((this$relationFlag == null) ? (other$relationFlag != null) : !this$relationFlag.equals(other$relationFlag))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        return !((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof M78IMRelationDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $imTypeId = getImTypeId();
        result = result * 59 + (($imTypeId == null) ? 43 : $imTypeId.hashCode());
        Object $deleted = getDeleted();
        result = result * 59 + (($deleted == null) ? 43 : $deleted.hashCode());
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $botId = getBotId();
        result = result * 59 + (($botId == null) ? 43 : $botId.hashCode());
        Object $botName = getBotName();
        result = result * 59 + (($botName == null) ? 43 : $botName.hashCode());
        Object $relationFlag = getRelationFlag();
        result = result * 59 + (($relationFlag == null) ? 43 : $relationFlag.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $createTime = getCreateTime();
        return result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
    }

    public String toString() {
        return "M78IMRelationDTO(id=" + getId() + ", botId=" + getBotId() + ", botName=" + getBotName() + ", imTypeId=" + getImTypeId() + ", relationFlag=" + getRelationFlag() + ", creator=" + getCreator() + ", deleted=" + getDeleted() + ", createTime=" + getCreateTime() + ")";
    }

    /* 21 */
    public static M78IMRelationDTOBuilder builder() {
        return new M78IMRelationDTOBuilder();
    }

    public static class M78IMRelationDTOBuilder {
        private BigInteger id;
        private BigInteger botId;
        private String botName;
        private Integer imTypeId;

        public M78IMRelationDTOBuilder id(BigInteger id) {
            this.id = id;
            return this;
        }

        private String relationFlag;
        private String creator;
        private Integer deleted;
        private LocalDateTime createTime;

        public M78IMRelationDTOBuilder botId(BigInteger botId) {
            this.botId = botId;
            return this;
        }

        public M78IMRelationDTOBuilder botName(String botName) {
            this.botName = botName;
            return this;
        }

        public M78IMRelationDTOBuilder imTypeId(Integer imTypeId) {
            this.imTypeId = imTypeId;
            return this;
        }

        public M78IMRelationDTOBuilder relationFlag(String relationFlag) {
            this.relationFlag = relationFlag;
            return this;
        }

        public M78IMRelationDTOBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public M78IMRelationDTOBuilder deleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }

        public M78IMRelationDTOBuilder createTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public M78IMRelationDTO build() {
            return new M78IMRelationDTO(this.id, this.botId, this.botName, this.imTypeId, this.relationFlag, this.creator, this.deleted, this.createTime);
        }

        public String toString() {
            return "M78IMRelationDTO.M78IMRelationDTOBuilder(id=" + this.id + ", botId=" + this.botId + ", botName=" + this.botName + ", imTypeId=" + this.imTypeId + ", relationFlag=" + this.relationFlag + ", creator=" + this.creator + ", deleted=" + this.deleted + ", createTime=" + this.createTime + ")";
        }
    }

    public BigInteger getId() {
        /* 24 */
        return this.id;
    }

    public BigInteger getBotId() {
        /* 26 */
        return this.botId;
    }

    public String getBotName() {
        /* 28 */
        return this.botName;
    }

    public Integer getImTypeId() {
        /* 30 */
        return this.imTypeId;
    }

    public String getRelationFlag() {
        /* 32 */
        return this.relationFlag;
    }

    public String getCreator() {
        /* 34 */
        return this.creator;
    }

    public Integer getDeleted() {
        /* 36 */
        return this.deleted;
    }

    public LocalDateTime getCreateTime() {
        /* 38 */
        return this.createTime;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/M78IMRelationDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */