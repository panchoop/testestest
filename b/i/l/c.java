package b.i.l;

public class c<T> implements c<T> {
  public final Object[] a;
  
  public int b;
  
  public c(int paramInt) {
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
    int i = 0;
    while (true) {
      if (i < this.b) {
        if (this.a[i] == paramT) {
          i = 1;
          break;
        } 
        i++;
        continue;
      } 
      i = 0;
      break;
    } 
    if (i == 0) {
      i = this.b;
      Object[] arrayOfObject = this.a;
      if (i < arrayOfObject.length) {
        arrayOfObject[i] = paramT;
        this.b = i + 1;
        return true;
      } 
      return false;
    } 
    throw new IllegalStateException("Already in the pool!");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\l\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */