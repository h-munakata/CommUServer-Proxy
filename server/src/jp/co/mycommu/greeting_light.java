//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mycommu;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	java.awt.Color;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;

public class greeting_light
{

	public CRobotPose pose;
	/*
	pose = new CRobotPose();																							//@<BlockInfo>jp.vstone.block.commu.pose,-384,64,-384,64,False,1,コメント@</BlockInfo>
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
	CRobotUtil.wait(1000);																								//@<EndOfBlock/>

	*/

	//@<Separate/>
	public greeting_light()																								//@<BlockInfo>jp.vstone.block.func.constructor,16,16,192,16,False,3,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,112,16,112,16,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void method()																								//@<BlockInfo>jp.vstone.block.func,0,128,592,240,False,8,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,240,128,240,128,False,7,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,-900,-300,900,300,0,0,0,0,0,0,0,430}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,190}
						);
		GlobalVariable.motion.play(pose,1000);
		CRobotUtil.wait(1000);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,448,96,448,96,False,6,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,-900,-200,900,200,0,0,0,0,0,0,0,300}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,190}
						);
		GlobalVariable.motion.play(pose,400);
		CRobotUtil.wait(400);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,576,96,576,96,False,5,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,-900,-300,900,300,0,0,0,0,0,0,0,300}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,190}
						);
		GlobalVariable.motion.play(pose,400);
		CRobotUtil.wait(400);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,656,96,656,96,False,4,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,-900,-200,900,200,0,0,0,0,0,0,0,300}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,190}
						);
		GlobalVariable.motion.play(pose,400);
		CRobotUtil.wait(400);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,480,240,480,240,False,9,コメント@</BlockInfo>
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
