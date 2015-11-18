package lib.dt.com.imagehunter.Helper;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by Winter on 2015/11/13 0013.
 */
public class RetrofitHelper {

    private static RetrofitHelper ourInstance;

    private Retrofit retrofit;

    public static RetrofitHelper getInstance() {
        if (ourInstance == null) {
            ourInstance = new RetrofitHelper();
        }
        return ourInstance;
    }

    private RetrofitHelper() {
        OkHttpClient client = new OkHttpClient();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.interceptors().add(interceptor);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://google.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
    }

    public <T> T create(final Class<T> service) {
        return retrofit.create(service);
    }
}
