package b.d;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import b.b.k.g;
import b.l.a.c;

@SuppressLint({"SyntheticAccessor"})
public class c extends c {
  public c h0 = new c(this);
  
  public Bundle i0;
  
  public int j0;
  
  public int k0;
  
  public int l0;
  
  public ImageView m0;
  
  public TextView n0;
  
  public Context o0;
  
  public boolean p0 = true;
  
  public DialogInterface.OnClickListener q0;
  
  public final DialogInterface.OnClickListener r0 = new a(this);
  
  public static int d0(Context paramContext) {
    char c1;
    if (paramContext != null && a.a.a.a.a.y0(paramContext, Build.MODEL)) {
      c1 = Character.MIN_VALUE;
    } else {
      c1 = 'ߐ';
    } 
    return c1;
  }
  
  public void A(Bundle paramBundle) {
    int i;
    super.A(paramBundle);
    Context context = k();
    this.o0 = context;
    if (Build.VERSION.SDK_INT >= 26) {
      i = e0(16844099);
    } else {
      i = b.i.e.a.a(context, j.biometric_error_color);
    } 
    this.j0 = i;
    this.k0 = e0(16842808);
  }
  
  public void G() {
    ((Fragment)this).E = true;
    this.h0.removeCallbacksAndMessages(null);
  }
  
  public void H() {
    ((Fragment)this).E = true;
    this.l0 = 0;
    f0(1);
  }
  
  public void I(Bundle paramBundle) {
    super.I(paramBundle);
    paramBundle.putBundle("SavedBundle", this.i0);
  }
  
  public Dialog a0(Bundle paramBundle) {
    CharSequence charSequence1;
    if (paramBundle != null && this.i0 == null)
      this.i0 = paramBundle.getBundle("SavedBundle"); 
    g.a a = new g.a(k());
    CharSequence charSequence2 = this.i0.getCharSequence("title");
    AlertController.b b1 = a.a;
    b1.f = charSequence2;
    View view = LayoutInflater.from(b1.a).inflate(m.fingerprint_dialog_layout, null);
    TextView textView2 = (TextView)view.findViewById(l.fingerprint_subtitle);
    TextView textView1 = (TextView)view.findViewById(l.fingerprint_description);
    CharSequence charSequence4 = this.i0.getCharSequence("subtitle");
    if (TextUtils.isEmpty(charSequence4)) {
      textView2.setVisibility(8);
    } else {
      textView2.setVisibility(0);
      textView2.setText(charSequence4);
    } 
    CharSequence charSequence3 = this.i0.getCharSequence("description");
    if (TextUtils.isEmpty(charSequence3)) {
      textView1.setVisibility(8);
    } else {
      textView1.setVisibility(0);
      textView1.setText(charSequence3);
    } 
    this.m0 = (ImageView)view.findViewById(l.fingerprint_icon);
    this.n0 = (TextView)view.findViewById(l.fingerprint_error);
    if (this.i0.getBoolean("allow_device_credential")) {
      charSequence1 = t(n.confirm_device_credential_password);
    } else {
      charSequence1 = this.i0.getCharSequence("negative_text");
    } 
    b b = new b(this);
    AlertController.b b2 = a.a;
    b2.k = charSequence1;
    b2.l = b;
    b2.t = view;
    b2.s = 0;
    b2.u = false;
    g g = a.a();
    g.setCanceledOnTouchOutside(false);
    return (Dialog)g;
  }
  
  public void c0() {
    if (((Fragment)this).s == null) {
      Log.e("FingerprintDialogFrag", "Failed to dismiss fingerprint dialog fragment. Fragment manager was null.");
      return;
    } 
    Z(true, false);
  }
  
  public final int e0(int paramInt) {
    TypedValue typedValue = new TypedValue();
    this.o0.getTheme().resolveAttribute(paramInt, typedValue, true);
    TypedArray typedArray = g().obtainStyledAttributes(typedValue.data, new int[] { paramInt });
    paramInt = typedArray.getColor(0, 0);
    typedArray.recycle();
    return paramInt;
  }
  
