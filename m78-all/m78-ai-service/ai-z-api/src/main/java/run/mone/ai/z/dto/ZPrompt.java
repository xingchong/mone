package run.mone.ai.z.dto;


import java.io.Serializable;
import java.util.List;

public class ZPrompt implements Serializable {
    private String token;
    private String prompt;
    private String type;

    /*  9 */
    public void setToken(String token) {
        this.token = token;
    }

    private String name;
    private int num;
    private boolean chatGPT;
    private List<Integer> types;

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setChatGPT(boolean chatGPT) {
        this.chatGPT = chatGPT;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ZPrompt)) return false;
        ZPrompt other = (ZPrompt) o;
        if (!other.canEqual(this)) return false;
        if (getNum() != other.getNum()) return false;
        if (isChatGPT() != other.isChatGPT()) return false;
        Object this$token = getToken(), other$token = other.getToken();
        if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;
        Object this$prompt = getPrompt(), other$prompt = other.getPrompt();
        if ((this$prompt == null) ? (other$prompt != null) : !this$prompt.equals(other$prompt)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$types = (Object) getTypes(), other$types = (Object) other.getTypes();
        return !((this$types == null) ? (other$types != null) : !this$types.equals(other$types));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ZPrompt;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getNum();
        result = result * 59 + (isChatGPT() ? 79 : 97);
        Object $token = getToken();
        result = result * 59 + (($token == null) ? 43 : $token.hashCode());
        Object $prompt = getPrompt();
        result = result * 59 + (($prompt == null) ? 43 : $prompt.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $types = (Object) getTypes();
        return result * 59 + (($types == null) ? 43 : $types.hashCode());
    }

    public String toString() {
        return "ZPrompt(token=" + getToken() + ", prompt=" + getPrompt() + ", type=" + getType() + ", name=" + getName() + ", num=" + getNum() + ", chatGPT=" + isChatGPT() + ", types=" + getTypes() + ")";
    }

    /* 11 */
    public String getToken() {
        return this.token;
    }

    /* 12 */
    public String getPrompt() {
        return this.prompt;
    }

    public String getType() {
        /* 13 */
        return this.type;
    }

    public String getName() {
        /* 15 */
        return this.name;
    }

    public int getNum() {
        /* 17 */
        return this.num;
    }

    public boolean isChatGPT() {
        /* 21 */
        return this.chatGPT;
    }

    public List<Integer> getTypes() {
        /* 23 */
        return this.types;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZPrompt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */