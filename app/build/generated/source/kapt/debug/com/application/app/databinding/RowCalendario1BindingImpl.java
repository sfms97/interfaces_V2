package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowCalendario1BindingImpl extends RowCalendario1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btnMo, 1);
        sViewsWithIds.put(R.id.btnTu, 2);
        sViewsWithIds.put(R.id.btnWe, 3);
        sViewsWithIds.put(R.id.btnTh, 4);
        sViewsWithIds.put(R.id.btnFr, 5);
        sViewsWithIds.put(R.id.btnSa, 6);
        sViewsWithIds.put(R.id.btnSu, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowCalendario1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RowCalendario1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[5]
            , (androidx.appcompat.widget.AppCompatButton) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.constraintLine.setTag(null);
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
        if (BR.calendario1RowModel == variableId) {
            setCalendario1RowModel((com.application.app.modules.calendario.data.model.Calendario1RowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCalendario1RowModel(@Nullable com.application.app.modules.calendario.data.model.Calendario1RowModel Calendario1RowModel) {
        this.mCalendario1RowModel = Calendario1RowModel;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): calendario1RowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}