package structural.proxy.medialib;

import java.util.HashMap;

/**
 * Interface of remote service.
 *
 * @author Alexander Naumov
 */


public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
