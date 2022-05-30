package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPerfilBindingImpl extends ActivityPerfilBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txt, 11);
        sViewsWithIds.put(R.id.imageRectangle7, 12);
        sViewsWithIds.put(R.id.imageRectangle8, 13);
        sViewsWithIds.put(R.id.constraintGroup100, 14);
        sViewsWithIds.put(R.id.imageGroup, 15);
        sViewsWithIds.put(R.id.imageGroup1, 16);
        sViewsWithIds.put(R.id.imageGroup2, 17);
        sViewsWithIds.put(R.id.constraintGroup120, 18);
        sViewsWithIds.put(R.id.imageGroup3, 19);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPerfilBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityPerfilBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            );
        this.constraintPerfil.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey2.setTag(null);
        this.txtBirthday.setTag(null);
        this.txtEditar.setTag(null);
        this.txtEmail.setTag(null);
        this.txtFirstname.setTag(null);
        this.txtLastname.setTag(null);
        this.txtSubirFoto.setTag(null);
        this.txtTelfono.setTag(null);
        this.txtUsername.setTag(null);
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
        if (BR.perfilVM == variableId) {
            setPerfilVM((com.application.app.modules.perfil.data.viewmodel.PerfilVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPerfilVM(@Nullable com.application.app.modules.perfil.data.viewmodel.PerfilVM PerfilVM) {
        this.mPerfilVM = PerfilVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.perfilVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePerfilVMPerfilModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.perfil.data.model.PerfilModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePerfilVMPerfilModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.perfil.data.model.PerfilModel> PerfilVMPerfilModel, int fieldId) {
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
        com.application.app.modules.perfil.data.model.PerfilModel perfilVMPerfilModelGetValue = null;
        java.lang.String perfilVMPerfilModelTxtEditar = null;
        java.lang.String perfilVMPerfilModelTxtEmail = null;
        java.lang.String perfilVMPerfilModelTxtLastname = null;
        com.application.app.modules.perfil.data.viewmodel.PerfilVM perfilVM = mPerfilVM;
        java.lang.String perfilVMPerfilModelTxtBirthday = null;
        java.lang.String perfilVMPerfilModelTxtUsername = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.perfil.data.model.PerfilModel> perfilVMPerfilModel = null;
        java.lang.String perfilVMPerfilModelTxtSubirFoto = null;
        java.lang.String perfilVMPerfilModelTxtFirstname = null;
        java.lang.String perfilVMPerfilModelTxtTelfono = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (perfilVM != null) {
                    // read perfilVM.perfilModel
                    perfilVMPerfilModel = perfilVM.getPerfilModel();
                }
                updateLiveDataRegistration(0, perfilVMPerfilModel);


                if (perfilVMPerfilModel != null) {
                    // read perfilVM.perfilModel.getValue()
                    perfilVMPerfilModelGetValue = perfilVMPerfilModel.getValue();
                }


                if (perfilVMPerfilModelGetValue != null) {
                    // read perfilVM.perfilModel.getValue().txtEditar
                    perfilVMPerfilModelTxtEditar = perfilVMPerfilModelGetValue.getTxtEditar();
                    // read perfilVM.perfilModel.getValue().txtEmail
                    perfilVMPerfilModelTxtEmail = perfilVMPerfilModelGetValue.getTxtEmail();
                    // read perfilVM.perfilModel.getValue().txtLastname
                    perfilVMPerfilModelTxtLastname = perfilVMPerfilModelGetValue.getTxtLastname();
                    // read perfilVM.perfilModel.getValue().txtBirthday
                    perfilVMPerfilModelTxtBirthday = perfilVMPerfilModelGetValue.getTxtBirthday();
                    // read perfilVM.perfilModel.getValue().txtUsername
                    perfilVMPerfilModelTxtUsername = perfilVMPerfilModelGetValue.getTxtUsername();
                    // read perfilVM.perfilModel.getValue().txtSubirFoto
                    perfilVMPerfilModelTxtSubirFoto = perfilVMPerfilModelGetValue.getTxtSubirFoto();
                    // read perfilVM.perfilModel.getValue().txtFirstname
                    perfilVMPerfilModelTxtFirstname = perfilVMPerfilModelGetValue.getTxtFirstname();
                    // read perfilVM.perfilModel.getValue().txtTelfono
                    perfilVMPerfilModelTxtTelfono = perfilVMPerfilModelGetValue.getTxtTelfono();
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBirthday, perfilVMPerfilModelTxtBirthday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEditar, perfilVMPerfilModelTxtEditar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, perfilVMPerfilModelTxtEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFirstname, perfilVMPerfilModelTxtFirstname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLastname, perfilVMPerfilModelTxtLastname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSubirFoto, perfilVMPerfilModelTxtSubirFoto);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTelfono, perfilVMPerfilModelTxtTelfono);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUsername, perfilVMPerfilModelTxtUsername);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): perfilVM.perfilModel
        flag 1 (0x2L): perfilVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}