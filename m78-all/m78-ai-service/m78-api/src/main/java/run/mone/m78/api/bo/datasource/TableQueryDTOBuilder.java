package run.mone.m78.api.bo.datasource;


public class TableQueryDTOBuilder {
    private int connectionId;
    private String tableName;
    private Integer lowerBound;
    private Integer upperBound;

    public TableQueryDTOBuilder connectionId(int connectionId) {
        /* 13 */
        this.connectionId = connectionId;
        return this;
    }

    public TableQueryDTOBuilder tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public TableQueryDTOBuilder lowerBound(Integer lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public TableQueryDTOBuilder upperBound(Integer upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    public TableQueryDTO build() {
        return new TableQueryDTO(this.connectionId, this.tableName, this.lowerBound, this.upperBound);
    }

    public String toString() {
        return "TableQueryDTO.TableQueryDTOBuilder(connectionId=" + this.connectionId + ", tableName=" + this.tableName + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ")";
    }

}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/datasource/TableQueryDTO$TableQueryDTOBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */