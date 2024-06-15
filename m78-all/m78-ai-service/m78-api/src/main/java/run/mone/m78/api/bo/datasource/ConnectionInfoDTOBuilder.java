package run.mone.m78.api.bo.datasource;

public class ConnectionInfoDTOBuilder {
    private Integer id;
    private String host;
    private String port;
    private String database;
    private String user;
    private String pwd;
    private String jdbcUrl;

    /* 11 */
    public ConnectionInfoDTOBuilder id(Integer id) {
        this.id = id;
        return this;
    }

    private String cluster;
    private String kerberos;
    private String queue;
    private String userName;
    private int type;
    private String customKnowledge;
    private String createTime;
    private String updateTime;

    public ConnectionInfoDTOBuilder host(String host) {
        this.host = host;
        return this;
    }

    public ConnectionInfoDTOBuilder port(String port) {
        this.port = port;
        return this;
    }

    public ConnectionInfoDTOBuilder database(String database) {
        this.database = database;
        return this;
    }

    public ConnectionInfoDTOBuilder user(String user) {
        this.user = user;
        return this;
    }

    public ConnectionInfoDTOBuilder pwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public ConnectionInfoDTOBuilder jdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
        return this;
    }

    public ConnectionInfoDTOBuilder cluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    public ConnectionInfoDTOBuilder kerberos(String kerberos) {
        this.kerberos = kerberos;
        return this;
    }

    public ConnectionInfoDTOBuilder queue(String queue) {
        this.queue = queue;
        return this;
    }

    public ConnectionInfoDTOBuilder userName(String userName) {
        this.userName = userName;
        return this;
    }

    public ConnectionInfoDTOBuilder type(int type) {
        this.type = type;
        return this;
    }

    public ConnectionInfoDTOBuilder customKnowledge(String customKnowledge) {
        this.customKnowledge = customKnowledge;
        return this;
    }

    public ConnectionInfoDTOBuilder createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public ConnectionInfoDTOBuilder updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public ConnectionInfoDTO build() {
        return new ConnectionInfoDTO(this.id, this.host, this.port, this.database, this.user, this.pwd, this.jdbcUrl, this.cluster, this.kerberos, this.queue, this.userName, this.type, this.customKnowledge, this.createTime, this.updateTime);
    }

    public String toString() {
        return "ConnectionInfoDTO.ConnectionInfoDTOBuilder(id=" + this.id + ", host=" + this.host + ", port=" + this.port + ", database=" + this.database + ", user=" + this.user + ", pwd=" + this.pwd + ", jdbcUrl=" + this.jdbcUrl + ", cluster=" + this.cluster + ", kerberos=" + this.kerberos + ", queue=" + this.queue + ", userName=" + this.userName + ", type=" + this.type + ", customKnowledge=" + this.customKnowledge + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/ConnectionInfoDTO$ConnectionInfoDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */