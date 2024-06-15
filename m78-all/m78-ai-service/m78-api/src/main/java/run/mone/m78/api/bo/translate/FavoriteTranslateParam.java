  package run.mone.m78.api.bo.translate;

  import java.io.Serializable;

  public class FavoriteTranslateParam
    implements Serializable
  {
    private String uuid;

    public String toString() {
/* 11 */     return "FavoriteTranslateParam(uuid=" + getUuid() + ")"; } public int hashCode() {  int  result = 1; Object $uuid = getUuid(); return result * 59 + (($uuid == null) ? 43 : $uuid.hashCode()); } protected boolean canEqual(Object other) { return other instanceof FavoriteTranslateParam; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof FavoriteTranslateParam)) return false;  FavoriteTranslateParam other = (FavoriteTranslateParam)o; if (!other.canEqual(this)) return false;  Object this$uuid = getUuid(), other$uuid = other.getUuid(); return !((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)); } public void setUuid(String uuid) { this.uuid = uuid; }

    public String getUuid() {
/* 14 */     return this.uuid;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/translate/FavoriteTranslateParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */