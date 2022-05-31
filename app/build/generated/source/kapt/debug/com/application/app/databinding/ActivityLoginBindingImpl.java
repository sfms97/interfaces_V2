package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewRectangle3, 5);
        sViewsWithIds.put(R.id.editTextTextPersonName, 6);
        sViewsWithIds.put(R.id.editTextTextPassword, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[5]
            );
        this.constraintGroup277.setTag(null);
        this.imagePngkey1.setTag(null);
        this.txtLogin.setTag(null);
        this.txtRegistrate.setTag(null);
        this.txtStudyEnjoy.setTag(null);
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
        if (BR.loginVM == variableId) {
            setLoginVM((com.application.app.modules.login.data.viewmodel.LoginVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginVM(@Nullable com.application.app.modules.login.data.viewmodel.LoginVM LoginVM) {
        this.mLoginVM = LoginVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.loginVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginVMLoginModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.login.data.model.LoginModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginVMLoginModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.login.data.model.LoginModel> LoginVMLoginModel, int fieldId) {
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
        java.lang.String loginVMLoginModelTxtStudyEnjoy = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.login.data.model.LoginModel> loginVMLoginModel = null;
        com.application.app.modules.login.data.viewmodel.LoginVM loginVM = mLoginVM;
        com.application.app.modules.login.data.model.LoginModel loginVMLoginModelGetValue = null;
        java.lang.String loginVMLoginModelTxtRegstrate = null;
        java.lang.String loginVMLoginModelTxtLogin = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (loginVM != null) {
                    // read loginVM.loginModel
                    loginVMLoginModel = loginVM.getLoginModel();
                }
                updateLiveDataRegistration(0, loginVMLoginModel);


                if (loginVMLoginModel != null) {
                    // read loginVM.loginModel.getValue()
                    loginVMLoginModelGetValue = loginVMLoginModel.getValue();
                }


                if (loginVMLoginModelGetValue != null) {
                    // read loginVM.loginModel.getValue().txtStudyEnjoy
                    loginVMLoginModelTxtStudyEnjoy = loginVMLoginModelGetValue.getTxtStudyEnjoy();
                    // read loginVM.loginModel.getValue().txtRegstrate
                    loginVMLoginModelTxtRegstrate = loginVMLoginModelGetValue.getTxtRegstrate();
                    // read loginVM.loginModel.getValue().txtLogin
                    loginVMLoginModelTxtLogin = loginVMLoginModelGetValue.getTxtLogin();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey1, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey1.getContext(), R.drawable.img_pngkey1), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLogin, loginVMLoginModelTxtLogin);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRegistrate, loginVMLoginModelTxtRegstrate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStudyEnjoy, loginVMLoginModelTxtStudyEnjoy);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginVM.loginModel
        flag 1 (0x2L): loginVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}