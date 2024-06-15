package run.mone.m78.api.bo.translate;

import java.util.List;

public class TextTranslateChatParam {
    private List<String> requirements;
    private String fromLanguage;
    private String toLanguage;
    private String fromText;
    private String toText;
    private String chatContent;
    private String user;

    /* 14 */
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

    public void setToText(String toText) {
        this.toText = toText;
    }

    public void setChatContent(String chatContent) {
        this.chatContent = chatContent;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TextTranslateChatParam)) return false;
        TextTranslateChatParam other = (TextTranslateChatParam) o;
        if (!other.canEqual(this)) return false;
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
        Object this$toText = getToText(), other$toText = other.getToText();
        if ((this$toText == null) ? (other$toText != null) : !this$toText.equals(other$toText)) return false;
        Object this$chatContent = getChatContent(), other$chatContent = other.getChatContent();
        if ((this$chatContent == null) ? (other$chatContent != null) : !this$chatContent.equals(other$chatContent))
            return false;
        Object this$user = getUser(), other$user = other.getUser();
        return !((this$user == null) ? (other$user != null) : !this$user.equals(other$user));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TextTranslateChatParam;
    }

    public int hashCode() {
        int result = 1;
        Object $requirements = (Object) getRequirements();
        result = result * 59 + (($requirements == null) ? 43 : $requirements.hashCode());
        Object $fromLanguage = getFromLanguage();
        result = result * 59 + (($fromLanguage == null) ? 43 : $fromLanguage.hashCode());
        Object $toLanguage = getToLanguage();
        result = result * 59 + (($toLanguage == null) ? 43 : $toLanguage.hashCode());
        Object $fromText = getFromText();
        result = result * 59 + (($fromText == null) ? 43 : $fromText.hashCode());
        Object $toText = getToText();
        result = result * 59 + (($toText == null) ? 43 : $toText.hashCode());
        Object $chatContent = getChatContent();
        result = result * 59 + (($chatContent == null) ? 43 : $chatContent.hashCode());
        Object $user = getUser();
        return result * 59 + (($user == null) ? 43 : $user.hashCode());
    }

    public String toString() {
        return "TextTranslateChatParam(requirements=" + getRequirements() + ", fromLanguage=" + getFromLanguage() + ", toLanguage=" + getToLanguage() + ", fromText=" + getFromText() + ", toText=" + getToText() + ", chatContent=" + getChatContent() + ", user=" + getUser() + ")";
    }

    public TextTranslateChatParam() {
    }

    /* 16 */
    public TextTranslateChatParam(List<String> requirements, String fromLanguage, String toLanguage, String fromText, String toText, String chatContent, String user) {
        this.requirements = requirements;
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
        this.fromText = fromText;
        this.toText = toText;
        this.chatContent = chatContent;
        this.user = user;
    }

    /* 17 */
    public static TextTranslateChatParamBuilder builder() {
        return new TextTranslateChatParamBuilder();
    }

    public static class TextTranslateChatParamBuilder {
        private List<String> requirements;
        private String fromLanguage;
        private String toLanguage;

        public TextTranslateChatParamBuilder requirements(List<String> requirements) {
            this.requirements = requirements;
            return this;
        }

        private String fromText;
        private String toText;
        private String chatContent;
        private String user;

        public TextTranslateChatParamBuilder fromLanguage(String fromLanguage) {
            this.fromLanguage = fromLanguage;
            return this;
        }

        public TextTranslateChatParamBuilder toLanguage(String toLanguage) {
            this.toLanguage = toLanguage;
            return this;
        }

        public TextTranslateChatParamBuilder fromText(String fromText) {
            this.fromText = fromText;
            return this;
        }

        public TextTranslateChatParamBuilder toText(String toText) {
            this.toText = toText;
            return this;
        }

        public TextTranslateChatParamBuilder chatContent(String chatContent) {
            this.chatContent = chatContent;
            return this;
        }

        public TextTranslateChatParamBuilder user(String user) {
            this.user = user;
            return this;
        }

        public TextTranslateChatParam build() {
            return new TextTranslateChatParam(this.requirements, this.fromLanguage, this.toLanguage, this.fromText, this.toText, this.chatContent, this.user);
        }

        public String toString() {
            return "TextTranslateChatParam.TextTranslateChatParamBuilder(requirements=" + this.requirements + ", fromLanguage=" + this.fromLanguage + ", toLanguage=" + this.toLanguage + ", fromText=" + this.fromText + ", toText=" + this.toText + ", chatContent=" + this.chatContent + ", user=" + this.user + ")";
        }
    }

    public List<String> getRequirements() {
        /* 20 */
        return this.requirements;
    }

    public String getFromLanguage() {
        /* 22 */
        return this.fromLanguage;
    }

    public String getToLanguage() {
        /* 24 */
        return this.toLanguage;
    }

    public String getFromText() {
        /* 26 */
        return this.fromText;
    }

    public String getToText() {
        /* 28 */
        return this.toText;
    }

    public String getChatContent() {
        /* 30 */
        return this.chatContent;
    }

    public String getUser() {
        /* 32 */
        return this.user;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/TextTranslateChatParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */