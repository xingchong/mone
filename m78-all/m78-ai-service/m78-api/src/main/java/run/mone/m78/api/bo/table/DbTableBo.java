package run.mone.m78.api.bo.table;


import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

import java.time.LocalDateTime;

public class DbTableBo {
    @HttpApiDocClassDefine(value = "id", description = "id")
    private Long id;
    @HttpApiDocClassDefine(value = "workspaceId", description = "工作空间id")
    private Long workspaceId;
    @HttpApiDocClassDefine(value = "tableName", description = "表名")
    private String tableName;
    @HttpApiDocClassDefine(value = "creator", description = "创建人")
    private String creator;
    @HttpApiDocClassDefine(value = "gmtCreate", description = "创建时间")
    private LocalDateTime createTime;

    /* 16 */
    public void setId(Long id) {
        this.id = id;
    }

    public void setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DbTableBo)) return false;
        DbTableBo other = (DbTableBo) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$workspaceId = getWorkspaceId(), other$workspaceId = other.getWorkspaceId();
        if ((this$workspaceId == null) ? (other$workspaceId != null) : !this$workspaceId.equals(other$workspaceId))
            return false;
        Object this$tableName = getTableName(), other$tableName = other.getTableName();
        if ((this$tableName == null) ? (other$tableName != null) : !this$tableName.equals(other$tableName))
            return false;
        Object this$creator = getCreator(), other$creator = other.getCreator();
        if ((this$creator == null) ? (other$creator != null) : !this$creator.equals(other$creator)) return false;
        Object this$createTime = getCreateTime(), other$createTime = other.getCreateTime();
        return !((this$createTime == null) ? (other$createTime != null) : !this$createTime.equals(other$createTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DbTableBo;
    }

    public int hashCode() {
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $workspaceId = getWorkspaceId();
        result = result * 59 + (($workspaceId == null) ? 43 : $workspaceId.hashCode());
        Object $tableName = getTableName();
        result = result * 59 + (($tableName == null) ? 43 : $tableName.hashCode());
        Object $creator = getCreator();
        result = result * 59 + (($creator == null) ? 43 : $creator.hashCode());
        Object $createTime = getCreateTime();
        return result * 59 + (($createTime == null) ? 43 : $createTime.hashCode());
    }

    public String toString() {
        return "DbTableBo(id=" + getId() + ", workspaceId=" + getWorkspaceId() + ", tableName=" + getTableName() + ", creator=" + getCreator() + ", createTime=" + getCreateTime() + ")";
    }

    public DbTableBo(Long id, Long workspaceId, String tableName, String creator, LocalDateTime createTime) {
        /* 17 */
        this.id = id;
        this.workspaceId = workspaceId;
        this.tableName = tableName;
        this.creator = creator;
        this.createTime = createTime;
    }

    public DbTableBo() {
    }

    /* 19 */
    public static DbTableBoBuilder builder() {
        return new DbTableBoBuilder();
    }

    public static class DbTableBoBuilder {
        private Long id;
        private Long workspaceId;

        public DbTableBoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        private String tableName;
        private String creator;
        private LocalDateTime createTime;

        public DbTableBoBuilder workspaceId(Long workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public DbTableBoBuilder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public DbTableBoBuilder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public DbTableBoBuilder createTime(LocalDateTime createTime) {
            this.createTime = createTime;
            return this;
        }

        public DbTableBo build() {
            return new DbTableBo(this.id, this.workspaceId, this.tableName, this.creator, this.createTime);
        }

        public String toString() {
            return "DbTableBo.DbTableBoBuilder(id=" + this.id + ", workspaceId=" + this.workspaceId + ", tableName=" + this.tableName + ", creator=" + this.creator + ", createTime=" + this.createTime + ")";
        }
    }

    public Long getId() {
        /* 23 */
        return this.id;
    }

    public Long getWorkspaceId() {
        /* 26 */
        return this.workspaceId;
    }

    public String getTableName() {
        /* 29 */
        return this.tableName;
    }

    public String getCreator() {
        /* 32 */
        return this.creator;
    }

    public LocalDateTime getCreateTime() {
        /* 35 */
        return this.createTime;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableBo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */