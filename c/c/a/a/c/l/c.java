package c.c.a.a.c.l;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c {
  public final Account a;
  
  public final Set<Scope> b;
  
  public final Set<Scope> c;
  
  public final Map<c.c.a.a.c.k.a<?>, b> d;
  
  public final String e;
  
  public final String f;
  
  public final c.c.a.a.g.a g;
  
  public Integer h;
  
  public c(Account paramAccount, Set<Scope> paramSet, Map<c.c.a.a.c.k.a<?>, b> paramMap, int paramInt, View paramView, String paramString1, String paramString2, c.c.a.a.g.a parama, boolean paramBoolean) {
    this.a = paramAccount;
    if (paramSet == null) {
      set = Collections.emptySet();
    } else {
      set = Collections.unmodifiableSet(paramSet);
    } 
    this.b = set;
    this.d = Collections.emptyMap();
    this.e = paramString1;
    this.f = paramString2;
    this.g = parama;
    Set<Scope> set = new HashSet<Scope>(this.b);
    Iterator iterator = this.d.values().iterator();
    while (iterator.hasNext())
      set.addAll(((b)iterator.next()).a); 
    this.c = Collections.unmodifiableSet(set);
  }
  
  public static final class a {
    public Account a;
    
    public b.f.c<Scope> b;
    
    public int c = 0;
    
    public String d;
    
    public String e;
    
    public c.c.a.a.g.a f = c.c.a.a.g.a.k;
    
    public final c a() {
      return new c(this.a, (Set<Scope>)this.b, null, this.c, null, this.d, this.e, this.f, false);
    }
  }
  
  public static final class b {
    public final Set<Scope> a;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */