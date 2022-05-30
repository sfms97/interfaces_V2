// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.subirfoto.data.viewmodel.SubirFotoVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySubirFotoBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintGroup240;

  @NonNull
  public final ConstraintLayout constraintGroup245;

  @NonNull
  public final ConstraintLayout constraintGroup247;

  @NonNull
  public final ConstraintLayout constraintRectangle21;

  @NonNull
  public final ImageView imageGroup;

  @NonNull
  public final ImageView imageGroup43;

  @NonNull
  public final ImageView imageMenu;

  @NonNull
  public final ImageView imagePngkey4;

  @NonNull
  public final ScrollView scrollViewScrollview;

  @NonNull
  public final TextView txtSeleccionaLaF;

  @NonNull
  public final TextView txtSubir;

  @NonNull
  public final TextView txtSubirFoto;

  @Bindable
  protected SubirFotoVM mSubirFotoVM;

  protected ActivitySubirFotoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintGroup240, ConstraintLayout constraintGroup245,
      ConstraintLayout constraintGroup247, ConstraintLayout constraintRectangle21,
      ImageView imageGroup, ImageView imageGroup43, ImageView imageMenu, ImageView imagePngkey4,
      ScrollView scrollViewScrollview, TextView txtSeleccionaLaF, TextView txtSubir,
      TextView txtSubirFoto) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintGroup240 = constraintGroup240;
    this.constraintGroup245 = constraintGroup245;
    this.constraintGroup247 = constraintGroup247;
    this.constraintRectangle21 = constraintRectangle21;
    this.imageGroup = imageGroup;
    this.imageGroup43 = imageGroup43;
    this.imageMenu = imageMenu;
    this.imagePngkey4 = imagePngkey4;
    this.scrollViewScrollview = scrollViewScrollview;
    this.txtSeleccionaLaF = txtSeleccionaLaF;
    this.txtSubir = txtSubir;
    this.txtSubirFoto = txtSubirFoto;
  }

  public abstract void setSubirFotoVM(@Nullable SubirFotoVM subirFotoVM);

  @Nullable
  public SubirFotoVM getSubirFotoVM() {
    return mSubirFotoVM;
  }

  @NonNull
  public static ActivitySubirFotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_subir_foto, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySubirFotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySubirFotoBinding>inflateInternal(inflater, R.layout.activity_subir_foto, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySubirFotoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_subir_foto, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySubirFotoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySubirFotoBinding>inflateInternal(inflater, R.layout.activity_subir_foto, null, false, component);
  }

  public static ActivitySubirFotoBinding bind(@NonNull View view) {
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
  public static ActivitySubirFotoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySubirFotoBinding)bind(component, view, R.layout.activity_subir_foto);
  }
}