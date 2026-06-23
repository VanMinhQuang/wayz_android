package com.wayz.app.core.network;

import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.*;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0002\u0010\rJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0001H\u00a7@\u00a2\u0006\u0002\u0010\rJ$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\'\u00a8\u0006\u0013"}, d2 = {"Lcom/wayz/app/core/network/ApiService;", "", "delete", "Lretrofit2/Response;", "", "path", "", "params", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "patch", "body", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "put", "refreshTokens", "Lretrofit2/Call;", "Lcom/wayz/app/core/network/TokenResponse;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "{path}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object get(@retrofit2.http.Path(value = "path", encoded = true)
    @org.jetbrains.annotations.NotNull()
    java.lang.String path, @retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.POST(value = "{path}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object post(@retrofit2.http.Path(value = "path", encoded = true)
    @org.jetbrains.annotations.NotNull()
    java.lang.String path, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    java.lang.Object body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.PUT(value = "{path}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object put(@retrofit2.http.Path(value = "path", encoded = true)
    @org.jetbrains.annotations.NotNull()
    java.lang.String path, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    java.lang.Object body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.PATCH(value = "{path}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object patch(@retrofit2.http.Path(value = "path", encoded = true)
    @org.jetbrains.annotations.NotNull()
    java.lang.String path, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    java.lang.Object body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.DELETE(value = "{path}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@retrofit2.http.Path(value = "path", encoded = true)
    @org.jetbrains.annotations.NotNull()
    java.lang.String path, @retrofit2.http.QueryMap()
    @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<kotlin.Unit>> $completion);
    
    @retrofit2.http.POST(value = "auth/refresh")
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Call<com.wayz.app.core.network.TokenResponse> refreshTokens(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> body);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}