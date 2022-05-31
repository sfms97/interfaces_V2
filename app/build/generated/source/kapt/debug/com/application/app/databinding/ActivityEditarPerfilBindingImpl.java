package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditarPerfilBindingImpl extends ActivityEditarPerfilBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 10);
        sViewsWithIds.put(R.id.constraintGroup148, 11);
        sViewsWithIds.put(R.id.viewRectangle2, 12);
        sViewsWithIds.put(R.id.imageGroup19, 13);
        sViewsWithIds.put(R.id.constraintGroup183, 14);
        sViewsWithIds.put(R.id.constraintGroup181, 15);
        sViewsWithIds.put(R.id.imageGroup, 16);
        sViewsWithIds.put(R.id.imageInterfaceAdd2, 17);
        sViewsWithIds.put(R.id.constraintGroup160, 18);
        sViewsWithIds.put(R.id.imageView14, 19);
        sViewsWithIds.put(R.id.imageView15, 20);
        sViewsWithIds.put(R.id.imageView16, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditarPerfilBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityEditarPerfilBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[12]
            );
        this.constraintGroup186.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey2.setTag(null);
        this.txtBirthdayEditarPerfil.setTag(null);
        this.txtEditar1.setTag(null);
        this.txtEmailEditarPerfil2.setTag(null);
        this.txtLastname1.setTag(null);
        this.txtNombreEditarPerfil.setTag(null);
        this.txtTelfono1.setTag(null);
        this.txtUsernameEditarPerfil.setTag(null);
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
        if (BR.editarPerfilVM == variableId) {
            setEditarPerfilVM((com.application.app.modules.editarperfil.data.viewmodel.EditarPerfilVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEditarPerfilVM(@Nullable com.application.app.modules.editarperfil.data.viewmodel.EditarPerfilVM EditarPerfilVM) {
        this.mEditarPerfilVM = EditarPerfilVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.editarPerfilVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEditarPerfilVMEditarPerfilModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.editarperfil.data.model.EditarPerfilModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEditarPerfilVMEditarPerfilModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.editarperfil.data.model.EditarPerfilModel> EditarPerfilVMEditarPerfilModel, int fieldId) {
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
        com.application.app.modules.editarperfil.data.viewmodel.EditarPerfilVM editarPerfilVM = mEditarPerfilVM;
        com.application.app.modules.editarperfil.data.model.EditarPerfilModel editarPerfilVMEditarPerfilModelGetValue = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtEditar1 = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtTelfono1 = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.editarperfil.data.model.EditarPerfilModel> editarPerfilVMEditarPerfilModel = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtLastname1 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (editarPerfilVM != null) {
                    // read editarPerfilVM.editarPerfilModel
                    editarPerfilVMEditarPerfilModel = editarPerfilVM.getEditarPerfilModel();
                }
                updateLiveDataRegistration(0, editarPerfilVMEditarPerfilModel);


                if (editarPerfilVMEditarPerfilModel != null) {
                    // read editarPerfilVM.editarPerfilModel.getValue()
                    editarPerfilVMEditarPerfilModelGetValue = editarPerfilVMEditarPerfilModel.getValue();
                }


                if (editarPerfilVMEditarPerfilModelGetValue != null) {
                    // read editarPerfilVM.editarPerfilModel.getValue().txtEditar1
                    editarPerfilVMEditarPerfilModelTxtEditar1 = editarPerfilVMEditarPerfilModelGetValue.getTxtEditar1();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtTelfono1
                    editarPerfilVMEditarPerfilModelTxtTelfono1 = editarPerfilVMEditarPerfilModelGetValue.getTxtTelfono1();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtLastname1
                    editarPerfilVMEditarPerfilModelTxtLastname1 = editarPerfilVMEditarPerfilModelGetValue.getTxtLastname1();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageMenu, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageMenu.getContext(), R.drawable.img_menu), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey2, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey2.getContext(), R.drawable.img_pngkey2), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBirthdayEditarPerfil, editarPerfilVMEditarPerfilModelTxtTelfono1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEditar1, editarPerfilVMEditarPerfilModelTxtEditar1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmailEditarPerfil2, editarPerfilVMEditarPerfilModelTxtTelfono1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLastname1, editarPerfilVMEditarPerfilModelTxtLastname1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNombreEditarPerfil, editarPerfilVMEditarPerfilModelTxtLastname1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTelfono1, editarPerfilVMEditarPerfilModelTxtTelfono1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsernameEditarPerfil, editarPerfilVMEditarPerfilModelTxtTelfono1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): editarPerfilVM.editarPerfilModel
        flag 1 (0x2L): editarPerfilVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}