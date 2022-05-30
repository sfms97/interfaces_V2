package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySubirFotoBindingImpl extends ActivitySubirFotoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 6);
        sViewsWithIds.put(R.id.constraintGroup245, 7);
        sViewsWithIds.put(R.id.imageGroup43, 8);
        sViewsWithIds.put(R.id.constraintGroup240, 9);
        sViewsWithIds.put(R.id.constraintRectangle21, 10);
        sViewsWithIds.put(R.id.imageGroup, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySubirFotoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivitySubirFotoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintGroup247.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey4.setTag(null);
        this.txtSeleccionaLaF.setTag(null);
        this.txtSubir.setTag(null);
        this.txtSubirFoto.setTag(null);
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
        if (BR.subirFotoVM == variableId) {
            setSubirFotoVM((com.application.app.modules.subirfoto.data.viewmodel.SubirFotoVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSubirFotoVM(@Nullable com.application.app.modules.subirfoto.data.viewmodel.SubirFotoVM SubirFotoVM) {
        this.mSubirFotoVM = SubirFotoVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.subirFotoVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSubirFotoVMSubirFotoModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.subirfoto.data.model.SubirFotoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSubirFotoVMSubirFotoModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.subirfoto.data.model.SubirFotoModel> SubirFotoVMSubirFotoModel, int fieldId) {
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
        com.application.app.modules.subirfoto.data.viewmodel.SubirFotoVM subirFotoVM = mSubirFotoVM;
        java.lang.String subirFotoVMSubirFotoModelTxtSubirFoto = null;
        com.application.app.modules.subirfoto.data.model.SubirFotoModel subirFotoVMSubirFotoModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.subirfoto.data.model.SubirFotoModel> subirFotoVMSubirFotoModel = null;
        java.lang.String subirFotoVMSubirFotoModelTxtSeleccionaLaF = null;
        java.lang.String subirFotoVMSubirFotoModelTxtSubir = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (subirFotoVM != null) {
                    // read subirFotoVM.subirFotoModel
                    subirFotoVMSubirFotoModel = subirFotoVM.getSubirFotoModel();
                }
                updateLiveDataRegistration(0, subirFotoVMSubirFotoModel);


                if (subirFotoVMSubirFotoModel != null) {
                    // read subirFotoVM.subirFotoModel.getValue()
                    subirFotoVMSubirFotoModelGetValue = subirFotoVMSubirFotoModel.getValue();
                }


                if (subirFotoVMSubirFotoModelGetValue != null) {
                    // read subirFotoVM.subirFotoModel.getValue().txtSubirFoto
                    subirFotoVMSubirFotoModelTxtSubirFoto = subirFotoVMSubirFotoModelGetValue.getTxtSubirFoto();
                    // read subirFotoVM.subirFotoModel.getValue().txtSeleccionaLaF
                    subirFotoVMSubirFotoModelTxtSeleccionaLaF = subirFotoVMSubirFotoModelGetValue.getTxtSeleccionaLaF();
                    // read subirFotoVM.subirFotoModel.getValue().txtSubir
                    subirFotoVMSubirFotoModelTxtSubir = subirFotoVMSubirFotoModelGetValue.getTxtSubir();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageMenu, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageMenu.getContext(), R.drawable.img_menu), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey4, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey4.getContext(), R.drawable.img_pngkey2), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeleccionaLaF, subirFotoVMSubirFotoModelTxtSeleccionaLaF);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSubir, subirFotoVMSubirFotoModelTxtSubir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSubirFoto, subirFotoVMSubirFotoModelTxtSubirFoto);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): subirFotoVM.subirFotoModel
        flag 1 (0x2L): subirFotoVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}