package FileOper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class CreateFile {
	public static void main(String[] args){
		String fileName="zyytest";
		String filecontent="险种投保人年龄不得小于18岁，核保不通过";
		createFile(fileName,filecontent);
		writeFileContent(fileName,filecontent);
		
	}
	public static boolean createFile(String fileName,String filecontent){
		boolean bool=false;
		String filepth="D:\\zyy\\";
		String file1=filepth+fileName;
		File file=new File(file1);
		try{
			if(!file.exists()){
				file.createNewFile();
				bool=true;
				System.out.println("success create file,the file is "+file1);
				//创建文件成功后，写入内容到文件里
				writeFileContent(file1,filecontent);

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return bool;
	}
	
    /**
     * 向文件中写入内容
     * @param filepath 文件路径与名称
     * @param newstr  写入的内容
     * @return
     * @throws IOException
     */
	public static boolean writeFileContent(String filename,String content){
		Boolean bool=false;
		String temp  = "";

		String filecontent=content+"\r\n";
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try{
        	File file=new File(filename);
        	//将文件读入输入流
        	fis=new FileInputStream(file);
        	isr=new InputStreamReader(fis);
        	br=new BufferedReader(isr);
        	StringBuffer sBuffer=new StringBuffer();
        	//文件原有内容
        	for(int i=0;(temp=br.readLine())!=null;i++){
        		sBuffer.append(temp);
        		// 行与行之间的分隔符 相当于“\n”
        		sBuffer=sBuffer.append(System.getProperty("line.separator"));
        	}
        	sBuffer.append(filecontent);
        	fos=new FileOutputStream(file);
        	pw=new PrintWriter(fos);
        	pw.write(sBuffer.toString().toCharArray());
        	pw.flush();
        	bool=true;

        	
        }catch(Exception e){
        	e.printStackTrace();
        }finally{
        	//关闭
        	if(pw!=null){
        		pw.close();
        	}
//        	if(fos!=null){
//        		fos.close();
//        	}
//            if (br != null) {
//                br.close();
//            }
//            if (isr != null) {
//                isr.close();
//            }
//            if (fis != null) {
//                fis.close();
//            }  	
        }

		return bool;
	}

}
