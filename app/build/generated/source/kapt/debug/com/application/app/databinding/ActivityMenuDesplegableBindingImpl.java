package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMenuDesplegableBindingImpl extends ActivityMenuDesplegableBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 8);
        sViewsWithIds.put(R.id.constraintGroup340, 9);
        sViewsWithIds.put(R.id.imageGroup73, 10);
        sViewsWithIds.put(R.id.viewRectangle10, 11);
        sViewsWithIds.put(R.id.viewRectangle17, 12);
        sViewsWithIds.put(R.id.constraintGroup332, 13);
        sViewsWithIds.put(R.id.viewRectangle21, 14);
        sViewsWithIds.put(R.id.imageGroup, 15);
        sViewsWithIds.put(R.id.constraintGroup345, 16);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMenuDesplegableBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityMenuDesplegableBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ScrollView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[14]
            );
        this.constraintGroup347.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey4.setTag(null);
        this.txtSeleccionaElF.setTag(null);
        this.txtSeleccionaLaA.setTag(null);
        this.txtSubirApuntes.setTag(null);
        this.txtSubirApuntes1.setTag(null);
        this.txtTtulo.setTag(null);
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
        if (BR.menuDesplegableVM == variableId) {
            setMenuDesplegableVM((com.application.app.modules.menudesplegable.data.viewmodel.MenuDesplegableVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuDesplegableVM(@Nullable com.application.app.modules.menudesplegable.data.viewmodel.MenuDesplegableVM MenuDesplegableVM) {
        this.mMenuDesplegableVM = MenuDesplegableVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.menuDesplegableVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMenuDesplegableVMMenuDesplegableModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.menudesplegable.data.model.MenuDesplegableModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMenuDesplegableVMMenuDesplegableModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.menudesplegable.data.model.MenuDesplegableModel> MenuDesplegableVMMenuDesplegableModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.menudesplegable.data.model.MenuDesplegableModel> menuDesplegableVMMenuDesplegableModel = null;
        java.lang.String menuDesplegableVMMenuDesplegableModelTxtTtulo = null;
        com.application.app.modules.menudesplegable.data.viewmodel.MenuDesplegableVM menuDesplegableVM = mMenuDesplegableVM;
        java.lang.String menuDesplegableVMMenuDesplegableModelTxtSeleccionaLaA = null;
        java.lang.String menuDesplegableVMMenuDesplegableModelTxtSeleccionaElF = null;
        java.lang.String menuDesplegableVMMenuDesplegableModelTxtSubirApuntes1 = null;
        com.application.app.modules.menudesplegable.data.model.MenuDesplegableModel menuDesplegableVMMenuDesplegableModelGetValue = null;
        java.lang.String menuDesplegableVMMenuDesplegableModelTxtSubirApuntes = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (menuDesplegableVM != null) {
                    // read menuDesplegableVM.menuDesplegableModel
                    menuDesplegableVMMenuDesplegableModel = menuDesplegableVM.getMenuDesplegableModel();
                }
                updateLiveDataRegistration(0, menuDesplegableVMMenuDesplegableModel);


                if (menuDesplegableVMMenuDesplegableModel != null) {
                    // read menuDesplegableVM.menuDesplegableModel.getValue()
                    menuDesplegableVMMenuDesplegableModelGetValue = menuDesplegableVMMenuDesplegableModel.getValue();
                }


                if (menuDesplegableVMMenuDesplegableModelGetValue != null) {
                    // read menuDesplegableVM.menuDesplegableModel.getValue().txtTtulo
                    menuDesplegableVMMenuDesplegableModelTxtTtulo = menuDesplegableVMMenuDesplegableModelGetValue.getTxtTtulo();
                    // read menuDesplegableVM.menuDesplegableModel.getValue().txtSeleccionaLaA
                    menuDesplegableVMMenuDesplegableModelTxtSeleccionaLaA = menuDesplegableVMMenuDesplegableModelGetValue.getTxtSeleccionaLaA();
                    // read menuDesplegableVM.menuDesplegableModel.getValue().txtSeleccionaElF
                    menuDesplegableVMMenuDesplegableModelTxtSeleccionaElF = menuDesplegableVMMenuDesplegableModelGetValue.getTxtSeleccionaElF();
                    // read menuDesplegableVM.menuDesplegableModel.getValue().txtSubirApuntes1
                    menuDesplegableVMMenuDesplegableModelTxtSubirApuntes1 = menuDesplegableVMMenuDesplegableModelGetValue.getTxtSubirApuntes1();
                    // read menuDesplegableVM.menuDesplegableModel.getValue().txtSubirApuntes
                    menuDesplegableVMMenuDesplegableModelTxtSubirApuntes = menuDesplegableVMMenuDesplegableModelGetValue.getTxtSubirApuntes();
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeleccionaElF, menuDesplegableVMMenuDesplegableModelTxtSeleccionaElF);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeleccionaLaA, menuDesplegableVMMenuDesplegableModelTxtSeleccionaLaA);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSubirApuntes, menuDesplegableVMMenuDesplegableModelTxtSubirApuntes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSubirApuntes1, menuDesplegableVMMenuDesplegableModelTxtSubirApuntes1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTtulo, menuDesplegableVMMenuDesplegableModelTxtTtulo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuDesplegableVM.menuDesplegableModel
        flag 1 (0x2L): menuDesplegableVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}