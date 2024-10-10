package b.i.l;

public class d<T> extends c<T> {
  public final Object c = new Object();
  
  public d(int paramInt) {
    super(paramInt);
  }
  
  public T a() {
    synchronized (this.c) {
      return super.a();
    } 
  }
  
  public boolean b(T paramT) {
    synchronized (this.c) {
      return super.b(paramT);
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\l\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */