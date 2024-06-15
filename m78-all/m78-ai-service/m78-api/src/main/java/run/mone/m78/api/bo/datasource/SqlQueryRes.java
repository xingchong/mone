package run.mone.m78.api.bo.datasource;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class SqlQueryRes
        implements Serializable {
    private int total;
    private List<Map<String, Object>> data;

    public SqlQueryRes() {
    }

    public SqlQueryRes(int total, List<Map<String, Object>> data) {
        /* 17 */
        this.total = total;
        this.data = data;
        /* 18 */
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SqlQueryRes)) return false;
        SqlQueryRes other = (SqlQueryRes) o;
        if (!other.canEqual(this)) return false;
        if (getTotal() != other.getTotal()) return false;
        Object this$data = (Object) getData(), other$data = (Object) other.getData();
        return !((this$data == null) ? (other$data != null) : !this$data.equals(other$data));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SqlQueryRes;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + getTotal();
        Object $data = (Object) getData();
        return result * 59 + (($data == null) ? 43 : $data.hashCode());
    }

    public String toString() {
        return "SqlQueryRes(total=" + getTotal() + ", data=" + getData() + ")";
    }

    /* 19 */
    public static SqlQueryResBuilder builder() {
        return new SqlQueryResBuilder();
    }

    public static class SqlQueryResBuilder {
        private int total;

        public SqlQueryResBuilder total(int total) {
            this.total = total;
            return this;
        }

        private List<Map<String, Object>> data;

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

    public int getTotal() {
        /* 22 */
        return this.total;
    }

    public List<Map<String, Object>> getData() {
        /* 24 */
        return this.data;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/SqlQueryRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */