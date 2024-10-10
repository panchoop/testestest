package b.i.i;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

public final class b {
  static {
    if (Build.VERSION.SDK_INT < 29)
      try {
        Trace.class.getField("TRACE_TAG_APP").getLong(null);
        Trace.class.getMethod("isTagEnabled", new Class[] { long.class });
        Trace.class.getMethod("asyncTraceBegin", new Class[] { long.class, String.class, int.class });
        Trace.class.getMethod("asyncTraceEnd", new Class[] { long.class, String.class, int.class });
        Trace.class.getMethod("traceCounter", new Class[] { long.class, String.class, int.class });
      } catch (Exception exception) {
        Log.i("TraceCompat", "Unable to initialize via reflection.", exception);
      }  
  }
  
  public static void a(String paramString) {
    Trace.beginSection(paramString);
  }
  
  public static void b() {
    Trace.endSection();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\i\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */