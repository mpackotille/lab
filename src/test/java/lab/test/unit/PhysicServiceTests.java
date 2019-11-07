package lab.test.unit;

import lab.domain.PhysicService;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by nmpacko on 07/11/2019.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PhysicService.class)
public class PhysicServiceTests {

    @Autowired
    private PhysicService subject;

    @Test
    public void shouldReturnCorrectPos(){
        double a=0;
        double v0=0;
        double x0=0;
        double t=0;


        double actual=subject.getRectPos(a,v0,x0,t);

        double expected=0;
        assertThat(expected).isEqualTo(actual);

    }


}
