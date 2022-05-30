// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.fotosubida.data.viewmodel.FotoSubidaVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityFotoSubidaBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintFotosubida;

  @NonNull
  public final ConstraintLayout constraintGroup371;

  @NonNull
  public final ImageView imageInterfaceFavor;

  @NonNull
  public final ImageView imageInterfaceFavor1;

  @NonNull
  public final ImageView imagePngkey5;

  @NonNull
  public final ImageView imagePngkey6;

  @NonNull
  public final TextView txtFotoSubida;

  @Bindable
  protected FotoSubidaVM mFotoSubidaVM;

  protected ActivityFotoSubidaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintFotosubida, ConstraintLayout constraintGroup371,
      ImageView imageInterfaceFavor, ImageView imageInterfaceFavor1, ImageView imagePngkey5,
      ImageView imagePngkey6, TextView txtFotoSubida) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintFotosubida = constraintFotosubida;
    this.constraintGroup371 = constraintGroup371;
    this.imageInterfaceFavor = imageInterfaceFavor;
    this.imageInterfaceFavor1 = imageInterfaceFavor1;
    this.imagePngkey5 = imagePngkey5;
    this.imagePngkey6 = imagePngkey6;
    this.txtFotoSubida = txtFotoSubida;
  }

  public abstract void setFotoSubidaVM(@Nullable FotoSubidaVM fotoSubidaVM);

  @Nullable
  public FotoSubidaVM getFotoSubidaVM() {
    return mFotoSubidaVM;
  }

  @NonNull
  public static ActivityFotoSubidaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_foto_subida, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFotoSubidaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFotoSubidaBinding>inflateInternal(inflater, R.layout.activity_foto_subida, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFotoSubidaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_foto_subida, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFotoSubidaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFotoSubidaBinding>inflateInternal(inflater, R.layout.activity_foto_subida, null, false, component);
  }

  public static ActivityFotoSubidaBinding bind(@NonNull View view) {
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
  public static ActivityFotoSubidaBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityFotoSubidaBinding)bind(component, view, R.layout.activity_foto_subida);
  }
}