package b.g.b;

public class e<T> implements e<T> {
  public final Object[] a;
  
  public int b;
  
  public e(int paramInt) {
    if (paramInt > 0) {
      this.a = new Object[paramInt];
      return;
    } 
    throw new IllegalArgumentException("The max pool size must be > 0");
  }
  
  public T a() {
    int i = this.b;
    if (i > 0) {
      int j = i - 1;
      Object[] arrayOfObject = this.a;
      Object object = arrayOfObject[j];
      arrayOfObject[j] = null;
      this.b = i - 1;
      return (T)object;
    } 
    return null;
  }
  
  public boolean b(T paramT) {
    int i = this.b;
    Object[] arrayOfObject = this.a;
    if (i < arrayOfObject.length) {
      arrayOfObject[i] = paramT;
      this.b = i + 1;
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */