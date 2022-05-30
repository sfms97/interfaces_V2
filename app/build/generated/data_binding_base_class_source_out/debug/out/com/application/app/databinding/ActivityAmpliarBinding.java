// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.ampliar.data.viewmodel.AmpliarVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAmpliarBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintAmpliar;

  @NonNull
  public final ConstraintLayout constraintGroup404;

  @NonNull
  public final ImageView imageGroup97;

  @NonNull
  public final ImageView imageImage1;

  @NonNull
  public final ScrollView scrollViewScrollview;

  @Bindable
  protected AmpliarVM mAmpliarVM;

  protected ActivityAmpliarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintAmpliar, ConstraintLayout constraintGroup404,
      ImageView imageGroup97, ImageView imageImage1, ScrollView scrollViewScrollview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintAmpliar = constraintAmpliar;
    this.constraintGroup404 = constraintGroup404;
    this.imageGroup97 = imageGroup97;
    this.imageImage1 = imageImage1;
    this.scrollViewScrollview = scrollViewScrollview;
  }

  public abstract void setAmpliarVM(@Nullable AmpliarVM ampliarVM);

  @Nullable
  public AmpliarVM getAmpliarVM() {
    return mAmpliarVM;
  }

  @NonNull
  public static ActivityAmpliarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ampliar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAmpliarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAmpliarBinding>inflateInternal(inflater, R.layout.activity_ampliar, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAmpliarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ampliar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAmpliarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAmpliarBinding>inflateInternal(inflater, R.layout.activity_ampliar, null, false, component);
  }

  public static ActivityAmpliarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAmpliarBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAmpliarBinding)bind(component, view, R.layout.activity_ampliar);
  }
}