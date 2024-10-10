package b.i.d;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

public class j {
  public static final Object a = new Object();
  
  public static Bundle a(e parame) {
    boolean bool;
    Bundle bundle1;
    Bundle bundle2 = new Bundle();
    IconCompat iconCompat = parame.a();
    if (iconCompat != null) {
      bool = iconCompat.c();
    } else {
      bool = false;
    } 
    bundle2.putInt("icon", bool);
    bundle2.putCharSequence("title", parame.j);
    bundle2.putParcelable("actionIntent", (Parcelable)parame.k);
    if (parame.a != null) {
      bundle1 = new Bundle(parame.a);
    } else {
      bundle1 = new Bundle();
    } 
    bundle1.putBoolean("android.support.allowGeneratedReplies", parame.e);
    bundle2.putBundle("extras", bundle1);
    bundle2.putParcelableArray("remoteInputs", (Parcelable[])b(parame.c));
    bundle2.putBoolean("showsUserInterface", parame.f);
    bundle2.putInt("semanticAction", parame.g);
    return bundle2;
  }
  
  public static Bundle[] b(k[] paramArrayOfk) {
    if (paramArrayOfk == null)
      return null; 
    Bundle[] arrayOfBundle = new Bundle[paramArrayOfk.length];
    if (paramArrayOfk.length <= 0)
      return arrayOfBundle; 
    k k1 = paramArrayOfk[0];
    new Bundle();
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */