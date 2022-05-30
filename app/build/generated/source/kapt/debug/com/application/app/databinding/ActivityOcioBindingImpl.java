package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOcioBindingImpl extends ActivityOcioBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup280, 6);
        sViewsWithIds.put(R.id.constraintGroup279, 7);
        sViewsWithIds.put(R.id.imageGroup, 8);
        sViewsWithIds.put(R.id.imageGroup1, 9);
        sViewsWithIds.put(R.id.imageGroup2, 10);
        sViewsWithIds.put(R.id.imageRectangle2, 11);
        sViewsWithIds.put(R.id.imageGroup3, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOcioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityOcioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.constraintOcio.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey1.setTag(null);
        this.imageRectangle.setTag(null);
        this.txtBuscar.setTag(null);
        this.txtOcioCercano.setTag(null);
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
        if (BR.ocioVM == variableId) {
            setOcioVM((com.application.app.modules.ocio.data.viewmodel.OcioVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOcioVM(@Nullable com.application.app.modules.ocio.data.viewmodel.OcioVM OcioVM) {
        this.mOcioVM = OcioVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ocioVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOcioVMOcioModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.ocio.data.model.OcioModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOcioVMOcioModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.ocio.data.model.OcioModel> OcioVMOcioModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.ocio.data.model.OcioModel> ocioVMOcioModel = null;
        java.lang.String ocioVMOcioModelTxtBuscar = null;
        com.application.app.modules.ocio.data.viewmodel.OcioVM ocioVM = mOcioVM;
        java.lang.String ocioVMOcioModelTxtOcioCercano = null;
        com.application.app.modules.ocio.data.model.OcioModel ocioVMOcioModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ocioVM != null) {
                    // read ocioVM.ocioModel
                    ocioVMOcioModel = ocioVM.getOcioModel();
                }
                updateLiveDataRegistration(0, ocioVMOcioModel);


                if (ocioVMOcioModel != null) {
                    // read ocioVM.ocioModel.getValue()
                    ocioVMOcioModelGetValue = ocioVMOcioModel.getValue();
                }


                if (ocioVMOcioModelGetValue != null) {
                    // read ocioVM.ocioModel.getValue().txtBuscar
                    ocioVMOcioModelTxtBuscar = ocioVMOcioModelGetValue.getTxtBuscar();
                    // read ocioVM.ocioModel.getValue().txtOcioCercano
                    ocioVMOcioModelTxtOcioCercano = ocioVMOcioModelGetValue.getTxtOcioCercano();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageMenu, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageMenu.getContext(), R.drawable.img_menu), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey1, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey1.getContext(), R.drawable.img_pngkey2), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangle, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangle.getContext(), R.drawable.img_rectangle), imageRectangle.getResources().getDimension(R.dimen._20pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBuscar, ocioVMOcioModelTxtBuscar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOcioCercano, ocioVMOcioModelTxtOcioCercano);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ocioVM.ocioModel
        flag 1 (0x2L): ocioVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}