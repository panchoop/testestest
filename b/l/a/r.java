package b.l.a;

import androidx.fragment.app.Fragment;
import b.n.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class r {
  public ArrayList<a> a = new ArrayList<a>();
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public boolean h;
  
  public String i;
  
  public int j;
  
  public CharSequence k;
  
  public int l;
  
  public CharSequence m;
  
  public ArrayList<String> n;
  
  public ArrayList<String> o;
  
  public boolean p = false;
  
  public ArrayList<Runnable> q;
  
  public r b(Fragment paramFragment, String paramString) {
    g(0, paramFragment, paramString, 1);
    return this;
  }
  
  public void c(a parama) {
    this.a.add(parama);
    parama.c = this.b;
    parama.d = this.c;
    parama.e = this.d;
    parama.f = this.e;
  }
  
  public r d(Fragment paramFragment) {
    c(new a(7, paramFragment));
    return this;
  }
  
  public abstract int e();
  
  public abstract r f(Fragment paramFragment);
  
  public void g(int paramInt1, Fragment paramFragment, String paramString, int paramInt2) {
    StringBuilder stringBuilder2;
    Class<?> clazz = paramFragment.getClass();
    int i = clazz.getModifiers();
    if (!clazz.isAnonymousClass() && Modifier.isPublic(i) && (!clazz.isMemberClass() || Modifier.isStatic(i))) {
      if (paramString != null) {
        String str = paramFragment.y;
        if (str == null || paramString.equals(str)) {
          paramFragment.y = paramString;
        } else {
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Can't change tag of fragment ");
          stringBuilder2.append(paramFragment);
          stringBuilder2.append(": was ");
          stringBuilder2.append(paramFragment.y);
          stringBuilder2.append(" now ");
          stringBuilder2.append(paramString);
          throw new IllegalStateException(stringBuilder2.toString());
        } 
      } 
      if (paramInt1 != 0) {
        StringBuilder stringBuilder;
        if (paramInt1 != -1) {
          i = paramFragment.w;
          if (i == 0 || i == paramInt1) {
            paramFragment.w = paramInt1;
            paramFragment.x = paramInt1;
          } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't change container ID of fragment ");
            stringBuilder.append(paramFragment);
            stringBuilder.append(": was ");
            stringBuilder.append(paramFragment.w);
            stringBuilder.append(" now ");
            stringBuilder.append(paramInt1);
            throw new IllegalStateException(stringBuilder.toString());
          } 
        } else {
          stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Can't add fragment ");
          stringBuilder2.append(paramFragment);
          stringBuilder2.append(" with tag ");
          stringBuilder2.append((String)stringBuilder);
          stringBuilder2.append(" to container view with no id");
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
      } 
      c(new a(paramInt2, paramFragment));
      return;
    } 
    StringBuilder stringBuilder1 = c.a.a.a.a.e("Fragment ");
    stringBuilder1.append(stringBuilder2.getCanonicalName());
    stringBuilder1.append(" must be a public static class to be  properly recreated from instance state.");
    throw new IllegalStateException(stringBuilder1.toString());
  }
  
  public static final class a {
    public int a;
    
    public Fragment b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public d.b g;
    
    public d.b h;
    
    public a() {}
    
    public a(int param1Int, Fragment param1Fragment) {
      this.a = param1Int;
      this.b = param1Fragment;
      d.b b1 = d.b.f;
      this.g = b1;
      this.h = b1;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */