package c.a.b;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class l {
  public final byte[] a;
  
  public final Map<String, String> b;
  
  public final List<h> c;
  
  public final boolean d;
  
  public l(int paramInt, byte[] paramArrayOfbyte, Map<String, String> paramMap, List<h> paramList, boolean paramBoolean, long paramLong) {
    List<h> list;
    this.a = paramArrayOfbyte;
    this.b = paramMap;
    if (paramList == null) {
      paramArrayOfbyte = null;
    } else {
      list = Collections.unmodifiableList(paramList);
    } 
    this.c = list;
    this.d = paramBoolean;
  }
  
  public l(int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean, long paramLong, List<h> paramList) {
    this(paramInt, paramArrayOfbyte, (Map<String, String>)h, paramList, paramBoolean, paramLong);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */