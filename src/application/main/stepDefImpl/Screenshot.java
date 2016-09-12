package application.main.stepDefImpl;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

class Screenshot {

	public void takeScreenshot(String className,String message)
	{
		try{
		boolean success=false;
		
		String dir="C:\\Users\\Administrator\\Desktop\\DhsProject\\screenshots\\"+className;
		
		File screenStoreDir= new File(dir);
		
		if(screenStoreDir.exists()){
			
		}else{
			success=screenStoreDir.mkdir();
			if(success){
				
			}else
			{
			System.out.printf("failed to create new directory");
			}
		}
		
		BufferedImage screenShot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(screenShot, "JPG", new File(screenStoreDir+"//"+message+".jpg"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
