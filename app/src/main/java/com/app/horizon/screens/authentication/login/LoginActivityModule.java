package com.app.horizon.screens.authentication.login;

import android.arch.lifecycle.ViewModelProvider;

import com.app.horizon.core.store.MainAppStore;
import com.app.horizon.core.store.online.services.FirestoreService;
import com.app.horizon.utils.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginActivityModule {

    @Provides
    LoginActivityViewModel providesLoginActivityViewModel(MainAppStore store,
                                                          FirestoreService firestoreService){
        return new LoginActivityViewModel(store, firestoreService);
    }

    @Provides
    ViewModelProvider.Factory provideViewModelProvider(LoginActivityViewModel viewModel){
        return new ViewModelProviderFactory<>(viewModel);
    }
}
