package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAAdirAsignaturaBindingImpl extends ActivityAAdirAsignaturaBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintGroup351, 2);
        sViewsWithIds.put(R.id.imagePngkey5, 3);
        sViewsWithIds.put(R.id.imageInterfaceFavor, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAAdirAsignaturaBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityAAdirAsignaturaBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.constraintAadirAsignatu.setTag(null);
        this.txtNombreDeLaAs.setTag(null);
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
        if (BR.aAdirAsignaturaVM == variableId) {
            setAAdirAsignaturaVM((com.application.app.modules.aadirasignatura.data.viewmodel.AAdirAsignaturaVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAAdirAsignaturaVM(@Nullable com.application.app.modules.aadirasignatura.data.viewmodel.AAdirAsignaturaVM AAdirAsignaturaVM) {
        this.mAAdirAsignaturaVM = AAdirAsignaturaVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.aAdirAsignaturaVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAAdirAsignaturaVMAAdirAsignaturaModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.aadirasignatura.data.model.AAdirAsignaturaModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAAdirAsignaturaVMAAdirAsignaturaModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.aadirasignatura.data.model.AAdirAsignaturaModel> AAdirAsignaturaVMAAdirAsignaturaModel, int fieldId) {
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
        java.lang.String aAdirAsignaturaVMAAdirAsignaturaModelTxtNombreDeLaAs = null;
        com.application.app.modules.aadirasignatura.data.model.AAdirAsignaturaModel aAdirAsignaturaVMAAdirAsignaturaModelGetValue = null;
        com.application.app.modules.aadirasignatura.data.viewmodel.AAdirAsignaturaVM aAdirAsignaturaVM = mAAdirAsignaturaVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.aadirasignatura.data.model.AAdirAsignaturaModel> aAdirAsignaturaVMAAdirAsignaturaModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (aAdirAsignaturaVM != null) {
                    // read aAdirAsignaturaVM.aAdirAsignaturaModel
                    aAdirAsignaturaVMAAdirAsignaturaModel = aAdirAsignaturaVM.getAAdirAsignaturaModel();
                }
                updateLiveDataRegistration(0, aAdirAsignaturaVMAAdirAsignaturaModel);


                if (aAdirAsignaturaVMAAdirAsignaturaModel != null) {
                    // read aAdirAsignaturaVM.aAdirAsignaturaModel.getValue()
                    aAdirAsignaturaVMAAdirAsignaturaModelGetValue = aAdirAsignaturaVMAAdirAsignaturaModel.getValue();
                }


                if (aAdirAsignaturaVMAAdirAsignaturaModelGetValue != null) {
                    // read aAdirAsignaturaVM.aAdirAsignaturaModel.getValue().txtNombreDeLaAs
                    aAdirAsignaturaVMAAdirAsignaturaModelTxtNombreDeLaAs = aAdirAsignaturaVMAAdirAsignaturaModelGetValue.getTxtNombreDeLaAs();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNombreDeLaAs, aAdirAsignaturaVMAAdirAsignaturaModelTxtNombreDeLaAs);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): aAdirAsignaturaVM.aAdirAsignaturaModel
        flag 1 (0x2L): aAdirAsignaturaVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}