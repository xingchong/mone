package run.mone.ai.z.dto;

import java.util.List;


public class ZCsQaResDTOBuilder {
    private Long fileId;
    private String fileName;
    private String creator;
    private List<ZQARes> qAList;

    public ZCsQaResDTOBuilder fileId(Long fileId) {
        /* 18 */
        this.fileId = fileId;
        return this;
    }

    public ZCsQaResDTOBuilder fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public ZCsQaResDTOBuilder creator(String creator) {
        this.creator = creator;
        return this;
    }

    public ZCsQaResDTOBuilder qAList(List<ZQARes> qAList) {
        this.qAList = qAList;
        return this;
    }

    public ZCsQaResDTO build() {
        return new ZCsQaResDTO(this.fileId, this.fileName, this.creator, this.qAList);
    }

    public String toString() {
        return "ZCsQaResDTO.ZCsQaResDTOBuilder(fileId=" + this.fileId + ", fileName=" + this.fileName + ", creator=" + this.creator + ", qAList=" + this.qAList + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/ZCsQaResDTO$ZCsQaResDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */