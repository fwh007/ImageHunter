package lib.dt.com.imagehunter.ServiceInterface;


import java.util.Map;

import lib.dt.com.imagehunter.Module.GoogleSearchResult;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import rx.Observable;

/**
 * Created by Winter on 2015/11/13 0013.
 */
public interface ImageService {
    @GET("https://ajax.googleapis.com/ajax/services/search/images?v=1.0&userip=INSERT-USER-IP")
    Observable<GoogleSearchResult> getGoogleImage(@Query("q") String key, @QueryMap Map<String, String> options);
}
