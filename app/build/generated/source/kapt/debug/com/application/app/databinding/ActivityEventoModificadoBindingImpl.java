package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEventoModificadoBindingImpl extends ActivityEventoModificadoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup353, 2);
        sViewsWithIds.put(R.id.imagePngkey5, 3);
        sViewsWithIds.put(R.id.imageInterfaceFavor, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEventoModificadoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityEventoModificadoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintEventoModifica.setTag(null);
        this.txtEVENTOMODIFICA.setTag(null);
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
        if (BR.eventoModificadoVM == variableId) {
            setEventoModificadoVM((com.application.app.modules.eventomodificado.data.viewmodel.EventoModificadoVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventoModificadoVM(@Nullable com.application.app.modules.eventomodificado.data.viewmodel.EventoModificadoVM EventoModificadoVM) {
        this.mEventoModificadoVM = EventoModificadoVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventoModificadoVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEventoModificadoVMEventoModificadoModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.eventomodificado.data.model.EventoModificadoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEventoModificadoVMEventoModificadoModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.eventomodificado.data.model.EventoModificadoModel> EventoModificadoVMEventoModificadoModel, int fieldId) {
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
        java.lang.String eventoModificadoVMEventoModificadoModelTxtEVENTOMODIFICA = null;
        com.application.app.modules.eventomodificado.data.model.EventoModificadoModel eventoModificadoVMEventoModificadoModelGetValue = null;
        com.application.app.modules.eventomodificado.data.viewmodel.EventoModificadoVM eventoModificadoVM = mEventoModificadoVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.eventomodificado.data.model.EventoModificadoModel> eventoModificadoVMEventoModificadoModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (eventoModificadoVM != null) {
                    // read eventoModificadoVM.eventoModificadoModel
                    eventoModificadoVMEventoModificadoModel = eventoModificadoVM.getEventoModificadoModel();
                }
                updateLiveDataRegistration(0, eventoModificadoVMEventoModificadoModel);


                if (eventoModificadoVMEventoModificadoModel != null) {
                    // read eventoModificadoVM.eventoModificadoModel.getValue()
                    eventoModificadoVMEventoModificadoModelGetValue = eventoModificadoVMEventoModificadoModel.getValue();
                }


                if (eventoModificadoVMEventoModificadoModelGetValue != null) {
                    // read eventoModificadoVM.eventoModificadoModel.getValue().txtEVENTOMODIFICA
                    eventoModificadoVMEventoModificadoModelTxtEVENTOMODIFICA = eventoModificadoVMEventoModificadoModelGetValue.getTxtEVENTOMODIFICA();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEVENTOMODIFICA, eventoModificadoVMEventoModificadoModelTxtEVENTOMODIFICA);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventoModificadoVM.eventoModificadoModel
        flag 1 (0x2L): eventoModificadoVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}