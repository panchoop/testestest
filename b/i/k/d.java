package b.i.k;

public final class d {
  public static final c a = new d(null, false);
  
  public static final c b = new d(null, true);
  
  public static final c c = new d(a.a, false);
  
  public static final c d = new d(a.a, true);
  
  public static int a(int paramInt) {
    if (paramInt != 0)
      if (paramInt != 1 && paramInt != 2) {
        switch (paramInt) {
          default:
            return 2;
          case 16:
          case 17:
            return 0;
          case 14:
          case 15:
            break;
        } 
        return 1;
      }  
    return 1;
  }
  
  public static class a implements b {
    public static final a a = new a();
    
    public int a(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      int j = 2;
      for (int i = param1Int1; i < param1Int2 + param1Int1 && j == 2; i++)
        j = d.a(Character.getDirectionality(param1CharSequence.charAt(i))); 
      return j;
    }
  }
  
  public static interface b {
    int a(CharSequence param1CharSequence, int param1Int1, int param1Int2);
  }
  
  public static abstract class c implements c {
    public final d.b a;
    
    public c(d.b param1b) {
      this.a = param1b;
    }
    
    public abstract boolean a();
    
    public boolean b(CharSequence param1CharSequence, int param1Int1, int param1Int2) {
      if (param1Int1 >= 0 && param1Int2 >= 0 && param1CharSequence.length() - param1Int2 >= param1Int1) {
        d.b b1 = this.a;
        if (b1 == null)
          return a(); 
        param1Int1 = b1.a(param1CharSequence, param1Int1, param1Int2);
        boolean bool = true;
        if (param1Int1 != 0)
          if (param1Int1 != 1) {
            bool = a();
          } else {
            bool = false;
          }  
        return bool;
      } 
      throw new IllegalArgumentException();
    }
  }
  
  public static class d extends c {
    public final boolean b;
    
    public d(d.b param1b, boolean param1Boolean) {
      super(param1b);
      this.b = param1Boolean;
    }
    
    public boolean a() {
      return this.b;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\k\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */