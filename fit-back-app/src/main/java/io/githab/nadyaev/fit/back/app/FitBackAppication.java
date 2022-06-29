package io.githab.nadyaev.fit.back.app;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FitBackAppication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(FitBackAppication.class)
		  .bannerMode(Banner.Mode.OFF)
		  .logStartupInfo(false)
		  .registerShutdownHook(true)
		  .run();
	}
}
