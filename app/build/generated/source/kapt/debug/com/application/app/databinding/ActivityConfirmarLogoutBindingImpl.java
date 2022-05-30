package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityConfirmarLogoutBindingImpl extends ActivityConfirmarLogoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup399, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityConfirmarLogoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityConfirmarLogoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintConfirmarlogou.setTag(null);
        this.txtNo.setTag(null);
        this.txtS.setTag(null);
        this.txtSeguroQueQui.setTag(null);
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
        if (BR.confirmarLogoutVM == variableId) {
            setConfirmarLogoutVM((com.application.app.modules.confirmarlogout.data.viewmodel.ConfirmarLogoutVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConfirmarLogoutVM(@Nullable com.application.app.modules.confirmarlogout.data.viewmodel.ConfirmarLogoutVM ConfirmarLogoutVM) {
        this.mConfirmarLogoutVM = ConfirmarLogoutVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.confirmarLogoutVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeConfirmarLogoutVMConfirmarLogoutModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.confirmarlogout.data.model.ConfirmarLogoutModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeConfirmarLogoutVMConfirmarLogoutModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.confirmarlogout.data.model.ConfirmarLogoutModel> ConfirmarLogoutVMConfirmarLogoutModel, int fieldId) {
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
        java.lang.String confirmarLogoutVMConfirmarLogoutModelTxtNo = null;
        com.application.app.modules.confirmarlogout.data.model.ConfirmarLogoutModel confirmarLogoutVMConfirmarLogoutModelGetValue = null;
        com.application.app.modules.confirmarlogout.data.viewmodel.ConfirmarLogoutVM confirmarLogoutVM = mConfirmarLogoutVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.confirmarlogout.data.model.ConfirmarLogoutModel> confirmarLogoutVMConfirmarLogoutModel = null;
        java.lang.String confirmarLogoutVMConfirmarLogoutModelTxtSeguroQueQui = null;
        java.lang.String confirmarLogoutVMConfirmarLogoutModelTxtS = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (confirmarLogoutVM != null) {
                    // read confirmarLogoutVM.confirmarLogoutModel
                    confirmarLogoutVMConfirmarLogoutModel = confirmarLogoutVM.getConfirmarLogoutModel();
                }
                updateLiveDataRegistration(0, confirmarLogoutVMConfirmarLogoutModel);


                if (confirmarLogoutVMConfirmarLogoutModel != null) {
                    // read confirmarLogoutVM.confirmarLogoutModel.getValue()
                    confirmarLogoutVMConfirmarLogoutModelGetValue = confirmarLogoutVMConfirmarLogoutModel.getValue();
                }


                if (confirmarLogoutVMConfirmarLogoutModelGetValue != null) {
                    // read confirmarLogoutVM.confirmarLogoutModel.getValue().txtNo
                    confirmarLogoutVMConfirmarLogoutModelTxtNo = confirmarLogoutVMConfirmarLogoutModelGetValue.getTxtNo();
                    // read confirmarLogoutVM.confirmarLogoutModel.getValue().txtSeguroQueQui
                    confirmarLogoutVMConfirmarLogoutModelTxtSeguroQueQui = confirmarLogoutVMConfirmarLogoutModelGetValue.getTxtSeguroQueQui();
                    // read confirmarLogoutVM.confirmarLogoutModel.getValue().txtS
                    confirmarLogoutVMConfirmarLogoutModelTxtS = confirmarLogoutVMConfirmarLogoutModelGetValue.getTxtS();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNo, confirmarLogoutVMConfirmarLogoutModelTxtNo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtS, confirmarLogoutVMConfirmarLogoutModelTxtS);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeguroQueQui, confirmarLogoutVMConfirmarLogoutModelTxtSeguroQueQui);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): confirmarLogoutVM.confirmarLogoutModel
        flag 1 (0x2L): confirmarLogoutVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}