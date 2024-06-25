package run.mone.test;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;
import run.mone.Moonshot;
import run.mone.bo.ChatCompletion;
import run.mone.bo.Message;

import java.nio.file.Paths;

/**
 * @author goodjava@qq.com
 * @date 2024/3/26 15:30
 */
public class MoonshotTest {


    @Test
    public void testGetFiles() {
        System.out.println(Moonshot.getFiles());
    }

    @Test
    public void testUploadFile() {
        String filePath = "/Users/admin/Documents/git/mi/mone/jcommon/ai/moonshot/src/main/resources/doc_001.txt";
        System.out.println(Moonshot.uploadFile(Paths.get(filePath), "file-extract"));
    }

    @Test
    public void testDeleteFile() {
        System.out.println(Moonshot.deleteFile("co18c5pkqq4ua4e5lb60"));
    }

    @Test
    public void testGetFileContent() {
        System.out.println(Moonshot.getFileContent("cpt7e66cp7f2p5159fj0"));
    }


    @Test
    public void testGetModels() {
        System.out.println(Moonshot.getModels());
    }

    @Test
    public void testCall() {
        Message msg1 = Message.builder().role("system").content(Moonshot.getFileContent("cpt7e66cp7f2p5159fj0")).build();
        Message msg2 = Message.builder().role("user").content("这个是什么").build();
        ChatCompletion data = Moonshot.call(Lists.newArrayList(msg1, msg2));
        System.out.println(data);
    }


    @Test
    public void test12() {
        JsonObject obj = new JsonObject();
        obj.add("a", new Gson().toJsonTree(Lists.newArrayList("1","2")));
    }

}
