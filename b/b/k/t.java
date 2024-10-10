package b.b.k;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

public class t {
  public static t d;
  
  public final Context a;
  
  public final LocationManager b;
  
  public final a c = new a();
  
  public t(Context paramContext, LocationManager paramLocationManager) {
    this.a = paramContext;
    this.b = paramLocationManager;
  }
  
  public final Location a(String paramString) {
    try {
      if (this.b.isProviderEnabled(paramString))
        return this.b.getLastKnownLocation(paramString); 
    } catch (Exception exception) {
      Log.d("TwilightManager", "Failed to get last known location", exception);
    } 
    return null;
  }
  
  public static class a {
    public boolean a;
    
    public long b;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */