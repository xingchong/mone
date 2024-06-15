package run.mone.m78.api;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import run.mone.m78.api.bo.plugins.BotPluginDTO;
import run.mone.m78.api.bo.plugins.PluginReq;

public interface BotPluginProvider {
  Pair<Long, List<BotPluginDTO>> getBotPlugins(PluginReq paramPluginReq);
  
  BotPluginDTO getBotPluginById(Long paramLong);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/BotPluginProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */