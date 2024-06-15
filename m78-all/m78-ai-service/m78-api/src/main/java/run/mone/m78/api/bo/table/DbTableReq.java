package run.mone.m78.api.bo.table;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.io.Serializable;
import java.util.List;

public class DbTableReq implements Serializable {
    private static final long serialVersionUID = -420519440091860590L;
    @HttpApiDocClassDefine(value = "tableDesc", description = "表注释")
    private String tableDesc;
    @HttpApiDocClassDefine(value = "model", description = "模型")
    private String model;
    @HttpApiDocClassDefine(value = "botId", description = "机器人id")
    private Long botId;
    @HttpApiDocClassDefine(value = "workspaceId", description = "工作空间id")
    private Long workspaceId;
    @HttpApiDocClassDefine(value = "columnInfoList", description = "列信息")
    private List<M78ColumnInfo> columnInfoList;
    @HttpApiDocClassDefine(value = "ddl", description = "如果是ai生成的ddl，则将生成的ddl传递过来, 否则不用传递")
    private String ddl;
    @HttpApiDocClassDefine(value = "tableName", description = "表名")
    private String tableName;
    @HttpApiDocClassDefine(value = "id", description = "表id")
    private Long id;

    public DbTableReq() {
    }

    /* 17 */
    public DbTableReq(String tableDesc, String model, Long botId, Long workspaceId, List<M78ColumnInfo> columnInfoList, String ddl, String tableName, Long id) {
        this.tableDesc = tableDesc;
        this.model = model;
        this.botId = botId;
        this.workspaceId = workspaceId;
        this.columnInfoList = columnInfoList;
        this.ddl = ddl;
        this.tableName = tableName;
        this.id = id;
    }

    /* 18 */
    public void setTableDesc(String tableDesc) {
        this.tableDesc = tableDesc;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBotId(Long botId) {
        this.botId = botId;
    }

    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public void setColumnInfoList(List<M78ColumnInfo> columnInfoList) {
        this.columnInfoList = columnInfoList;
    }

    public void setDdl(String ddl) {
        this.ddl = ddl;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DbTableReq)) return false;
        DbTableReq other = (DbTableReq) o;
        if (!other.canEqual(this)) return false;
        Object this$botId = getBotId(), other$botId = other.getBotId();
        if ((this$botId == null) ? (other$botId != null) : !this$botId.equals(other$botId)) return false;
        Object this$workspaceId = getWorkspaceId(), other$workspaceId = other.getWorkspaceId();
        if ((this$workspaceId == null) ? (other$workspaceId != null) : !this$workspaceId.equals(other$workspaceId))
            return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$tableDesc = getTableDesc(), other$tableDesc = other.getTableDesc();
        if ((this$tableDesc == null) ? (other$tableDesc != null) : !this$tableDesc.equals(other$tableDesc))
            return false;
        Object this$model = getModel(), other$model = other.getModel();
        if ((this$model == null) ? (other$model != null) : !this$model.equals(other$model)) return false;
        Object this$columnInfoList = (Object) getColumnInfoList(), other$columnInfoList = (Object) other.getColumnInfoList();
        if ((this$columnInfoList == null) ? (other$columnInfoList != null) : !this$columnInfoList.equals(other$columnInfoList))
            return false;
        Object this$ddl = getDdl(), other$ddl = other.getDdl();
        if ((this$ddl == null) ? (other$ddl != null) : !this$ddl.equals(other$ddl)) return false;
        Object this$tableName = getTableName(), other$tableName = other.getTableName();
        return !((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DbTableReq;
    }

    public int hashCode() {
        int result = 1;
        Object $botId = getBotId();
        result = result * 59 + (($botId == null) ? 43 : $botId.hashCode());
        Object $workspaceId = getWorkspaceId();
        result = result * 59 + (($workspaceId == null) ? 43 : $workspaceId.hashCode());
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $tableDesc = getTableDesc();
        result = result * 59 + (($tableDesc == null) ? 43 : $tableDesc.hashCode());
        Object $model = getModel();
        result = result * 59 + (($model == null) ? 43 : $model.hashCode());
        Object $columnInfoList = (Object) getColumnInfoList();
        result = result * 59 + (($columnInfoList == null) ? 43 : $columnInfoList.hashCode());
        Object $ddl = getDdl();
        result = result * 59 + (($ddl == null) ? 43 : $ddl.hashCode());
        Object $tableName = getTableName();
        return result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
    }

    public String toString() {
        return "DbTableReq(tableDesc=" + getTableDesc() + ", model=" + getModel() + ", botId=" + getBotId() + ", workspaceId=" + getWorkspaceId() + ", columnInfoList=" + getColumnInfoList() + ", ddl=" + getDdl() + ", tableName=" + getTableName() + ", id=" + getId() + ")";
    }

    /* 19 */
    public static DbTableReqBuilder builder() {
        return new DbTableReqBuilder();
    }

    public static class DbTableReqBuilder {
        private String tableDesc;
        private String model;
        private Long botId;
        private Long workspaceId;

        public DbTableReqBuilder tableDesc(String tableDesc) {
            this.tableDesc = tableDesc;
            return this;
        }

        private List<M78ColumnInfo> columnInfoList;
        private String ddl;
        private String tableName;
        private Long id;

        public DbTableReqBuilder model(String model) {
            this.model = model;
            return this;
        }

        public DbTableReqBuilder botId(Long botId) {
            this.botId = botId;
            return this;
        }

        public DbTableReqBuilder workspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DbTableReqBuilder columnInfoList(List<M78ColumnInfo> columnInfoList) {
            this.columnInfoList = columnInfoList;
            return this;
        }

        public DbTableReqBuilder ddl(String ddl) {
            this.ddl = ddl;
            return this;
        }

        public DbTableReqBuilder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public DbTableReqBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public DbTableReq build() {
            return new DbTableReq(this.tableDesc, this.model, this.botId, this.workspaceId, this.columnInfoList, this.ddl, this.tableName, this.id);
        }

        public String toString() {
            return "DbTableReq.DbTableReqBuilder(tableDesc=" + this.tableDesc + ", model=" + this.model + ", botId=" + this.botId + ", workspaceId=" + this.workspaceId + ", columnInfoList=" + this.columnInfoList + ", ddl=" + this.ddl + ", tableName=" + this.tableName + ", id=" + this.id + ")";
        }
    }


    public String getTableDesc() {
        /* 25 */
        return this.tableDesc;
    }

    public String getModel() {
        /* 28 */
        return this.model;
    }

    public Long getBotId() {
        /* 31 */
        return this.botId;
    }

    public Long getWorkspaceId() {
        /* 34 */
        return this.workspaceId;
    }

    public List<M78ColumnInfo> getColumnInfoList() {
        /* 37 */
        return this.columnInfoList;
    }

    public String getDdl() {
        /* 40 */
        return this.ddl;
    }

    public String getTableName() {
        /* 43 */
        return this.tableName;
    }

    public Long getId() {
        /* 46 */
        return this.id;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */