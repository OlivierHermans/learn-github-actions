package be.olivierhermans.learngithubactions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LearnGithubActionsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testThatWillFail() {
        assertThat(true).isFalse();
    }
}
