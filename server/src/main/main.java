package main;
import jp.co.mycommu.greeting;
import jp.vstone.RobotLib.*;
import jp.vstone.camera.*;
import jp.vstone.sotatalk.*;
import jp.vstone.sotatalk.SpeechRecog.*;
import java.lang.reflect.Method;
import main.Server;


public class main
{
	public static void main(String[] args)
	{
		if(GlobalVariable.mem.Connect())
		{
			int port = Integer.parseInt(args[0]);
			System.out.print(String.format("Launching server... Port:%d \n", port));

			GlobalVariable.motion.InitRobot_CommU();
			GlobalVariable.motion.ServoOn();

			CRobotPose pose = new CRobotPose();
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
							new Short[]{0,0,900,0,-900,0,0,0,0,0,0,0,0,0}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
							new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,50,50}
							);
			pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
							new Short[]{0,0,0,0,0,0,0}
							);
			GlobalVariable.motion.play(pose,1500);
			CRobotUtil.wait(1500);

			Server serv = new Server(port, 5000);
			try
			{
				while(true){
					String message = serv.recieve();
					if(message!=null){
						System.out.print("Recieved message:"+message);
						switch_behavior(message);
					}
					// switch_behavior("jp.co.mycommu.greeting");
				}

			} catch(Exception e)
			{
				System.out.println("例外が発生しました:");
				e.printStackTrace();
			}
			System.exit(0);
		}
	}

	public static class GlobalVariable
	{
		public static CRobotMem mem = new CRobotMem();
		public static boolean TRUE = true;
		public static CCommUMotion motion = new CCommUMotion(mem);
		public static FaceDetectResult faceresult;
		public static CRoboCamera robocam = new CRoboCamera("/dev/video0",motion);
		public static int detectCount = 0;
		public static Object recvReturnValue;
		public static String recvString;
		public static boolean booleanResult;
		public static CRecordMic mic = new CRecordMic();
	}

	public static void switch_behavior(String args){
		try {
			Class<?> behavior = Class.forName(args);
			Method method = behavior.getMethod("method");
			method.invoke(behavior.getDeclaredConstructor().newInstance());
		} catch(Exception e)
		{
			System.out.println("\nCan't do the behavior correctly...");
		}
	}


}

