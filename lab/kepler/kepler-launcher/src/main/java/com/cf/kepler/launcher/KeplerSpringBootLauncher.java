/**
 * 
 */

package com.cf.kepler.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sabuj.das
 *
 */
@Slf4j
@SpringBootApplication
public class KeplerSpringBootLauncher {

    public static void main(String[] args) throws Exception {
        log.info("Starting KeplerSpringBootLauncher ...");
        SpringApplication.run(KeplerSpringBootLauncher.class, args);
    }


}
