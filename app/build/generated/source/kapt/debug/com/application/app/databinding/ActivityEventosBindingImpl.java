package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEventosBindingImpl extends ActivityEventosBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 10);
        sViewsWithIds.put(R.id.constraintGroup197, 11);
        sViewsWithIds.put(R.id.imageGroup27, 12);
        sViewsWithIds.put(R.id.viewRectangle3, 13);
        sViewsWithIds.put(R.id.constraintGroup188, 14);
        sViewsWithIds.put(R.id.textInputEditText, 15);
        sViewsWithIds.put(R.id.textInputEditText2, 16);
        sViewsWithIds.put(R.id.tituloEventos, 17);
        sViewsWithIds.put(R.id.imageCalendarDate, 18);
        sViewsWithIds.put(R.id.imageView10, 19);
        sViewsWithIds.put(R.id.imageView17, 20);
        sViewsWithIds.put(R.id.imageView18, 21);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEventosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityEventosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ScrollView) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[15]
            , (com.google.android.material.textfield.TextInputEditText) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[17]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[13]
            );
        this.constraintGroup200.setTag(null);
        this.imageMenu.setTag(null);
        this.imagePngkey2.setTag(null);
        this.txt.setTag(null);
        this.txtAadir.setTag(null);
        this.txtAsignatura.setTag(null);
        this.txtComentarios.setTag(null);
        this.txtEventos.setTag(null);
        this.txtFecha.setTag(null);
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
        if (BR.eventosVM == variableId) {
            setEventosVM((com.application.app.modules.eventos.data.viewmodel.EventosVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEventosVM(@Nullable com.application.app.modules.eventos.data.viewmodel.EventosVM EventosVM) {
        this.mEventosVM = EventosVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventosVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEventosVMEventosModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.eventos.data.model.EventosModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEventosVMEventosModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.eventos.data.model.EventosModel> EventosVMEventosModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.eventos.data.model.EventosModel> eventosVMEventosModel = null;
        java.lang.String eventosVMEventosModelTxtAadir = null;
        com.application.app.modules.eventos.data.model.EventosModel eventosVMEventosModelGetValue = null;
        java.lang.String eventosVMEventosModelTxtEventos = null;
        java.lang.String eventosVMEventosModelTxtFecha = null;
        java.lang.String eventosVMEventosModelTxtTtulo = null;
        java.lang.String eventosVMEventosModelTxtComentarios = null;
        com.application.app.modules.eventos.data.viewmodel.EventosVM eventosVM = mEventosVM;
        java.lang.String eventosVMEventosModelTxtAsignatura = null;
        java.lang.String eventosVMEventosModelTxt = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (eventosVM != null) {
                    // read eventosVM.eventosModel
                    eventosVMEventosModel = eventosVM.getEventosModel();
                }
                updateLiveDataRegistration(0, eventosVMEventosModel);


                if (eventosVMEventosModel != null) {
                    // read eventosVM.eventosModel.getValue()
                    eventosVMEventosModelGetValue = eventosVMEventosModel.getValue();
                }


                if (eventosVMEventosModelGetValue != null) {
                    // read eventosVM.eventosModel.getValue().txtAadir
                    eventosVMEventosModelTxtAadir = eventosVMEventosModelGetValue.getTxtAadir();
                    // read eventosVM.eventosModel.getValue().txtEventos
                    eventosVMEventosModelTxtEventos = eventosVMEventosModelGetValue.getTxtEventos();
                    // read eventosVM.eventosModel.getValue().txtFecha
                    eventosVMEventosModelTxtFecha = eventosVMEventosModelGetValue.getTxtFecha();
                    // read eventosVM.eventosModel.getValue().txtTtulo
                    eventosVMEventosModelTxtTtulo = eventosVMEventosModelGetValue.getTxtTtulo();
                    // read eventosVM.eventosModel.getValue().txtComentarios
                    eventosVMEventosModelTxtComentarios = eventosVMEventosModelGetValue.getTxtComentarios();
                    // read eventosVM.eventosModel.getValue().txtAsignatura
                    eventosVMEventosModelTxtAsignatura = eventosVMEventosModelGetValue.getTxtAsignatura();
                    // read eventosVM.eventosModel.getValue().txt
                    eventosVMEventosModelTxt = eventosVMEventosModelGetValue.getTxt();
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

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txt, eventosVMEventosModelTxt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAadir, eventosVMEventosModelTxtAadir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAsignatura, eventosVMEventosModelTxtAsignatura);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtComentarios, eventosVMEventosModelTxtComentarios);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEventos, eventosVMEventosModelTxtEventos);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFecha, eventosVMEventosModelTxtFecha);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTtulo, eventosVMEventosModelTxtTtulo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): eventosVM.eventosModel
        flag 1 (0x2L): eventosVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}