package com.seeho.riotproject.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8G\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8G\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/seeho/riotproject/ui/RpAppState;", "", "navController", "Landroidx/navigation/NavHostController;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/navigation/NavHostController;Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "currentDestination", "Landroidx/navigation/NavDestination;", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentTopLevelDestination", "Lcom/seeho/riotproject/navigation/TopLevelDestination;", "getCurrentTopLevelDestination", "()Lcom/seeho/riotproject/navigation/TopLevelDestination;", "getNavController", "()Landroidx/navigation/NavHostController;", "topLevelDestinations", "", "getTopLevelDestinations", "()Ljava/util/List;", "navigateToTopLevelDestination", "", "topLevelDestination", "app_debug"})
@androidx.compose.runtime.Stable
public final class RpAppState {
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavHostController navController = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.seeho.riotproject.navigation.TopLevelDestination> topLevelDestinations = null;
    
    public RpAppState(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavHostController getNavController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.Nullable
    public final androidx.navigation.NavDestination getCurrentDestination() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.Nullable
    public final com.seeho.riotproject.navigation.TopLevelDestination getCurrentTopLevelDestination() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.seeho.riotproject.navigation.TopLevelDestination> getTopLevelDestinations() {
        return null;
    }
    
    public final void navigateToTopLevelDestination(@org.jetbrains.annotations.NotNull
    com.seeho.riotproject.navigation.TopLevelDestination topLevelDestination) {
    }
}