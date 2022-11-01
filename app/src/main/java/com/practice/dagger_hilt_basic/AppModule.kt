package com.practice.dagger_hilt_basic

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideTestString1() = "Ini adalah nilai String yang akan di-Inject ke 1"

    @Singleton
    @Provides
    @Named("string2")
    fun provideTestString2() = "Ini adalah nilai String yang akan di-Inject ke 2"

}