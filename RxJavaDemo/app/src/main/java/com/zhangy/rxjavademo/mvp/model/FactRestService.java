package com.zhangy.rxjavademo.mvp.model;




import retrofit.http.GET;
import rx.Observable;

/**
 * zhangy
 * Created by dream on 16/7/6.
 */
public interface FactRestService {

   // final String SERVICE_ENDPOINT = "https://dl.dropboxusercontent.com/u/746330/facts.json";
    final String SERVICE_ENDPOINT = "http://ditu.amap.com/service/regeo?longitude=121.04925573429551&latitude=31.315590522490712";

    /**
     * Use Retrofit to get JSON from URL, then parse it.
     * @return Observable
     */
    @GET("/")
    Observable<Country> getCountry();
}
