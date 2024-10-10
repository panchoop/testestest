package b.f;

public class d {
  public static final int[] a = new int[0];
  
  public static final long[] b = new long[0];
  
  public static final Object[] c = new Object[0];
  
  public static int a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    paramInt1--;
    int i = 0;
    while (i <= paramInt1) {
      int k = i + paramInt1 >>> 1;
      int j = paramArrayOfint[k];
      if (j < paramInt2) {
        i = k + 1;
        continue;
      } 
      if (j > paramInt2) {
        paramInt1 = k - 1;
        continue;
      } 
      return k;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public static int b(long[] paramArrayOflong, int paramInt, long paramLong) {
    paramInt--;
    int i = 0;
    while (i <= paramInt) {
      int j = i + paramInt >>> 1;
      int k = paramArrayOflong[j] cmp paramLong;
      if (k < 0) {
        i = j + 1;
        continue;
      } 
      if (k > 0) {
        paramInt = j - 1;
        continue;
      } 
      return j;
    } 
    return i ^ 0xFFFFFFFF;
  }
  
  public static boolean c(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static int d(int paramInt) {
    for (byte b = 4; b < 32; b++) {
      int i = (1 << b) - 12;
      if (paramInt <= i)
        return i; 
    } 
    return paramInt;
  }
  
  public static int e(int paramInt) {
    return d(paramInt * 4) / 4;
  }
  
  public static int f(int paramInt) {
    return d(paramInt * 8) / 8;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */