package com.wayz.app.core.ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.wayz.app.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010 R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010 R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010 \u00a8\u0006;"}, d2 = {"Lcom/wayz/app/core/ui/theme/AppTypography;", "", "normal10", "Landroidx/compose/ui/text/TextStyle;", "normal12", "normal14", "normal16", "normal18", "normal20", "normal24", "normal28", "normal32", "semibold10", "semibold12", "semibold14", "semibold16", "semibold18", "semibold20", "semibold24", "semibold28", "semibold32", "bold10", "bold12", "bold14", "bold16", "bold18", "bold20", "bold24", "bold28", "bold32", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBold10", "()Landroidx/compose/ui/text/TextStyle;", "getBold12", "getBold14", "getBold16", "getBold18", "getBold20", "getBold24", "getBold28", "getBold32", "getNormal10", "getNormal12", "getNormal14", "getNormal16", "getNormal18", "getNormal20", "getNormal24", "getNormal28", "getNormal32", "getSemibold10", "getSemibold12", "getSemibold14", "getSemibold16", "getSemibold18", "getSemibold20", "getSemibold24", "getSemibold28", "getSemibold32", "app_debug"})
public final class AppTypography {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal10 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal12 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal14 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal16 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal18 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal20 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal24 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal28 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle normal32 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold10 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold12 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold14 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold16 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold18 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold20 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold24 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold28 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle semibold32 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold10 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold12 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold14 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold16 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold18 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold20 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold24 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold28 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.text.TextStyle bold32 = null;
    
    public AppTypography(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal10, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal12, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal14, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal16, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal18, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal20, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal24, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal28, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle normal32, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold10, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold12, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold14, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold16, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold18, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold20, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold24, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold28, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle semibold32, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold10, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold12, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold14, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold16, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold18, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold20, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold24, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold28, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.text.TextStyle bold32) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getNormal32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getSemibold32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.text.TextStyle getBold32() {
        return null;
    }
    
    public AppTypography() {
        super();
    }
}