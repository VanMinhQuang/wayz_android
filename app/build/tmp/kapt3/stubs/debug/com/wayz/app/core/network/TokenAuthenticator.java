package com.wayz.app.core.network;

import com.wayz.app.core.session.SessionManager;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import javax.inject.Inject;
import javax.inject.Provider;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/wayz/app/core/network/TokenAuthenticator;", "Lokhttp3/Authenticator;", "sessionManager", "Lcom/wayz/app/core/session/SessionManager;", "apiServiceProvider", "Ljavax/inject/Provider;", "Lcom/wayz/app/core/network/ApiService;", "(Lcom/wayz/app/core/session/SessionManager;Ljavax/inject/Provider;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "app_debug"})
public final class TokenAuthenticator implements okhttp3.Authenticator {
    @org.jetbrains.annotations.NotNull()
    private final com.wayz.app.core.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final javax.inject.Provider<com.wayz.app.core.network.ApiService> apiServiceProvider = null;
    
    @javax.inject.Inject()
    public TokenAuthenticator(@org.jetbrains.annotations.NotNull()
    com.wayz.app.core.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    javax.inject.Provider<com.wayz.app.core.network.ApiService> apiServiceProvider) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable()
    okhttp3.Route route, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
        return null;
    }
}