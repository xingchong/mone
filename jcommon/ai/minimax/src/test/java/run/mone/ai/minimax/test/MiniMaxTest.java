package run.mone.ai.minimax.test;

import com.google.gson.JsonObject;
import org.junit.Test;
import run.mone.ai.minimax.MiniMax;
import run.mone.ai.minimax.bo.RequestBodyContent;
import run.mone.ai.minimax.bo.VoiceIdEnum;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MiniMaxTest {

    private static final String GROUP_ID = System.getenv("minimax_group_id");

    private static final String AUTHORIZATION = System.getenv("minimax_authorization");

    @Test
    public void testCall() {
        try {
            RequestBodyContent requestBodyContent = new RequestBodyContent();
            requestBodyContent.setText("哼! 我的拳法迅若奔雷，你是我的对手吗？");
            requestBodyContent.setVoice_id(VoiceIdEnum.male_qn_daxuesheng.voiceId);
            byte[] bytes = MiniMax.call_Text_To_Speech(GROUP_ID, AUTHORIZATION, requestBodyContent);
            try (OutputStream outputStream = new FileOutputStream("output/audio6.mp3")) {
                outputStream.write(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
