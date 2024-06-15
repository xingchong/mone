  package run.mone.m78.api.enums;

  import java.util.Arrays;
  import java.util.Map;
  import java.util.function.Function;
  import java.util.stream.Collectors;



  public enum AvatarTypeEnum
  {

/* 14 */   BOT(0, "bot"),
/* 15 */   PLUGIN(1, "plugin");
    private final int code;
    private final String desc;

    private static final Map<Integer, AvatarTypeEnum> valMap;
    private static final Map<String, AvatarTypeEnum> nameMap;

    static {
/* 20 */     valMap = (Map<Integer, AvatarTypeEnum>)Arrays.<AvatarTypeEnum>stream(values()).collect(Collectors.toMap(AvatarTypeEnum::getCode, Function.identity()));

/* 22 */     nameMap = (Map<String, AvatarTypeEnum>)Arrays.<AvatarTypeEnum>stream(values()).collect(Collectors.toMap(AvatarTypeEnum::getDesc, Function.identity()));
    }
    AvatarTypeEnum(int code, String desc) {
/* 25 */     this.code = code;
/* 26 */     this.desc = desc;
    }

    public int getCode() {
/* 30 */     return this.code;
    }

    public String getDesc() {
/* 34 */     return this.desc;
    }

    public static AvatarTypeEnum getTypeEnumByCode(int code) {
/* 38 */     return valMap.getOrDefault(Integer.valueOf(code), BOT);
    }

    public static AvatarTypeEnum getTypeEnumByName(String name) {
/* 42 */     return nameMap.getOrDefault(name, BOT);
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/enums/AvatarTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */