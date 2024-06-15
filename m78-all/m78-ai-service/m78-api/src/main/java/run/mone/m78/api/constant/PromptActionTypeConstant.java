  package run.mone.m78.api.constant;

  import java.util.Arrays;
  import java.util.Map;
  import java.util.function.Function;
  import java.util.stream.Collectors;




  public enum PromptActionTypeConstant
  {

/* 15 */   TRANSLATE("translate", "textTranslateStream"),
/* 16 */   ARTICLE_COMPLETE("article_complete", "article_complete"),
/* 17 */   CODE_LANGUAGE_IDENTIFY("code_language_identify", "code_language_identify"),
/* 18 */   CODE_COMMENT("code_comment", "comment_side_car"),
/* 19 */   CODE_EXPLAIN("code_explain", "comment_2"),
/* 20 */   GOLANG_CODE_EXPLAIN("golang_code_explain", "golang_comment_2"),
/* 21 */   GENERAL_PROMPT_TURBO("general_prompt_turbo", "general_prompt_turbo");

    private final String action;
     private final String promptName;
    private static final Map<String, PromptActionTypeConstant> actionMap;

    static {
/* 26 */     actionMap = (Map<String, PromptActionTypeConstant>)Arrays.<PromptActionTypeConstant>stream(values()).collect(Collectors.toMap(PromptActionTypeConstant::getAction, Function.identity()));
    }
    PromptActionTypeConstant(String action, String promptName) {
/* 29 */     this.action = action;
/* 30 */     this.promptName = promptName;
    }

    public String getAction() {
/* 34 */     return this.action;
    }

    public String getPromptName() {
/* 38 */     return this.promptName;
    }

    public static PromptActionTypeConstant getEnumByAction(String action) {
/* 42 */     return actionMap.get(action);
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/constant/PromptActionTypeConstant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */