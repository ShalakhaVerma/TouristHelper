package retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    public static final String BASE_URL = "https://maps.googleapis.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

            Retrofit.Builder builder =
                    new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(
                                    GsonConverterFactory.create()
                            );

            retrofit =
                    builder
                            .client(
                                    httpClient.build()
                            )
                            .build();
        }
        return retrofit;
    }
}