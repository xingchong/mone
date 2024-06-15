package run.mone.m78.api.bo.code;

import java.io.Serializable;
import java.util.List;


public class CodeContentDTO
        implements Serializable {
    private static final long serialVersionUID = 256698131566645853L;
    private String name;
    private String language;
    private List<CodeDTO.CodeParamDTO> params;
    private String code;
    private List<CodeDTO.CodeParamDTO> outs;

    public CodeContentDTO() {
    }

    public CodeContentDTO(String name, String language, List<CodeDTO.CodeParamDTO> params, String code, List<CodeDTO.CodeParamDTO> outs) {
        /* 42 */
        this.name = name;
        this.language = language;
        this.params = params;
        this.code = code;
        this.outs = outs;
        /* 43 */
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setParams(List<CodeDTO.CodeParamDTO> params) {
        this.params = params;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setOuts(List<CodeDTO.CodeParamDTO> outs) {
        this.outs = outs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CodeContentDTO)) return false;
        CodeContentDTO other = (CodeContentDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$language = getLanguage(), other$language = other.getLanguage();
        if ((this$language == null) ? (other$language != null) : !this$language.equals(other$language)) return false;
        Object this$params = (Object) getParams(), other$params = (Object) other.getParams();
        if ((this$params == null) ? (other$params != null) : !this$params.equals(other$params)) return false;
        Object this$code = getCode(), other$code = other.getCode();
        if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code)) return false;
        Object this$outs = (Object) getOuts(), other$outs = (Object) other.getOuts();
        return !((this$outs == null) ? (other$outs != null) : !this$outs.equals(other$outs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CodeContentDTO;
    }

    public int hashCode() {
        int result = 1;
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $language = getLanguage();
        result = result * 59 + (($language == null) ? 43 : $language.hashCode());
        Object $params = (Object) getParams();
        result = result * 59 + (($params == null) ? 43 : $params.hashCode());
        Object $code = getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        Object $outs = (Object) getOuts();
        return result * 59 + (($outs == null) ? 43 : $outs.hashCode());
    }

    public String toString() {
        return "CodeDTO.CodeContentDTO(name=" + getName() + ", language=" + getLanguage() + ", params=" + getParams() + ", code=" + getCode() + ", outs=" + getOuts() + ")";
    }

    /* 44 */
    public static CodeContentDTOBuilder builder() {
        return new CodeContentDTOBuilder();
    }

    public static class CodeContentDTOBuilder {
        private String name;
        private String language;

        public CodeContentDTOBuilder name(String name) {
            this.name = name;
            return this;
        }

        private List<CodeDTO.CodeParamDTO> params;
        private String code;
        private List<CodeDTO.CodeParamDTO> outs;

        public CodeContentDTOBuilder language(String language) {
            this.language = language;
            return this;
        }

        public CodeContentDTOBuilder params(List<CodeDTO.CodeParamDTO> params) {
            this.params = params;
            return this;
        }

        public CodeContentDTOBuilder code(String code) {
            this.code = code;
            return this;
        }

        public CodeContentDTOBuilder outs(List<CodeDTO.CodeParamDTO> outs) {
            this.outs = outs;
            return this;
        }

        public CodeDTO.CodeContentDTO build() {
            return new CodeDTO.CodeContentDTO(this.name, this.language, this.params, this.code, this.outs);
        }

        public String toString() {
            return "CodeDTO.CodeContentDTO.CodeContentDTOBuilder(name=" + this.name + ", language=" + this.language + ", params=" + this.params + ", code=" + this.code + ", outs=" + this.outs + ")";
        }
    }


    public String getName() {
        /* 49 */
        return this.name;
    }

    public String getLanguage() {
        /* 51 */
        return this.language;
    }

    public List<CodeDTO.CodeParamDTO> getParams() {
        /* 53 */
        return this.params;
    }

    public String getCode() {
        /* 55 */
        return this.code;
    }

    public List<CodeDTO.CodeParamDTO> getOuts() {
        /* 57 */
        return this.outs;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/code/CodeDTO$CodeContentDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */