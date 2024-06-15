  package run.mone.m78.api.bo.im;

  import java.io.Serializable;

  public class ExecuteBotReqDTO
    implements Serializable {
    private String username;
    private Long botId;
    private String input;
    private String topicId;

    public void setUsername(String username) {
/* 13 */     this.username = username; } public void setBotId(Long botId) { this.botId = botId; } public void setInput(String input) { this.input = input; } public void setTopicId(String topicId) { this.topicId = topicId; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof ExecuteBotReqDTO)) return false;  ExecuteBotReqDTO other = (ExecuteBotReqDTO)o; if (!other.canEqual(this)) return false;  Object this$botId = getBotId(), other$botId = other.getBotId(); if ((this$botId == null) ? (other$botId != null) : !this$botId.equals(other$botId)) return false;  Object this$username = getUsername(), other$username = other.getUsername(); if ((this$username == null) ? (other$username != null) : !this$username.equals(other$username)) return false;  Object this$input = getInput(), other$input = other.getInput(); if ((this$input == null) ? (other$input != null) : !this$input.equals(other$input)) return false;  Object this$topicId = getTopicId(), other$topicId = other.getTopicId(); return !((this$topicId == null) ? (other$topicId != null) : !this$topicId.equals(other$topicId)); } protected boolean canEqual(Object other) { return other instanceof ExecuteBotReqDTO; } public int hashCode() {  int  result = 1; Object $botId = getBotId(); result = result * 59 + (($botId == null) ? 43 : $botId.hashCode()); Object $username = getUsername(); result = result * 59 + (($username == null) ? 43 : $username.hashCode()); Object $input = getInput(); result = result * 59 + (($input == null) ? 43 : $input.hashCode()); Object $topicId = getTopicId(); return result * 59 + (($topicId == null) ? 43 : $topicId.hashCode()); } public String toString() { return "ExecuteBotReqDTO(username=" + getUsername() + ", botId=" + getBotId() + ", input=" + getInput() + ", topicId=" + getTopicId() + ")"; }


/* 16 */   public String getUsername() { return this.username; }
/* 17 */   public Long getBotId() { return this.botId; }
/* 18 */   public String getInput() { return this.input; } public String getTopicId() {
/* 19 */     return this.topicId;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/im/ExecuteBotReqDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */