package run.mone.m78.api.bo.datasource;

import java.io.Serializable;

public class TableQueryDTO implements Serializable {
    private int connectionId;
    private String tableName;
    private Integer lowerBound;
    private Integer upperBound;

    public void setConnectionId(int connectionId) {
        /* 12 */
        this.connectionId = connectionId;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setLowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(Integer upperBound) {
        this.upperBound = upperBound;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TableQueryDTO)) return false;
        TableQueryDTO other = (TableQueryDTO) o;
        if (!other.canEqual(this)) return false;
        if (getConnectionId() != other.getConnectionId()) return false;
        Object this$lowerBound = getLowerBound(), other$lowerBound = other.getLowerBound();
        if ((this$lowerBound == null) ? (other$lowerBound != null) : !this$lowerBound.equals(other$lowerBound))
            return false;
        Object this$upperBound = getUpperBound(), other$upperBound = other.getUpperBound();
        if ((this$upperBound == null) ? (other$upperBound != null) : !this$upperBound.equals(other$upperBound))
            return false;
        Object this$tableName = getTableName(), other$tableName = other.getTableName();
        return !((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TableQueryDTO;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getConnectionId();
        Object $lowerBound = getLowerBound();
        result = result * 59 + (($lowerBound == null) ? 43 : $lowerBound.hashCode());
        Object $upperBound = getUpperBound();
        result = result * 59 + (($upperBound == null) ? 43 : $upperBound.hashCode());
        Object $tableName = getTableName();
        return result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
    }

    public String toString() {
        return "TableQueryDTO(connectionId=" + getConnectionId() + ", tableName=" + getTableName() + ", lowerBound=" + getLowerBound() + ", upperBound=" + getUpperBound() + ")";
    }

    /* 13 */   TableQueryDTO(int connectionId, String tableName, Integer lowerBound, Integer upperBound) {
        this.connectionId = connectionId;
        this.tableName = tableName;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public static TableQueryDTOBuilder builder() {
        return new TableQueryDTOBuilder();
    }

    public static class TableQueryDTOBuilder {
        private int connectionId;
        private String tableName;

        public TableQueryDTOBuilder connectionId(int connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        private Integer lowerBound;
        private Integer upperBound;

        public TableQueryDTOBuilder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableQueryDTOBuilder lowerBound(Integer lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }

        public TableQueryDTOBuilder upperBound(Integer upperBound) {
            this.upperBound = upperBound;
            return this;
        }

        public TableQueryDTO build() {
            return new TableQueryDTO(this.connectionId, this.tableName, this.lowerBound, this.upperBound);
        }

        public String toString() {
            return "TableQueryDTO.TableQueryDTOBuilder(connectionId=" + this.connectionId + ", tableName=" + this.tableName + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ")";
        }
    }

    public int getConnectionId() {
        /* 16 */
        return this.connectionId;
    }

    public String getTableName() {
        /* 18 */
        return this.tableName;
    }

    public Integer getLowerBound() {
        /* 21 */
        return this.lowerBound;
    }

    public Integer getUpperBound() {
        /* 23 */
        return this.upperBound;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/TableQueryDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */