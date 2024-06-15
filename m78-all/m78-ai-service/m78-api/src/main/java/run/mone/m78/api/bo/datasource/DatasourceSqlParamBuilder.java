package run.mone.m78.api.bo.datasource;

import java.util.List;


public class DatasourceSqlParamBuilder {
    private Integer connectionId;
    private String comment;
    private String customKnowledge;
    private Integer lowerBound;
    private Integer upperBound;
    private List<String> tableNames;

    public DatasourceSqlParamBuilder connectionId(Integer connectionId) {
        /* 17 */
        this.connectionId = connectionId;
        return this;
    }

    public DatasourceSqlParamBuilder comment(String comment) {
        this.comment = comment;
        return this;
    }

    public DatasourceSqlParamBuilder customKnowledge(String customKnowledge) {
        this.customKnowledge = customKnowledge;
        return this;
    }

    public DatasourceSqlParamBuilder lowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public DatasourceSqlParamBuilder upperBound(Integer upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    public DatasourceSqlParamBuilder tableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    public DatasourceSqlParam build() {
        return new DatasourceSqlParam(this.connectionId, this.comment, this.customKnowledge, this.lowerBound, this.upperBound, this.tableNames);
    }

    public String toString() {
        return "DatasourceSqlParam.DatasourceSqlParamBuilder(connectionId=" + this.connectionId + ", comment=" + this.comment + ", customKnowledge=" + this.customKnowledge + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ", tableNames=" + this.tableNames + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/DatasourceSqlParam$DatasourceSqlParamBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */