package com.wayz.app.data.auth.api;

import com.wayz.app.data.auth.dto.AuthTokensDto;
import com.wayz.app.data.auth.dto.LoginRequestDto;
import retrofit2.http.Body;
import retrofit2.http.POST;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/wayz/app/data/auth/api/AuthApi;", "", "login", "Lcom/wayz/app/data/auth/dto/AuthTokensDto;", "request", "Lcom/wayz/app/data/auth/dto/LoginRequestDto;", "(Lcom/wayz/app/data/auth/dto/LoginRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthApi {
    
    @retrofit2.http.POST(value = "auth/login")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.wayz.app.data.auth.dto.LoginRequestDto request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wayz.app.data.auth.dto.AuthTokensDto> $completion);
}