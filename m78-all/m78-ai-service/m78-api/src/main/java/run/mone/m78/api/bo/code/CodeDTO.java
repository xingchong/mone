package run.mone.m78.api.bo.code;

import java.io.Serializable;
import java.util.List;

public class CodeDTO implements Serializable {
    private static final long serialVersionUID = 2437468757890536436L;

    private Long id;

    private CodeContentDTO code;

    private String name;

    private String desc;

    private Integer type;

    private String model;

    private String creator;

    private Long ctime;

    private Long utime;

    public CodeDTO() {}

    public CodeDTO(Long id, CodeContentDTO code, String name, String desc, Integer type, String model, String creator, Long ctime, Long utime) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.model = model;
        this.creator = creator;
        this.ctime = ctime;
        this.utime = utime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(CodeContentDTO code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public void setUtime(Long utime) {
        this.utime = utime;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CodeDTO))
            return false;
        CodeDTO other = (CodeDTO)o;
        if (!other.canEqual(this))
            return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id))
            return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type))
            return false;
        Object this$ctime = getCtime(), other$ctime = other.getCtime();
        if ((this$ctime == null) ? (other$ctime != null) : !this$ctime.equals(other$ctime))
            return false;
        Object this$utime = getUtime(), other$utime = other.getUtime();
        if ((this$utime == null) ? (other$utime != null) : !this$utime.equals(other$utime))
            return false;
        Object this$code = getCode(), other$code = other.getCode();
        if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
            return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
            return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc))
            return false;
        Object this$model = getModel(), other$model = other.getModel();
        if ((this$model == null) ? (other$model != null) : !this$model.equals(other$model))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        return !((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CodeDTO;
    }

    public int hashCode() {
                 int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $ctime = getCtime();
        result = result * 59 + (($ctime == null) ? 43 : $ctime.hashCode());
        Object $utime = getUtime();
        result = result * 59 + (($utime == null) ? 43 : $utime.hashCode());
        Object $code = getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $desc = getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        Object $model = getModel();
        result = result * 59 + (($model == null) ? 43 : $model.hashCode());
        Object $creator = getCreator();
        return result * 59 + (($creator == null) ? 43 : $creator.hashCode());
    }

    public String toString() {
        return "CodeDTO(id=" + getId() + ", code=" + getCode() + ", name=" + getName() + ", desc=" + getDesc() + ", type=" + getType() + ", model=" + getModel() + ", creator=" + getCreator() + ", ctime=" + getCtime() + ", utime=" + getUtime() + ")";
    }

    public static CodeDTOBuilder builder() {
        return new CodeDTOBuilder();
    }

    public static class CodeDTOBuilder {
        private Long id;

        private CodeDTO.CodeContentDTO code;

        private String name;

        private String desc;

        private Integer type;

        private String model;

        private String creator;

        private Long ctime;

        private Long utime;

        public CodeDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CodeDTOBuilder code(CodeDTO.CodeContentDTO code) {
            this.code = code;
            return this;
        }

        public CodeDTOBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CodeDTOBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public CodeDTOBuilder type(Integer type) {
            this.type = type;
            return this;
        }

        public CodeDTOBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CodeDTOBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public CodeDTOBuilder ctime(Long ctime) {
            this.ctime = ctime;
            return this;
        }

        public CodeDTOBuilder utime(Long utime) {
            this.utime = utime;
            return this;
        }

        public CodeDTO build() {
            return new CodeDTO(this.id, this.code, this.name, this.desc, this.type, this.model, this.creator, this.ctime, this.utime);
        }

        public String toString() {
            return "CodeDTO.CodeDTOBuilder(id=" + this.id + ", code=" + this.code + ", name=" + this.name + ", desc=" + this.desc + ", type=" + this.type + ", model=" + this.model + ", creator=" + this.creator + ", ctime=" + this.ctime + ", utime=" + this.utime + ")";
        }
    }

    public Long getId() {
        return this.id;
    }

    public CodeContentDTO getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getCreator() {
        return this.creator;
    }

    public Long getCtime() {
        return this.ctime;
    }

    public Long getUtime() {
        return this.utime;
    }

    public static class CodeContentDTO implements Serializable {
        private static final long serialVersionUID = 256698131566645853L;

        private String name;

        private String language;

        private List<CodeDTO.CodeParamDTO> params;

        private String code;

        private List<CodeDTO.CodeParamDTO> outs;

        public CodeContentDTO() {}

        public CodeContentDTO(String name, String language, List<CodeDTO.CodeParamDTO> params, String code, List<CodeDTO.CodeParamDTO> outs) {
            this.name = name;
            this.language = language;
            this.params = params;
            this.code = code;
            this.outs = outs;
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
            if (o == this)
                return true;
            if (!(o instanceof CodeContentDTO))
                return false;
            CodeContentDTO other = (CodeContentDTO)o;
            if (!other.canEqual(this))
                return false;
            Object this$name = getName(), other$name = other.getName();
            if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
                return false;
            Object this$language = getLanguage(), other$language = other.getLanguage();
            if ((this$language == null) ? (other$language != null) : !this$language.equals(other$language))
                return false;
            Object this$params = getParams(), other$params = other.getParams();
            if ((this$params == null) ? (other$params != null) : !this$params.equals(other$params))
                return false;
            Object this$code = getCode(), other$code = other.getCode();
            if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code))
                return false;
            Object this$outs = getOuts(), other$outs = other.getOuts();
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
            Object $params = getParams();
            result = result * 59 + (($params == null) ? 43 : $params.hashCode());
            Object $code = getCode();
            result = result * 59 + (($code == null) ? 43 : $code.hashCode());
            Object $outs = getOuts();
            return result * 59 + (($outs == null) ? 43 : $outs.hashCode());
        }

        public String toString() {
            return "CodeDTO.CodeContentDTO(name=" + getName() + ", language=" + getLanguage() + ", params=" + getParams() + ", code=" + getCode() + ", outs=" + getOuts() + ")";
        }

        public static CodeContentDTOBuilder builder() {
            return new CodeContentDTOBuilder();
        }

        public static class CodeContentDTOBuilder {
            private String name;

            private String language;

            private List<CodeDTO.CodeParamDTO> params;

            private String code;

            private List<CodeDTO.CodeParamDTO> outs;

            public CodeContentDTOBuilder name(String name) {
                this.name = name;
                return this;
            }

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
            return this.name;
        }

        public String getLanguage() {
            return this.language;
        }

        public List<CodeDTO.CodeParamDTO> getParams() {
            return this.params;
        }

        public String getCode() {
            return this.code;
        }

        public List<CodeDTO.CodeParamDTO> getOuts() {
            return this.outs;
        }
    }

    public static class CodeParamDTO implements Serializable {
        private static final long serialVersionUID = -7646951138269813280L;

        private String name;

        private String type;

        public CodeParamDTO() {}

        public CodeParamDTO(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof CodeParamDTO))
                return false;
            CodeParamDTO other = (CodeParamDTO)o;
            if (!other.canEqual(this))
                return false;
            Object this$name = getName(), other$name = other.getName();
            if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name))
                return false;
            Object this$type = getType(), other$type = other.getType();
            return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type));
        }

        protected boolean canEqual(Object other) {
            return other instanceof CodeParamDTO;
        }

        public int hashCode() {
             int result = 1;
            Object $name = getName();
            result = result * 59 + (($name == null) ? 43 : $name.hashCode());
            Object $type = getType();
            return result * 59 + (($type == null) ? 43 : $type.hashCode());
        }

        public String toString() {
            return "CodeDTO.CodeParamDTO(name=" + getName() + ", type=" + getType() + ")";
        }

        public static CodeParamDTOBuilder builder() {
            return new CodeParamDTOBuilder();
        }

        public static class CodeParamDTOBuilder {
            private String name;

            private String type;

            public CodeParamDTOBuilder name(String name) {
                this.name = name;
                return this;
            }

            public CodeParamDTOBuilder type(String type) {
                this.type = type;
                return this;
            }

            public CodeDTO.CodeParamDTO build() {
                return new CodeDTO.CodeParamDTO(this.name, this.type);
            }

            public String toString() {
                return "CodeDTO.CodeParamDTO.CodeParamDTOBuilder(name=" + this.name + ", type=" + this.type + ")";
            }
        }

        public String getName() {
            return this.name;
        }

        public String getType() {
            return this.type;
        }
    }
}
