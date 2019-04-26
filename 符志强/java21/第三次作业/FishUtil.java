package 作业3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public final class FishUtil {
	//定义一个常量：publie static final常量名一般大写key--value:文件名---image对象
	public static final Map<String,BufferedImage>IMAGES=new HashMap<String,BufferedImage>();
	static{
		//1.得到目录("resource")对象
		File dir=new File("resource");
		//2.得到目录中所有文件对象
		File[] files=dir.listFiles();
		//3.将所有文件对象转为image对象
		for (int i = 0; i < files.length; i++) {
			BufferedImage image=null;
			try {
				image=ImageIO.read(files[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//4.将image对象以文件名--image的方式保存到IMAGES集合中
			IMAGES.put(files[i].getName(), image);
		}
	}
}
