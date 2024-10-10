package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageButton;
import b.b.p.l;
import b.i.m.l;

public class CheckableImageButton extends l implements Checkable {
  public static final int[] g = new int[] { 16842912 };
  
  public boolean d;
  
  public boolean e = true;
  
  public boolean f = true;
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, b.b.a.imageButtonStyle);
    l.W((View)this, (b.i.m.a)new c.c.a.b.y.a(this));
  }
  
  public boolean isChecked() {
    return this.d;
  }
  
  public int[] onCreateDrawableState(int paramInt) {
    return this.d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(paramInt + g.length), g) : super.onCreateDrawableState(paramInt);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof a)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    a a = (a)paramParcelable;
    super.onRestoreInstanceState(a.b);
    setChecked(a.d);
  }
  
  public Parcelable onSaveInstanceState() {
    a a = new a(super.onSaveInstanceState());
    a.d = this.d;
    return (Parcelable)a;
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (this.e != paramBoolean) {
      this.e = paramBoolean;
      sendAccessibilityEvent(0);
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.e && this.d != paramBoolean) {
      this.d = paramBoolean;
      refreshDrawableState();
      sendAccessibilityEvent(2048);
    } 
  }
  
  public void setPressable(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  public void setPressed(boolean paramBoolean) {
    if (this.f)
      super.setPressed(paramBoolean); 
  }
  
  public void toggle() {
    setChecked(this.d ^ true);
  }
  
  public static class a extends b.k.a.a {
    public static final Parcelable.Creator<a> CREATOR = (Parcelable.Creator<a>)new a();
    
    public boolean d;
    
    public a(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.d = bool;
    }
    
    public a(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeParcelable(this.b, param1Int);
      param1Parcel.writeInt(this.d);
    }
    
    public static final class a implements Parcelable.ClassLoaderCreator<a> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new CheckableImageButton.a(param2Parcel, null);
      }
      
      public Object createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new CheckableImageButton.a(param2Parcel, param2ClassLoader);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new CheckableImageButton.a[param2Int];
      }
    }
  }
  
  public static final class a implements Parcelable.ClassLoaderCreator<a> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new CheckableImageButton.a(param1Parcel, null);
    }
    
    public Object createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new CheckableImageButton.a(param1Parcel, param1ClassLoader);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new CheckableImageButton.a[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\internal\CheckableImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */