package com.example.luruibo.coolweather.gson;

/**
 * Created by luruibo on 2017/9/24.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
