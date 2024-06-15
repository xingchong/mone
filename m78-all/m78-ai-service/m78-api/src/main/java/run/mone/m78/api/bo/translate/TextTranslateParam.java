package run.mone.m78.api.bo.translate;

import java.util.List;

public class TextTranslateParam {
    private String uuid;
    private int type;
    private List<String> requirements;
    private String fromLanguage;
    private String toLanguage;
    private String fromText;
    private String user;

    /* 14 */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    public void setFromLanguage(String fromLanguage) {
        this.fromLanguage = fromLanguage;
    }

    public void setToLanguage(String toLanguage) {
        this.toLanguage = toLanguage;
    }

    public void setFromText(String fromText) {
        this.fromText = fromText;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TextTranslateParam)) return false;
        TextTranslateParam other = (TextTranslateParam) o;
        if (!other.canEqual(this)) return false;
        if (getType() != other.getType()) return false;
        Object this$uuid = getUuid(), other$uuid = other.getUuid();
        if ((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)) return false;
        Object this$requirements = (Object) getRequirements(), other$requirements = (Object) other.getRequirements();
        if ((this$requirements == null) ? (other$requirements != null) : !this$requirements.equals(other$requirements))
            return false;
        Object this$fromLanguage = getFromLanguage(), other$fromLanguage = other.getFromLanguage();
        if ((this$fromLanguage == null) ? (other$fromLanguage != null) : !this$fromLanguage.equals(other$fromLanguage))
            return false;
        Object this$toLanguage = getToLanguage(), other$toLanguage = other.getToLanguage();
        if ((this$toLanguage == null) ? (other$toLanguage != null) : !this$toLanguage.equals(other$toLanguage))
            return false;
        Object this$fromText = getFromText(), other$fromText = other.getFromText();
        if ((this$fromText == null) ? (other$fromText != null) : !this$fromText.equals(other$fromText)) return false;
        Object this$user = getUser(), other$user = other.getUser();
        return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TextTranslateParam;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getType();
        Object $uuid = getUuid();
        result = result * 59 + (($uuid == null) ? 43 : $uuid.hashCode());
        Object $requirements = (Object) getRequirements();
        result = result * 59 + (($requirements == null) ? 43 : $requirements.hashCode());
        Object $fromLanguage = getFromLanguage();
        result = result * 59 + (($fromLanguage == null) ? 43 : $fromLanguage.hashCode());
        Object $toLanguage = getToLanguage();
        result = result * 59 + (($toLanguage == null) ? 43 : $toLanguage.hashCode());
        Object $fromText = getFromText();
        result = result * 59 + (($fromText == null) ? 43 : $fromText.hashCode());
        Object $user = getUser();
        return result * 59 + (($user == null) ? 43 : $user.hashCode());
    }

    public String toString() {
        return "TextTranslateParam(uuid=" + getUuid() + ", type=" + getType() + ", requirements=" + getRequirements() + ", fromLanguage=" + getFromLanguage() + ", toLanguage=" + getToLanguage() + ", fromText=" + getFromText() + ", user=" + getUser() + ")";
    }

    public TextTranslateParam() {
    }

    /* 16 */
    public TextTranslateParam(String uuid, int type, List<String> requirements, String fromLanguage, String toLanguage, String fromText, String user) {
        this.uuid = uuid;
        this.type = type;
        this.requirements = requirements;
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
        this.fromText = fromText;
        this.user = user;
    }

    /* 17 */
    public static TextTranslateParamBuilder builder() {
        return new TextTranslateParamBuilder();
    }

    public static class TextTranslateParamBuilder {
        private String uuid;
        private int type;
        private List<String> requirements;

        public TextTranslateParamBuilder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        private String fromLanguage;
        private String toLanguage;
        private String fromText;
        private String user;

        public TextTranslateParamBuilder type(int type) {
            this.type = type;
            return this;
        }

        public TextTranslateParamBuilder requirements(List<String> requirements) {
            this.requirements = requirements;
            return this;
        }

        public TextTranslateParamBuilder fromLanguage(String fromLanguage) {
            this.fromLanguage = fromLanguage;
            return this;
        }

        public TextTranslateParamBuilder toLanguage(String toLanguage) {
            this.toLanguage = toLanguage;
            return this;
        }

        public TextTranslateParamBuilder fromText(String fromText) {
            this.fromText = fromText;
            return this;
        }

        public TextTranslateParamBuilder user(String user) {
            this.user = user;
            return this;
        }

        public TextTranslateParam build() {
            return new TextTranslateParam(this.uuid, this.type, this.requirements, this.fromLanguage, this.toLanguage, this.fromText, this.user);
        }

        public String toString() {
            return "TextTranslateParam.TextTranslateParamBuilder(uuid=" + this.uuid + ", type=" + this.type + ", requirements=" + this.requirements + ", fromLanguage=" + this.fromLanguage + ", toLanguage=" + this.toLanguage + ", fromText=" + this.fromText + ", user=" + this.user + ")";
        }
    }

    public String getUuid() {
        /* 20 */
        return this.uuid;
    }

    public int getType() {
        /* 22 */
        return this.type;
    }

    public List<String> getRequirements() {
        /* 24 */
        return this.requirements;
    }

    public String getFromLanguage() {
        /* 26 */
        return this.fromLanguage;
    }

    public String getToLanguage() {
        /* 28 */
        return this.toLanguage;
    }

    public String getFromText() {
        /* 30 */
        return this.fromText;
    }

    public String getUser() {
        /* 32 */
        return this.user;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */