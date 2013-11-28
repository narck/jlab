package wad.jlab.data;

import java.util.Calendar;
import java.util.List;
import twitter4j.Status;

/** 
 * Simple data class to store the latest winning result.
 * Use to avoid getting rate-limited.
 * @param hashtag Simply provide the hashtag. Everything else is generated.
 */
public class TwitterCache {
    
    private String hashtag;
    private int monthFetched;
    private int dayFetched;
    private int cacheTimeout = 5;
    private int cacheTime = 0;
    private List<Status> tweets;
    
    public TwitterCache(String hashtag, List<Status> tweets) {
        this.hashtag=hashtag;
        this.monthFetched = Calendar.getInstance().get(Calendar.MONTH);
        this.dayFetched = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        this.tweets=tweets;
        this.cacheTime+=1;
    }

    public int getCacheTimeout() {
        return cacheTimeout;
    }

    public void setCacheTimeout(int cacheTimeout) {
        this.cacheTimeout = cacheTimeout;
    }

    public int getCacheTime() {
        return cacheTime;
    }
    
    public void incrementCacheTime() {
        this.cacheTime+=1;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }
    
    
} 
