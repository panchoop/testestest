package a.a.a.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
  public static final Parcelable.Creator<b> CREATOR = new a();
  
  public final Handler b = null;
  
  public a c;
  
  public b(Parcel paramParcel) {
    this.c = a.a.c(paramParcel.readStrongBinder());
  }
  
  public void c(int paramInt, Bundle paramBundle) {}
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : La/a/a/b/a;
    //   6: ifnonnull -> 23
    //   9: new a/a/a/b/b$b
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: invokespecial <init> : (La/a/a/b/b;)V
    //   18: aload_0
    //   19: aload_3
    //   20: putfield c : La/a/a/b/a;
    //   23: aload_1
    //   24: aload_0
    //   25: getfield c : La/a/a/b/a;
    //   28: invokeinterface asBinder : ()Landroid/os/IBinder;
    //   33: invokevirtual writeStrongBinder : (Landroid/os/IBinder;)V
    //   36: aload_0
    //   37: monitorexit
    //   38: return
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	39	finally
    //   23	38	39	finally
    //   40	42	39	finally
  }
  
  public class a implements Parcelable.Creator<b> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new b(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new b[param1Int];
    }
  }
  
  public class b extends a.a {
    public final b a;
    
    public b(b this$0) {}
    
    public void z(int param1Int, Bundle param1Bundle) {
      b b1 = this.a;
      Handler handler = b1.b;
      if (handler != null) {
        handler.post(new b.c(b1, param1Int, param1Bundle));
      } else {
        b1.c(param1Int, param1Bundle);
      } 
    }
  }
  
  public class c implements Runnable {
    public final int b;
    
    public final Bundle c;
    
    public final b d;
    
    public c(b this$0, int param1Int, Bundle param1Bundle) {
      this.b = param1Int;
      this.c = param1Bundle;
    }
    
    public void run() {
      this.d.c(this.b, this.c);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\a\a\a\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */