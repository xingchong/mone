package run.mone.m78.api.bo.datasource;

import java.util.List;
import java.util.Map;


public class SqlQueryResBuilder {
    private int total;
    private List<Map<String, Object>> data;

    public SqlQueryResBuilder total(int total) {
        /* 19 */
        this.total = total;
        return this;
    }

    public SqlQueryResBuilder data(List<Map<String, Object>> data) {
        this.data = data;
        return this;
    }

    public SqlQueryRes build() {
        return new SqlQueryRes(this.total, this.data);
    }

    public String toString() {
        return "SqlQueryRes.SqlQueryResBuilder(total=" + this.total + ", data=" + this.data + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/SqlQueryRes$SqlQueryResBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */