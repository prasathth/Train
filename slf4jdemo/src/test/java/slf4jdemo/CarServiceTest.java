package slf4jdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarServiceTest {

	@Test
	public void test() {
		CarService s = new CarService();
		s.process("serv in processs");
	}

}
