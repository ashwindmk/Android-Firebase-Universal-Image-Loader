package com.example.ashwin.firebaseuniversalimageloader;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by ashwin on 12/9/16.
 */

public class AppViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public AppViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
    }

    public void setTitle(String name) {
        TextView textview_title = (TextView) mView.findViewById(R.id.title);
        textview_title.setText(name);
    }

    public void setSubTitle(String address) {
        TextView textview_subtitle = (TextView) mView.findViewById(R.id.subtitle);
        textview_subtitle.setText(address);
    }

    public void setAppLogo(Context context, String url) {
        ImageView imageViewAppLogo = (ImageView) mView.findViewById(R.id.app_logo);
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
        imageLoader.displayImage(url, imageViewAppLogo);
    }

    public void setAppImage(Context context, String url) {

        ImageView imageViewAppImage = (ImageView) mView.findViewById(R.id.app_image);
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
        imageLoader.displayImage(url, imageViewAppImage);

    }

    public void setCallToActionText(String callToAction) {
        Button buttonCallToActionText = (Button) mView.findViewById(R.id.call_to_action);
        buttonCallToActionText.setText(callToAction);
    }

}

