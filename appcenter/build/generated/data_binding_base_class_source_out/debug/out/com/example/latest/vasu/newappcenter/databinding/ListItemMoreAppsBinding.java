// Generated by view binder compiler. Do not edit!
package com.example.latest.vasu.newappcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.latest.vasu.newappcenter.R;
import com.example.latest.vasu.newappcenter.widgets.SquareImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemMoreAppsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ConstraintLayout listAppsClContainer;

  @NonNull
  public final SquareImageView listAppsIvThumb;

  @NonNull
  public final TextView listAppsTvAppName;

  private ListItemMoreAppsBinding(@NonNull CardView rootView,
      @NonNull ConstraintLayout listAppsClContainer, @NonNull SquareImageView listAppsIvThumb,
      @NonNull TextView listAppsTvAppName) {
    this.rootView = rootView;
    this.listAppsClContainer = listAppsClContainer;
    this.listAppsIvThumb = listAppsIvThumb;
    this.listAppsTvAppName = listAppsTvAppName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemMoreAppsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemMoreAppsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_more_apps, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemMoreAppsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.list_apps_cl_container;
      ConstraintLayout listAppsClContainer = ViewBindings.findChildViewById(rootView, id);
      if (listAppsClContainer == null) {
        break missingId;
      }

      id = R.id.list_apps_iv_thumb;
      SquareImageView listAppsIvThumb = ViewBindings.findChildViewById(rootView, id);
      if (listAppsIvThumb == null) {
        break missingId;
      }

      id = R.id.list_apps_tv_app_name;
      TextView listAppsTvAppName = ViewBindings.findChildViewById(rootView, id);
      if (listAppsTvAppName == null) {
        break missingId;
      }

      return new ListItemMoreAppsBinding((CardView) rootView, listAppsClContainer, listAppsIvThumb,
          listAppsTvAppName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
