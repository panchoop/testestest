package c.c.a.a.c.l;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public abstract class e implements DialogInterface.OnClickListener {
  public void onClick(DialogInterface paramDialogInterface, int paramInt) {
    try {
      v v = (v)this;
      Intent intent = v.b;
      if (intent != null)
        v.c.startActivityForResult(intent, v.d); 
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      Log.e("DialogRedirect", "Failed to start resolution intent", (Throwable)activityNotFoundException);
      return;
    } finally {
      paramDialogInterface.dismiss();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */