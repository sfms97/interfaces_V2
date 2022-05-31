package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditarEventoBindingImpl extends ActivityEditarEventoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 12);
        sViewsWithIds.put(R.id.constraintGroup271, 13);
        sViewsWithIds.put(R.id.imageGroup59, 14);
        sViewsWithIds.put(R.id.constraintGroup264, 15);
        sViewsWithIds.put(R.id.viewRectangle3, 16);
        sViewsWithIds.put(R.id.viewRectangle18, 17);
        sViewsWithIds.put(R.id.constraintGroup263, 18);
        sViewsWithIds.put(R.id.constraintGroup262, 19);
        sViewsWithIds.put(R.id.imageView4, 20);
        sViewsWithIds.put(R.id.imageView5, 21);
        sViewsWithIds.put(R.id.imageView7, 22);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditarEventoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityEditarEventoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ScrollView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[16]
            );
        this.constraintGroup274.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey3.setTag(null);
        this.txtAsignatura.setTag(null);
        this.txtAsignatura1.setTag(null);
        this.txtComentarios.setTag(null);
        this.txtComentarios1.setTag(null);
        this.txtEliminar.setTag(null);
        this.txtModificar.setTag(null);
        this.txtTtulo.setTag(null);
        this.txtTtuloDelEven.setTag(null);
        this.txtTtuloDelEven1.setTag(null);
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
        if (BR.editarEventoVM == variableId) {
            setEditarEventoVM((com.application.app.modules.editarevento.data.viewmodel.EditarEventoVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEditarEventoVM(@Nullable com.application.app.modules.editarevento.data.viewmodel.EditarEventoVM EditarEventoVM) {
        this.mEditarEventoVM = EditarEventoVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.editarEventoVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEditarEventoVMEditarEventoModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.editarevento.data.model.EditarEventoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEditarEventoVMEditarEventoModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.editarevento.data.model.EditarEventoModel> EditarEventoVMEditarEventoModel, int fieldId) {
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
        java.lang.String editarEventoVMEditarEventoModelTxtEliminar = null;
        java.lang.String editarEventoVMEditarEventoModelTxtModificar = null;
        java.lang.String editarEventoVMEditarEventoModelTxtTtuloDelEven1 = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.editarevento.data.model.EditarEventoModel> editarEventoVMEditarEventoModel = null;
        java.lang.String editarEventoVMEditarEventoModelTxtTtulo = null;
        java.lang.String editarEventoVMEditarEventoModelTxtAsignatura = null;
        com.application.app.modules.editarevento.data.model.EditarEventoModel editarEventoVMEditarEventoModelGetValue = null;
        java.lang.String editarEventoVMEditarEventoModelTxtAsignatura1 = null;
        java.lang.String editarEventoVMEditarEventoModelTxtTtuloDelEven = null;
        java.lang.String editarEventoVMEditarEventoModelTxtComentarios = null;
        java.lang.String editarEventoVMEditarEventoModelTxtComentarios1 = null;
        com.application.app.modules.editarevento.data.viewmodel.EditarEventoVM editarEventoVM = mEditarEventoVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (editarEventoVM != null) {
                    // read editarEventoVM.editarEventoModel
                    editarEventoVMEditarEventoModel = editarEventoVM.getEditarEventoModel();
                }
                updateLiveDataRegistration(0, editarEventoVMEditarEventoModel);


                if (editarEventoVMEditarEventoModel != null) {
                    // read editarEventoVM.editarEventoModel.getValue()
                    editarEventoVMEditarEventoModelGetValue = editarEventoVMEditarEventoModel.getValue();
                }


                if (editarEventoVMEditarEventoModelGetValue != null) {
                    // read editarEventoVM.editarEventoModel.getValue().txtEliminar
                    editarEventoVMEditarEventoModelTxtEliminar = editarEventoVMEditarEventoModelGetValue.getTxtEliminar();
                    // read editarEventoVM.editarEventoModel.getValue().txtModificar
                    editarEventoVMEditarEventoModelTxtModificar = editarEventoVMEditarEventoModelGetValue.getTxtModificar();
                    // read editarEventoVM.editarEventoModel.getValue().txtTtuloDelEven1
                    editarEventoVMEditarEventoModelTxtTtuloDelEven1 = editarEventoVMEditarEventoModelGetValue.getTxtTtuloDelEven1();
                    // read editarEventoVM.editarEventoModel.getValue().txtTtulo
                    editarEventoVMEditarEventoModelTxtTtulo = editarEventoVMEditarEventoModelGetValue.getTxtTtulo();
                    // read editarEventoVM.editarEventoModel.getValue().txtAsignatura
                    editarEventoVMEditarEventoModelTxtAsignatura = editarEventoVMEditarEventoModelGetValue.getTxtAsignatura();
                    // read editarEventoVM.editarEventoModel.getValue().txtAsignatura1
                    editarEventoVMEditarEventoModelTxtAsignatura1 = editarEventoVMEditarEventoModelGetValue.getTxtAsignatura1();
                    // read editarEventoVM.editarEventoModel.getValue().txtTtuloDelEven
                    editarEventoVMEditarEventoModelTxtTtuloDelEven = editarEventoVMEditarEventoModelGetValue.getTxtTtuloDelEven();
                    // read editarEventoVM.editarEventoModel.getValue().txtComentarios
                    editarEventoVMEditarEventoModelTxtComentarios = editarEventoVMEditarEventoModelGetValue.getTxtComentarios();
                    // read editarEventoVM.editarEventoModel.getValue().txtComentarios1
                    editarEventoVMEditarEventoModelTxtComentarios1 = editarEventoVMEditarEventoModelGetValue.getTxtComentarios1();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageMenu, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageMenu.getContext(), R.drawable.img_menu), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imagePngkey3, androidx.appcompat.content.res.AppCompatResources.getDrawable(imagePngkey3.getContext(), R.drawable.img_pngkey2), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAsignatura, editarEventoVMEditarEventoModelTxtAsignatura);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAsignatura1, editarEventoVMEditarEventoModelTxtAsignatura1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtComentarios, editarEventoVMEditarEventoModelTxtComentarios);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtComentarios1, editarEventoVMEditarEventoModelTxtComentarios1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEliminar, editarEventoVMEditarEventoModelTxtEliminar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtModificar, editarEventoVMEditarEventoModelTxtModificar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTtulo, editarEventoVMEditarEventoModelTxtTtulo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTtuloDelEven, editarEventoVMEditarEventoModelTxtTtuloDelEven);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTtuloDelEven1, editarEventoVMEditarEventoModelTxtTtuloDelEven1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): editarEventoVM.editarEventoModel
        flag 1 (0x2L): editarEventoVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}