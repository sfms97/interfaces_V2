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
        sViewsWithIds.put(R.id.scrollViewScrollview, 14);
        sViewsWithIds.put(R.id.constraintGroup148, 15);
        sViewsWithIds.put(R.id.imageGroup19, 16);
        sViewsWithIds.put(R.id.constraintGroup183, 17);
        sViewsWithIds.put(R.id.constraintGroup163, 18);
        sViewsWithIds.put(R.id.constraintGroup165, 19);
        sViewsWithIds.put(R.id.constraintGroup181, 20);
        sViewsWithIds.put(R.id.constraintGroup167, 21);
        sViewsWithIds.put(R.id.imageGroup, 22);
        sViewsWithIds.put(R.id.imageInterfaceAdd2, 23);
        sViewsWithIds.put(R.id.imageGroup1, 24);
        sViewsWithIds.put(R.id.imageInterfaceAdd3, 25);
        sViewsWithIds.put(R.id.constraintGroup160, 26);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditarPerfilBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityEditarPerfilBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[14]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.constraintGroup186.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey2.setTag(null);
        this.recyclerEditarPerfil.setTag(null);
        this.txtEditar.setTag(null);
        this.txtEditar1.setTag(null);
        this.txtFirstname.setTag(null);
        this.txtFirstname1.setTag(null);
        this.txtLastname.setTag(null);
        this.txtLastname1.setTag(null);
        this.txtTelfono.setTag(null);
        this.txtTelfono1.setTag(null);
        this.txtUsername.setTag(null);
        this.txtUsername1.setTag(null);
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
        java.lang.String editarPerfilVMEditarPerfilModelTxtTelfono = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtLastname = null;
        com.application.app.modules.editarperfil.data.viewmodel.EditarPerfilVM editarPerfilVM = mEditarPerfilVM;
        com.application.app.modules.editarperfil.data.model.EditarPerfilModel editarPerfilVMEditarPerfilModelGetValue = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtEditar1 = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtEditar = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtTelfono1 = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtUsername1 = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtUsername = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtFirstname = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.editarperfil.data.model.EditarPerfilModel> editarPerfilVMEditarPerfilModel = null;
        java.lang.String editarPerfilVMEditarPerfilModelTxtFirstname1 = null;
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
                    // read editarPerfilVM.editarPerfilModel.getValue().txtTelfono
                    editarPerfilVMEditarPerfilModelTxtTelfono = editarPerfilVMEditarPerfilModelGetValue.getTxtTelfono();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtLastname
                    editarPerfilVMEditarPerfilModelTxtLastname = editarPerfilVMEditarPerfilModelGetValue.getTxtLastname();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtEditar1
                    editarPerfilVMEditarPerfilModelTxtEditar1 = editarPerfilVMEditarPerfilModelGetValue.getTxtEditar1();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtEditar
                    editarPerfilVMEditarPerfilModelTxtEditar = editarPerfilVMEditarPerfilModelGetValue.getTxtEditar();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtTelfono1
                    editarPerfilVMEditarPerfilModelTxtTelfono1 = editarPerfilVMEditarPerfilModelGetValue.getTxtTelfono1();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtUsername1
                    editarPerfilVMEditarPerfilModelTxtUsername1 = editarPerfilVMEditarPerfilModelGetValue.getTxtUsername1();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtUsername
                    editarPerfilVMEditarPerfilModelTxtUsername = editarPerfilVMEditarPerfilModelGetValue.getTxtUsername();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtFirstname
                    editarPerfilVMEditarPerfilModelTxtFirstname = editarPerfilVMEditarPerfilModelGetValue.getTxtFirstname();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtFirstname1
                    editarPerfilVMEditarPerfilModelTxtFirstname1 = editarPerfilVMEditarPerfilModelGetValue.getTxtFirstname1();
                    // read editarPerfilVM.editarPerfilModel.getValue().txtLastname1
                    editarPerfilVMEditarPerfilModelTxtLastname1 = editarPerfilVMEditarPerfilModelGetValue.getTxtLastname1();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageMenu, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageMenu.getContext(), R.drawable.img_menu), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey2, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey2.getContext(), R.drawable.img_pngkey2), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerEditarPerfil, recyclerEditarPerfil.getResources().getDimension(R.dimen._10pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEditar, editarPerfilVMEditarPerfilModelTxtEditar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEditar1, editarPerfilVMEditarPerfilModelTxtEditar1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFirstname, editarPerfilVMEditarPerfilModelTxtFirstname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFirstname1, editarPerfilVMEditarPerfilModelTxtFirstname1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLastname, editarPerfilVMEditarPerfilModelTxtLastname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLastname1, editarPerfilVMEditarPerfilModelTxtLastname1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTelfono, editarPerfilVMEditarPerfilModelTxtTelfono);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTelfono1, editarPerfilVMEditarPerfilModelTxtTelfono1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsername, editarPerfilVMEditarPerfilModelTxtUsername);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsername1, editarPerfilVMEditarPerfilModelTxtUsername1);
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