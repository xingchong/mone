  package run.mone.m78.api.bo.im;
  
  import java.time.LocalDateTime;
  
  
  
  public class PublishRecordDTOBuilder
  {
    private Long id;
    private Long botId;
    private String versionRecord;
    private String botSnapshot;
    private String publishImChannel;
    private String publisher;
    private LocalDateTime publishTime;
    
    public PublishRecordDTOBuilder id(Long id) {
/* 18 */     this.id = id; return this; } public PublishRecordDTOBuilder botId(Long botId) { this.botId = botId; return this; } public PublishRecordDTOBuilder versionRecord(String versionRecord) { this.versionRecord = versionRecord; return this; } public PublishRecordDTOBuilder botSnapshot(String botSnapshot) { this.botSnapshot = botSnapshot; return this; } public PublishRecordDTOBuilder publishImChannel(String publishImChannel) { this.publishImChannel = publishImChannel; return this; } public PublishRecordDTOBuilder publisher(String publisher) { this.publisher = publisher; return this; } public PublishRecordDTOBuilder publishTime(LocalDateTime publishTime) { this.publishTime = publishTime; return this; } public PublishRecordDTO build() { return new PublishRecordDTO(this.id, this.botId, this.versionRecord, this.botSnapshot, this.publishImChannel, this.publisher, this.publishTime); } public String toString() { return "PublishRecordDTO.PublishRecordDTOBuilder(id=" + this.id + ", botId=" + this.botId + ", versionRecord=" + this.versionRecord + ", botSnapshot=" + this.botSnapshot + ", publishImChannel=" + this.publishImChannel + ", publisher=" + this.publisher + ", publishTime=" + this.publishTime + ")"; }
  
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/PublishRecordDTO$PublishRecordDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */