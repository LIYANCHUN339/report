package com.org.report;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
/**

 * 加载对应的xml配置文件

 */

@ImportResource("classpath:context.xml")
public class ReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);
    }
    /**

     * 进行注册Servlet

     * 配置 UReport2 需要使用到的servlet

     */

    @Bean

    public ServletRegistrationBean buildUReportServlet() {

        /**

         * @param  servlet

         * @param  urlMappings 值为“/ureport/*”的 urlMappings 是一定不能变的，否则系统将无法运行。

         */

        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");

    }

}

