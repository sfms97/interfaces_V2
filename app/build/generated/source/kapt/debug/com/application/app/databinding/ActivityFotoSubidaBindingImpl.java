package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFotoSubidaBindingImpl extends ActivityFotoSubidaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup371, 2);
        sViewsWithIds.put(R.id.imagePngkey5, 3);
        sViewsWithIds.put(R.id.imageInterfaceFavor, 4);
        sViewsWithIds.put(R.id.imagePngkey6, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFotoSubidaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityFotoSubidaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintFotosubida.setTag(null);
        this.txtFotoSubida.setTag(null);
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
        if (BR.fotoSubidaVM == variableId) {
            setFotoSubidaVM((com.application.app.modules.fotosubida.data.viewmodel.FotoSubidaVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFotoSubidaVM(@Nullable com.application.app.modules.fotosubida.data.viewmodel.FotoSubidaVM FotoSubidaVM) {
        this.mFotoSubidaVM = FotoSubidaVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.fotoSubidaVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFotoSubidaVMFotoSubidaModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.fotosubida.data.model.FotoSubidaModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFotoSubidaVMFotoSubidaModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.fotosubida.data.model.FotoSubidaModel> FotoSubidaVMFotoSubidaModel, int fieldId) {
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
        java.lang.String fotoSubidaVMFotoSubidaModelTxtFotoSubida = null;
        com.application.app.modules.fotosubida.data.model.FotoSubidaModel fotoSubidaVMFotoSubidaModelGetValue = null;
        com.application.app.modules.fotosubida.data.viewmodel.FotoSubidaVM fotoSubidaVM = mFotoSubidaVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.fotosubida.data.model.FotoSubidaModel> fotoSubidaVMFotoSubidaModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (fotoSubidaVM != null) {
                    // read fotoSubidaVM.fotoSubidaModel
                    fotoSubidaVMFotoSubidaModel = fotoSubidaVM.getFotoSubidaModel();
                }
                updateLiveDataRegistration(0, fotoSubidaVMFotoSubidaModel);


                if (fotoSubidaVMFotoSubidaModel != null) {
                    // read fotoSubidaVM.fotoSubidaModel.getValue()
                    fotoSubidaVMFotoSubidaModelGetValue = fotoSubidaVMFotoSubidaModel.getValue();
                }


                if (fotoSubidaVMFotoSubidaModelGetValue != null) {
                    // read fotoSubidaVM.fotoSubidaModel.getValue().txtFotoSubida
                    fotoSubidaVMFotoSubidaModelTxtFotoSubida = fotoSubidaVMFotoSubidaModelGetValue.getTxtFotoSubida();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFotoSubida, fotoSubidaVMFotoSubidaModelTxtFotoSubida);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fotoSubidaVM.fotoSubidaModel
        flag 1 (0x2L): fotoSubidaVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}