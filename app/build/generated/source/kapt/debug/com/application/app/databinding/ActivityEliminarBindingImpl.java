package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEliminarBindingImpl extends ActivityEliminarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup401, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEliminarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityEliminarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintEliminar.setTag(null);
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
        if (BR.eliminarVM == variableId) {
            setEliminarVM((com.application.app.modules.eliminar.data.viewmodel.EliminarVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEliminarVM(@Nullable com.application.app.modules.eliminar.data.viewmodel.EliminarVM EliminarVM) {
        this.mEliminarVM = EliminarVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eliminarVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEliminarVMEliminarModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.eliminar.data.model.EliminarModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEliminarVMEliminarModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.eliminar.data.model.EliminarModel> EliminarVMEliminarModel, int fieldId) {
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
        java.lang.String eliminarVMEliminarModelTxtNo = null;
        com.application.app.modules.eliminar.data.model.EliminarModel eliminarVMEliminarModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.eliminar.data.model.EliminarModel> eliminarVMEliminarModel = null;
        java.lang.String eliminarVMEliminarModelTxtS = null;
        com.application.app.modules.eliminar.data.viewmodel.EliminarVM eliminarVM = mEliminarVM;
        java.lang.String eliminarVMEliminarModelTxtSeguroQueQui = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (eliminarVM != null) {
                    // read eliminarVM.eliminarModel
                    eliminarVMEliminarModel = eliminarVM.getEliminarModel();
                }
                updateLiveDataRegistration(0, eliminarVMEliminarModel);


                if (eliminarVMEliminarModel != null) {
                    // read eliminarVM.eliminarModel.getValue()
                    eliminarVMEliminarModelGetValue = eliminarVMEliminarModel.getValue();
                }


                if (eliminarVMEliminarModelGetValue != null) {
                    // read eliminarVM.eliminarModel.getValue().txtNo
                    eliminarVMEliminarModelTxtNo = eliminarVMEliminarModelGetValue.getTxtNo();
                    // read eliminarVM.eliminarModel.getValue().txtS
                    eliminarVMEliminarModelTxtS = eliminarVMEliminarModelGetValue.getTxtS();
                    // read eliminarVM.eliminarModel.getValue().txtSeguroQueQui
                    eliminarVMEliminarModelTxtSeguroQueQui = eliminarVMEliminarModelGetValue.getTxtSeguroQueQui();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNo, eliminarVMEliminarModelTxtNo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtS, eliminarVMEliminarModelTxtS);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeguroQueQui, eliminarVMEliminarModelTxtSeguroQueQui);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eliminarVM.eliminarModel
        flag 1 (0x2L): eliminarVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}