  public final void f0(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield m0 : Landroid/widget/ImageView;
    //   4: ifnonnull -> 8
    //   7: return
    //   8: getstatic android/os/Build$VERSION.SDK_INT : I
    //   11: bipush #23
    //   13: if_icmplt -> 193
    //   16: aload_0
    //   17: getfield l0 : I
    //   20: istore_2
    //   21: aconst_null
    //   22: astore #5
    //   24: iconst_1
    //   25: istore_3
    //   26: iload_2
    //   27: ifne -> 38
    //   30: iload_1
    //   31: iconst_1
    //   32: if_icmpne -> 38
    //   35: goto -> 48
    //   38: iload_2
    //   39: iconst_1
    //   40: if_icmpne -> 55
    //   43: iload_1
    //   44: iconst_2
    //   45: if_icmpne -> 55
    //   48: getstatic b/d/k.fingerprint_dialog_fp_to_error : I
    //   51: istore_2
    //   52: goto -> 82
    //   55: iload_2
    //   56: iconst_2
    //   57: if_icmpne -> 68
    //   60: iload_1
    //   61: iconst_1
    //   62: if_icmpne -> 68
    //   65: goto -> 78
    //   68: iload_2
    //   69: iconst_1
    //   70: if_icmpne -> 95
    //   73: iload_1
    //   74: iconst_3
    //   75: if_icmpne -> 95
    //   78: getstatic b/d/k.fingerprint_dialog_error_to_fp : I
    //   81: istore_2
    //   82: aload_0
    //   83: getfield o0 : Landroid/content/Context;
    //   86: iload_2
    //   87: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   90: astore #4
    //   92: goto -> 98
    //   95: aconst_null
    //   96: astore #4
    //   98: aload #4
    //   100: ifnonnull -> 104
    //   103: return
    //   104: aload #4
    //   106: instanceof android/graphics/drawable/AnimatedVectorDrawable
    //   109: ifeq -> 119
    //   112: aload #4
    //   114: checkcast android/graphics/drawable/AnimatedVectorDrawable
    //   117: astore #5
    //   119: aload_0
    //   120: getfield m0 : Landroid/widget/ImageView;
    //   123: aload #4
    //   125: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   128: aload #5
    //   130: ifnull -> 188
    //   133: aload_0
    //   134: getfield l0 : I
    //   137: istore_2
    //   138: iload_2
    //   139: ifne -> 152
    //   142: iload_1
    //   143: iconst_1
    //   144: if_icmpne -> 152
    //   147: iconst_0
    //   148: istore_2
    //   149: goto -> 179
    //   152: iload_2
    //   153: iconst_1
    //   154: if_icmpne -> 167
    //   157: iload_1
    //   158: iconst_2
    //   159: if_icmpne -> 167
    //   162: iload_3
    //   163: istore_2
    //   164: goto -> 179
    //   167: iload_2
    //   168: iconst_2
    //   169: if_icmpne -> 147
    //   172: iload_1
    //   173: iconst_1
    //   174: if_icmpne -> 147
    //   177: iload_3
    //   178: istore_2
    //   179: iload_2
    //   180: ifeq -> 188
    //   183: aload #5
    //   185: invokevirtual start : ()V
    //   188: aload_0
    //   189: iload_1
    //   190: putfield l0 : I
    //   193: return
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {
    e e = (e)((Fragment)this).s.b("FingerprintHelperFragment");
    if (e != null)
      e.Z(1); 
  }
  
  public class a implements DialogInterface.OnClickListener {
    public final c b;
    
    public a(c this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (param1Int == -2)
        a.a.a.a.a.T("FingerprintDialogFrag", this.b.g(), this.b.i0, new a(this, param1DialogInterface)); 
    }
    
    public class a implements Runnable {
      public final DialogInterface b;
      
      public final c.a c;
      
      public a(c.a this$0, DialogInterface param2DialogInterface) {}
      
      public void run() {
        this.c.b.onCancel(this.b);
      }
    }
  }
  
  public class a implements Runnable {
    public final DialogInterface b;
    
    public final c.a c;
    
    public a(c this$0, DialogInterface param1DialogInterface) {}
    
    public void run() {
      this.c.b.onCancel(this.b);
    }
  }
  
  public class b implements DialogInterface.OnClickListener {
    public final c b;
    
    public b(c this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      DialogInterface.OnClickListener onClickListener;
      if (this.b.i0.getBoolean("allow_device_credential")) {
        onClickListener = this.b.r0;
      } else {
        onClickListener = this.b.q0;
        if (onClickListener != null) {
          onClickListener.onClick(param1DialogInterface, param1Int);
          return;
        } 
        Log.w("FingerprintDialogFrag", "No suitable negative button listener.");
        return;
      } 
      onClickListener.onClick(param1DialogInterface, param1Int);
    }
  }
  
  public final class c extends Handler {
    public final c a;
    
    public c(c this$0) {}
    
    public void handleMessage(Message param1Message) {
      Context context;
      TextView textView2;
      CharSequence charSequence1;
      c c2;
      TextView textView3;
      int i = param1Message.what;
      boolean bool = true;
      switch (i) {
        default:
          return;
        case 6:
          context = this.a.k();
          c3 = this.a;
          if (context == null || !a.a.a.a.a.y0(context, Build.MODEL))
            bool = false; 
          c3.p0 = bool;
        case 5:
          this.a.c0();
        case 4:
          c3 = this.a;
          c3.f0(1);
          textView2 = c3.n0;
          if (textView2 != null) {
            textView2.setTextColor(c3.k0);
            c3.n0.setText(c3.o0.getString(n.fingerprint_dialog_touch_sensor));
          } 
        case 3:
          c3 = this.a;
          charSequence1 = (CharSequence)((Message)textView2).obj;
          if (c3.p0) {
            c3.c0();
          } else {
            TextView textView = c3.n0;
            if (textView != null) {
              textView.setTextColor(c3.j0);
              if (charSequence1 != null) {
                c3.n0.setText(charSequence1);
              } else {
                c3.n0.setText(n.fingerprint_error_lockout);
              } 
            } 
            c3.h0.postDelayed(new d(c3), c.d0(c3.o0));
          } 
          c3.p0 = true;
        case 2:
          c3 = this.a;
          charSequence1 = (CharSequence)((Message)charSequence1).obj;
          c3.f0(2);
          c3.h0.removeMessages(4);
          textView3 = c3.n0;
          if (textView3 != null) {
            textView3.setTextColor(c3.j0);
            c3.n0.setText(charSequence1);
          } 
          c2 = c3.h0;
          c2.sendMessageDelayed(c2.obtainMessage(3), c.d0(c3.o0));
        case 1:
          break;
      } 
      c c3 = this.a;
      CharSequence charSequence2 = (CharSequence)((Message)c2).obj;
      c3.f0(2);
      c3.h0.removeMessages(4);
      TextView textView1 = c3.n0;
      if (textView1 != null) {
        textView1.setTextColor(c3.j0);
        c3.n0.setText(charSequence2);
      } 
      c c1 = c3.h0;
      c1.sendMessageDelayed(c1.obtainMessage(4), 2000L);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */