hello £¬ i want to test this function,of changes,thanks£¡

test again

package com.macroft.objectTracker.robot;

import android.content.Context;
import com.macroft.objectTracker.adkutils.BluetoothBroadcastReceiver;

public class RobotBroadcastReceiver
  extends BluetoothBroadcastReceiver
{
  public RobotBroadcastReceiver(Context paramContext)
  {
    super(paramContext);
  }
  
  public void sendMessage(RobotCommand paramRobotCommand)
  {
    super.sendMessage(paramRobotCommand.id);
  }
  
  public void sendMessage(RobotCommand paramRobotCommand, int paramInt)
  {
    super.sendMessage(paramRobotCommand.id, paramInt);
  }
  
  public void sendMessage(RobotCommand paramRobotCommand, int paramInt1, int paramInt2)
  {
    super.sendMessage(paramRobotCommand.id, paramInt1, paramInt2);
  }
}


/*
package com.macroft.objectTracker.robot;

import android.content.Context;

import com.macroft.objectTracker.adkutils.BluetoothBroadcastReceiver;

public class RobotBroadcastReceiver extends BluetoothBroadcastReceiver {
	
	public RobotBroadcastReceiver(Context context) {
		super(context);
	}
	
	public void sendMessage(RobotCommand command) {
		super.sendMessage(command.id);
	}
	
	public void sendMessage(RobotCommand command, int value) {
		super.sendMessage(command.id, value);
	}
	
	public void sendMessage(RobotCommand command, int value1, int value2) {
		super.sendMessage(command.id, value1, value2);
	}
}
*/