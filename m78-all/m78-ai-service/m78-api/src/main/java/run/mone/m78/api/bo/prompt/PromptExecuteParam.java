package run.mone.m78.api.bo.prompt;

import java.util.Map;

public class PromptExecuteParam {
    private String user;
    private String uuid;
    private String action;
    private Map<String, String> params;

    public void setUser(String user) {
        /* 12 */
        this.user = user;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PromptExecuteParam)) return false;
        PromptExecuteParam other = (PromptExecuteParam) o;
        if (!other.canEqual(this)) return false;
        Object this$user = getUser(), other$user = other.getUser();
        if ((this$user == null) ? (other$user != null) : !this$user.equals(other$user)) return false;
        Object this$uuid = getUuid(), other$uuid = other.getUuid();
        if ((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)) return false;
        Object this$action = getAction(), other$action = other.getAction();
        if ((this$action == null) ? (other$action != null) : !this$action.equals(other$action)) return false;
        Object this$params = (Object) getParams(), other$params = (Object) other.getParams();
        return !((this$params == null) ? (other$params != null) : !this$params.equals(other$params));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PromptExecuteParam;
    }

    public int hashCode() {
        int result = 1;
        Object $user = getUser();
        result = result * 59 + (($user == null) ? 43 : $user.hashCode());
        Object $uuid = getUuid();
        result = result * 59 + (($uuid == null) ? 43 : $uuid.hashCode());
        Object $action = getAction();
        result = result * 59 + (($action == null) ? 43 : $action.hashCode());
        Object $params = (Object) getParams();
        return result * 59 + (($params == null) ? 43 : $params.hashCode());
    }

    public String toString() {
        return "PromptExecuteParam(user=" + getUser() + ", uuid=" + getUuid() + ", action=" + getAction() + ", params=" + getParams() + ")";
    }

    public String getUser() {
        /* 15 */
        return this.user;
    }

    public String getUuid() {
        /* 17 */
        return this.uuid;
    }


    public String getAction() {
        /* 22 */
        return this.action;
    }

    public Map<String, String> getParams() {
        /* 24 */
        return this.params;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/prompt/PromptExecuteParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */