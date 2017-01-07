package Frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest {
	public static void main(String[] args){
		//创建一个窗体对象
		Frame frame=new NewFrame();
//		NewFrame frame1=new NewFrame();
		//显示窗体
		frame.setVisible(true);
		
	}
static class NewFrame extends Frame{
	NewFrame(){
		//设置窗口标题
		setTitle("zyytest的窗口");
		//取得工具类
		Toolkit tk=Toolkit.getDefaultToolkit();
		//取得显示器尺寸
		Dimension screenSize=tk.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		setSize(screenWidth/2,screenHeight/2);
		setLocation(screenWidth/4,screenHeight/4);
		this.repaint();
	}
}

}
