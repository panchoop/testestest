package b.i.e.b;

import java.util.List;

public final class f {
  public final int[] a;
  
  public final float[] b;
  
  public f(int paramInt1, int paramInt2) {
    this.a = new int[] { paramInt1, paramInt2 };
    this.b = new float[] { 0.0F, 1.0F };
  }
  
  public f(int paramInt1, int paramInt2, int paramInt3) {
    this.a = new int[] { paramInt1, paramInt2, paramInt3 };
    this.b = new float[] { 0.0F, 0.5F, 1.0F };
  }
  
  public f(List<Integer> paramList, List<Float> paramList1) {
    int i = paramList.size();
    this.a = new int[i];
    this.b = new float[i];
    for (byte b = 0; b < i; b++) {
      this.a[b] = ((Integer)paramList.get(b)).intValue();
      this.b[b] = ((Float)paramList1.get(b)).floatValue();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\e\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */