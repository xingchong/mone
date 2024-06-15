package run.mone.ai.z.dto;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;

public class ZQuestion implements Serializable {
    @HttpApiDocClassDefine(value = "token", description = "chat gpt 的token， chatGPT==true的时候使用", defaultValue = "")
    private String token;
    @HttpApiDocClassDefine(value = "question", description = "提示词，问题", defaultValue = "")
    private String question;

    /*  8 */
    public void setToken(String token) {
        this.token = token;
    }

    @HttpApiDocClassDefine(value = "num", description = "答案数量", defaultValue = "")
    private int num;
    @HttpApiDocClassDefine(value = "chatGPT", description = "使用chatGPT", defaultValue = "")
    private boolean chatGPT;

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setChatGPT(boolean chatGPT) {
        this.chatGPT = chatGPT;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZQuestion)) return false;
        ZQuestion other = (ZQuestion) o;
        if (!other.canEqual(this)) return false;
        if (getNum() != other.getNum()) return false;
        if (isChatGPT() != other.isChatGPT()) return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;
        Object this$question = getQuestion(), other$question = other.getQuestion();
        return !((this$question == null) ? (other$question != null) : !this$question.equals(other$question));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZQuestion;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getNum();
        result = result * 59 + (isChatGPT() ? 79 : 97);
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $question = getQuestion();
        return result * 59 + (($question == null) ? 43 : $question.hashCode());
    }

    public String toString() {
        return "ZQuestion(token=" + getToken() + ", question=" + getQuestion() + ", num=" + getNum() + ", chatGPT=" + isChatGPT() + ")";
    }

    public String getToken() {
        /* 11 */
        return this.token;
    }

    public String getQuestion() {
        /* 13 */
        return this.question;
    }

    public int getNum() {
        /* 15 */
        return this.num;
    }

    public boolean isChatGPT() {
        /* 17 */
        return this.chatGPT;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZQuestion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */