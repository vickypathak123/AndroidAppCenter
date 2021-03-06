// Generated by view binder compiler. Do not edit!
package com.example.app.adshelper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.app.adshelper.R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutGoogleNativeAdExitFullScreenWebsiteBinding implements ViewBinding {
  @NonNull
  private final NativeAdView rootView;

  @NonNull
  public final TextView adAdvertiser;

  @NonNull
  public final ImageView adAppIcon;

  @NonNull
  public final TextView adBody;

  @NonNull
  public final Button adCallToAction;

  @NonNull
  public final TextView adHeadline;

  @NonNull
  public final MediaView adMedia;

  @NonNull
  public final TextView adPrice;

  @NonNull
  public final RatingBar adStars;

  @NonNull
  public final TextView adStore;

  @NonNull
  public final View blurView;

  @NonNull
  public final ConstraintLayout clAdPriceStore;

  @NonNull
  public final CardView cvAppIcon;

  @NonNull
  public final CardView cvMainImage;

  @NonNull
  public final Guideline glHorizontalCenter;

  @NonNull
  public final ImageView ivBgMainImage;

  @NonNull
  public final NativeAdView nativeAdView;

  @NonNull
  public final TextView txtAd;

  private LayoutGoogleNativeAdExitFullScreenWebsiteBinding(@NonNull NativeAdView rootView,
      @NonNull TextView adAdvertiser, @NonNull ImageView adAppIcon, @NonNull TextView adBody,
      @NonNull Button adCallToAction, @NonNull TextView adHeadline, @NonNull MediaView adMedia,
      @NonNull TextView adPrice, @NonNull RatingBar adStars, @NonNull TextView adStore,
      @NonNull View blurView, @NonNull ConstraintLayout clAdPriceStore, @NonNull CardView cvAppIcon,
      @NonNull CardView cvMainImage, @NonNull Guideline glHorizontalCenter,
      @NonNull ImageView ivBgMainImage, @NonNull NativeAdView nativeAdView,
      @NonNull TextView txtAd) {
    this.rootView = rootView;
    this.adAdvertiser = adAdvertiser;
    this.adAppIcon = adAppIcon;
    this.adBody = adBody;
    this.adCallToAction = adCallToAction;
    this.adHeadline = adHeadline;
    this.adMedia = adMedia;
    this.adPrice = adPrice;
    this.adStars = adStars;
    this.adStore = adStore;
    this.blurView = blurView;
    this.clAdPriceStore = clAdPriceStore;
    this.cvAppIcon = cvAppIcon;
    this.cvMainImage = cvMainImage;
    this.glHorizontalCenter = glHorizontalCenter;
    this.ivBgMainImage = ivBgMainImage;
    this.nativeAdView = nativeAdView;
    this.txtAd = txtAd;
  }

  @Override
  @NonNull
  public NativeAdView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutGoogleNativeAdExitFullScreenWebsiteBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutGoogleNativeAdExitFullScreenWebsiteBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_google_native_ad_exit_full_screen_website, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutGoogleNativeAdExitFullScreenWebsiteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ad_advertiser;
      TextView adAdvertiser = ViewBindings.findChildViewById(rootView, id);
      if (adAdvertiser == null) {
        break missingId;
      }

      id = R.id.ad_app_icon;
      ImageView adAppIcon = ViewBindings.findChildViewById(rootView, id);
      if (adAppIcon == null) {
        break missingId;
      }

      id = R.id.ad_body;
      TextView adBody = ViewBindings.findChildViewById(rootView, id);
      if (adBody == null) {
        break missingId;
      }

      id = R.id.ad_call_to_action;
      Button adCallToAction = ViewBindings.findChildViewById(rootView, id);
      if (adCallToAction == null) {
        break missingId;
      }

      id = R.id.ad_headline;
      TextView adHeadline = ViewBindings.findChildViewById(rootView, id);
      if (adHeadline == null) {
        break missingId;
      }

      id = R.id.ad_media;
      MediaView adMedia = ViewBindings.findChildViewById(rootView, id);
      if (adMedia == null) {
        break missingId;
      }

      id = R.id.ad_price;
      TextView adPrice = ViewBindings.findChildViewById(rootView, id);
      if (adPrice == null) {
        break missingId;
      }

      id = R.id.ad_stars;
      RatingBar adStars = ViewBindings.findChildViewById(rootView, id);
      if (adStars == null) {
        break missingId;
      }

      id = R.id.ad_store;
      TextView adStore = ViewBindings.findChildViewById(rootView, id);
      if (adStore == null) {
        break missingId;
      }

      id = R.id.blur_view;
      View blurView = ViewBindings.findChildViewById(rootView, id);
      if (blurView == null) {
        break missingId;
      }

      id = R.id.cl_ad_price_store;
      ConstraintLayout clAdPriceStore = ViewBindings.findChildViewById(rootView, id);
      if (clAdPriceStore == null) {
        break missingId;
      }

      id = R.id.cv_app_icon;
      CardView cvAppIcon = ViewBindings.findChildViewById(rootView, id);
      if (cvAppIcon == null) {
        break missingId;
      }

      id = R.id.cv_main_image;
      CardView cvMainImage = ViewBindings.findChildViewById(rootView, id);
      if (cvMainImage == null) {
        break missingId;
      }

      id = R.id.gl_horizontal_center;
      Guideline glHorizontalCenter = ViewBindings.findChildViewById(rootView, id);
      if (glHorizontalCenter == null) {
        break missingId;
      }

      id = R.id.iv_bg_main_image;
      ImageView ivBgMainImage = ViewBindings.findChildViewById(rootView, id);
      if (ivBgMainImage == null) {
        break missingId;
      }

      NativeAdView nativeAdView = (NativeAdView) rootView;

      id = R.id.txt_ad;
      TextView txtAd = ViewBindings.findChildViewById(rootView, id);
      if (txtAd == null) {
        break missingId;
      }

      return new LayoutGoogleNativeAdExitFullScreenWebsiteBinding((NativeAdView) rootView,
          adAdvertiser, adAppIcon, adBody, adCallToAction, adHeadline, adMedia, adPrice, adStars,
          adStore, blurView, clAdPriceStore, cvAppIcon, cvMainImage, glHorizontalCenter,
          ivBgMainImage, nativeAdView, txtAd);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
