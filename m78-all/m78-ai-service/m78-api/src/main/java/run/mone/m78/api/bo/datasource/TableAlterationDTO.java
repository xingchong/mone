package run.mone.m78.api.bo.datasource;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TableAlterationDTO implements Serializable {
    @HttpApiDocClassDefine(value = "datasourceId", required = true, description = "数据源的Id", defaultValue = "")
    private Integer datasourceId;
    @HttpApiDocClassDefine(value = "tableName", required = true, description = "表名", defaultValue = "")
    private String tableName;
    @HttpApiDocClassDefine(value = "columnOperations", required = true, description = "列操作，内容如下：[\n        {\n        \t\"operationType\": \"操作类型，包括ADD/MODIFY/DROP，分别对应新增一列，修改一列，删除一列\"\n            \"columnType\": \"bigint(20) unsigned\",\n            \"columnComment\": \"修改后的列注释\",\n            \"columnName\": \"列名\",\n            \"nullable\": \"约束，非必传\",\n            \"defaultValue\": \"默认值，非必传\"\n        }\n    ]", defaultValue = "")
    private List<Map<String, String>> columnOperations;

    /* 14 */
    public void setDatasourceId(Integer datasourceId) {
        this.datasourceId = datasourceId;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setColumnOperations(List<Map<String, String>> columnOperations) {
        this.columnOperations = columnOperations;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof TableAlterationDTO)) return false;
        TableAlterationDTO other = (TableAlterationDTO) o;
        if (!other.canEqual(this)) return false;
        Object this$datasourceId = getDatasourceId(), other$datasourceId = other.getDatasourceId();
        if ((this$datasourceId == null) ? (other$datasourceId != null) : !this$datasourceId.equals(other$datasourceId))
            return false;
        Object this$tableName = getTableName(), other$tableName = other.getTableName();
        if ((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName))
            return false;
        Object this$columnOperations = (Object) getColumnOperations(), other$columnOperations = (Object) other.getColumnOperations();
        return !((this$columnOperations == null) ? (other$columnOperations != null) : !this$columnOperations.equals(other$columnOperations));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TableAlterationDTO;
    }

    public int hashCode() {
        int result = 1;
        Object $datasourceId = getDatasourceId();
        result = result * 59 + (($datasourceId == null) ? 43 : $datasourceId.hashCode());
        Object $tableName = getTableName();
        result = result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
        Object $columnOperations = (Object) getColumnOperations();
        return result * 59 + (($columnOperations == null) ? 43 : $columnOperations.hashCode());
    }

    public String toString() {
        return "TableAlterationDTO(datasourceId=" + getDatasourceId() + ", tableName=" + getTableName() + ", columnOperations=" + getColumnOperations() + ")";
    }


    public Integer getDatasourceId() {
        /* 18 */
        return this.datasourceId;
    }

    public String getTableName() {
        /* 21 */
        return this.tableName;
    }


    public List<Map<String, String>> getColumnOperations() {
        /* 41 */
        return this.columnOperations;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/TableAlterationDTO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */