package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEventoAAdidoBindingImpl extends ActivityEventoAAdidoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup349, 2);
        sViewsWithIds.put(R.id.imagePngkey5, 3);
        sViewsWithIds.put(R.id.imageInterfaceFavor, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEventoAAdidoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityEventoAAdidoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintEventoAadido.setTag(null);
        this.txtEVENTOAADIDO.setTag(null);
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
        if (BR.eventoAAdidoVM == variableId) {
            setEventoAAdidoVM((com.application.app.modules.eventoaadido.data.viewmodel.EventoAAdidoVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventoAAdidoVM(@Nullable com.application.app.modules.eventoaadido.data.viewmodel.EventoAAdidoVM EventoAAdidoVM) {
        this.mEventoAAdidoVM = EventoAAdidoVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventoAAdidoVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEventoAAdidoVMEventoAAdidoModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.eventoaadido.data.model.EventoAAdidoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEventoAAdidoVMEventoAAdidoModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.eventoaadido.data.model.EventoAAdidoModel> EventoAAdidoVMEventoAAdidoModel, int fieldId) {
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
        com.application.app.modules.eventoaadido.data.model.EventoAAdidoModel eventoAAdidoVMEventoAAdidoModelGetValue = null;
        com.application.app.modules.eventoaadido.data.viewmodel.EventoAAdidoVM eventoAAdidoVM = mEventoAAdidoVM;
        java.lang.String eventoAAdidoVMEventoAAdidoModelTxtEVENTOAADIDO = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.eventoaadido.data.model.EventoAAdidoModel> eventoAAdidoVMEventoAAdidoModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (eventoAAdidoVM != null) {
                    // read eventoAAdidoVM.eventoAAdidoModel
                    eventoAAdidoVMEventoAAdidoModel = eventoAAdidoVM.getEventoAAdidoModel();
                }
                updateLiveDataRegistration(0, eventoAAdidoVMEventoAAdidoModel);


                if (eventoAAdidoVMEventoAAdidoModel != null) {
                    // read eventoAAdidoVM.eventoAAdidoModel.getValue()
                    eventoAAdidoVMEventoAAdidoModelGetValue = eventoAAdidoVMEventoAAdidoModel.getValue();
                }


                if (eventoAAdidoVMEventoAAdidoModelGetValue != null) {
                    // read eventoAAdidoVM.eventoAAdidoModel.getValue().txtEVENTOAADIDO
                    eventoAAdidoVMEventoAAdidoModelTxtEVENTOAADIDO = eventoAAdidoVMEventoAAdidoModelGetValue.getTxtEVENTOAADIDO();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEVENTOAADIDO, eventoAAdidoVMEventoAAdidoModelTxtEVENTOAADIDO);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventoAAdidoVM.eventoAAdidoModel
        flag 1 (0x2L): eventoAAdidoVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}