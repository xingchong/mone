package run.mone.ai.z.dto.code;

import java.util.List;

public class CodeReq {
    private String projectName;
    private String moduleName;
    private String code;
    private String data;
    private String requirement;
    private int limit;
    private Long knowledgeBaseId;
    private List<String> codeList;
    private List<String> fileTypeList;
    
    /* 14 */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setKnowledgeBaseId(Long knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setFileTypeList(List<String> fileTypeList) {
        this.fileTypeList = fileTypeList;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CodeReq)) return false;
        CodeReq other = (CodeReq) o;
        if (!other.canEqual(this)) return false;
        if (getLimit() != other.getLimit()) return false;
        Object this$knowledgeBaseId = getKnowledgeBaseId(), other$knowledgeBaseId = other.getKnowledgeBaseId();
        if ((this$knowledgeBaseId == null) ? (other$knowledgeBaseId != null) : !this$knowledgeBaseId.equals(other$knowledgeBaseId))
            return false;
        Object this$projectName = getProjectName(), other$projectName = other.getProjectName();
        if ((this$projectName == null) ? (other$projectName != null) : !this$projectName.equals(other$projectName))
            return false;
        Object this$moduleName = getModuleName(), other$moduleName = other.getModuleName();
        if ((this$moduleName == null) ? (other$moduleName != null) : !this$moduleName.equals(other$moduleName))
            return false;
        Object this$code = getCode(), other$code = other.getCode();
        if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code)) return false;
        Object this$data = getData(), other$data = other.getData();
        if ((this$data == null) ? (other$data != null) : !this$data.equals(other$data)) return false;
        Object this$requirement = getRequirement(), other$requirement = other.getRequirement();
        if ((this$requirement == null) ? (other$requirement != null) : !this$requirement.equals(other$requirement))
            return false;
        Object this$codeList = (Object) getCodeList(), other$codeList = (Object) other.getCodeList();
        if ((this$codeList == null) ? (other$codeList != null) : !this$codeList.equals(other$codeList)) return false;
        Object this$fileTypeList = (Object) getFileTypeList(), other$fileTypeList = (Object) other.getFileTypeList();
        return !((this$fileTypeList == null) ? (other$fileTypeList != null) : !this$fileTypeList.equals(other$fileTypeList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CodeReq;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getLimit();
        Object $knowledgeBaseId = getKnowledgeBaseId();
        result = result * 59 + (($knowledgeBaseId == null) ? 43 : $knowledgeBaseId.hashCode());
        Object $projectName = getProjectName();
        result = result * 59 + (($projectName == null) ? 43 : $projectName.hashCode());
        Object $moduleName = getModuleName();
        result = result * 59 + (($moduleName == null) ? 43 : $moduleName.hashCode());
        Object $code = getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        Object $data = getData();
        result = result * 59 + (($data == null) ? 43 : $data.hashCode());
        Object $requirement = getRequirement();
        result = result * 59 + (($requirement == null) ? 43 : $requirement.hashCode());
        Object $codeList = (Object) getCodeList();
        result = result * 59 + (($codeList == null) ? 43 : $codeList.hashCode());
        Object $fileTypeList = (Object) getFileTypeList();
        return result * 59 + (($fileTypeList == null) ? 43 : $fileTypeList.hashCode());
    }

    public String toString() {
        return "CodeReq(projectName=" + getProjectName() + ", moduleName=" + getModuleName() + ", code=" + getCode() + ", data=" + getData() + ", requirement=" + getRequirement() + ", limit=" + getLimit() + ", knowledgeBaseId=" + getKnowledgeBaseId() + ", codeList=" + getCodeList() + ", fileTypeList=" + getFileTypeList() + ")";
    }

    /* 15 */
    public static int $default$limit() {
        return 3;
    }

    public static CodeReqBuilder builder() {
        return new CodeReqBuilder();
    }

    public static class CodeReqBuilder {
        private String projectName;
        private String moduleName;
        private String code;
        private String data;
        private String requirement;

        public CodeReqBuilder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        private boolean limit$set;
        private int limit$value;
        private Long knowledgeBaseId;
        private List<String> codeList;
        private List<String> fileTypeList;

        public CodeReqBuilder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public CodeReqBuilder code(String code) {
            this.code = code;
            return this;
        }

        public CodeReqBuilder data(String data) {
            this.data = data;
            return this;
        }

        public CodeReqBuilder requirement(String requirement) {
            this.requirement = requirement;
            return this;
        }

        public CodeReqBuilder limit(int limit) {
            this.limit$value = limit;
            this.limit$set = true;
            return this;
        }

        public CodeReqBuilder knowledgeBaseId(Long knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        public CodeReqBuilder codeList(List<String> codeList) {
            this.codeList = codeList;
            return this;
        }

        public CodeReqBuilder fileTypeList(List<String> fileTypeList) {
            this.fileTypeList = fileTypeList;
            return this;
        }

        public CodeReq build() {
            int limit$value = this.limit$value;
            if (!this.limit$set) limit$value = CodeReq.$default$limit();
            return new CodeReq(this.projectName, this.moduleName, this.code, this.data, this.requirement, limit$value, this.knowledgeBaseId, this.codeList, this.fileTypeList);
        }

        public String toString() {
            return "CodeReq.CodeReqBuilder(projectName=" + this.projectName + ", moduleName=" + this.moduleName + ", code=" + this.code + ", data=" + this.data + ", requirement=" + this.requirement + ", limit$value=" + this.limit$value + ", knowledgeBaseId=" + this.knowledgeBaseId + ", codeList=" + this.codeList + ", fileTypeList=" + this.fileTypeList + ")";
        }
    }

    /* 16 */
    public CodeReq() {
        this.limit = $default$limit();
    }

    public CodeReq(String projectName, String moduleName, String code, String data, String requirement, int limit, Long knowledgeBaseId, List<String> codeList, List<String> fileTypeList) {
        /* 17 */
        this.projectName = projectName;
        this.moduleName = moduleName;
        this.code = code;
        this.data = data;
        this.requirement = requirement;
        this.limit = limit;
        this.knowledgeBaseId = knowledgeBaseId;
        this.codeList = codeList;
        this.fileTypeList = fileTypeList;
    }

    public String getProjectName() {
        /* 20 */
        return this.projectName;
    }

    public String getModuleName() {
        /* 22 */
        return this.moduleName;
    }

    public String getCode() {
        /* 24 */
        return this.code;
    }

    public String getData() {
        /* 26 */
        return this.data;
    }

    public String getRequirement() {
        /* 29 */
        return this.requirement;
    }

    public int getLimit() {
        /* 32 */
        return this.limit;
    }

    public Long getKnowledgeBaseId() {
        /* 34 */
        return this.knowledgeBaseId;
    }

    public List<String> getCodeList() {
        /* 36 */
        return this.codeList;
    }

    public List<String> getFileTypeList() {
        /* 38 */
        return this.fileTypeList;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/code/CodeReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */