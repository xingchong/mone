package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.List;

public class ZHistoryRes implements Serializable {
    private long id;
    private String userName;
    private Integer userType;
    private Long dataId;

    /*  8 */
    public void setId(long id) {
        this.id = id;
    }

    private String prompt;
    private String response;
    private List<String> history;
    private Long timestamp;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZHistoryRes)) return false;
        ZHistoryRes other = (ZHistoryRes) o;
        if (!other.canEqual(this)) return false;
        if (getId() != other.getId()) return false;
        Object this$userType = getUserType(), other$userType = other.getUserType();
        if ((this$userType == null) ? (other$userType != null) : !this$userType.equals(other$userType)) return false;
        Object this$dataId = getDataId(), other$dataId = other.getDataId();
        if ((this$dataId == null) ? (other$dataId != null) : !this$dataId.equals(other$dataId)) return false;
        Object this$timestamp = getTimestamp(), other$timestamp = other.getTimestamp();
        if ((this$timestamp == null) ? (other$timestamp != null) : !this$timestamp.equals(other$timestamp))
            return false;
        Object this$userName = getUserName(), other$userName = other.getUserName();
        if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;
        Object this$prompt = getPrompt(), other$prompt = other.getPrompt();
        if ((this$prompt == null) ? (other$prompt != null) : !this$prompt.equals(other$prompt)) return false;
        Object this$response = getResponse(), other$response = other.getResponse();
        if ((this$response == null) ? (other$response != null) : !this$response.equals(other$response)) return false;
        Object this$history = (Object) getHistory(), other$history = (Object) other.getHistory();
        return !((this$history == null) ? (other$history != null) : !this$history.equals(other$history));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZHistoryRes;
    }

    public int hashCode() {
        int result = 1;
        long $id = getId();
        result = result * 59 + (int) ($id >>> 32L ^ $id);
        Object $userType = getUserType();
        result = result * 59 + (($userType == null) ? 43 : $userType.hashCode());
        Object $dataId = getDataId();
        result = result * 59 + (($dataId == null) ? 43 : $dataId.hashCode());
        Object $timestamp = getTimestamp();
        result = result * 59 + (($timestamp == null) ? 43 : $timestamp.hashCode());
        Object $userName = getUserName();
        result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
        Object $prompt = getPrompt();
        result = result * 59 + (($prompt == null) ? 43 : $prompt.hashCode());
        Object $response = getResponse();
        result = result * 59 + (($response == null) ? 43 : $response.hashCode());
        Object $history = (Object) getHistory();
        return result * 59 + (($history == null) ? 43 : $history.hashCode());
    }

    public String toString() {
        return "ZHistoryRes(id=" + getId() + ", userName=" + getUserName() + ", userType=" + getUserType() + ", dataId=" + getDataId() + ", prompt=" + getPrompt() + ", response=" + getResponse() + ", history=" + getHistory() + ", timestamp=" + getTimestamp() + ")";
    }

    public long getId() {
        /* 10 */
        return this.id;
    }

    public String getUserName() {
        /* 12 */
        return this.userName;
    }

    public Integer getUserType() {
        /* 14 */
        return this.userType;
    }

    public Long getDataId() {
        /* 16 */
        return this.dataId;
    }

    public String getPrompt() {
        /* 18 */
        return this.prompt;
    }

    public String getResponse() {
        /* 20 */
        return this.response;
    }

    public List<String> getHistory() {
        /* 22 */
        return this.history;
    }

    public Long getTimestamp() {
        /* 24 */
        return this.timestamp;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZHistoryRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */