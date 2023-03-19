package com.mydeveloperplanet.myjhipsterplanet;

import com.mydeveloperplanet.myjhipsterplanet.MyjhipsterplanetApp;
import com.mydeveloperplanet.myjhipsterplanet.config.AsyncSyncConfiguration;
import com.mydeveloperplanet.myjhipsterplanet.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { MyjhipsterplanetApp.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
