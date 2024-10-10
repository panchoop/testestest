package c.a.b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class p {
  public final AtomicInteger a = new AtomicInteger();
  
  public final Set<o<?>> b = new HashSet<o<?>>();
  
  public final PriorityBlockingQueue<o<?>> c = new PriorityBlockingQueue<o<?>>();
  
  public final PriorityBlockingQueue<o<?>> d = new PriorityBlockingQueue<o<?>>();
  
  public final b e;
  
  public final i f;
  
  public final r g;
  
  public final j[] h;
  
  public d i;
  
  public final List<a> j = new ArrayList<a>();
  
  public p(b paramb, i parami) {
    this.e = paramb;
    this.f = parami;
    this.h = new j[4];
    this.g = g;
  }
  
  public <T> o<T> a(o<T> paramo) {
    Set<o<?>> set;
    PriorityBlockingQueue<o<?>> priorityBlockingQueue;
    paramo.i = this;
    synchronized (this.b) {
      this.b.add(paramo);
      paramo.h = Integer.valueOf(this.a.incrementAndGet());
      paramo.a("add-to-queue");
      if (!paramo.j) {
        priorityBlockingQueue = this.d;
      } else {
        priorityBlockingQueue = this.c;
      } 
      priorityBlockingQueue.add(paramo);
      return paramo;
    } 
  }
  
  public static interface a<T> {
    void a(o<T> param1o);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */