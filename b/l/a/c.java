package b.l.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
  public Handler W;
  
  public Runnable X = new a(this);
  
  public int Y = 0;
  
  public int Z = 0;
  
  public boolean a0 = true;
  
  public boolean b0 = true;
  
  public int c0 = -1;
  
  public Dialog d0;
  
  public boolean e0;
  
  public boolean f0;
  
  public boolean g0;
  
  public void A(Bundle paramBundle) {
    boolean bool;
    super.A(paramBundle);
    this.W = new Handler();
    if (this.x == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b0 = bool;
    if (paramBundle != null) {
      this.Y = paramBundle.getInt("android:style", 0);
      this.Z = paramBundle.getInt("android:theme", 0);
      this.a0 = paramBundle.getBoolean("android:cancelable", true);
      this.b0 = paramBundle.getBoolean("android:showsDialog", this.b0);
      this.c0 = paramBundle.getInt("android:backStackId", -1);
    } 
  }
  
  public void C() {
    this.E = true;
    Dialog dialog = this.d0;
    if (dialog != null) {
      this.e0 = true;
      dialog.setOnDismissListener(null);
      this.d0.dismiss();
      if (!this.f0)
        onDismiss((DialogInterface)this.d0); 
      this.d0 = null;
    } 
  }
  
  public void D() {
    this.E = true;
    if (!this.g0 && !this.f0)
      this.f0 = true; 
  }
  
  public LayoutInflater E(Bundle paramBundle) {
    if (!this.b0)
      return super.E(paramBundle); 
    Dialog dialog = a0(paramBundle);
    this.d0 = dialog;
    if (dialog != null) {
      Context context1;
      int i = this.Y;
      if (i != 1 && i != 2) {
        if (i != 3) {
          context1 = this.d0.getContext();
          return (LayoutInflater)context1.getSystemService("layout_inflater");
        } 
        context1.getWindow().addFlags(24);
      } 
      context1.requestWindowFeature(1);
    } else {
      Context context1 = this.t.c;
      return (LayoutInflater)context1.getSystemService("layout_inflater");
    } 
    Context context = this.d0.getContext();
    return (LayoutInflater)context.getSystemService("layout_inflater");
  }
  
  public void I(Bundle paramBundle) {
    Dialog dialog = this.d0;
    if (dialog != null) {
      Bundle bundle = dialog.onSaveInstanceState();
      if (bundle != null)
        paramBundle.putBundle("android:savedDialogState", bundle); 
    } 
    int i = this.Y;
    if (i != 0)
      paramBundle.putInt("android:style", i); 
    i = this.Z;
    if (i != 0)
      paramBundle.putInt("android:theme", i); 
    boolean bool = this.a0;
    if (!bool)
      paramBundle.putBoolean("android:cancelable", bool); 
    bool = this.b0;
    if (!bool)
      paramBundle.putBoolean("android:showsDialog", bool); 
    i = this.c0;
    if (i != -1)
      paramBundle.putInt("android:backStackId", i); 
  }
  
  public void J() {
    this.E = true;
    Dialog dialog = this.d0;
    if (dialog != null) {
      this.e0 = false;
      dialog.show();
    } 
  }
  
  public void K() {
    this.E = true;
    Dialog dialog = this.d0;
    if (dialog != null)
      dialog.hide(); 
  }
  
  public void Z(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.f0)
      return; 
    this.f0 = true;
    this.g0 = false;
    Dialog dialog = this.d0;
    if (dialog != null) {
      dialog.setOnDismissListener(null);
      this.d0.dismiss();
      if (!paramBoolean2)
        if (Looper.myLooper() == this.W.getLooper()) {
          onDismiss((DialogInterface)this.d0);
        } else {
          this.W.post(this.X);
        }  
    } 
    this.e0 = true;
    if (this.c0 >= 0) {
      j j = P();
      int i = this.c0;
      j = j;
      if (i >= 0) {
        j.N(new k.i((k)j, null, i, 1), false);
        this.c0 = -1;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
    } else {
      a a = new a((k)P());
      k k = this.s;
      if (k == null || k == a.r) {
        a.c(new r.a(3, this));
        if (paramBoolean1) {
          a.e();
        } else {
          a.i(false);
        } 
        return;
      } 
      StringBuilder stringBuilder = c.a.a.a.a.e("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
      stringBuilder.append(toString());
      stringBuilder.append(" is already attached to a FragmentManager.");
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
  
  public abstract Dialog a0(Bundle paramBundle);
  
  public void b0(j paramj, String paramString) {
    this.f0 = false;
    this.g0 = true;
    paramj = paramj;
    if (paramj != null) {
      a a = new a((k)paramj);
      a.g(0, this, paramString, 1);
      a.i(false);
      return;
    } 
    throw null;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    if (!this.e0)
      Z(true, true); 
  }
  
  public void y(Bundle paramBundle) {
    this.E = true;
    if (!this.b0)
      return; 
    View view = this.G;
    if (view != null)
      if (view.getParent() == null) {
        this.d0.setContentView(view);
      } else {
        throw new IllegalStateException("DialogFragment can not be attached to a container view");
      }  
    e e = g();
    if (e != null)
      this.d0.setOwnerActivity((Activity)e); 
    this.d0.setCancelable(this.a0);
    this.d0.setOnCancelListener(this);
    this.d0.setOnDismissListener(this);
    if (paramBundle != null) {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null)
        this.d0.onRestoreInstanceState(paramBundle); 
    } 
  }
  
  public void z(Context paramContext) {
    super.z(paramContext);
    if (!this.g0)
      this.f0 = false; 
  }
  
  public class a implements Runnable {
    public final c b;
    
    public a(c this$0) {}
    
    public void run() {
      c c1 = this.b;
      Dialog dialog = c1.d0;
      if (dialog != null)
        c1.onDismiss((DialogInterface)dialog); 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */