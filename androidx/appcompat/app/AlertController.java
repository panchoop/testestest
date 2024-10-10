package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import b.b.j;
import b.b.k.q;
import java.lang.ref.WeakReference;

public class AlertController {
  public NestedScrollView A;
  
  public int B = 0;
  
  public Drawable C;
  
  public ImageView D;
  
  public TextView E;
  
  public TextView F;
  
  public View G;
  
  public ListAdapter H;
  
  public int I = -1;
  
  public int J;
  
  public int K;
  
  public int L;
  
  public int M;
  
  public int N;
  
  public int O;
  
  public boolean P;
  
  public int Q = 0;
  
  public Handler R;
  
  public final View.OnClickListener S = new a(this);
  
  public final Context a;
  
  public final q b;
  
  public final Window c;
  
  public final int d;
  
  public CharSequence e;
  
  public CharSequence f;
  
  public ListView g;
  
  public View h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public boolean n = false;
  
  public Button o;
  
  public CharSequence p;
  
  public Message q;
  
  public Drawable r;
  
  public Button s;
  
  public CharSequence t;
  
  public Message u;
  
  public Drawable v;
  
  public Button w;
  
  public CharSequence x;
  
  public Message y;
  
  public Drawable z;
  
  public AlertController(Context paramContext, q paramq, Window paramWindow) {
    this.a = paramContext;
    this.b = paramq;
    this.c = paramWindow;
    this.R = new c((DialogInterface)paramq);
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, j.AlertDialog, b.b.a.alertDialogStyle, 0);
    this.J = typedArray.getResourceId(j.AlertDialog_android_layout, 0);
    this.K = typedArray.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
    this.L = typedArray.getResourceId(j.AlertDialog_listLayout, 0);
    this.M = typedArray.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
    this.N = typedArray.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
    this.O = typedArray.getResourceId(j.AlertDialog_listItemLayout, 0);
    this.P = typedArray.getBoolean(j.AlertDialog_showTitle, true);
    this.d = typedArray.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
    typedArray.recycle();
    paramq.a().k(1);
  }
  
  public static boolean a(View paramView) {
    if (paramView.onCheckIsTextEditor())
      return true; 
    if (!(paramView instanceof ViewGroup))
      return false; 
    ViewGroup viewGroup = (ViewGroup)paramView;
    int i = viewGroup.getChildCount();
    while (i > 0) {
      int j = i - 1;
      i = j;
      if (a(viewGroup.getChildAt(j)))
        return true; 
    } 
    return false;
  }
  
  public static void c(View paramView1, View paramView2, View paramView3) {
    byte b = 4;
    if (paramView2 != null) {
      byte b1;
      if (paramView1.canScrollVertically(-1)) {
        b1 = 0;
      } else {
        b1 = 4;
      } 
      paramView2.setVisibility(b1);
    } 
    if (paramView3 != null) {
      byte b1 = b;
      if (paramView1.canScrollVertically(1))
        b1 = 0; 
      paramView3.setVisibility(b1);
    } 
  }
  
  public final void b(Button paramButton) {
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)paramButton.getLayoutParams();
    layoutParams.gravity = 1;
    layoutParams.weight = 0.5F;
    paramButton.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  public final ViewGroup d(View paramView1, View paramView2) {
    if (paramView1 == null) {
      paramView1 = paramView2;
      if (paramView2 instanceof ViewStub)
        paramView1 = ((ViewStub)paramView2).inflate(); 
      return (ViewGroup)paramView1;
    } 
    if (paramView2 != null) {
      ViewParent viewParent = paramView2.getParent();
      if (viewParent instanceof ViewGroup)
        ((ViewGroup)viewParent).removeView(paramView2); 
    } 
    paramView2 = paramView1;
    if (paramView1 instanceof ViewStub)
      paramView2 = ((ViewStub)paramView1).inflate(); 
    return (ViewGroup)paramView2;
  }
  
  public void e(int paramInt, CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener, Message paramMessage, Drawable paramDrawable) {
    if (paramOnClickListener != null) {
      Message message = this.R.obtainMessage(paramInt, paramOnClickListener);
    } else {
      paramOnClickListener = null;
    } 
    if (paramInt != -3) {
      if (paramInt != -2) {
        if (paramInt == -1) {
          this.p = paramCharSequence;
          this.q = (Message)paramOnClickListener;
          this.r = null;
        } else {
          throw new IllegalArgumentException("Button does not exist");
        } 
      } else {
        this.t = paramCharSequence;
        this.u = (Message)paramOnClickListener;
        this.v = null;
      } 
    } else {
      this.x = paramCharSequence;
      this.y = (Message)paramOnClickListener;
      this.z = null;
    } 
  }
  
  public void f(int paramInt) {
    this.C = null;
    this.B = paramInt;
    ImageView imageView = this.D;
    if (imageView != null)
      if (paramInt != 0) {
        imageView.setVisibility(0);
        this.D.setImageResource(this.B);
      } else {
        imageView.setVisibility(8);
      }  
  }
  
  public static class RecycleListView extends ListView {
    public final int b;
    
    public final int c;
    
    public RecycleListView(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.RecycleListView);
      this.c = typedArray.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
      this.b = typedArray.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
    }
  }
  
  public class a implements View.OnClickListener {
    public final AlertController b;
    
    public a(AlertController this$0) {}
    
    public void onClick(View param1View) {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Landroidx/appcompat/app/AlertController;
      //   4: astore_2
      //   5: aload_1
      //   6: aload_2
      //   7: getfield o : Landroid/widget/Button;
      //   10: if_acmpne -> 32
      //   13: aload_2
      //   14: getfield q : Landroid/os/Message;
      //   17: astore_2
      //   18: aload_2
      //   19: ifnull -> 32
      //   22: aload_2
      //   23: astore_1
      //   24: aload_1
      //   25: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
      //   28: astore_1
      //   29: goto -> 91
      //   32: aload_0
      //   33: getfield b : Landroidx/appcompat/app/AlertController;
      //   36: astore_2
      //   37: aload_1
      //   38: aload_2
      //   39: getfield s : Landroid/widget/Button;
      //   42: if_acmpne -> 59
      //   45: aload_2
      //   46: getfield u : Landroid/os/Message;
      //   49: astore_2
      //   50: aload_2
      //   51: ifnull -> 59
      //   54: aload_2
      //   55: astore_1
      //   56: goto -> 24
      //   59: aload_0
      //   60: getfield b : Landroidx/appcompat/app/AlertController;
      //   63: astore_2
      //   64: aload_1
      //   65: aload_2
      //   66: getfield w : Landroid/widget/Button;
      //   69: if_acmpne -> 89
      //   72: aload_2
      //   73: getfield y : Landroid/os/Message;
      //   76: astore_1
      //   77: aload_1
      //   78: ifnull -> 89
      //   81: aload_1
      //   82: invokestatic obtain : (Landroid/os/Message;)Landroid/os/Message;
      //   85: astore_1
      //   86: goto -> 91
      //   89: aconst_null
      //   90: astore_1
      //   91: aload_1
      //   92: ifnull -> 99
      //   95: aload_1
      //   96: invokevirtual sendToTarget : ()V
      //   99: aload_0
      //   100: getfield b : Landroidx/appcompat/app/AlertController;
      //   103: astore_1
      //   104: aload_1
      //   105: getfield R : Landroid/os/Handler;
      //   108: iconst_1
      //   109: aload_1
      //   110: getfield b : Lb/b/k/q;
      //   113: invokevirtual obtainMessage : (ILjava/lang/Object;)Landroid/os/Message;
      //   116: invokevirtual sendToTarget : ()V
      //   119: return
    }
  }
  
  public static class b {
    public final Context a;
    
    public final LayoutInflater b;
    
    public int c = 0;
    
    public Drawable d;
    
    public int e = 0;
    
    public CharSequence f;
    
    public View g;
    
    public CharSequence h;
    
    public CharSequence i;
    
    public DialogInterface.OnClickListener j;
    
    public CharSequence k;
    
    public DialogInterface.OnClickListener l;
    
    public boolean m;
    
    public DialogInterface.OnCancelListener n;
    
    public DialogInterface.OnDismissListener o;
    
    public DialogInterface.OnKeyListener p;
    
    public ListAdapter q;
    
    public DialogInterface.OnClickListener r;
    
    public int s;
    
    public View t;
    
    public boolean u = false;
    
    public boolean v;
    
    public int w = -1;
    
    public b(Context param1Context) {
      this.a = param1Context;
      this.m = true;
      this.b = (LayoutInflater)param1Context.getSystemService("layout_inflater");
    }
  }
  
  public static final class c extends Handler {
    public WeakReference<DialogInterface> a;
    
    public c(DialogInterface param1DialogInterface) {
      this.a = new WeakReference<DialogInterface>(param1DialogInterface);
    }
    
    public void handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != -3 && i != -2 && i != -1) {
        if (i == 1)
          ((DialogInterface)param1Message.obj).dismiss(); 
      } else {
        ((DialogInterface.OnClickListener)param1Message.obj).onClick(this.a.get(), param1Message.what);
      } 
    }
  }
  
  public static class d extends ArrayAdapter<CharSequence> {
    public d(Context param1Context, int param1Int1, int param1Int2, CharSequence[] param1ArrayOfCharSequence) {
      super(param1Context, param1Int1, param1Int2, null);
    }
    
    public long getItemId(int param1Int) {
      return param1Int;
    }
    
    public boolean hasStableIds() {
      return true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\app\AlertController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */