package run.mone.ai.z.dto;

import java.io.Serializable;
import java.util.List;


public class HistoryReq implements Serializable {
    long id;
    String prompt;
    String response;
    List<String> history;

    /*  8 */
    public void setId(long id) {
        this.id = id;
    }

    String token;
    String model;
    long prompt_tokens;
    long completion_tokens;

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrompt_tokens(long prompt_tokens) {
        this.prompt_tokens = prompt_tokens;
    }

    public void setCompletion_tokens(long completion_tokens) {
        this.completion_tokens = completion_tokens;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof HistoryReq)) return false;
        HistoryReq other = (HistoryReq) o;
        if (!other.canEqual(this)) return false;
        if (getId() != other.getId()) return false;
        if (getPrompt_tokens() != other.getPrompt_tokens()) return false;
        if (getCompletion_tokens() != other.getCompletion_tokens()) return false;
        Object this$prompt = getPrompt(), other$prompt = other.getPrompt();
        if ((this$prompt == null) ? (other$prompt != null) : !this$prompt.equals(other$prompt)) return false;
        Object this$response = getResponse(), other$response = other.getResponse();
        if ((this$response == null) ? (other$response != null) : !this$response.equals(other$response)) return false;
        Object this$history = (Object) getHistory(), other$history = (Object) other.getHistory();
        if ((this$history == null) ? (other$history != null) : !this$history.equals(other$history)) return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;
        Object this$model = getModel(), other$model = other.getModel();
        return !((this$model == null) ? (other$model != null) : !this$model.equals(other$model));
    }

    protected boolean canEqual(Object other) {
        return other instanceof HistoryReq;
    }

    public int hashCode() {
        int result = 1;
        long $id = getId();
        result = result * 59 + (int) ($id >>> 32L ^ $id);
        long $prompt_tokens = getPrompt_tokens();
        result = result * 59 + (int) ($prompt_tokens >>> 32L ^ $prompt_tokens);
        long $completion_tokens = getCompletion_tokens();
        result = result * 59 + (int) ($completion_tokens >>> 32L ^ $completion_tokens);
        Object $prompt = getPrompt();
        result = result * 59 + (($prompt == null) ? 43 : $prompt.hashCode());
        Object $response = getResponse();
        result = result * 59 + (($response == null) ? 43 : $response.hashCode());
        Object $history = (Object) getHistory();
        result = result * 59 + (($history == null) ? 43 : $history.hashCode());
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $model = getModel();
        return result * 59 + (($model == null) ? 43 : $model.hashCode());
    }

    public String toString() {
        return "HistoryReq(id=" + getId() + ", prompt=" + getPrompt() + ", response=" + getResponse() + ", history=" + getHistory() + ", token=" + getToken() + ", model=" + getModel() + ", prompt_tokens=" + getPrompt_tokens() + ", completion_tokens=" + getCompletion_tokens() + ")";
    }

    /* 10 */
    public long getId() {
        return this.id;
    }

    /* 11 */
    public String getPrompt() {
        return this.prompt;
    }

    /* 12 */
    public String getResponse() {
        return this.response;
    }

    /* 13 */
    public List<String> getHistory() {
        return this.history;
    }

    /* 14 */
    public String getToken() {
        return this.token;
    }

    /* 15 */
    public String getModel() {
        return this.model;
    }

    /* 16 */
    public long getPrompt_tokens() {
        return this.prompt_tokens;
    }

    public long getCompletion_tokens() {
        /* 17 */
        return this.completion_tokens;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/HistoryReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */