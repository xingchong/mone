package run.mone.m78.api.bo.document;

import java.util.List;
import java.util.Map;


public class DataAnalyzeRes {
    private String chatUuid;
    private String chatContentUuid;
    private List<Map<String, Object>> data;
    private String sql;

    public void setChatUuid(String chatUuid) {
        /* 15 */
        this.chatUuid = chatUuid;
    }

    public void setChatContentUuid(String chatContentUuid) {
        this.chatContentUuid = chatContentUuid;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DataAnalyzeRes)) return false;
        DataAnalyzeRes other = (DataAnalyzeRes) o;
        if (!other.canEqual(this)) return false;
        Object this$chatUuid = getChatUuid(), other$chatUuid = other.getChatUuid();
        if ((this$chatUuid == null) ? (other$chatUuid != null) : !this$chatUuid.equals(other$chatUuid)) return false;
        Object this$chatContentUuid = getChatContentUuid(), other$chatContentUuid = other.getChatContentUuid();
        if ((this$chatContentUuid == null) ? (other$chatContentUuid != null) : !this$chatContentUuid.equals(other$chatContentUuid))
            return false;
        Object this$data = (Object) getData(), other$data = (Object) other.getData();
        if ((this$data == null) ? (other$data != null) : !this$data.equals(other$data)) return false;
        Object this$sql = getSql(), other$sql = other.getSql();
        return !((this$sql == null) ? (other$sql != null) : !this$sql.equals(other$sql));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DataAnalyzeRes;
    }

    public int hashCode() {
        int result = 1;
        Object $chatUuid = getChatUuid();
        result = result * 59 + (($chatUuid == null) ? 43 : $chatUuid.hashCode());
        Object $chatContentUuid = getChatContentUuid();
        result = result * 59 + (($chatContentUuid == null) ? 43 : $chatContentUuid.hashCode());
        Object $data = (Object) getData();
        result = result * 59 + (($data == null) ? 43 : $data.hashCode());
        Object $sql = getSql();
        return result * 59 + (($sql == null) ? 43 : $sql.hashCode());
    }

    public String toString() {
        return "DataAnalyzeRes(chatUuid=" + getChatUuid() + ", chatContentUuid=" + getChatContentUuid() + ", data=" + getData() + ", sql=" + getSql() + ")";
    }

    /* 16 */
    public static DataAnalyzeResBuilder builder() {
        return new DataAnalyzeResBuilder();
    }

    public static class DataAnalyzeResBuilder {
        private String chatUuid;
        private String chatContentUuid;

        public DataAnalyzeResBuilder chatUuid(String chatUuid) {
            this.chatUuid = chatUuid;
            return this;
        }

        private List<Map<String, Object>> data;
        private String sql;

        public DataAnalyzeResBuilder chatContentUuid(String chatContentUuid) {
            this.chatContentUuid = chatContentUuid;
            return this;
        }

        public DataAnalyzeResBuilder data(List<Map<String, Object>> data) {
            this.data = data;
            return this;
        }

        public DataAnalyzeResBuilder sql(String sql) {
            this.sql = sql;
            return this;
        }

        public DataAnalyzeRes build() {
            return new DataAnalyzeRes(this.chatUuid, this.chatContentUuid, this.data, this.sql);
        }

        public String toString() {
            return "DataAnalyzeRes.DataAnalyzeResBuilder(chatUuid=" + this.chatUuid + ", chatContentUuid=" + this.chatContentUuid + ", data=" + this.data + ", sql=" + this.sql + ")";
        }
    }

    public DataAnalyzeRes() {
    }

    public DataAnalyzeRes(String chatUuid, String chatContentUuid, List<Map<String, Object>> data, String sql) {
        /* 18 */
        this.chatUuid = chatUuid;
        this.chatContentUuid = chatContentUuid;
        this.data = data;
        this.sql = sql;
    }

    public String getChatUuid() {
        /* 21 */
        return this.chatUuid;
    }

    public String getChatContentUuid() {
        /* 23 */
        return this.chatContentUuid;
    }

    public List<Map<String, Object>> getData() {
        /* 25 */
        return this.data;
    }

    public String getSql() {
        /* 27 */
        return this.sql;
    }
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/document/DataAnalyzeRes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */