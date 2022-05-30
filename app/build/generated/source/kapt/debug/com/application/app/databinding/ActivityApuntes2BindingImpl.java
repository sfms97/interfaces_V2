package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityApuntes2BindingImpl extends ActivityApuntes2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 18);
        sViewsWithIds.put(R.id.constraintGroup213, 19);
        sViewsWithIds.put(R.id.imageGroup32, 20);
        sViewsWithIds.put(R.id.constraintGroup202, 21);
        sViewsWithIds.put(R.id.imageCalendarDate, 22);
        sViewsWithIds.put(R.id.constraintGroup214, 23);
        sViewsWithIds.put(R.id.viewRectangle19, 24);
        sViewsWithIds.put(R.id.viewRectangle3, 25);
        sViewsWithIds.put(R.id.constraintGroup209, 26);
        sViewsWithIds.put(R.id.imageRectangle17, 27);
        sViewsWithIds.put(R.id.imageInterfaceRemov, 28);
        sViewsWithIds.put(R.id.imageGroup, 29);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityApuntes2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityApuntes2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ScrollView) bindings[18]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[25]
            );
        this.constraintGroup225.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey3.setTag(null);
        this.txt.setTag(null);
        this.txtApuntes1fech.setTag(null);
        this.txtApuntes2fech.setTag(null);
        this.txtApuntes3fech.setTag(null);
        this.txtApuntes4fech.setTag(null);
        this.txtApuntes5fech.setTag(null);
        this.txtApuntes6fech.setTag(null);
        this.txtApuntes7fech.setTag(null);
        this.txtApuntes8fech.setTag(null);
        this.txtDescargar.setTag(null);
        this.txtElige.setTag(null);
        this.txtFsica.setTag(null);
        this.txtSeleccionaUna.setTag(null);
        this.txtVer.setTag(null);
        this.txtVer1.setTag(null);
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
        if (BR.apuntes2VM == variableId) {
            setApuntes2VM((com.application.app.modules.apuntes2.data.viewmodel.Apuntes2VM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setApuntes2VM(@Nullable com.application.app.modules.apuntes2.data.viewmodel.Apuntes2VM Apuntes2VM) {
        this.mApuntes2VM = Apuntes2VM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.apuntes2VM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeApuntes2VMApuntes2Model((androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntes2.data.model.Apuntes2Model>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeApuntes2VMApuntes2Model(androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntes2.data.model.Apuntes2Model> Apuntes2VMApuntes2Model, int fieldId) {
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
        java.lang.String apuntes2VMApuntes2ModelTxtVer1 = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes3fech = null;
        java.lang.String apuntes2VMApuntes2ModelTxtElige = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes1fech = null;
        java.lang.String apuntes2VMApuntes2ModelTxtFsica = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes4fech = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes7fech = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes5fech = null;
        com.application.app.modules.apuntes2.data.model.Apuntes2Model apuntes2VMApuntes2ModelGetValue = null;
        java.lang.String apuntes2VMApuntes2ModelTxtSeleccionaUna = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes8fech = null;
        java.lang.String apuntes2VMApuntes2ModelTxtVer = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes6fech = null;
        com.application.app.modules.apuntes2.data.viewmodel.Apuntes2VM apuntes2VM = mApuntes2VM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.apuntes2.data.model.Apuntes2Model> apuntes2VMApuntes2Model = null;
        java.lang.String apuntes2VMApuntes2ModelTxtDescargar = null;
        java.lang.String apuntes2VMApuntes2ModelTxtApuntes2fech = null;
        java.lang.String apuntes2VMApuntes2ModelTxt = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (apuntes2VM != null) {
                    // read apuntes2VM.apuntes2Model
                    apuntes2VMApuntes2Model = apuntes2VM.getApuntes2Model();
                }
                updateLiveDataRegistration(0, apuntes2VMApuntes2Model);


                if (apuntes2VMApuntes2Model != null) {
                    // read apuntes2VM.apuntes2Model.getValue()
                    apuntes2VMApuntes2ModelGetValue = apuntes2VMApuntes2Model.getValue();
                }


                if (apuntes2VMApuntes2ModelGetValue != null) {
                    // read apuntes2VM.apuntes2Model.getValue().txtVer1
                    apuntes2VMApuntes2ModelTxtVer1 = apuntes2VMApuntes2ModelGetValue.getTxtVer1();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes3fech
                    apuntes2VMApuntes2ModelTxtApuntes3fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes3fech();
                    // read apuntes2VM.apuntes2Model.getValue().txtElige
                    apuntes2VMApuntes2ModelTxtElige = apuntes2VMApuntes2ModelGetValue.getTxtElige();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes1fech
                    apuntes2VMApuntes2ModelTxtApuntes1fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes1fech();
                    // read apuntes2VM.apuntes2Model.getValue().txtFsica
                    apuntes2VMApuntes2ModelTxtFsica = apuntes2VMApuntes2ModelGetValue.getTxtFsica();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes4fech
                    apuntes2VMApuntes2ModelTxtApuntes4fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes4fech();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes7fech
                    apuntes2VMApuntes2ModelTxtApuntes7fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes7fech();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes5fech
                    apuntes2VMApuntes2ModelTxtApuntes5fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes5fech();
                    // read apuntes2VM.apuntes2Model.getValue().txtSeleccionaUna
                    apuntes2VMApuntes2ModelTxtSeleccionaUna = apuntes2VMApuntes2ModelGetValue.getTxtSeleccionaUna();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes8fech
                    apuntes2VMApuntes2ModelTxtApuntes8fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes8fech();
                    // read apuntes2VM.apuntes2Model.getValue().txtVer
                    apuntes2VMApuntes2ModelTxtVer = apuntes2VMApuntes2ModelGetValue.getTxtVer();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes6fech
                    apuntes2VMApuntes2ModelTxtApuntes6fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes6fech();
                    // read apuntes2VM.apuntes2Model.getValue().txtDescargar
                    apuntes2VMApuntes2ModelTxtDescargar = apuntes2VMApuntes2ModelGetValue.getTxtDescargar();
                    // read apuntes2VM.apuntes2Model.getValue().txtApuntes2fech
                    apuntes2VMApuntes2ModelTxtApuntes2fech = apuntes2VMApuntes2ModelGetValue.getTxtApuntes2fech();
                    // read apuntes2VM.apuntes2Model.getValue().txt
                    apuntes2VMApuntes2ModelTxt = apuntes2VMApuntes2ModelGetValue.getTxt();
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt, apuntes2VMApuntes2ModelTxt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes1fech, apuntes2VMApuntes2ModelTxtApuntes1fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes2fech, apuntes2VMApuntes2ModelTxtApuntes2fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes3fech, apuntes2VMApuntes2ModelTxtApuntes3fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes4fech, apuntes2VMApuntes2ModelTxtApuntes4fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes5fech, apuntes2VMApuntes2ModelTxtApuntes5fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes6fech, apuntes2VMApuntes2ModelTxtApuntes6fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes7fech, apuntes2VMApuntes2ModelTxtApuntes7fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtApuntes8fech, apuntes2VMApuntes2ModelTxtApuntes8fech);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescargar, apuntes2VMApuntes2ModelTxtDescargar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtElige, apuntes2VMApuntes2ModelTxtElige);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFsica, apuntes2VMApuntes2ModelTxtFsica);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeleccionaUna, apuntes2VMApuntes2ModelTxtSeleccionaUna);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVer, apuntes2VMApuntes2ModelTxtVer);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtVer1, apuntes2VMApuntes2ModelTxtVer1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): apuntes2VM.apuntes2Model
        flag 1 (0x2L): apuntes2VM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}