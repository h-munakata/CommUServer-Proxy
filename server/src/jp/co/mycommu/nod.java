//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mycommu;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	java.awt.Color;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;

public class nod
{

	public CRobotPose pose;
	public nod()																										//@<BlockInfo>jp.vstone.block.func.constructor,16,16,144,16,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void method()																								//@<BlockInfo>jp.vstone.block.func,16,176,224,176,False,7,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,96,176,96,176,False,6,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,-900,0,100,0,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,200);
		CRobotUtil.wait(200);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,32,256,32,256,False,5,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,-900,0,0,0,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,200);
		CRobotUtil.wait(200);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,128,256,128,256,False,4,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,-900,0,100,0,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,200);
		CRobotUtil.wait(200);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,224,256,224,256,False,3,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,-900,0,0,0,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,200);
		CRobotUtil.wait(200);																							//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
