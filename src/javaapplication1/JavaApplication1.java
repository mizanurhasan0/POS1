/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author world
 */
public class JavaApplication1 {
private static final String osName=System.getProperty("os.name");
private static final String dataModel=
        System.getProperty("sun.arch.data.model");
private static final String vmVersion=
        System.getProperty("java.vm.version");
private static final String osArch=
        System.getProperty("os.arch");
   
public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("OS Name:"+osName);
        System.out.println("dataModel:"+dataModel);
        System.out.println("vmVersion:"+vmVersion);
        System.out.println("osArch:"+osArch);
    }
    
}
