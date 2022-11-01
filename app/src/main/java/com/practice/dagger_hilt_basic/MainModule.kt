package com.practice.dagger_hilt_basic

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Singleton
    @Provides
    @Named("string3")
    fun provideTestString3(
        // Membuat paramter context.
        @ApplicationContext context: Context,

        // Memanggil object string1 yang di-inject dari AppModule
        string1: String,

        // Memanggil object string2 yang di-inject dari AppModule
        @Named("string2")string2: String
    ) = "${context.getString(R.string.String_to_inject)} - $string2 - $string1"
}