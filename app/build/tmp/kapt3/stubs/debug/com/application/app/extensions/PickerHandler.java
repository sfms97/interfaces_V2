package com.application.app.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fJ\u0012\u0010\u0019\u001a\u00020\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/application/app/extensions/PickerHandler;", "", "()V", "MIME_TYPE_ALL", "", "MIME_TYPE_IMAGE", "OPEN_CAMERA_REQUEST_CODE", "", "OPEN_CONTACT_REQUEST_CODE", "OPEN_STORAGE_REQUEST_CODE", "REQUEST_PERMISSION", "contactIntent", "Landroid/content/Intent;", "createUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "filePickerIntent", "mimeType", "getContactInfo", "", "contactData", "isValidCameraIntent", "", "takePicture", "takePictureFromCameraIntent", "imageUri", "app_debug"})
public final class PickerHandler {
    @org.jetbrains.annotations.NotNull()
    public static final com.application.app.extensions.PickerHandler INSTANCE = null;
    public static final int REQUEST_PERMISSION = 10;
    public static final int OPEN_CAMERA_REQUEST_CODE = 1;
    public static final int OPEN_STORAGE_REQUEST_CODE = 2;
    public static final int OPEN_CONTACT_REQUEST_CODE = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIME_TYPE_IMAGE = "image/*";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MIME_TYPE_ALL = "*/*";
    
    private PickerHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent filePickerIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent takePictureFromCameraIntent(@org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent contactIntent() {
        return null;
    }
    
    public final void getContactInfo(@org.jetbrains.annotations.NotNull()
    android.net.Uri contactData, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean isValidCameraIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent takePicture) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri createUri(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
}