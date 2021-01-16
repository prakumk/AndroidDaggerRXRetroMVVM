package com.di.myapplication.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.di.myapplication.R;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{
    @Provides
    static RequestOptions provideRequestOptions(){
        return RequestOptions.placeholderOf(R.drawable.avatar).error(R.drawable.avatar);
    }

    @Provides
    static RequestManager provideGlideInstance(Application context,RequestOptions requestOptions){
        return Glide.with(context).setDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppDrawable(Application context){
        return ContextCompat.getDrawable(context,R.drawable.avatar);
    }

}
