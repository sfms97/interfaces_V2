package com.application.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.application.app.databinding.ActivityAAdirAsignaturaBindingImpl;
import com.application.app.databinding.ActivityAmpliarBindingImpl;
import com.application.app.databinding.ActivityAppNavigationBindingImpl;
import com.application.app.databinding.ActivityApuntes2BindingImpl;
import com.application.app.databinding.ActivityApuntesBindingImpl;
import com.application.app.databinding.ActivityApuntesSubidosBindingImpl;
import com.application.app.databinding.ActivityCalendarioBindingImpl;
import com.application.app.databinding.ActivityConfirmarLogoutBindingImpl;
import com.application.app.databinding.ActivityEditarEventoBindingImpl;
import com.application.app.databinding.ActivityEditarPerfilBindingImpl;
import com.application.app.databinding.ActivityEliminarBindingImpl;
import com.application.app.databinding.ActivityEventoAAdidoBindingImpl;
import com.application.app.databinding.ActivityEventoEliminadpBindingImpl;
import com.application.app.databinding.ActivityEventoModificadoBindingImpl;
import com.application.app.databinding.ActivityEventosBindingImpl;
import com.application.app.databinding.ActivityFotoSubida1BindingImpl;
import com.application.app.databinding.ActivityFotoSubidaBindingImpl;
import com.application.app.databinding.ActivityLoginBindingImpl;
import com.application.app.databinding.ActivityMenuDesplegableBindingImpl;
import com.application.app.databinding.ActivityOcioBindingImpl;
import com.application.app.databinding.ActivityPerfilBindingImpl;
import com.application.app.databinding.ActivitySignUpBindingImpl;
import com.application.app.databinding.ActivitySubirFotoBindingImpl;
import com.application.app.databinding.ActivityVerApuntesBindingImpl;
import com.application.app.databinding.LayoutProgressDialogBindingImpl;
import com.application.app.databinding.RowCalendario1BindingImpl;
import com.application.app.databinding.RowEditarPerfil1BindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAADIRASIGNATURA = 1;

  private static final int LAYOUT_ACTIVITYAMPLIAR = 2;

  private static final int LAYOUT_ACTIVITYAPPNAVIGATION = 3;

  private static final int LAYOUT_ACTIVITYAPUNTES = 4;

  private static final int LAYOUT_ACTIVITYAPUNTES2 = 5;

  private static final int LAYOUT_ACTIVITYAPUNTESSUBIDOS = 6;

  private static final int LAYOUT_ACTIVITYCALENDARIO = 7;

  private static final int LAYOUT_ACTIVITYCONFIRMARLOGOUT = 8;

  private static final int LAYOUT_ACTIVITYEDITAREVENTO = 9;

  private static final int LAYOUT_ACTIVITYEDITARPERFIL = 10;

  private static final int LAYOUT_ACTIVITYELIMINAR = 11;

  private static final int LAYOUT_ACTIVITYEVENTOAADIDO = 12;

  private static final int LAYOUT_ACTIVITYEVENTOELIMINADP = 13;

  private static final int LAYOUT_ACTIVITYEVENTOMODIFICADO = 14;

  private static final int LAYOUT_ACTIVITYEVENTOS = 15;

  private static final int LAYOUT_ACTIVITYFOTOSUBIDA = 16;

  private static final int LAYOUT_ACTIVITYFOTOSUBIDA1 = 17;

  private static final int LAYOUT_ACTIVITYLOGIN = 18;

  private static final int LAYOUT_ACTIVITYMENUDESPLEGABLE = 19;

  private static final int LAYOUT_ACTIVITYOCIO = 20;

  private static final int LAYOUT_ACTIVITYPERFIL = 21;

  private static final int LAYOUT_ACTIVITYSIGNUP = 22;

  private static final int LAYOUT_ACTIVITYSUBIRFOTO = 23;

  private static final int LAYOUT_ACTIVITYVERAPUNTES = 24;

  private static final int LAYOUT_LAYOUTPROGRESSDIALOG = 25;

  private static final int LAYOUT_ROWCALENDARIO1 = 26;

  private static final int LAYOUT_ROWEDITARPERFIL1 = 27;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(27);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_a_adir_asignatura, LAYOUT_ACTIVITYAADIRASIGNATURA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_ampliar, LAYOUT_ACTIVITYAMPLIAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_app_navigation, LAYOUT_ACTIVITYAPPNAVIGATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_apuntes, LAYOUT_ACTIVITYAPUNTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_apuntes_2, LAYOUT_ACTIVITYAPUNTES2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_apuntes_subidos, LAYOUT_ACTIVITYAPUNTESSUBIDOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_calendario, LAYOUT_ACTIVITYCALENDARIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_confirmar_logout, LAYOUT_ACTIVITYCONFIRMARLOGOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_editar_evento, LAYOUT_ACTIVITYEDITAREVENTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_editar_perfil, LAYOUT_ACTIVITYEDITARPERFIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_eliminar, LAYOUT_ACTIVITYELIMINAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_evento_a_adido, LAYOUT_ACTIVITYEVENTOAADIDO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_evento_eliminadp, LAYOUT_ACTIVITYEVENTOELIMINADP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_evento_modificado, LAYOUT_ACTIVITYEVENTOMODIFICADO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_eventos, LAYOUT_ACTIVITYEVENTOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_foto_subida, LAYOUT_ACTIVITYFOTOSUBIDA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_foto_subida1, LAYOUT_ACTIVITYFOTOSUBIDA1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_menu_desplegable, LAYOUT_ACTIVITYMENUDESPLEGABLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_ocio, LAYOUT_ACTIVITYOCIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_perfil, LAYOUT_ACTIVITYPERFIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_sign_up, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_subir_foto, LAYOUT_ACTIVITYSUBIRFOTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_ver_apuntes, LAYOUT_ACTIVITYVERAPUNTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.layout_progress_dialog, LAYOUT_LAYOUTPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_calendario1, LAYOUT_ROWCALENDARIO1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_editar_perfil1, LAYOUT_ROWEDITARPERFIL1);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAADIRASIGNATURA: {
          if ("layout/activity_a_adir_asignatura_0".equals(tag)) {
            return new ActivityAAdirAsignaturaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_a_adir_asignatura is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYAMPLIAR: {
          if ("layout/activity_ampliar_0".equals(tag)) {
            return new ActivityAmpliarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_ampliar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYAPPNAVIGATION: {
          if ("layout/activity_app_navigation_0".equals(tag)) {
            return new ActivityAppNavigationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_app_navigation is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYAPUNTES: {
          if ("layout/activity_apuntes_0".equals(tag)) {
            return new ActivityApuntesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_apuntes is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYAPUNTES2: {
          if ("layout/activity_apuntes_2_0".equals(tag)) {
            return new ActivityApuntes2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_apuntes_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYAPUNTESSUBIDOS: {
          if ("layout/activity_apuntes_subidos_0".equals(tag)) {
            return new ActivityApuntesSubidosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_apuntes_subidos is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCALENDARIO: {
          if ("layout/activity_calendario_0".equals(tag)) {
            return new ActivityCalendarioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_calendario is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCONFIRMARLOGOUT: {
          if ("layout/activity_confirmar_logout_0".equals(tag)) {
            return new ActivityConfirmarLogoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_confirmar_logout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITAREVENTO: {
          if ("layout/activity_editar_evento_0".equals(tag)) {
            return new ActivityEditarEventoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_editar_evento is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITARPERFIL: {
          if ("layout/activity_editar_perfil_0".equals(tag)) {
            return new ActivityEditarPerfilBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_editar_perfil is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYELIMINAR: {
          if ("layout/activity_eliminar_0".equals(tag)) {
            return new ActivityEliminarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_eliminar is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEVENTOAADIDO: {
          if ("layout/activity_evento_a_adido_0".equals(tag)) {
            return new ActivityEventoAAdidoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_evento_a_adido is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEVENTOELIMINADP: {
          if ("layout/activity_evento_eliminadp_0".equals(tag)) {
            return new ActivityEventoEliminadpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_evento_eliminadp is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEVENTOMODIFICADO: {
          if ("layout/activity_evento_modificado_0".equals(tag)) {
            return new ActivityEventoModificadoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_evento_modificado is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEVENTOS: {
          if ("layout/activity_eventos_0".equals(tag)) {
            return new ActivityEventosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_eventos is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFOTOSUBIDA: {
          if ("layout/activity_foto_subida_0".equals(tag)) {
            return new ActivityFotoSubidaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_foto_subida is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFOTOSUBIDA1: {
          if ("layout/activity_foto_subida1_0".equals(tag)) {
            return new ActivityFotoSubida1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_foto_subida1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMENUDESPLEGABLE: {
          if ("layout/activity_menu_desplegable_0".equals(tag)) {
            return new ActivityMenuDesplegableBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_menu_desplegable is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYOCIO: {
          if ("layout/activity_ocio_0".equals(tag)) {
            return new ActivityOcioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_ocio is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPERFIL: {
          if ("layout/activity_perfil_0".equals(tag)) {
            return new ActivityPerfilBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_perfil is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_sign_up_0".equals(tag)) {
            return new ActivitySignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSUBIRFOTO: {
          if ("layout/activity_subir_foto_0".equals(tag)) {
            return new ActivitySubirFotoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_subir_foto is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVERAPUNTES: {
          if ("layout/activity_ver_apuntes_0".equals(tag)) {
            return new ActivityVerApuntesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_ver_apuntes is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSDIALOG: {
          if ("layout/layout_progress_dialog_0".equals(tag)) {
            return new LayoutProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCALENDARIO1: {
          if ("layout/row_calendario1_0".equals(tag)) {
            return new RowCalendario1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_calendario1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWEDITARPERFIL1: {
          if ("layout/row_editar_perfil1_0".equals(tag)) {
            return new RowEditarPerfil1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_editar_perfil1 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(28);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aAdirAsignaturaVM");
      sKeys.put(2, "ampliarVM");
      sKeys.put(3, "appNavigationVM");
      sKeys.put(4, "apuntes2VM");
      sKeys.put(5, "apuntesSubidosVM");
      sKeys.put(6, "apuntesVM");
      sKeys.put(7, "calendario1RowModel");
      sKeys.put(8, "calendarioVM");
      sKeys.put(9, "confirmarLogoutVM");
      sKeys.put(10, "editarEventoVM");
      sKeys.put(11, "editarPerfil1RowModel");
      sKeys.put(12, "editarPerfilVM");
      sKeys.put(13, "eliminarVM");
      sKeys.put(14, "eventoAAdidoVM");
      sKeys.put(15, "eventoEliminadpVM");
      sKeys.put(16, "eventoModificadoVM");
      sKeys.put(17, "eventosVM");
      sKeys.put(18, "fotoSubida1VM");
      sKeys.put(19, "fotoSubidaVM");
      sKeys.put(20, "loginVM");
      sKeys.put(21, "menuDesplegableVM");
      sKeys.put(22, "message");
      sKeys.put(23, "ocioVM");
      sKeys.put(24, "perfilVM");
      sKeys.put(25, "signUpVM");
      sKeys.put(26, "subirFotoVM");
      sKeys.put(27, "verApuntesVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(27);

    static {
      sKeys.put("layout/activity_a_adir_asignatura_0", com.application.app.R.layout.activity_a_adir_asignatura);
      sKeys.put("layout/activity_ampliar_0", com.application.app.R.layout.activity_ampliar);
      sKeys.put("layout/activity_app_navigation_0", com.application.app.R.layout.activity_app_navigation);
      sKeys.put("layout/activity_apuntes_0", com.application.app.R.layout.activity_apuntes);
      sKeys.put("layout/activity_apuntes_2_0", com.application.app.R.layout.activity_apuntes_2);
      sKeys.put("layout/activity_apuntes_subidos_0", com.application.app.R.layout.activity_apuntes_subidos);
      sKeys.put("layout/activity_calendario_0", com.application.app.R.layout.activity_calendario);
      sKeys.put("layout/activity_confirmar_logout_0", com.application.app.R.layout.activity_confirmar_logout);
      sKeys.put("layout/activity_editar_evento_0", com.application.app.R.layout.activity_editar_evento);
      sKeys.put("layout/activity_editar_perfil_0", com.application.app.R.layout.activity_editar_perfil);
      sKeys.put("layout/activity_eliminar_0", com.application.app.R.layout.activity_eliminar);
      sKeys.put("layout/activity_evento_a_adido_0", com.application.app.R.layout.activity_evento_a_adido);
      sKeys.put("layout/activity_evento_eliminadp_0", com.application.app.R.layout.activity_evento_eliminadp);
      sKeys.put("layout/activity_evento_modificado_0", com.application.app.R.layout.activity_evento_modificado);
      sKeys.put("layout/activity_eventos_0", com.application.app.R.layout.activity_eventos);
      sKeys.put("layout/activity_foto_subida_0", com.application.app.R.layout.activity_foto_subida);
      sKeys.put("layout/activity_foto_subida1_0", com.application.app.R.layout.activity_foto_subida1);
      sKeys.put("layout/activity_login_0", com.application.app.R.layout.activity_login);
      sKeys.put("layout/activity_menu_desplegable_0", com.application.app.R.layout.activity_menu_desplegable);
      sKeys.put("layout/activity_ocio_0", com.application.app.R.layout.activity_ocio);
      sKeys.put("layout/activity_perfil_0", com.application.app.R.layout.activity_perfil);
      sKeys.put("layout/activity_sign_up_0", com.application.app.R.layout.activity_sign_up);
      sKeys.put("layout/activity_subir_foto_0", com.application.app.R.layout.activity_subir_foto);
      sKeys.put("layout/activity_ver_apuntes_0", com.application.app.R.layout.activity_ver_apuntes);
      sKeys.put("layout/layout_progress_dialog_0", com.application.app.R.layout.layout_progress_dialog);
      sKeys.put("layout/row_calendario1_0", com.application.app.R.layout.row_calendario1);
      sKeys.put("layout/row_editar_perfil1_0", com.application.app.R.layout.row_editar_perfil1);
    }
  }
}
