package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEventoEliminadpBindingImpl extends ActivityEventoEliminadpBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup358, 2);
        sViewsWithIds.put(R.id.imagePngkey5, 3);
        sViewsWithIds.put(R.id.imageInterfaceFavor, 4);
        sViewsWithIds.put(R.id.imagePngkey6, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEventoEliminadpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityEventoEliminadpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintEventoEliminad.setTag(null);
        this.txtEventoEliminad.setTag(null);
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
        if (BR.eventoEliminadpVM == variableId) {
            setEventoEliminadpVM((com.application.app.modules.eventoeliminadp.data.viewmodel.EventoEliminadpVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventoEliminadpVM(@Nullable com.application.app.modules.eventoeliminadp.data.viewmodel.EventoEliminadpVM EventoEliminadpVM) {
        this.mEventoEliminadpVM = EventoEliminadpVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventoEliminadpVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEventoEliminadpVMEventoEliminadpModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.eventoeliminadp.data.model.EventoEliminadpModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEventoEliminadpVMEventoEliminadpModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.eventoeliminadp.data.model.EventoEliminadpModel> EventoEliminadpVMEventoEliminadpModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.eventoeliminadp.data.model.EventoEliminadpModel> eventoEliminadpVMEventoEliminadpModel = null;
        java.lang.String eventoEliminadpVMEventoEliminadpModelTxtEventoEliminad = null;
        com.application.app.modules.eventoeliminadp.data.viewmodel.EventoEliminadpVM eventoEliminadpVM = mEventoEliminadpVM;
        com.application.app.modules.eventoeliminadp.data.model.EventoEliminadpModel eventoEliminadpVMEventoEliminadpModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (eventoEliminadpVM != null) {
                    // read eventoEliminadpVM.eventoEliminadpModel
                    eventoEliminadpVMEventoEliminadpModel = eventoEliminadpVM.getEventoEliminadpModel();
                }
                updateLiveDataRegistration(0, eventoEliminadpVMEventoEliminadpModel);


                if (eventoEliminadpVMEventoEliminadpModel != null) {
                    // read eventoEliminadpVM.eventoEliminadpModel.getValue()
                    eventoEliminadpVMEventoEliminadpModelGetValue = eventoEliminadpVMEventoEliminadpModel.getValue();
                }


                if (eventoEliminadpVMEventoEliminadpModelGetValue != null) {
                    // read eventoEliminadpVM.eventoEliminadpModel.getValue().txtEventoEliminad
                    eventoEliminadpVMEventoEliminadpModelTxtEventoEliminad = eventoEliminadpVMEventoEliminadpModelGetValue.getTxtEventoEliminad();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEventoEliminad, eventoEliminadpVMEventoEliminadpModelTxtEventoEliminad);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventoEliminadpVM.eventoEliminadpModel
        flag 1 (0x2L): eventoEliminadpVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}