package run.mone.m78.api.bo.im;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PublishRecordDTO implements Serializable {
    private Long id;
    private Long botId;
    private String versionRecord;
    private String botSnapshot;
    private String publishImChannel;
    private String publisher;
    private LocalDateTime publishTime;

    public PublishRecordDTO() {
    }

    /* 16 */
    public PublishRecordDTO(Long id, Long botId, String versionRecord, String botSnapshot, String publishImChannel, String publisher, LocalDateTime publishTime) {
        this.id = id;
        this.botId = botId;
        this.versionRecord = versionRecord;
        this.botSnapshot = botSnapshot;
        this.publishImChannel = publishImChannel;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }

    /* 17 */
    public void setId(Long id) {
        this.id = id;
    }

    public void setBotId(Long botId) {
        this.botId = botId;
    }

    public void setVersionRecord(String versionRecord) {
        this.versionRecord = versionRecord;
    }

    public void setBotSnapshot(String botSnapshot) {
        this.botSnapshot = botSnapshot;
    }

    public void setPublishImChannel(String publishImChannel) {
        this.publishImChannel = publishImChannel;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PublishRecordDTO)) return false;
        PublishRecordDTO other = (PublishRecordDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$botId = getBotId(), other$botId = other.getBotId();
        if ((this$botId == null) ? (other$botId != null) : !this$botId.equals(other$botId)) return false;
        Object this$versionRecord = getVersionRecord(), other$versionRecord = other.getVersionRecord();
        if ((this$versionRecord == null) ? (other$versionRecord != null) : !this$versionRecord.equals(other$versionRecord))
            return false;
        Object this$botSnapshot = getBotSnapshot(), other$botSnapshot = other.getBotSnapshot();
        if ((this$botSnapshot == null) ? (other$botSnapshot != null) : !this$botSnapshot.equals(other$botSnapshot))
            return false;
        Object this$publishImChannel = getPublishImChannel(), other$publishImChannel = other.getPublishImChannel();
        if ((this$publishImChannel == null) ? (other$publishImChannel != null) : !this$publishImChannel.equals(other$publishImChannel))
            return false;
        Object this$publisher = getPublisher(), other$publisher = other.getPublisher();
        if ((this$publisher == null) ? (other$publisher != null) : !this$publisher.equals(other$publisher))
            return false;
        Object this$publishTime = getPublishTime(), other$publishTime = other.getPublishTime();
        return !((this$publishTime == null) ? (other$publishTime != null) : !this$publishTime.equals(other$publishTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PublishRecordDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $botId = getBotId();
        result = result * 59 + (($botId == null) ? 43 : $botId.hashCode());
        Object $versionRecord = getVersionRecord();
        result = result * 59 + (($versionRecord == null) ? 43 : $versionRecord.hashCode());
        Object $botSnapshot = getBotSnapshot();
        result = result * 59 + (($botSnapshot == null) ? 43 : $botSnapshot.hashCode());
        Object $publishImChannel = getPublishImChannel();
        result = result * 59 + (($publishImChannel == null) ? 43 : $publishImChannel.hashCode());
        Object $publisher = getPublisher();
        result = result * 59 + (($publisher == null) ? 43 : $publisher.hashCode());
        Object $publishTime = getPublishTime();
        return result * 59 + (($publishTime == null) ? 43 : $publishTime.hashCode());
    }

    public String toString() {
        return "PublishRecordDTO(id=" + getId() + ", botId=" + getBotId() + ", versionRecord=" + getVersionRecord() + ", botSnapshot=" + getBotSnapshot() + ", publishImChannel=" + getPublishImChannel() + ", publisher=" + getPublisher() + ", publishTime=" + getPublishTime() + ")";
    }

    /* 18 */
    public static PublishRecordDTOBuilder builder() {
        return new PublishRecordDTOBuilder();
    }

    public static class PublishRecordDTOBuilder {
        private Long id;
        private Long botId;
        private String versionRecord;

        public PublishRecordDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        private String botSnapshot;
        private String publishImChannel;
        private String publisher;
        private LocalDateTime publishTime;

        public PublishRecordDTOBuilder botId(Long botId) {
            this.botId = botId;
            return this;
        }

        public PublishRecordDTOBuilder versionRecord(String versionRecord) {
            this.versionRecord = versionRecord;
            return this;
        }

        public PublishRecordDTOBuilder botSnapshot(String botSnapshot) {
            this.botSnapshot = botSnapshot;
            return this;
        }

        public PublishRecordDTOBuilder publishImChannel(String publishImChannel) {
            this.publishImChannel = publishImChannel;
            return this;
        }

        public PublishRecordDTOBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public PublishRecordDTOBuilder publishTime(LocalDateTime publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        public PublishRecordDTO build() {
            return new PublishRecordDTO(this.id, this.botId, this.versionRecord, this.botSnapshot, this.publishImChannel, this.publisher, this.publishTime);
        }

        public String toString() {
            return "PublishRecordDTO.PublishRecordDTOBuilder(id=" + this.id + ", botId=" + this.botId + ", versionRecord=" + this.versionRecord + ", botSnapshot=" + this.botSnapshot + ", publishImChannel=" + this.publishImChannel + ", publisher=" + this.publisher + ", publishTime=" + this.publishTime + ")";
        }
    }

    public Long getId() {
        /* 21 */
        return this.id;
    }

    public Long getBotId() {
        /* 23 */
        return this.botId;
    }


    public String getVersionRecord() {
        /* 28 */
        return this.versionRecord;
    }

    public String getBotSnapshot() {
        /* 30 */
        return this.botSnapshot;
    }


    public String getPublishImChannel() {
        /* 35 */
        return this.publishImChannel;
    }


    public String getPublisher() {
        /* 40 */
        return this.publisher;
    }


    public LocalDateTime getPublishTime() {
        /* 45 */
        return this.publishTime;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/PublishRecordDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */