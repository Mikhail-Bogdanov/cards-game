package com.template.template

import android.app.Application
import com.template.data.di.DataModule
import com.template.domain.di.DomainModule
import com.template.entrypoint.di.EntryPointModule
import com.template.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class App : Application(), KoinComponent {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(
                DomainModule.module,
                PresentationModule.module,
                DataModule.module,
                EntryPointModule.module
            )
        }

    }
}