package com.wuqj.tool;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/** 代码生成器 */
public class MpGenerator {

  // 作者  需要根据自己的用户名调整
  private static final String AUTHOR = "wuqj";
  // 生成的目录 需要根据自己的实际目录调整
  private static final String OUT_PUT_DIR = "H:\\Work\\IdeaWorkSpace\\activity-demo\\src\\main\\java";
  // 模块的父级目录
  private static final String PARENT_PACKAGE = "com.wuqj.demo";
  // 模块名  需要根据自己的实际表名调整
  private static final String MODULE_NAME = "TestInfo";
  // 表名    需要根据自己的实际表名调整
  private static final String TABLE_NAME = "T_TEST_INFO";
  // 逻辑删除标志位 如果表中存在逻辑删除标志位，则在此填写具体属性名
  // private static final String logicDeleteFieldName = "DEMO_DELETE_FLAG";

  // 数据库用户名
  private static final String DB_USER_NAME = "activity_demo";
  // 数据库密码
  private static final String DB_PASSWORD = "activity_demo";
  // 数据库url
  private static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521/orcl";

  /** Mybatis-plus 代码生成器 */
  public static void main(String[] args) {

    AutoGenerator mpg = new AutoGenerator();

    // 选择 freemarker 引擎，默认 Veloctiy
    mpg.setTemplateEngine(new FreemarkerTemplateEngine());

    // 全局配置
    GlobalConfig gc = new GlobalConfig();
    gc.setAuthor(AUTHOR);
    gc.setOutputDir(OUT_PUT_DIR);
    gc.setFileOverride(true); // 是否覆盖同名文件，默认是false
    gc.setActiveRecord(true); // 不需要ActiveRecord特性的请改为false
    gc.setEnableCache(false); // XML 二级缓存
    gc.setBaseResultMap(true); // XML ResultMap
    gc.setBaseColumnList(false); // XML columList
    gc.setSwagger2(true);
    /* 自定义文件命名，注意 %s 会自动填充表实体属性！ */
    gc.setEntityName(MODULE_NAME);
    gc.setMapperName(MODULE_NAME + "Mapper");
    gc.setXmlName(MODULE_NAME + "Mapper");
    gc.setServiceName(MODULE_NAME + "Service");
    gc.setServiceImplName(MODULE_NAME + "ServiceImpl");
    gc.setControllerName(MODULE_NAME + "Controller");
    mpg.setGlobalConfig(gc);

    // 数据源配置
    DataSourceConfig dsc = new DataSourceConfig();
    dsc.setDbType(DbType.ORACLE);
    dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
    dsc.setUsername(DB_USER_NAME);
    dsc.setPassword(DB_PASSWORD);
    dsc.setUrl(DB_URL);
    mpg.setDataSource(dsc);

    // 策略配置
    StrategyConfig strategy = new StrategyConfig();
    strategy.setNaming(NamingStrategy.underline_to_camel); // 表名生成策略
    strategy.setColumnNaming(NamingStrategy.underline_to_camel);
    strategy.setInclude(TABLE_NAME); // 需要生成的表
    strategy.setRestControllerStyle(true);
    strategy.entityTableFieldAnnotationEnable(true);
    // 如果表中有删除标志位，增加此设置
    // if(!"".equals(logicDeleteFieldName)) {
    //    strategy.setLogicDeleteFieldName(logicDeleteFieldName);
    // }
    //strategy.setSuperServiceClass("com.kaiyufound.kre.mybatisplus.BaseService");
    //strategy.setSuperServiceImplClass("com.kaiyufound.kre.mybatisplus.impl.BaseServiceImpl");
    //TODO 设置需要继承的基础控制层 目前只是个空的控制层
    strategy.setSuperControllerClass("com.wuqj.base.BaseController");
    mpg.setStrategy(strategy);
    // 包配置
    PackageConfig pc = new PackageConfig();
    pc.setParent(PARENT_PACKAGE);
    mpg.setPackageInfo(pc);
    // 执行生成
    mpg.execute();
  }
}
