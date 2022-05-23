package com.example.springbootdemo1.util;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.digest.Digester;

import java.util.Scanner;

/**
 * @package:com.example.springbootdemo1.util
 * @Author:旁观者
 * @Date:2022/5/16-11:27
 * @By:IntelliJ IDEA
 * @FileName:MD5.java
 */
public class Security {

    public static String toMd5(String data){
        Digester md5 = new Digester(DigestAlgorithm.MD5);

        return md5.digestHex(data);
    }

    public static String encodeWithMd5(String data){
        String str = DigestUtil.bcrypt(data);
        return null;
    }

    public static void main(String[] args) {
        String str = "e10adc3949ba59abbe56e057f20f883e";
//        String safeStr = DigestUtil.md5Hex(str);
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(str.equals(DigestUtil.md5Hex(line)));
    }
}
