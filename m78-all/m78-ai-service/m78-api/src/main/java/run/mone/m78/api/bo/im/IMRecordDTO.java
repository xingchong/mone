package run.mone.m78.api.bo.im;

import java.io.Serializable;
import java.math.BigInteger;

public class IMRecordDTO implements Serializable {
    private BigInteger id;
    private BigInteger botId;
    private String chatId;
    private Integer imTypeId;
    private String userName;
    private Integer status;

    public IMRecordDTO() {
    }

    /* 12 */
    public IMRecordDTO(BigInteger id, BigInteger botId, String chatId, Integer imTypeId, String userName, Integer status) {
        this.id = id;
        this.botId = botId;
        this.chatId = chatId;
        this.imTypeId = imTypeId;
        this.userName = userName;
        this.status = status;
    }

    /* 13 */
    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setBotId(BigInteger botId) {
        this.botId = botId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public void setImTypeId(Integer imTypeId) {
        this.imTypeId = imTypeId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof IMRecordDTO)) return false;
        IMRecordDTO other = (IMRecordDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$imTypeId = getImTypeId(), other$imTypeId = other.getImTypeId();
        if ((this$imTypeId == null) ? (other$imTypeId != null) : !this$imTypeId.equals(other$imTypeId)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$botId = getBotId(), other$botId = other.getBotId();
        if ((this$botId == null) ? (other$botId != null) : !this$botId.equals(other$botId)) return false;
        Object this$chatId = getChatId(), other$chatId = other.getChatId();
        if ((this$chatId == null) ? (other$chatId != null) : !this$chatId.equals(other$chatId)) return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        return !((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof IMRecordDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $imTypeId = getImTypeId();
        result = result * 59 + (($imTypeId == null) ? 43 : $imTypeId.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $botId = getBotId();
        result = result * 59 + (($botId == null) ? 43 : $botId.hashCode());
        Object $chatId = getChatId();
        result = result * 59 + (($chatId == null) ? 43 : $chatId.hashCode());
        Object $userName = getUserName();
        return result * 59 + (($userName == null) ? 43 : $userName.hashCode());
    }

    public String toString() {
        return "IMRecordDTO(id=" + getId() + ", botId=" + getBotId() + ", chatId=" + getChatId() + ", imTypeId=" + getImTypeId() + ", userName=" + getUserName() + ", status=" + getStatus() + ")";
    }

    /* 14 */
    public static IMRecordDTOBuilder builder() {
        return new IMRecordDTOBuilder();
    }

    public static class IMRecordDTOBuilder {
        private BigInteger id;
        private BigInteger botId;
        private String chatId;

        public IMRecordDTOBuilder id(BigInteger id) {
            this.id = id;
            return this;
        }

        private Integer imTypeId;
        private String userName;
        private Integer status;

        public IMRecordDTOBuilder botId(BigInteger botId) {
            this.botId = botId;
            return this;
        }

        public IMRecordDTOBuilder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        public IMRecordDTOBuilder imTypeId(Integer imTypeId) {
            this.imTypeId = imTypeId;
            return this;
        }

        public IMRecordDTOBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public IMRecordDTOBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public IMRecordDTO build() {
            return new IMRecordDTO(this.id, this.botId, this.chatId, this.imTypeId, this.userName, this.status);
        }

        public String toString() {
            return "IMRecordDTO.IMRecordDTOBuilder(id=" + this.id + ", botId=" + this.botId + ", chatId=" + this.chatId + ", imTypeId=" + this.imTypeId + ", userName=" + this.userName + ", status=" + this.status + ")";
        }
    }

    public BigInteger getId() {
        /* 17 */
        return this.id;
    }

    public BigInteger getBotId() {
        /* 19 */
        return this.botId;
    }

    public String getChatId() {
        /* 21 */
        return this.chatId;
    }

    public Integer getImTypeId() {
        /* 23 */
        return this.imTypeId;
    }

    public String getUserName() {
        /* 25 */
        return this.userName;
    }

    public Integer getStatus() {
        /* 27 */
        return this.status;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/IMRecordDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */