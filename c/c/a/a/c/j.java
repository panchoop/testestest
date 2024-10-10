package c.c.a.a.c;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import b.l.a.c;

public class j extends c {
  public Dialog h0 = null;
  
  public DialogInterface.OnCancelListener i0 = null;
  
  public Dialog a0(Bundle paramBundle) {
    if (this.h0 == null)
      this.b0 = false; 
    return this.h0;
  }
  
  public void b0(b.l.a.j paramj, String paramString) {
    super.b0(paramj, paramString);
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.i0;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */