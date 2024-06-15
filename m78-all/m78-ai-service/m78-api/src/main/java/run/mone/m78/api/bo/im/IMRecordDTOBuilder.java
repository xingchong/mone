package run.mone.m78.api.bo.im;

import java.math.BigInteger;

public class IMRecordDTOBuilder {
    private BigInteger id;
    private BigInteger botId;
    private String chatId;
    private Integer imTypeId;
    private String userName;
    private Integer status;

    public IMRecordDTOBuilder id(BigInteger id) {
        /* 14 */
        this.id = id;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/IMRecordDTO$IMRecordDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */