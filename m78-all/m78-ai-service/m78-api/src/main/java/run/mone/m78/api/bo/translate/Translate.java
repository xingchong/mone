package run.mone.m78.api.bo.translate;

import java.io.Serializable;
import java.util.List;

public class Translate implements Serializable {
    private String uuid;
    private String fromText;
    private String toText;
    private String fromLanguage;
    private String toLanguage;
    private List<String> requirements;
    private int favorite;
    private int type;

    /* 13 */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setFromText(String fromText) {
        this.fromText = fromText;
    }

    public void setToText(String toText) {
        this.toText = toText;
    }

    public void setFromLanguage(String fromLanguage) {
        this.fromLanguage = fromLanguage;
    }

    public void setToLanguage(String toLanguage) {
        this.toLanguage = toLanguage;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Translate)) return false;
        Translate other = (Translate) o;
        if (!other.canEqual(this)) return false;
        if (getFavorite() != other.getFavorite()) return false;
        if (getType() != other.getType()) return false;
        Object this$uuid = getUuid(), other$uuid = other.getUuid();
        if ((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)) return false;
        Object this$fromText = getFromText(), other$fromText = other.getFromText();
        if ((this$fromText == null) ? (other$fromText != null) : !this$fromText.equals(other$fromText)) return false;
        Object this$toText = getToText(), other$toText = other.getToText();
        if ((this$toText == null) ? (other$toText != null) : !this$toText.equals(other$toText)) return false;
        Object this$fromLanguage = getFromLanguage(), other$fromLanguage = other.getFromLanguage();
        if ((this$fromLanguage == null) ? (other$fromLanguage != null) : !this$fromLanguage.equals(other$fromLanguage))
            return false;
        Object this$toLanguage = getToLanguage(), other$toLanguage = other.getToLanguage();
        if ((this$toLanguage == null) ? (other$toLanguage != null) : !this$toLanguage.equals(other$toLanguage))
            return false;
        Object this$requirements = (Object) getRequirements(), other$requirements = (Object) other.getRequirements();
        return !((this$requirements == null) ? (other$requirements != null) : !this$requirements.equals(other$requirements));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Translate;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getFavorite();
        result = result * 59 + getType();
        Object $uuid = getUuid();
        result = result * 59 + (($uuid == null) ? 43 : $uuid.hashCode());
        Object $fromText = getFromText();
        result = result * 59 + (($fromText == null) ? 43 : $fromText.hashCode());
        Object $toText = getToText();
        result = result * 59 + (($toText == null) ? 43 : $toText.hashCode());
        Object $fromLanguage = getFromLanguage();
        result = result * 59 + (($fromLanguage == null) ? 43 : $fromLanguage.hashCode());
        Object $toLanguage = getToLanguage();
        result = result * 59 + (($toLanguage == null) ? 43 : $toLanguage.hashCode());
        Object $requirements = (Object) getRequirements();
        return result * 59 + (($requirements == null) ? 43 : $requirements.hashCode());
    }

    public String toString() {
        return "Translate(uuid=" + getUuid() + ", fromText=" + getFromText() + ", toText=" + getToText() + ", fromLanguage=" + getFromLanguage() + ", toLanguage=" + getToLanguage() + ", requirements=" + getRequirements() + ", favorite=" + getFavorite() + ", type=" + getType() + ")";
    }

    /* 14 */   Translate(String uuid, String fromText, String toText, String fromLanguage, String toLanguage, List<String> requirements, int favorite, int type) {
        this.uuid = uuid;
        this.fromText = fromText;
        this.toText = toText;
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
        this.requirements = requirements;
        this.favorite = favorite;
        this.type = type;
    }

    public static TranslateBuilder builder() {
        return new TranslateBuilder();
    }

    public static class TranslateBuilder {
        private String uuid;
        private String fromText;
        private String toText;
        private String fromLanguage;

        public TranslateBuilder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        private String toLanguage;
        private List<String> requirements;
        private int favorite;
        private int type;

        public TranslateBuilder fromText(String fromText) {
            this.fromText = fromText;
            return this;
        }

        public TranslateBuilder toText(String toText) {
            this.toText = toText;
            return this;
        }

        public TranslateBuilder fromLanguage(String fromLanguage) {
            this.fromLanguage = fromLanguage;
            return this;
        }

        public TranslateBuilder toLanguage(String toLanguage) {
            this.toLanguage = toLanguage;
            return this;
        }

        public TranslateBuilder requirements(List<String> requirements) {
            this.requirements = requirements;
            return this;
        }

        public TranslateBuilder favorite(int favorite) {
            this.favorite = favorite;
            return this;
        }

        public TranslateBuilder type(int type) {
            this.type = type;
            return this;
        }

        public Translate build() {
            return new Translate(this.uuid, this.fromText, this.toText, this.fromLanguage, this.toLanguage, this.requirements, this.favorite, this.type);
        }

        public String toString() {
            return "Translate.TranslateBuilder(uuid=" + this.uuid + ", fromText=" + this.fromText + ", toText=" + this.toText + ", fromLanguage=" + this.fromLanguage + ", toLanguage=" + this.toLanguage + ", requirements=" + this.requirements + ", favorite=" + this.favorite + ", type=" + this.type + ")";
        }
    }

    public String getUuid() {
        /* 17 */
        return this.uuid;
    }

    public String getFromText() {
        /* 19 */
        return this.fromText;
    }

    public String getToText() {
        /* 21 */
        return this.toText;
    }

    public String getFromLanguage() {
        /* 23 */
        return this.fromLanguage;
    }

    public String getToLanguage() {
        /* 25 */
        return this.toLanguage;
    }

    public List<String> getRequirements() {
        /* 27 */
        return this.requirements;
    }

    public int getFavorite() {
        /* 29 */
        return this.favorite;
    }

    public int getType() {
        /* 31 */
        return this.type;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/Translate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */