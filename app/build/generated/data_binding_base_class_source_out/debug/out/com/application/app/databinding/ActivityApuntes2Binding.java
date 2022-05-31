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
import com.application.app.modules.apuntes2.data.viewmodel.Apuntes2VM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityApuntes2Binding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintGroup202;

  @NonNull
  public final ConstraintLayout constraintGroup209;

  @NonNull
  public final ConstraintLayout constraintGroup213;

  @NonNull
  public final ConstraintLayout constraintGroup214;

  @NonNull
  public final ConstraintLayout constraintGroup225;

  @NonNull
  public final ImageView imageCalendarDate;

  @NonNull
  public final ImageView imageGroup;

  @NonNull
  public final ImageView imageGroup32;

  @NonNull
  public final ImageView imageInterfaceRemov;

  @NonNull
  public final ImageView imageMenu;

  @NonNull
  public final ImageView imagePngkey3;

  @NonNull
  public final ImageView imageRectangle17;

  @NonNull
  public final ImageView imageView6;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final ImageView imageView9;

  @NonNull
  public final ScrollView scrollViewScrollview;

  @NonNull
  public final TextView txt;

  @NonNull
  public final TextView txtApuntes1fech;

  @NonNull
  public final TextView txtApuntes2fech;

  @NonNull
  public final TextView txtApuntes3fech;

  @NonNull
  public final TextView txtApuntes4fech;

  @NonNull
  public final TextView txtApuntes5fech;

  @NonNull
  public final TextView txtApuntes6fech;

  @NonNull
  public final TextView txtDescarga;

  @NonNull
  public final TextView txtElige;

  @NonNull
  public final TextView txtFsica;

  @NonNull
  public final TextView txtSeleccionaUna;

  @NonNull
  public final TextView txtVer1;

  @NonNull
  public final View viewRectangle;

  @NonNull
  public final View viewRectangle3;

  @Bindable
  protected Apuntes2VM mApuntes2VM;

  protected ActivityApuntes2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintGroup202, ConstraintLayout constraintGroup209,
      ConstraintLayout constraintGroup213, ConstraintLayout constraintGroup214,
      ConstraintLayout constraintGroup225, ImageView imageCalendarDate, ImageView imageGroup,
      ImageView imageGroup32, ImageView imageInterfaceRemov, ImageView imageMenu,
      ImageView imagePngkey3, ImageView imageRectangle17, ImageView imageView6,
      ImageView imageView8, ImageView imageView9, ScrollView scrollViewScrollview, TextView txt,
      TextView txtApuntes1fech, TextView txtApuntes2fech, TextView txtApuntes3fech,
      TextView txtApuntes4fech, TextView txtApuntes5fech, TextView txtApuntes6fech,
      TextView txtDescarga, TextView txtElige, TextView txtFsica, TextView txtSeleccionaUna,
      TextView txtVer1, View viewRectangle, View viewRectangle3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintGroup202 = constraintGroup202;
    this.constraintGroup209 = constraintGroup209;
    this.constraintGroup213 = constraintGroup213;
    this.constraintGroup214 = constraintGroup214;
    this.constraintGroup225 = constraintGroup225;
    this.imageCalendarDate = imageCalendarDate;
    this.imageGroup = imageGroup;
    this.imageGroup32 = imageGroup32;
    this.imageInterfaceRemov = imageInterfaceRemov;
    this.imageMenu = imageMenu;
    this.imagePngkey3 = imagePngkey3;
    this.imageRectangle17 = imageRectangle17;
    this.imageView6 = imageView6;
    this.imageView8 = imageView8;
    this.imageView9 = imageView9;
    this.scrollViewScrollview = scrollViewScrollview;
    this.txt = txt;
    this.txtApuntes1fech = txtApuntes1fech;
    this.txtApuntes2fech = txtApuntes2fech;
    this.txtApuntes3fech = txtApuntes3fech;
    this.txtApuntes4fech = txtApuntes4fech;
    this.txtApuntes5fech = txtApuntes5fech;
    this.txtApuntes6fech = txtApuntes6fech;
    this.txtDescarga = txtDescarga;
    this.txtElige = txtElige;
    this.txtFsica = txtFsica;
    this.txtSeleccionaUna = txtSeleccionaUna;
    this.txtVer1 = txtVer1;
    this.viewRectangle = viewRectangle;
    this.viewRectangle3 = viewRectangle3;
  }

  public abstract void setApuntes2VM(@Nullable Apuntes2VM apuntes2VM);

  @Nullable
  public Apuntes2VM getApuntes2VM() {
    return mApuntes2VM;
  }

  @NonNull
  public static ActivityApuntes2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_apuntes_2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityApuntes2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityApuntes2Binding>inflateInternal(inflater, R.layout.activity_apuntes_2, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityApuntes2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_apuntes_2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityApuntes2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityApuntes2Binding>inflateInternal(inflater, R.layout.activity_apuntes_2, null, false, component);
  }

  public static ActivityApuntes2Binding bind(@NonNull View view) {
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
  public static ActivityApuntes2Binding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityApuntes2Binding)bind(component, view, R.layout.activity_apuntes_2);
  }
}
