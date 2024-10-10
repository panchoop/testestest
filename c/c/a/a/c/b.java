package c.c.a.a.c;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

public class b extends DialogFragment {
  public Dialog b = null;
  
  public DialogInterface.OnCancelListener c = null;
  
  public void onCancel(DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.c;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
  
  public Dialog onCreateDialog(Bundle paramBundle) {
    if (this.b == null)
      setShowsDialog(false); 
    return this.b;
  }
  
  public void show(FragmentManager paramFragmentManager, String paramString) {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */