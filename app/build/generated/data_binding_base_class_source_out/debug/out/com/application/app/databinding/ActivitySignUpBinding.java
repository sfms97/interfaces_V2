// Generated by data binding compiler. Do not edit!
package com.application.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.application.app.R;
import com.application.app.modules.signup.data.viewmodel.SignUpVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySignUpBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintGroup308;

  @NonNull
  public final ConstraintLayout constraintSignup;

  @NonNull
  public final EditText editTextTextEmail;

  @NonNull
  public final EditText editTextTextLastname;

  @NonNull
  public final EditText editTextTextName;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final ImageView imageGroup;

  @NonNull
  public final ImageView imagePngkey2;

  @NonNull
  public final TextView txtSignUp;

  @NonNull
  public final TextView txtStudyEnjoy;

  @Bindable
  protected SignUpVM mSignUpVM;

  protected ActivitySignUpBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintGroup308, ConstraintLayout constraintSignup,
      EditText editTextTextEmail, EditText editTextTextLastname, EditText editTextTextName,
      EditText editTextTextPassword, EditText editTextTextPersonName, ImageView imageGroup,
      ImageView imagePngkey2, TextView txtSignUp, TextView txtStudyEnjoy) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintGroup308 = constraintGroup308;
    this.constraintSignup = constraintSignup;
    this.editTextTextEmail = editTextTextEmail;
    this.editTextTextLastname = editTextTextLastname;
    this.editTextTextName = editTextTextName;
    this.editTextTextPassword = editTextTextPassword;
    this.editTextTextPersonName = editTextTextPersonName;
    this.imageGroup = imageGroup;
    this.imagePngkey2 = imagePngkey2;
    this.txtSignUp = txtSignUp;
    this.txtStudyEnjoy = txtStudyEnjoy;
  }

  public abstract void setSignUpVM(@Nullable SignUpVM signUpVM);

  @Nullable
  public SignUpVM getSignUpVM() {
    return mSignUpVM;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sign_up, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySignUpBinding>inflateInternal(inflater, R.layout.activity_sign_up, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_sign_up, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySignUpBinding>inflateInternal(inflater, R.layout.activity_sign_up, null, false, component);
  }

  public static ActivitySignUpBinding bind(@NonNull View view) {
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
  public static ActivitySignUpBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySignUpBinding)bind(component, view, R.layout.activity_sign_up);
  }
}
