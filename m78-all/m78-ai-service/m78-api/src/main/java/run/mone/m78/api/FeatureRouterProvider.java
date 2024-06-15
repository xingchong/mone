package run.mone.m78.api;

import java.util.List;
import org.apache.commons.lang3.tuple.Pair;
import run.mone.m78.api.bo.feature.router.FeatureRouterDTO;
import run.mone.m78.api.bo.feature.router.FeatureRouterReq;

public interface FeatureRouterProvider {
  Pair<Long, List<FeatureRouterDTO>> listAllFeatureRouter(FeatureRouterReq paramFeatureRouterReq);
  
  FeatureRouterDTO getFeatureRouterDetailById(Long paramLong);
}


/* Location:              /Users/admin/Documents/git/mi/docker_image_jar/run.mone.zip!/run/mone/m78/api/FeatureRouterProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */