package run.mone.m78.api.bo.table;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.util.List;

public class DbTableUpdateReq {
    @HttpApiDocClassDefine(value = "columnInfoList", description = "列信息")
    private List<M78ColumnInfo> columnInfoList;
    @HttpApiDocClassDefine(value = "tableName", description = "表名")
    private String tableName;
    @HttpApiDocClassDefine(value = "botId", description = "机器人id")
    private Long botId;
    @HttpApiDocClassDefine(value = "workspaceId", description = "workspaceId")
    private Long workspaceId;
    @HttpApiDocClassDefine(value = "demo", description = "示例内容")
    private String demo;
    @HttpApiDocClassDefine(value = "comment", description = "表注释")
    private String tableDesc;

    public DbTableUpdateReq() {
    }

    /* 19 */
    public DbTableUpdateReq(List<M78ColumnInfo> columnInfoList, String tableName, Long botId, Long workspaceId, String demo, String tableDesc) {
        this.columnInfoList = columnInfoList;
        this.tableName = tableName;
        this.botId = botId;
        this.workspaceId = workspaceId;
        this.demo = demo;
        this.tableDesc = tableDesc;
    }

    /* 20 */
    public void setColumnInfoList(List<M78ColumnInfo> columnInfoList) {
        this.columnInfoList = columnInfoList;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setBotId(Long botId) {
        this.botId = botId;
    }

    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public void setTableDesc(String tableDesc) {
        this.tableDesc = tableDesc;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DbTableUpdateReq)) return false;
        DbTableUpdateReq other = (DbTableUpdateReq) o;
        if (!other.canEqual(this)) return false;
        Object this$botId = getBotId(), other$botId = other.getBotId();
        if ((this$botId == null) ? (other$botId != null) : !this$botId.equals(other$botId)) return false;
        Object this$workspaceId = getWorkspaceId(), other$workspaceId = other.getWorkspaceId();
        if ((this$workspaceId == null) ? (other$workspaceId != null) : !this$workspaceId.equals(other$workspaceId))
            return false;
        Object this$columnInfoList = (Object) getColumnInfoList(), other$columnInfoList = (Object) other.getColumnInfoList();
        if ((this$columnInfoList == null) ? (other$columnInfoList != null) : !this$columnInfoList.equals(other$columnInfoList))
            return false;
        Object this$tableName = getTableName(), other$tableName = other.getTableName();
        if ((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName))
            return false;
        Object this$demo = getDemo(), other$demo = other.getDemo();
        if ((this$demo == null) ? (other$demo != null) : !this$demo.equals(other$demo)) return false;
        Object this$tableDesc = getTableDesc(), other$tableDesc = other.getTableDesc();
        return !((this$tableDesc == null) ? (other$tableDesc != null) : !this$tableDesc.equals(other$tableDesc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DbTableUpdateReq;
    }

    public int hashCode() {
        int result = 1;
        Object $botId = getBotId();
        result = result * 59 + (($botId == null) ? 43 : $botId.hashCode());
        Object $workspaceId = getWorkspaceId();
        result = result * 59 + (($workspaceId == null) ? 43 : $workspaceId.hashCode());
        Object $columnInfoList = (Object) getColumnInfoList();
        result = result * 59 + (($columnInfoList == null) ? 43 : $columnInfoList.hashCode());
        Object $tableName = getTableName();
        result = result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
        Object $demo = getDemo();
        result = result * 59 + (($demo == null) ? 43 : $demo.hashCode());
        Object $tableDesc = getTableDesc();
        return result * 59 + (($tableDesc == null) ? 43 : $tableDesc.hashCode());
    }

    public String toString() {
        return "DbTableUpdateReq(columnInfoList=" + getColumnInfoList() + ", tableName=" + getTableName() + ", botId=" + getBotId() + ", workspaceId=" + getWorkspaceId() + ", demo=" + getDemo() + ", tableDesc=" + getTableDesc() + ")";
    }

    /* 21 */
    public static DbTableUpdateReqBuilder builder() {
        return new DbTableUpdateReqBuilder();
    }

    public static class DbTableUpdateReqBuilder {
        private List<M78ColumnInfo> columnInfoList;
        private String tableName;
        private Long botId;

        public DbTableUpdateReqBuilder columnInfoList(List<M78ColumnInfo> columnInfoList) {
            this.columnInfoList = columnInfoList;
            return this;
        }

        private Long workspaceId;
        private String demo;
        private String tableDesc;

        public DbTableUpdateReqBuilder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public DbTableUpdateReqBuilder botId(Long botId) {
            this.botId = botId;
            return this;
        }

        public DbTableUpdateReqBuilder workspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DbTableUpdateReqBuilder demo(String demo) {
            this.demo = demo;
            return this;
        }

        public DbTableUpdateReqBuilder tableDesc(String tableDesc) {
            this.tableDesc = tableDesc;
            return this;
        }

        public DbTableUpdateReq build() {
            return new DbTableUpdateReq(this.columnInfoList, this.tableName, this.botId, this.workspaceId, this.demo, this.tableDesc);
        }

        public String toString() {
            return "DbTableUpdateReq.DbTableUpdateReqBuilder(columnInfoList=" + this.columnInfoList + ", tableName=" + this.tableName + ", botId=" + this.botId + ", workspaceId=" + this.workspaceId + ", demo=" + this.demo + ", tableDesc=" + this.tableDesc + ")";
        }
    }

    public List<M78ColumnInfo> getColumnInfoList() {
        /* 25 */
        return this.columnInfoList;
    }

    public String getTableName() {
        /* 28 */
        return this.tableName;
    }

    public Long getBotId() {
        /* 31 */
        return this.botId;
    }

    public Long getWorkspaceId() {
        /* 34 */
        return this.workspaceId;
    }

    public String getDemo() {
        /* 37 */
        return this.demo;
    }

    public String getTableDesc() {
        /* 40 */
        return this.tableDesc;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableUpdateReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */