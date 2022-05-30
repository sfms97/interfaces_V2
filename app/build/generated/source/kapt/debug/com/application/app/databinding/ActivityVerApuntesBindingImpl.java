package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityVerApuntesBindingImpl extends ActivityVerApuntesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 7);
        sViewsWithIds.put(R.id.constraintGroup230, 8);
        sViewsWithIds.put(R.id.imageGroup37, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityVerApuntesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityVerApuntesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ScrollView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintGroup238.setTag(null);
        this.imageImage1.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey3.setTag(null);
        this.imageZoomIn.setTag(null);
        this.txtApuntes1fech.setTag(null);
        this.txtFsica.setTag(null);
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
        if (BR.verApuntesVM == variableId) {
            setVerApuntesVM((com.application.app.modules.verapuntes.data.viewmodel.VerApuntesVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVerApuntesVM(@Nullable com.application.app.modules.verapuntes.data.viewmodel.VerApuntesVM VerApuntesVM) {
        this.mVerApuntesVM = VerApuntesVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.verApuntesVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVerApuntesVMVerApuntesModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.verapuntes.data.model.VerApuntesModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVerApuntesVMVerApuntesModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.verapuntes.data.model.VerApuntesModel> VerApuntesVMVerApuntesModel, int fieldId) {
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
        com.application.app.modules.verapuntes.data.model.VerApuntesModel verApuntesVMVerApuntesModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.verapuntes.data.model.VerApuntesModel> verApuntesVMVerApuntesModel = null;
        java.lang.String verApuntesVMVerApuntesModelTxtFsica = null;
        com.application.app.modules.verapuntes.data.viewmodel.VerApuntesVM verApuntesVM = mVerApuntesVM;
        java.lang.String verApuntesVMVerApuntesModelTxtApuntes1fech = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (verApuntesVM != null) {
                    // read verApuntesVM.verApuntesModel
                    verApuntesVMVerApuntesModel = verApuntesVM.getVerApuntesModel();
                }
                updateLiveDataRegistration(0, verApuntesVMVerApuntesModel);


                if (verApuntesVMVerApuntesModel != null) {
                    // read verApuntesVM.verApuntesModel.getValue()
                    verApuntesVMVerApuntesModelGetValue = verApuntesVMVerApuntesModel.getValue();
                }


                if (verApuntesVMVerApuntesModelGetValue != null) {
                    // read verApuntesVM.verApuntesModel.getValue().txtFsica
                    verApuntesVMVerApuntesModelTxtFsica = verApuntesVMVerApuntesModelGetValue.getTxtFsica();
                    // read verApuntesVM.verApuntesModel.getValue().txtApuntes1fech
                    verApuntesVMVerApuntesModelTxtApuntes1fech = verApuntesVMVerApuntesModelGetValue.getTxtApuntes1fech();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImage1, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImage1.getContext(), R.drawable.img_image1), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageMenu, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageMenu.getContext(), R.drawable.img_menu), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey3, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey3.getContext(), R.drawable.img_pngkey2), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageZoomIn, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageZoomIn.getContext(), R.drawable.img_zoomin), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes1fech, verApuntesVMVerApuntesModelTxtApuntes1fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFsica, verApuntesVMVerApuntesModelTxtFsica);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): verApuntesVM.verApuntesModel
        flag 1 (0x2L): verApuntesVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}