package b.i.e;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class a {
  public static final Object a = new Object();
  
  public static int a(Context paramContext, int paramInt) {
    return (Build.VERSION.SDK_INT >= 23) ? paramContext.getColor(paramInt) : paramContext.getResources().getColor(paramInt);
  }
  
  public static ColorStateList b(Context paramContext, int paramInt) {
    return (Build.VERSION.SDK_INT >= 23) ? paramContext.getColorStateList(paramInt) : paramContext.getResources().getColorStateList(paramInt);
  }
  
  public static Drawable c(Context paramContext, int paramInt) {
    return paramContext.getDrawable(paramInt);
  }
  
  public static Executor d(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 28) ? paramContext.getMainExecutor() : new a(new Handler(paramContext.getMainLooper()));
  }
  
  public static boolean e(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle) {
    paramContext.startActivities(paramArrayOfIntent, paramBundle);
    return true;
  }
  
  public static class a implements Executor {
    public final Handler a;
    
    public a(Handler param1Handler) {
      this.a = param1Handler;
    }
    
    public void execute(Runnable param1Runnable) {
      if (this.a.post(param1Runnable))
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append(" is shutting down");
      throw new RejectedExecutionException(stringBuilder.toString());
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */