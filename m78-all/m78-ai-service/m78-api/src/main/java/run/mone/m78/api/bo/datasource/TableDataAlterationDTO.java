package run.mone.m78.api.bo.datasource;

import java.io.Serializable;
import java.util.Map;

public class TableDataAlterationDTO implements Serializable {
    private Integer datasourceId;
    private String tableName;
    private String operationType;

    /*  8 */
    public void setDatasourceId(Integer datasourceId) {
        this.datasourceId = datasourceId;
    }

    private Map<String, String> updateData;
    private Map<String, String> newData;
    private int id;

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public void setUpdateData(Map<String, String> updateData) {
        this.updateData = updateData;
    }

    public void setNewData(Map<String, String> newData) {
        this.newData = newData;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TableDataAlterationDTO)) return false;
        TableDataAlterationDTO other = (TableDataAlterationDTO) o;
        if (!other.canEqual(this)) return false;
        if (getId() != other.getId()) return false;
        Object this$datasourceId = getDatasourceId(), other$datasourceId = other.getDatasourceId();
        if ((this$datasourceId == null) ? (other$datasourceId != null) : !this$datasourceId.equals(other$datasourceId))
            return false;
        Object this$tableName = getTableName(), other$tableName = other.getTableName();
        if ((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName))
            return false;
        Object this$operationType = getOperationType(), other$operationType = other.getOperationType();
        if ((this$operationType == null) ? (other$operationType != null) : !this$operationType.equals(other$operationType))
            return false;
        Object this$updateData = (Object) getUpdateData(), other$updateData = (Object) other.getUpdateData();
        if ((this$updateData == null) ? (other$updateData != null) : !this$updateData.equals(other$updateData))
            return false;
        Object this$newData = (Object) getNewData(), other$newData = (Object) other.getNewData();
        return !((this$newData == null) ? (other$newData != null) : !this$newData.equals(other$newData));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TableDataAlterationDTO;
    }

    public int hashCode() {
                 int result = 1;
        result = result * 59 + getId();
        Object $datasourceId = getDatasourceId();
        result = result * 59 + (($datasourceId == null) ? 43 : $datasourceId.hashCode());
        Object $tableName = getTableName();
        result = result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
        Object $operationType = getOperationType();
        result = result * 59 + (($operationType == null) ? 43 : $operationType.hashCode());
        Object $updateData = (Object) getUpdateData();
        result = result * 59 + (($updateData == null) ? 43 : $updateData.hashCode());
        Object $newData = (Object) getNewData();
        return result * 59 + (($newData == null) ? 43 : $newData.hashCode());
    }

    public String toString() {
        return "TableDataAlterationDTO(datasourceId=" + getDatasourceId() + ", tableName=" + getTableName() + ", operationType=" + getOperationType() + ", updateData=" + getUpdateData() + ", newData=" + getNewData() + ", id=" + getId() + ")";
    }

    public Integer getDatasourceId() {
        /* 11 */
        return this.datasourceId;
    }

    public String getTableName() {
        /* 13 */
        return this.tableName;
    }

    public String getOperationType() {
        /* 15 */
        return this.operationType;
    }

    public Map<String, String> getUpdateData() {
        /* 17 */
        return this.updateData;
    }

    public Map<String, String> getNewData() {
        /* 19 */
        return this.newData;
    }

    public int getId() {
        /* 21 */
        return this.id;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/TableDataAlterationDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */