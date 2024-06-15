package run.mone.ai.z.dto.sensitiveword;


public class SensitiveTestDTOBuilder {
    private String content;
    private Long id;
    private Boolean testAll;

    public SensitiveTestDTOBuilder content(String content) {
        /* 15 */
        this.content = content;
        return this;
    }

    public SensitiveTestDTOBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public SensitiveTestDTOBuilder testAll(Boolean testAll) {
        this.testAll = testAll;
        return this;
    }

    public SensitiveTestDTO build() {
        return new SensitiveTestDTO(this.content, this.id, this.testAll);
    }

    public String toString() {
        return "SensitiveTestDTO.SensitiveTestDTOBuilder(content=" + this.content + ", id=" + this.id + ", testAll=" + this.testAll + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/sensitiveword/SensitiveTestDTO$SensitiveTestDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */