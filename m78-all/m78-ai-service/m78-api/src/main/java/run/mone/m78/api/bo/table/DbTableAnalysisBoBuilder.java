package run.mone.m78.api.bo.table;

public class DbTableAnalysisBoBuilder {
    private boolean hit$set;
    private boolean hit$value;
    private boolean sqlType$set;
    private String sqlType$value;
    private boolean sql$set;
    private String sql$value;
    private boolean tableExtra$set;
    private String tableExtra$value;

    public DbTableAnalysisBoBuilder hit(boolean hit) {
        /* 15 */
        this.hit$value = hit;
        this.hit$set = true;
        return this;
    }

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


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/table/DbTableAnalysisBo$DbTableAnalysisBoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */