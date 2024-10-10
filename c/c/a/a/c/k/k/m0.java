package c.c.a.a.c.k.k;

import c.c.a.a.c.k.b;
import c.c.a.a.h.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class m0 {
  public final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap<BasePendingResult<?>, Boolean>());
  
  public final Map<e<?>, Boolean> b = Collections.synchronizedMap(new WeakHashMap<e<?>, Boolean>());
  
  public final void a(boolean paramBoolean, Status paramStatus) {
    synchronized (this.a) {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this((Map)this.a);
      synchronized (this.b) {
        null = new HashMap<BasePendingResult<?>, Boolean>();
        super((Map)this.b);
        for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
          if (paramBoolean || ((Boolean)entry.getValue()).booleanValue())
            ((BasePendingResult)entry.getKey()).f(paramStatus); 
        } 
        for (Map.Entry<BasePendingResult<?>, Boolean> entry : null.entrySet()) {
          if (paramBoolean || ((Boolean)entry.getValue()).booleanValue())
            ((e)entry.getKey()).a((Exception)new b(paramStatus)); 
        } 
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */