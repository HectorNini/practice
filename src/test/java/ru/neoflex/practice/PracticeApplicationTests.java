package ru.neoflex.practice;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class PracticeApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testCalculateSum() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/plus/2/3"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("5"));

		mockMvc.perform(MockMvcRequestBuilders.get("/plus/2/-3"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("-1"));
	}

	@Test
	public void testCalculateDiff() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/minus/5/2"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("3"));

		mockMvc.perform(MockMvcRequestBuilders.get("/minus/5/-2"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("7"));
	}
}
