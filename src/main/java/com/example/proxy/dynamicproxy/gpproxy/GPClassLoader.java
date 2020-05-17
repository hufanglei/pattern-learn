package com.example.proxy.dynamicproxy.gpproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Title: GPClassLoader
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-14
 */
public class GPClassLoader extends ClassLoader{

    private File classPathFile;

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //获取 包名.类名
        String className = GPClassLoader.class.getPackage().getName() + "." + name;
        if(classPathFile != null){
            //将.class文件包名转换成文件路径，便于流读取
            File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte [] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if(null != in){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(out != null){
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }
}


