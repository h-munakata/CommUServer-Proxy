//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mycommu;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	java.awt.Color;

public class wavehand
{

	public CRobotPose pose;
	public wavehand()																									//@<BlockInfo>jp.vstone.block.func.constructor,16,16,208,16,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void method()																								//@<BlockInfo>jp.vstone.block.func,64,176,288,176,False,8,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,144,176,144,176,False,7,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,900,300,0,70,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,1000);
		CRobotUtil.wait(1000);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,48,288,48,288,False,6,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,900,0,0,70,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,500);
		CRobotUtil.wait(500);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,128,288,128,288,False,5,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,900,300,0,70,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,500);
		CRobotUtil.wait(500);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,192,288,192,288,False,4,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,900,0,0,70,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,500);
		CRobotUtil.wait(500);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,272,288,272,288,False,3,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,-900,0,0,0,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,1000);
		CRobotUtil.wait(1000);																							//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
