//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mycommu;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	java.awt.Color;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;

public class greeting_deep
{

	public CRobotPose pose;
	public greeting_deep()																								//@<BlockInfo>jp.vstone.block.func.constructor,16,16,272,0,False,2,@</BlockInfo>
	{
																														//@<OutputChild>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,80,16,80,16,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void method()																								//@<BlockInfo>jp.vstone.block.func,96,192,272,192,False,5,@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,176,192,176,192,False,4,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{120,0,900,-200,-900,200,70,0,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,1500);
		CRobotUtil.wait(1500);																							//@<EndOfBlock/>
		pose = new CRobotPose();																						//@<BlockInfo>jp.vstone.block.commu.pose,256,128,256,128,False,3,コメント@</BlockInfo>
		pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{0,0,900,0,-900,0,0,0,0,0,0,0,0,0}
						);
		pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
						new Short[]{100,100,100,100,100,100,100,100,100,100,100,100,100,100}
						);
		pose.SetLed(	new Byte[]{0,1,2,3,4,5,6},
						new Short[]{0,0,0,0,0,0,0}
						);
		GlobalVariable.motion.play(pose,1500);
		CRobotUtil.wait(1500);																							//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}