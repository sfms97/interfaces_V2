package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCalendarioBindingImpl extends ActivityCalendarioBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup302, 5);
        sViewsWithIds.put(R.id.constraintGroup289, 6);
        sViewsWithIds.put(R.id.imageGroup, 7);
        sViewsWithIds.put(R.id.imageGroup1, 8);
        sViewsWithIds.put(R.id.imageGroup2, 9);
        sViewsWithIds.put(R.id.viewRectangle9, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCalendarioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityCalendarioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[10]
            );
        this.constraintCalendario.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey1.setTag(null);
        this.txtAadirEvento.setTag(null);
        this.txtCalendario.setTag(null);
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
        if (BR.calendarioVM == variableId) {
            setCalendarioVM((com.application.app.modules.calendario.data.viewmodel.CalendarioVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCalendarioVM(@Nullable com.application.app.modules.calendario.data.viewmodel.CalendarioVM CalendarioVM) {
        this.mCalendarioVM = CalendarioVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.calendarioVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCalendarioVMCalendarioModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.calendario.data.model.CalendarioModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCalendarioVMCalendarioModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.calendario.data.model.CalendarioModel> CalendarioVMCalendarioModel, int fieldId) {
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
        java.lang.String calendarioVMCalendarioModelTxtAadirEvento = null;
        com.application.app.modules.calendario.data.viewmodel.CalendarioVM calendarioVM = mCalendarioVM;
        com.application.app.modules.calendario.data.model.CalendarioModel calendarioVMCalendarioModelGetValue = null;
        java.lang.String calendarioVMCalendarioModelTxtCalendario = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.calendario.data.model.CalendarioModel> calendarioVMCalendarioModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (calendarioVM != null) {
                    // read calendarioVM.calendarioModel
                    calendarioVMCalendarioModel = calendarioVM.getCalendarioModel();
                }
                updateLiveDataRegistration(0, calendarioVMCalendarioModel);


                if (calendarioVMCalendarioModel != null) {
                    // read calendarioVM.calendarioModel.getValue()
                    calendarioVMCalendarioModelGetValue = calendarioVMCalendarioModel.getValue();
                }


                if (calendarioVMCalendarioModelGetValue != null) {
                    // read calendarioVM.calendarioModel.getValue().txtAadirEvento
                    calendarioVMCalendarioModelTxtAadirEvento = calendarioVMCalendarioModelGetValue.getTxtAadirEvento();
                    // read calendarioVM.calendarioModel.getValue().txtCalendario
                    calendarioVMCalendarioModelTxtCalendario = calendarioVMCalendarioModelGetValue.getTxtCalendario();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageMenu, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageMenu.getContext(), R.drawable.img_menu), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey1, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey1.getContext(), R.drawable.img_pngkey2), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAadirEvento, calendarioVMCalendarioModelTxtAadirEvento);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCalendario, calendarioVMCalendarioModelTxtCalendario);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): calendarioVM.calendarioModel
        flag 1 (0x2L): calendarioVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}