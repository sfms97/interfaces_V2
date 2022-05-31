package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityApuntesSubidosBindingImpl extends ActivityApuntesSubidosBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup391, 2);
        sViewsWithIds.put(R.id.imagePngkey5, 3);
        sViewsWithIds.put(R.id.imageInterfaceFavor, 4);
        sViewsWithIds.put(R.id.imagePngkey6, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityApuntesSubidosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityApuntesSubidosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintApuntessubidos.setTag(null);
        this.txtApuntesSubidos.setTag(null);
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
        if (BR.apuntesSubidosVM == variableId) {
            setApuntesSubidosVM((com.application.app.modules.apuntessubidos.data.viewmodel.ApuntesSubidosVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setApuntesSubidosVM(@Nullable com.application.app.modules.apuntessubidos.data.viewmodel.ApuntesSubidosVM ApuntesSubidosVM) {
        this.mApuntesSubidosVM = ApuntesSubidosVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.apuntesSubidosVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeApuntesSubidosVMApuntesSubidosModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntessubidos.data.model.ApuntesSubidosModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeApuntesSubidosVMApuntesSubidosModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntessubidos.data.model.ApuntesSubidosModel> ApuntesSubidosVMApuntesSubidosModel, int fieldId) {
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
        com.application.app.modules.apuntessubidos.data.model.ApuntesSubidosModel apuntesSubidosVMApuntesSubidosModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntessubidos.data.model.ApuntesSubidosModel> apuntesSubidosVMApuntesSubidosModel = null;
        com.application.app.modules.apuntessubidos.data.viewmodel.ApuntesSubidosVM apuntesSubidosVM = mApuntesSubidosVM;
        java.lang.String apuntesSubidosVMApuntesSubidosModelTxtApuntesSubidos = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (apuntesSubidosVM != null) {
                    // read apuntesSubidosVM.apuntesSubidosModel
                    apuntesSubidosVMApuntesSubidosModel = apuntesSubidosVM.getApuntesSubidosModel();
                }
                updateLiveDataRegistration(0, apuntesSubidosVMApuntesSubidosModel);


                if (apuntesSubidosVMApuntesSubidosModel != null) {
                    // read apuntesSubidosVM.apuntesSubidosModel.getValue()
                    apuntesSubidosVMApuntesSubidosModelGetValue = apuntesSubidosVMApuntesSubidosModel.getValue();
                }


                if (apuntesSubidosVMApuntesSubidosModelGetValue != null) {
                    // read apuntesSubidosVM.apuntesSubidosModel.getValue().txtApuntesSubidos
                    apuntesSubidosVMApuntesSubidosModelTxtApuntesSubidos = apuntesSubidosVMApuntesSubidosModelGetValue.getTxtApuntesSubidos();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntesSubidos, apuntesSubidosVMApuntesSubidosModelTxtApuntesSubidos);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): apuntesSubidosVM.apuntesSubidosModel
        flag 1 (0x2L): apuntesSubidosVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}