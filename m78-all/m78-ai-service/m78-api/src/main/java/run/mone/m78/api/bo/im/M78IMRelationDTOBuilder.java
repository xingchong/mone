package run.mone.m78.api.bo.im;

import java.math.BigInteger;
import java.time.LocalDateTime;


public class M78IMRelationDTOBuilder {
    private BigInteger id;
    private BigInteger botId;
    private String botName;
    private Integer imTypeId;
    private String relationFlag;
    private String creator;
    private Integer deleted;
    private LocalDateTime createTime;

    public M78IMRelationDTOBuilder id(BigInteger id) {
        /* 21 */
        this.id = id;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/M78IMRelationDTO$M78IMRelationDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */