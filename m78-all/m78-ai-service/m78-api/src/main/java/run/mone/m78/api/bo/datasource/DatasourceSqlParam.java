package run.mone.m78.api.bo.datasource;

import java.util.List;

public class DatasourceSqlParam {
    private Integer connectionId;
    private String comment;
    private String customKnowledge;
    private Integer lowerBound;
    private Integer upperBound;
    private List<String> tableNames;

    public void setConnectionId(Integer connectionId) {
        /* 14 */
        this.connectionId = connectionId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCustomKnowledge(String customKnowledge) {
        this.customKnowledge = customKnowledge;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }

    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DatasourceSqlParam)) return false;
        DatasourceSqlParam other = (DatasourceSqlParam) o;
        if (!other.canEqual(this)) return false;
        Object this$connectionId = getConnectionId(), other$connectionId = other.getConnectionId();
        if ((this$connectionId == null) ? (other$connectionId != null) : !this$connectionId.equals(other$connectionId))
            return false;
        Object this$lowerBound = getLowerBound(), other$lowerBound = other.getLowerBound();
        if ((this$lowerBound == null) ? (other$lowerBound != null) : !this$lowerBound.equals(other$lowerBound))
            return false;
        Object this$upperBound = getUpperBound(), other$upperBound = other.getUpperBound();
        if ((this$upperBound == null) ? (other$upperBound != null) : !this$upperBound.equals(other$upperBound))
            return false;
        Object this$comment = getComment(), other$comment = other.getComment();
        if ((this$comment == null) ? (other$comment != null) : !this$comment.equals(other$comment)) return false;
        Object this$customKnowledge = getCustomKnowledge(), other$customKnowledge = other.getCustomKnowledge();
        if ((this$customKnowledge == null) ? (other$customKnowledge != null) : !this$customKnowledge.equals(other$customKnowledge))
            return false;
        Object this$tableNames = (Object) getTableNames(), other$tableNames = (Object) other.getTableNames();
        return !((this$tableNames == null) ? (other$tableNames != null) : !this$tableNames.equals(other$tableNames));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DatasourceSqlParam;
    }

    public int hashCode() {
        int result = 1;
        Object $connectionId = getConnectionId();
        result = result * 59 + (($connectionId == null) ? 43 : $connectionId.hashCode());
        Object $lowerBound = getLowerBound();
        result = result * 59 + (($lowerBound == null) ? 43 : $lowerBound.hashCode());
        Object $upperBound = getUpperBound();
        result = result * 59 + (($upperBound == null) ? 43 : $upperBound.hashCode());
        Object $comment = getComment();
        result = result * 59 + (($comment == null) ? 43 : $comment.hashCode());
        Object $customKnowledge = getCustomKnowledge();
        result = result * 59 + (($customKnowledge == null) ? 43 : $customKnowledge.hashCode());
        Object $tableNames = (Object) getTableNames();
        return result * 59 + (($tableNames == null) ? 43 : $tableNames.hashCode());
    }

    public String toString() {
        return "DatasourceSqlParam(connectionId=" + getConnectionId() + ", comment=" + getComment() + ", customKnowledge=" + getCustomKnowledge() + ", lowerBound=" + getLowerBound() + ", upperBound=" + getUpperBound() + ", tableNames=" + getTableNames() + ")";
    }

    public DatasourceSqlParam() {
    }

    /* 16 */
    public DatasourceSqlParam(Integer connectionId, String comment, String customKnowledge, Integer lowerBound, Integer upperBound, List<String> tableNames) {
        this.connectionId = connectionId;
        this.comment = comment;
        this.customKnowledge = customKnowledge;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.tableNames = tableNames;
    }

    /* 17 */
    public static DatasourceSqlParamBuilder builder() {
        return new DatasourceSqlParamBuilder();
    }

    public static class DatasourceSqlParamBuilder {
        private Integer connectionId;
        private String comment;
        private String customKnowledge;

        public DatasourceSqlParamBuilder connectionId(Integer connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        private Integer lowerBound;
        private Integer upperBound;
        private List<String> tableNames;

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

    public Integer getConnectionId() {
        /* 20 */
        return this.connectionId;
    }

    public String getComment() {
        /* 22 */
        return this.comment;
    }

    public String getCustomKnowledge() {
        /* 24 */
        return this.customKnowledge;
    }

    public Integer getLowerBound() {
        /* 26 */
        return this.lowerBound;
    }

    public Integer getUpperBound() {
        /* 28 */
        return this.upperBound;
    }

    public List<String> getTableNames() {
        /* 30 */
        return this.tableNames;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/DatasourceSqlParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */