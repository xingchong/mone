package run.mone.m78.api.bo.table;

import com.xiaomi.mone.http.docs.annotations.HttpApiDocClassDefine;

public class M78ColumnInfo {
    @HttpApiDocClassDefine(value = "name", description = "列名")
    private String name;
    @HttpApiDocClassDefine(value = "desc", description = "列描述")
    private String desc;
    @HttpApiDocClassDefine(value = "type", description = "列类型")
    private String type;
    @HttpApiDocClassDefine(value = "necessary", description = "是否必需")
    private Boolean necessary;
    private Boolean primaryKey;

    public M78ColumnInfo() {
    }

    /* 14 */
    public M78ColumnInfo(String name, String desc, String type, Boolean necessary, Boolean primaryKey) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.necessary = necessary;
        this.primaryKey = primaryKey;
    }

    /* 15 */
    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNecessary(Boolean necessary) {
        this.necessary = necessary;
    }

    public void setPrimaryKey(Boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof M78ColumnInfo)) return false;
        M78ColumnInfo other = (M78ColumnInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$necessary = getNecessary(), other$necessary = other.getNecessary();
        if ((this$necessary == null) ? (other$necessary != null) : !this$necessary.equals(other$necessary))
            return false;
        Object this$primaryKey = getPrimaryKey(), other$primaryKey = other.getPrimaryKey();
        if ((this$primaryKey == null) ? (other$primaryKey != null) : !this$primaryKey.equals(other$primaryKey))
            return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$desc = getDesc(), other$desc = other.getDesc();
        if ((this$desc == null) ? (other$desc != null) : !this$desc.equals(other$desc)) return false;
        Object this$type = getType(), other$type = other.getType();
        return !((this$type == null) ? (other$type != null) : !this$type.equals(other$type));
    }

    protected boolean canEqual(Object other) {
        return other instanceof M78ColumnInfo;
    }

    public int hashCode() {
        int result = 1;
        Object $necessary = getNecessary();
        result = result * 59 + (($necessary == null) ? 43 : $necessary.hashCode());
        Object $primaryKey = getPrimaryKey();
        result = result * 59 + (($primaryKey == null) ? 43 : $primaryKey.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $desc = getDesc();
        result = result * 59 + (($desc == null) ? 43 : $desc.hashCode());
        Object $type = getType();
        return result * 59 + (($type == null) ? 43 : $type.hashCode());
    }

    public String toString() {
        return "M78ColumnInfo(name=" + getName() + ", desc=" + getDesc() + ", type=" + getType() + ", necessary=" + getNecessary() + ", primaryKey=" + getPrimaryKey() + ")";
    }

    /* 16 */
    public static M78ColumnInfoBuilder builder() {
        return new M78ColumnInfoBuilder();
    }

    public static class M78ColumnInfoBuilder {
        private String name;
        private String desc;

        public M78ColumnInfoBuilder name(String name) {
            this.name = name;
            return this;
        }

        private String type;
        private Boolean necessary;
        private Boolean primaryKey;

        public M78ColumnInfoBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public M78ColumnInfoBuilder type(String type) {
            this.type = type;
            return this;
        }

        public M78ColumnInfoBuilder necessary(Boolean necessary) {
            this.necessary = necessary;
            return this;
        }

        public M78ColumnInfoBuilder primaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public M78ColumnInfo build() {
            return new M78ColumnInfo(this.name, this.desc, this.type, this.necessary, this.primaryKey);
        }

        public String toString() {
            return "M78ColumnInfo.M78ColumnInfoBuilder(name=" + this.name + ", desc=" + this.desc + ", type=" + this.type + ", necessary=" + this.necessary + ", primaryKey=" + this.primaryKey + ")";
        }
    }

    public String getName() {
        /* 20 */
        return this.name;
    }

    public String getDesc() {
        /* 23 */
        return this.desc;
    }

    public String getType() {
        /* 26 */
        return this.type;
    }

    public Boolean getNecessary() {
        /* 29 */
        return this.necessary;
    }

    public Boolean getPrimaryKey() {
        /* 31 */
        return this.primaryKey;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/M78ColumnInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */