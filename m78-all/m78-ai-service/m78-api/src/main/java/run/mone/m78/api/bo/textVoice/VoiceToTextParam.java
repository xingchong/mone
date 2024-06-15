  package run.mone.m78.api.bo.textVoice;



  public class VoiceToTextParam
  {
    private String voice;

    public String toString() {
/* 10 */     return "VoiceToTextParam(voice=" + getVoice() + ")"; } public int hashCode() {  int  result = 1; Object $voice = getVoice(); return result * 59 + (($voice == null) ? 43 : $voice.hashCode()); } protected boolean canEqual(Object other) { return other instanceof VoiceToTextParam; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof VoiceToTextParam)) return false;  VoiceToTextParam other = (VoiceToTextParam)o; if (!other.canEqual(this)) return false;  Object this$voice = getVoice(), other$voice = other.getVoice(); return !((this$voice == null) ? (other$voice != null) : !this$voice.equals(other$voice)); } public void setVoice(String voice) { this.voice = voice; }
     public String getVoice() {
/* 12 */     return this.voice;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/bo/textVoice/VoiceToTextParam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */