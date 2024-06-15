package run.mone.m78.api.bo.translate;


import java.util.List;

public class TranslateBuilder {
    private String uuid;
    private String fromText;
    private String toText;
    private String fromLanguage;
    private String toLanguage;
    private List<String> requirements;
    private int favorite;
    private int type;

    /* 14 */
    public TranslateBuilder uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/Translate$TranslateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */