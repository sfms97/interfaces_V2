package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignUpBindingImpl extends ActivitySignUpBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageRectangle2, 9);
        sViewsWithIds.put(R.id.imageRectangle4, 10);
        sViewsWithIds.put(R.id.imageRectangle5, 11);
        sViewsWithIds.put(R.id.imageRectangle9, 12);
        sViewsWithIds.put(R.id.imageRectangle7, 13);
        sViewsWithIds.put(R.id.constraintGroup308, 14);
        sViewsWithIds.put(R.id.imageGroup, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySignUpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivitySignUpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.constraintSignup.setTag(null);
        this.imagePngkey2.setTag(null);
        this.txtEmail.setTag(null);
        this.txtLastname.setTag(null);
        this.txtName.setTag(null);
        this.txtPassword.setTag(null);
        this.txtSignUp.setTag(null);
        this.txtStudyEnjoy.setTag(null);
        this.txtUsername.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.signUpVM == variableId) {
            setSignUpVM((com.application.app.modules.signup.data.viewmodel.SignUpVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSignUpVM(@Nullable com.application.app.modules.signup.data.viewmodel.SignUpVM SignUpVM) {
        this.mSignUpVM = SignUpVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.signUpVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSignUpVMSignUpModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.signup.data.model.SignUpModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSignUpVMSignUpModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.signup.data.model.SignUpModel> SignUpVMSignUpModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String signUpVMSignUpModelTxtLastname = null;
        java.lang.String signUpVMSignUpModelTxtSignUp = null;
        java.lang.String signUpVMSignUpModelTxtName = null;
        java.lang.String signUpVMSignUpModelTxtStudyEnjoy = null;
        com.application.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;
        java.lang.String signUpVMSignUpModelTxtPassword = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
        java.lang.String signUpVMSignUpModelTxtUsername = null;
        java.lang.String signUpVMSignUpModelTxtEmail = null;
        com.application.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (signUpVM != null) {
                    // read signUpVM.signUpModel
                    signUpVMSignUpModel = signUpVM.getSignUpModel();
                }
                updateLiveDataRegistration(0, signUpVMSignUpModel);


                if (signUpVMSignUpModel != null) {
                    // read signUpVM.signUpModel.getValue()
                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();
                }


                if (signUpVMSignUpModelGetValue != null) {
                    // read signUpVM.signUpModel.getValue().txtLastname
                    signUpVMSignUpModelTxtLastname = signUpVMSignUpModelGetValue.getTxtLastname();
                    // read signUpVM.signUpModel.getValue().txtSignUp
                    signUpVMSignUpModelTxtSignUp = signUpVMSignUpModelGetValue.getTxtSignUp();
                    // read signUpVM.signUpModel.getValue().txtName
                    signUpVMSignUpModelTxtName = signUpVMSignUpModelGetValue.getTxtName();
                    // read signUpVM.signUpModel.getValue().txtStudyEnjoy
                    signUpVMSignUpModelTxtStudyEnjoy = signUpVMSignUpModelGetValue.getTxtStudyEnjoy();
                    // read signUpVM.signUpModel.getValue().txtPassword
                    signUpVMSignUpModelTxtPassword = signUpVMSignUpModelGetValue.getTxtPassword();
                    // read signUpVM.signUpModel.getValue().txtUsername
                    signUpVMSignUpModelTxtUsername = signUpVMSignUpModelGetValue.getTxtUsername();
                    // read signUpVM.signUpModel.getValue().txtEmail
                    signUpVMSignUpModelTxtEmail = signUpVMSignUpModelGetValue.getTxtEmail();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey2, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey2.getContext(), R.drawable.img_pngkey1), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, signUpVMSignUpModelTxtEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLastname, signUpVMSignUpModelTxtLastname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtName, signUpVMSignUpModelTxtName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPassword, signUpVMSignUpModelTxtPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSignUp, signUpVMSignUpModelTxtSignUp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStudyEnjoy, signUpVMSignUpModelTxtStudyEnjoy);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsername, signUpVMSignUpModelTxtUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signUpVM.signUpModel
        flag 1 (0x2L): signUpVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}