package com.jalon.mybatis.generate;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jalon on 17/04/2018.
 * 生成的类和映射文件路径 com.jalon.mybatis.generate
 * 1.运行下列Main函数 失败 连接错误,需要设置 JVM proxy --Ok
 * 2.第二种方案，通过mvn插件的方式运行 mvn mybatis-generator:generate  还是失败
 * 3.java -jar mybatis-generator-core-x.x.x.jar -configfile \temp\generatorConfig.xml -overwrite，
 *   例如：java -jar mybatis-generator-core-1.3.5.jar -configfile E:\Git\mybatisSample\resources\mybatis-generate.xml  -overwrite
 *  还是报同样的错误，连接错误,需要设置 JVM proxy
 *
 *  可以成功了，生成路径可配。 可用第三种方式看到输出信息
 *  java -jar -Dhttp.proxyHost=127.0.0.1 -Dhttp.proxyPort=1080 mybatis-generator-core-1.3.5.jar -configfile E:\Git\mybatisSample\resources\mybatis-generate.xml  -overwrite
 Existing file E:\Git\mybatisSample\src\test\gene\test\model\UserExample.java was overwritten
 Existing file E:\Git\mybatisSample\src\test\gene\test\model\User.java was overwritten
 Existing file E:\Git\mybatisSample\src\test\dao\UserMapper.java was overwritten

 MyBatis Generator finished successfully, there were warnings.
 */

public class GenerateDemo {
    //TODO
    public static void main(String[] args) throws IOException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        String genCfg = "mybatis-generate.xml";
        File configFile = Resources.getResourceAsFile(genCfg);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {
            config = cp.parseConfiguration(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = null;
        try {
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
        try {
            myBatisGenerator.generate(null);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(warnings);
    }


}
