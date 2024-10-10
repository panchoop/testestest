package c.c.a.b.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public class h {
  public long a = 0L;
  
  public long b = 300L;
  
  public TimeInterpolator c = null;
  
  public int d = 0;
  
  public int e = 1;
  
  public h(long paramLong1, long paramLong2) {
    this.a = paramLong1;
    this.b = paramLong2;
  }
  
  public h(long paramLong1, long paramLong2, TimeInterpolator paramTimeInterpolator) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramTimeInterpolator;
  }
  
  public void a(Animator paramAnimator) {
    paramAnimator.setStartDelay(this.a);
    paramAnimator.setDuration(this.b);
    paramAnimator.setInterpolator(b());
    if (paramAnimator instanceof ValueAnimator) {
      ValueAnimator valueAnimator = (ValueAnimator)paramAnimator;
      valueAnimator.setRepeatCount(this.d);
      valueAnimator.setRepeatMode(this.e);
    } 
  }
  
  public TimeInterpolator b() {
    TimeInterpolator timeInterpolator = this.c;
    if (timeInterpolator == null)
      timeInterpolator = a.b; 
    return timeInterpolator;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof h))
      return false; 
    paramObject = paramObject;
    return (this.a != ((h)paramObject).a) ? false : ((this.b != ((h)paramObject).b) ? false : ((this.d != ((h)paramObject).d) ? false : ((this.e != ((h)paramObject).e) ? false : b().getClass().equals(paramObject.b().getClass()))));
  }
  
  public int hashCode() {
    long l = this.a;
    int j = (int)(l ^ l >>> 32L);
    l = this.b;
    int i = (int)(l ^ l >>> 32L);
    return ((b().getClass().hashCode() + (j * 31 + i) * 31) * 31 + this.d) * 31 + this.e;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('\n');
    stringBuilder.append(h.class.getName());
    stringBuilder.append('{');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" delay: ");
    stringBuilder.append(this.a);
    stringBuilder.append(" duration: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" interpolator: ");
    stringBuilder.append(b().getClass());
    stringBuilder.append(" repeatCount: ");
    stringBuilder.append(this.d);
    stringBuilder.append(" repeatMode: ");
    stringBuilder.append(this.e);
    stringBuilder.append("}\n");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\l\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */