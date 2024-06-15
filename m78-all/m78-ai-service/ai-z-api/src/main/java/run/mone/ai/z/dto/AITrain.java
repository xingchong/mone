package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.util.List;
import java.io.Serializable;

public class AITrain implements Serializable {
    @HttpApiDocClassDefine(value = "prompt", required = true, description = "提示词", defaultValue = "")
    private String prompt;

    /*  9 */
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @HttpApiDocClassDefine(value = "response", required = true, description = "回复", defaultValue = "")
    private String response;
    @HttpApiDocClassDefine(value = "context", required = true, description = "上下文", defaultValue = "")
    private List<String> context;

    public void setResponse(String response) {
        this.response = response;
    }

    public void setContext(List<String> context) {
        this.context = context;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AITrain)) return false;
        AITrain other = (AITrain) o;
        if (!other.canEqual(this)) return false;
        Object this$prompt = getPrompt(), other$prompt = other.getPrompt();
        if ((this$prompt == null) ? (other$prompt != null) : !this$prompt.equals(other$prompt)) return false;
        Object this$response = getResponse(), other$response = other.getResponse();
        if ((this$response == null) ? (other$response != null) : !this$response.equals(other$response)) return false;
        Object this$context = (Object) getContext(), other$context = (Object) other.getContext();
        return !((this$context == null) ? (other$context != null) : !this$context.equals(other$context));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AITrain;
    }

    public int hashCode() {
                 int result = 1;
        Object $prompt = getPrompt();
        result = result * 59 + (($prompt == null) ? 43 : $prompt.hashCode());
        Object $response = getResponse();
        result = result * 59 + (($response == null) ? 43 : $response.hashCode());
        Object $context = (Object) getContext();
        return result * 59 + (($context == null) ? 43 : $context.hashCode());
    }

    public String toString() {
        return "AITrain(prompt=" + getPrompt() + ", response=" + getResponse() + ", context=" + getContext() + ")";
    }

    public String getPrompt() {
        /* 12 */
        return this.prompt;
    }

    public String getResponse() {
        /* 14 */
        return this.response;
    }

    public List<String> getContext() {
        /* 16 */
        return this.context;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/AITrain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */