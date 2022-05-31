package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFotoSubida1BindingImpl extends ActivityFotoSubida1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup381, 2);
        sViewsWithIds.put(R.id.imagePngkey5, 3);
        sViewsWithIds.put(R.id.imageInterfaceFavor, 4);
        sViewsWithIds.put(R.id.imagePngkey6, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFotoSubida1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityFotoSubida1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintFotosubida.setTag(null);
        this.txtArchivoDescarg.setTag(null);
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
        if (BR.fotoSubida1VM == variableId) {
            setFotoSubida1VM((com.application.app.modules.fotosubida1.data.viewmodel.FotoSubida1VM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFotoSubida1VM(@Nullable com.application.app.modules.fotosubida1.data.viewmodel.FotoSubida1VM FotoSubida1VM) {
        this.mFotoSubida1VM = FotoSubida1VM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.fotoSubida1VM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeFotoSubida1VMFotoSubida1Model((androidx.lifecycle.MutableLiveData<com.application.app.modules.fotosubida1.data.model.FotoSubida1Model>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFotoSubida1VMFotoSubida1Model(androidx.lifecycle.MutableLiveData<com.application.app.modules.fotosubida1.data.model.FotoSubida1Model> FotoSubida1VMFotoSubida1Model, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.fotosubida1.data.model.FotoSubida1Model> fotoSubida1VMFotoSubida1Model = null;
        java.lang.String fotoSubida1VMFotoSubida1ModelTxtArchivoDescarg = null;
        com.application.app.modules.fotosubida1.data.viewmodel.FotoSubida1VM fotoSubida1VM = mFotoSubida1VM;
        com.application.app.modules.fotosubida1.data.model.FotoSubida1Model fotoSubida1VMFotoSubida1ModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (fotoSubida1VM != null) {
                    // read fotoSubida1VM.fotoSubida1Model
                    fotoSubida1VMFotoSubida1Model = fotoSubida1VM.getFotoSubida1Model();
                }
                updateLiveDataRegistration(0, fotoSubida1VMFotoSubida1Model);


                if (fotoSubida1VMFotoSubida1Model != null) {
                    // read fotoSubida1VM.fotoSubida1Model.getValue()
                    fotoSubida1VMFotoSubida1ModelGetValue = fotoSubida1VMFotoSubida1Model.getValue();
                }


                if (fotoSubida1VMFotoSubida1ModelGetValue != null) {
                    // read fotoSubida1VM.fotoSubida1Model.getValue().txtArchivoDescarg
                    fotoSubida1VMFotoSubida1ModelTxtArchivoDescarg = fotoSubida1VMFotoSubida1ModelGetValue.getTxtArchivoDescarg();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtArchivoDescarg, fotoSubida1VMFotoSubida1ModelTxtArchivoDescarg);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fotoSubida1VM.fotoSubida1Model
        flag 1 (0x2L): fotoSubida1VM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}