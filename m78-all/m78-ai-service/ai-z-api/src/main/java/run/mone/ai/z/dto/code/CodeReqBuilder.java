package run.mone.ai.z.dto.code;

import java.util.List;

public class CodeReqBuilder {
    private String projectName;
    private String moduleName;
    private String code;
    private String data;
    private String requirement;
    private boolean limit$set;
    private int limit$value;
    private Long knowledgeBaseId;
    private List<String> codeList;
    private List<String> fileTypeList;

    /* 15 */
    public CodeReqBuilder projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/code/CodeReq$CodeReqBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */