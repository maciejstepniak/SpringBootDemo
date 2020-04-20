package pl.stepniak.maciej.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    void method1() {
        demoService.method1(ImplementationType.X);
        demoService.method1(ImplementationType.Y);
        demoService.method1(ImplementationType.Z);
    }

    @Test
    void method2() {
        final int r1 = demoService.method2(ImplementationType.X);
        final int r2 = demoService.method2(ImplementationType.Y);
        final int r3 = demoService.method2(ImplementationType.Z);

        assertThat(r1).isEqualTo(-1);
        assertThat(r2).isEqualTo(0);
        assertThat(r3).isEqualTo(1);
    }

    @Test
    void method3() {
        final String r1 = demoService.method3(ImplementationType.X);
        final String r2 = demoService.method3(ImplementationType.Y);
        final String r3 = demoService.method3(ImplementationType.Z);

        assertThat(r1).isEqualTo("CX");
        assertThat(r2).isEqualTo("CY");
        assertThat(r3).isEqualTo("CZ");
    }
}