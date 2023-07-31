package com.bestbankservconf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {com.bestbanks.servconf.MsBestbankServconfApplication.class})
class MsBestbankServconfApplicationTests {

	@Test
	@Disabled("Test de Prueba")
	void contextLoads() {
	  Assertions.fail();
	}

}
