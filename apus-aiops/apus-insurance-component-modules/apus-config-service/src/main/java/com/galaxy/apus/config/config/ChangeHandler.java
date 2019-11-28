package com.galaxy.apus.config.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: yeyun
 * @Date: 2019/8/7 17:47
 * @Des spring 默认使用org.springframework.boot.env.PropertiesPropertySourceLoader 来加载配置，底层是通过调用 Properties 的 load 方法，而load方法输入流的编码是 ISO-8859-1
 * 配合resource下面的spring.factories来使用
 */
public class ChangeHandler implements PropertySourceLoader {
    private static final Logger logger = LoggerFactory.getLogger(ChangeHandler.class);

    @Override
    public String[] getFileExtensions() {
        return new String[]{"properties", "xml"};
    }

    @Override
    public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
        Map<String, ?> properties = loadProperties(resource);
        if (properties.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(new OriginTrackedMapPropertySource(name, properties));
    }
    private Map<String, ?> loadProperties(Resource resource) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = resource.getInputStream();
            properties.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            inputStream.close();
        } catch (IOException e) {
            logger.error("load inputstream failure...", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error("close IO failure ....", e);
                }
            }
        }
        return (Map) properties;
    }

}
