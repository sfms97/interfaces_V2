package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityApuntesBindingImpl extends ActivityApuntesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 10);
        sViewsWithIds.put(R.id.constraintGroup257, 11);
        sViewsWithIds.put(R.id.imageGroup52, 12);
        sViewsWithIds.put(R.id.constraintGroup251, 13);
        sViewsWithIds.put(R.id.viewRectangle19, 14);
        sViewsWithIds.put(R.id.viewRectangle20, 15);
        sViewsWithIds.put(R.id.constraintGroup250, 16);
        sViewsWithIds.put(R.id.constraintGroup256, 17);
        sViewsWithIds.put(R.id.constraintGroup249, 18);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityApuntesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityApuntesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ScrollView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[14]
            , (android.view.View) bindings[15]
            );
        this.constraintGroup260.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey4.setTag(null);
        this.txtAadir.setTag(null);
        this.txtAsignaturas.setTag(null);
        this.txtEliminar.setTag(null);
        this.txtFsica.setTag(null);
        this.txtHistoria.setTag(null);
        this.txtInterfacesDeU.setTag(null);
        this.txtProgramacin.setTag(null);
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
        if (BR.apuntesVM == variableId) {
            setApuntesVM((com.application.app.modules.apuntes.data.viewmodel.ApuntesVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setApuntesVM(@Nullable com.application.app.modules.apuntes.data.viewmodel.ApuntesVM ApuntesVM) {
        this.mApuntesVM = ApuntesVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.apuntesVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeApuntesVMApuntesModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntes.data.model.ApuntesModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeApuntesVMApuntesModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntes.data.model.ApuntesModel> ApuntesVMApuntesModel, int fieldId) {
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
        com.application.app.modules.apuntes.data.model.ApuntesModel apuntesVMApuntesModelGetValue = null;
        com.application.app.modules.apuntes.data.viewmodel.ApuntesVM apuntesVM = mApuntesVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntes.data.model.ApuntesModel> apuntesVMApuntesModel = null;
        java.lang.String apuntesVMApuntesModelTxtEliminar = null;
        java.lang.String apuntesVMApuntesModelTxtAsignaturas = null;
        java.lang.String apuntesVMApuntesModelTxtFsica = null;
        java.lang.String apuntesVMApuntesModelTxtInterfacesDeU = null;
        java.lang.String apuntesVMApuntesModelTxtProgramacin = null;
        java.lang.String apuntesVMApuntesModelTxtHistoria = null;
        java.lang.String apuntesVMApuntesModelTxtAadir = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (apuntesVM != null) {
                    // read apuntesVM.apuntesModel
                    apuntesVMApuntesModel = apuntesVM.getApuntesModel();
                }
                updateLiveDataRegistration(0, apuntesVMApuntesModel);


                if (apuntesVMApuntesModel != null) {
                    // read apuntesVM.apuntesModel.getValue()
                    apuntesVMApuntesModelGetValue = apuntesVMApuntesModel.getValue();
                }


                if (apuntesVMApuntesModelGetValue != null) {
                    // read apuntesVM.apuntesModel.getValue().txtEliminar
                    apuntesVMApuntesModelTxtEliminar = apuntesVMApuntesModelGetValue.getTxtEliminar();
                    // read apuntesVM.apuntesModel.getValue().txtAsignaturas
                    apuntesVMApuntesModelTxtAsignaturas = apuntesVMApuntesModelGetValue.getTxtAsignaturas();
                    // read apuntesVM.apuntesModel.getValue().txtFsica
                    apuntesVMApuntesModelTxtFsica = apuntesVMApuntesModelGetValue.getTxtFsica();
                    // read apuntesVM.apuntesModel.getValue().txtInterfacesDeU
                    apuntesVMApuntesModelTxtInterfacesDeU = apuntesVMApuntesModelGetValue.getTxtInterfacesDeU();
                    // read apuntesVM.apuntesModel.getValue().txtProgramacin
                    apuntesVMApuntesModelTxtProgramacin = apuntesVMApuntesModelGetValue.getTxtProgramacin();
                    // read apuntesVM.apuntesModel.getValue().txtHistoria
                    apuntesVMApuntesModelTxtHistoria = apuntesVMApuntesModelGetValue.getTxtHistoria();
                    // read apuntesVM.apuntesModel.getValue().txtAadir
                    apuntesVMApuntesModelTxtAadir = apuntesVMApuntesModelGetValue.getTxtAadir();
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAadir, apuntesVMApuntesModelTxtAadir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAsignaturas, apuntesVMApuntesModelTxtAsignaturas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEliminar, apuntesVMApuntesModelTxtEliminar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFsica, apuntesVMApuntesModelTxtFsica);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHistoria, apuntesVMApuntesModelTxtHistoria);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtInterfacesDeU, apuntesVMApuntesModelTxtInterfacesDeU);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProgramacin, apuntesVMApuntesModelTxtProgramacin);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): apuntesVM.apuntesModel
        flag 1 (0x2L): apuntesVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}