  package run.mone.ai.z.enums;

  public enum ModelTypeEnum {
/*  4 */   Local(Long.valueOf(0L)),
/*  5 */   AzureOpenAI(Long.valueOf(1L)),
/*  6 */   OpenAI(Long.valueOf(2L)),
/*  7 */   Whisper(Long.valueOf(3L)),
/*  8 */   Speech(Long.valueOf(4L)),
/*  9 */   GCPClaude(Long.valueOf(5L)),
/* 10 */   AWSClaude(Long.valueOf(6L)),
/* 11 */   AzureOpenAIOthers(Long.valueOf(10L));
    public final Long id;

    ModelTypeEnum(Long id) {
/* 15 */     this.id = id;
    }


    public static ModelTypeEnum fromName(Long id) {
/* 20 */     for (ModelTypeEnum d : values()) {
/* 21 */       if (d.id.equals(id)) {
/* 22 */         return d;
        }
      }
/* 25 */     return null;
    }
  }


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/ai/z/enums/ModelTypeEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */