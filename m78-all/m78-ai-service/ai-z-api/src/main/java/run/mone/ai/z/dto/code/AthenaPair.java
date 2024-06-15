  package run.mone.ai.z.dto.code;

  public class AthenaPair<K, V>
  {
    private K key;
    private V value;

    public void setKey(K key) {
/*  9 */     this.key = key; } public void setValue(V value) { this.value = value; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof AthenaPair)) return false;  AthenaPair<?, ?> other = (AthenaPair<?, ?>)o; if (!other.canEqual(this)) return false;  Object this$key = getKey(), other$key = other.getKey(); if ((this$key == null) ? (other$key != null) : !this$key.equals(other$key)) return false;  Object this$value = getValue(), other$value = other.getValue(); return !((this$value == null) ? (other$value != null) : !this$value.equals(other$value)); } protected boolean canEqual(Object other) { return other instanceof AthenaPair; } public int hashCode() {  int  result = 1; Object $key = getKey(); result = result * 59 + (($key == null) ? 43 : $key.hashCode()); Object $value = getValue(); return result * 59 + (($value == null) ? 43 : $value.hashCode()); } public String toString() { return "AthenaPair(key=" + getKey() + ", value=" + getValue() + ")"; }

    public K getKey() {
/* 12 */     return this.key;
    } public V getValue() {
/* 14 */     return this.value;
    }

    public static <K, V> AthenaPair<K, V> of(K key, V value) {
/* 18 */     AthenaPair<K, V> a = new AthenaPair<>();
/* 19 */     a.setKey(key);
/* 20 */     a.setValue(value);
/* 21 */     return a;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/dto/code/AthenaPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */