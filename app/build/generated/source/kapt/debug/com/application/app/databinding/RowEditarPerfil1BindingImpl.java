package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowEditarPerfil1BindingImpl extends RowEditarPerfil1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageRectangle8, 3);
        sViewsWithIds.put(R.id.imageRectangle15, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowEditarPerfil1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowEditarPerfil1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.constraintGroup.setTag(null);
        this.txtEmail.setTag(null);
        this.txtEmail1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.editarPerfil1RowModel == variableId) {
            setEditarPerfil1RowModel((com.application.app.modules.editarperfil.data.model.EditarPerfil1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEditarPerfil1RowModel(@Nullable com.application.app.modules.editarperfil.data.model.EditarPerfil1RowModel EditarPerfil1RowModel) {
        this.mEditarPerfil1RowModel = EditarPerfil1RowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.editarPerfil1RowModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String editarPerfil1RowModelTxtEmail = null;
        java.lang.String editarPerfil1RowModelTxtEmail1 = null;
        com.application.app.modules.editarperfil.data.model.EditarPerfil1RowModel editarPerfil1RowModel = mEditarPerfil1RowModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (editarPerfil1RowModel != null) {
                    // read editarPerfil1RowModel.txtEmail
                    editarPerfil1RowModelTxtEmail = editarPerfil1RowModel.getTxtEmail();
                    // read editarPerfil1RowModel.txtEmail1
                    editarPerfil1RowModelTxtEmail1 = editarPerfil1RowModel.getTxtEmail1();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, editarPerfil1RowModelTxtEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail1, editarPerfil1RowModelTxtEmail1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): editarPerfil1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}