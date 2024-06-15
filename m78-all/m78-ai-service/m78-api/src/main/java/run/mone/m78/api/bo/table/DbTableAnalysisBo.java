package run.mone.m78.api.bo.table;


public class DbTableAnalysisBo {
    private boolean hit;
    private String sqlType;
    private String sql;
    private String tableExtra;

    public DbTableAnalysisBo() {
        /* 12 */
        this.hit = $default$hit();
        this.sqlType = $default$sqlType();
        this.sql = $default$sql();
        this.tableExtra = $default$tableExtra();
        /* 13 */
    }

    public DbTableAnalysisBo(boolean hit, String sqlType, String sql, String tableExtra) {
        this.hit = hit;
        this.sqlType = sqlType;
        this.sql = sql;
        this.tableExtra = tableExtra;
    }

    /* 14 */
    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setTableExtra(String tableExtra) {
        this.tableExtra = tableExtra;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DbTableAnalysisBo)) return false;
        DbTableAnalysisBo other = (DbTableAnalysisBo) o;
        if (!other.canEqual(this)) return false;
        if (isHit() != other.isHit()) return false;
        Object this$sqlType = getSqlType(), other$sqlType = other.getSqlType();
        if ((this$sqlType == null) ? (other$sqlType != null) : !this$sqlType.equals(other$sqlType)) return false;
        Object this$sql = getSql(), other$sql = other.getSql();
        if ((this$sql == null) ? (other$sql != null) : !this$sql.equals(other$sql)) return false;
        Object this$tableExtra = getTableExtra(), other$tableExtra = other.getTableExtra();
        return !((this$tableExtra == null) ? (other$tableExtra != null) : !this$tableExtra.equals(other$tableExtra));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DbTableAnalysisBo;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + (isHit() ? 79 : 97);
        Object $sqlType = getSqlType();
        result = result * 59 + (($sqlType == null) ? 43 : $sqlType.hashCode());
        Object $sql = getSql();
        result = result * 59 + (($sql == null) ? 43 : $sql.hashCode());
        Object $tableExtra = getTableExtra();
        return result * 59 + (($tableExtra == null) ? 43 : $tableExtra.hashCode());
    }

    public String toString() {
        return "DbTableAnalysisBo(hit=" + isHit() + ", sqlType=" + getSqlType() + ", sql=" + getSql() + ", tableExtra=" + getTableExtra() + ")";
    }

    /* 15 */
    public static boolean $default$hit() {
        return false;
    }

    public static String $default$sqlType() {
        return "";
    }

    public static String $default$sql() {
        return "";
    }

    public static String $default$tableExtra() {
        return "";
    }

    public static DbTableAnalysisBoBuilder builder() {
        return new DbTableAnalysisBoBuilder();
    }

    public static class DbTableAnalysisBoBuilder {
        private boolean hit$set;
        private boolean hit$value;
        private boolean sqlType$set;
        private String sqlType$value;

        public DbTableAnalysisBoBuilder hit(boolean hit) {
            this.hit$value = hit;
            this.hit$set = true;
            return this;
        }

        private boolean sql$set;
        private String sql$value;
        private boolean tableExtra$set;
        private String tableExtra$value;

        public DbTableAnalysisBoBuilder sqlType(String sqlType) {
            this.sqlType$value = sqlType;
            this.sqlType$set = true;
            return this;
        }

        public DbTableAnalysisBoBuilder sql(String sql) {
            this.sql$value = sql;
            this.sql$set = true;
            return this;
        }

        public DbTableAnalysisBoBuilder tableExtra(String tableExtra) {
            this.tableExtra$value = tableExtra;
            this.tableExtra$set = true;
            return this;
        }

        public DbTableAnalysisBo build() {
            boolean hit$value = this.hit$value;
            if (!this.hit$set) hit$value = DbTableAnalysisBo.$default$hit();
            String sqlType$value = this.sqlType$value;
            if (!this.sqlType$set) sqlType$value = DbTableAnalysisBo.$default$sqlType();
            String sql$value = this.sql$value;
            if (!this.sql$set) sql$value = DbTableAnalysisBo.$default$sql();
            String tableExtra$value = this.tableExtra$value;
            if (!this.tableExtra$set) tableExtra$value = DbTableAnalysisBo.$default$tableExtra();
            return new DbTableAnalysisBo(hit$value, sqlType$value, sql$value, tableExtra$value);
        }

        public String toString() {
            return "DbTableAnalysisBo.DbTableAnalysisBoBuilder(hit$value=" + this.hit$value + ", sqlType$value=" + this.sqlType$value + ", sql$value=" + this.sql$value + ", tableExtra$value=" + this.tableExtra$value + ")";
        }
    }

    public boolean isHit() {
        /* 19 */
        return this.hit;
    }

    public String getSqlType() {
        /* 22 */
        return this.sqlType;
    }

    public String getSql() {
        /* 25 */
        return this.sql;
    }

    public String getTableExtra() {
        /* 28 */
        return this.tableExtra;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableAnalysisBo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */